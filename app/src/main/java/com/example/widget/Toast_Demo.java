package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class Toast_Demo extends AppCompatActivity {

    private TextView toast1;
    private TextView toast2;
    private TextView toast3;
    private TextView toast4;
    private TextView toast5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast__demo);

        toast1 = (TextView) findViewById(R.id.toast_1);
        toast2 = (TextView) findViewById(R.id.toast_2);
        toast3 = (TextView) findViewById(R.id.toast_3);
        toast4 = (TextView) findViewById(R.id.toast_4);
        toast5 = (TextView) findViewById(R.id.toast_5);

        toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Toast_Demo.this, "By Default Toast", Toast.LENGTH_SHORT).show();
            }
        });

        toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(Toast_Demo.this,"Simple Gravity Toast",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        });

        toast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(Toast_Demo.this,"Nested Gravity Toast",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);
                toast.show();
            }
        });

        toast4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(Toast_Demo.this,"Success Toasty",Toasty.LENGTH_SHORT).show();

            }
        });

        toast5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(Toast_Demo.this,"Error Toasty",Toasty.LENGTH_SHORT).show();
            }
        });
    }
}