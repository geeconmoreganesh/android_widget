package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Button_Demo extends AppCompatActivity implements View.OnClickListener {

    private AppCompatButton btn1;
    private AppCompatButton btn2;
    private AppCompatButton btn3;
    private AppCompatButton btn4;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button__demo);

        btn1 = (AppCompatButton) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);


        btn2 = (AppCompatButton) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = (AppCompatButton) findViewById(R.id.btn3);

        btn4 = (AppCompatButton) findViewById(R.id.btn4);

        text1 = (TextView) findViewById(R.id.text1);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(this, "Activity one", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(this, "Activity two", Toast.LENGTH_SHORT).show();
                break;
        }
    }

//    public void OnClickMethod(View view) {
//        Toast.makeText(Button_Demo.this, "Using OnClickMethod", Toast.LENGTH_SHORT).show();
//    }

    public void OnClickText(View view) {
        Toast.makeText(Button_Demo.this, "Using OnClickText", Toast.LENGTH_SHORT).show();
        text1.setText("Thanks For Watching & I hope you enjoyed !!!");
    }

    public void OnClickMethod(View view) {

        Toast.makeText(Button_Demo.this, "Using OnClickMethod", Toast.LENGTH_SHORT).show();
    }
}