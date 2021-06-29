package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class SwitchButton_Demo extends AppCompatActivity {

    private SwitchCompat bulb;
    private ImageView light;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_button__demo);

        bulb = (SwitchCompat) findViewById(R.id.bulb);
        light = (ImageView) findViewById(R.id.light);

        light.setImageDrawable(getResources().getDrawable(R.drawable.lightoff));

        //Toasty.success(SwitchButton_Demo.this,"Bulb is off", Toasty.LENGTH_SHORT).show();

        bulb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(bulb.isChecked())
                {
                    light.setImageDrawable(getResources().getDrawable(R.drawable.lifhton));
                    Toast.makeText(SwitchButton_Demo.this, "Bulb is on", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    light.setImageDrawable(getResources().getDrawable(R.drawable.lightoff));
                    Toast.makeText(SwitchButton_Demo.this, "Bulb is off", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}