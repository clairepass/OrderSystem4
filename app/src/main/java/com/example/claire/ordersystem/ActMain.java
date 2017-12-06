package com.example.claire.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActMain extends AppCompatActivity {

    private View.OnClickListener btnTotalPrice_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a= Integer.parseInt((textQ.getText().toString()));
            lblTotalPrice.setText(String.valueOf(a*120));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,0,1,"拿鐵");
        menu.add(0,1,2,"水果耶加雪夫");
        menu.add(0,2,3,"完美日曬耶加雪菲");
        menu.add(0,3,4,"超級肯亞");
    }
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0)
            menuPro.setText("拿鐵");
        if(item.getItemId()==1)
            menuPro.setText("水果耶加雪夫");
        if(item.getItemId()==2)
            menuPro.setText("完美日曬耶加雪菲");
        if(item.getItemId()==3)
            menuPro.setText("超級肯亞");
        return super.onContextItemSelected(item);
    }

    private void InitialComponent() {
        menuPro=(TextView)findViewById(R.id.menuPro);
        textQ=(EditText)findViewById(R.id.textQ);
        lblTotalPrice=(TextView)findViewById(R.id.lblTotalPrice);
        btnTotalPrice=(Button)findViewById(R.id.btnTotalPrice);
        btnTotalPrice.setOnClickListener(btnTotalPrice_click);
        registerForContextMenu(menuPro);

    }
    TextView menuPro;
    EditText textQ;
    TextView lblTotalPrice;
    Button btnTotalPrice;

}
