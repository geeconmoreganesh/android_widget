package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButton_Demo extends AppCompatActivity {

    private RadioGroup group;
    private AppCompatRadioButton male;
    private AppCompatRadioButton female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button__demo);

        group = (RadioGroup) findViewById(R.id.group);
        male = (AppCompatRadioButton) findViewById(R.id.male);
        female = (AppCompatRadioButton) findViewById(R.id.female);

    }

    public void Method(View view) {
        int i=group.getCheckedRadioButtonId();
        male=findViewById(i);
        Toast.makeText(this, ""+male.getText(), Toast.LENGTH_SHORT).show();

    }
}