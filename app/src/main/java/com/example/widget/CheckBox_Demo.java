package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBox_Demo extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkBtn1;
    private CheckBox checkBtn2;
    private CheckBox checkBtn3;
    private CheckBox checkBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box__demo);

        checkBtn1 = (CheckBox) findViewById(R.id.check_btn1);
        checkBtn1.setOnClickListener(this);

        checkBtn2 = (CheckBox) findViewById(R.id.check_btn2);
        checkBtn2.setOnClickListener(this);

        checkBtn3 = (CheckBox) findViewById(R.id.check_btn3);
        checkBtn3.setOnClickListener(this);

        checkBtn4 = (CheckBox) findViewById(R.id.check_btn4);
        checkBtn4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.check_btn1:
                if(checkBtn1.isChecked())
                    Toast.makeText(this, "You Selected ANDROID", Toast.LENGTH_SHORT).show();
                break;

                case R.id.check_btn2:
                    if(checkBtn2.isChecked())
                        Toast.makeText(this, "You Selected JAVA", Toast.LENGTH_SHORT).show();
                    break;

            case R.id.check_btn3:
                if(checkBtn3.isChecked())
                    Toast.makeText(this, "You Selected HTML", Toast.LENGTH_SHORT).show();
                break;

            case R.id.check_btn4:
                if(checkBtn4.isChecked())
                    Toast.makeText(this, "You Selected CSS", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}