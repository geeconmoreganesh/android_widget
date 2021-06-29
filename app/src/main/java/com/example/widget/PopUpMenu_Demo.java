package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopUpMenu_Demo extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private Button popBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_menu__demo);

        popBtn1 = (Button) findViewById(R.id.pop_btn1);

        popBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu=new PopupMenu(PopUpMenu_Demo.this,v);
                popupMenu.setOnMenuItemClickListener(PopUpMenu_Demo.this);
                popupMenu.inflate(R.menu.example_popupmenu);
                popupMenu.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

            switch (item.getItemId())
            {
                case R.id.item1:
                    Toast.makeText(this, "You Select : "+item.getTitle(), Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.item2:
                    Toast.makeText(this, "Fruits", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.item3:
                    Toast.makeText(this, "Vegetables", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.subitem1:
                    Toast.makeText(this, "Cabbage", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.subitem2:
                    Toast.makeText(this, "Capsicum", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.subitem3:
                    Toast.makeText(this, "Carrot", Toast.LENGTH_SHORT).show();
                    return true;
            default:
                return false;
        }

    }
}