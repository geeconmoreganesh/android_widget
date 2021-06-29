package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class DatePicker_Demo extends AppCompatActivity {

    private DatePicker date1;
    private AppCompatButton Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker__demo);

        date1 = (DatePicker) findViewById(R.id.date_1);
        Submit = (AppCompatButton) findViewById(R.id.Submit);

        int day=date1.getDayOfMonth();
        int month=date1.getMonth();
        int year=date1.getYear();

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day=String.valueOf("Day : "+date1.getDayOfMonth());
                String month=String.valueOf("Month : "+date1.getMonth()+1);
                String year=String.valueOf("Year : "+date1.getYear());

                Toast.makeText(DatePicker_Demo.this, day+"\n"+month+"\n"+year, Toast.LENGTH_SHORT).show();
            }
        });

    }
}