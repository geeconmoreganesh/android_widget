package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatToggleButton;

import android.os.Bundle;
import android.widget.CompoundButton;

public class ToggleButton_Demo extends AppCompatActivity {

    private AppCompatToggleButton toggle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button__demo);

        toggle1 = (AppCompatToggleButton) findViewById(R.id.toggle_1);

      //  String wifion=toggle1.getText().toString();

        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    toggle1.setBackgroundResource(R.color.design_default_color_primary_variant);
                    toggle1.setTextOff("Wifi On");
                }
                else
                {
                    toggle1.setBackgroundResource(R.color.design_default_color_error);
                    toggle1.setTextOn("Wifi Off");
                }
            }
        });

    }
}