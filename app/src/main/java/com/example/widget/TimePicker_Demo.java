package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePicker_Demo extends AppCompatActivity {

    private TimePicker time1;
    private AppCompatButton Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker__demo);

        time1 = (TimePicker) findViewById(R.id.time_1);
        Submit = (AppCompatButton) findViewById(R.id.Submit);

        time1.setCurrentHour(14);
        time1.setCurrentMinute(20);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Hours=String.valueOf("Hours : "+time1.getCurrentHour());
                String minutes=String.valueOf("Minutes : "+time1.getCurrentMinute());

                Toast.makeText(TimePicker_Demo.this,Hours+"\n"+minutes, Toast.LENGTH_SHORT).show();

            }
        });

    }
}