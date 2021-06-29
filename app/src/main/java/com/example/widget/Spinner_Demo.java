package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Spinner_Demo extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private TextView text1;
    private Spinner spin;
    String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner__demo);

        text1 = (TextView) findViewById(R.id.text1);
        spin = (Spinner) findViewById(R.id.spin);

        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this,R.array.City,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
     data=parent.getItemAtPosition(position).toString();
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}