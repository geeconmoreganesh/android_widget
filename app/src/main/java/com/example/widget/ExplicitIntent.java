package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ExplicitIntent extends AppCompatActivity {

    private EditText etfirstname;
    private EditText etlastname;
    private AppCompatButton btsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        etfirstname = (EditText) findViewById(R.id.firstname);
        etlastname = (EditText) findViewById(R.id.lastname);
        btsubmit = (AppCompatButton) findViewById(R.id.submit);

        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Firstname=etfirstname.getText().toString();
                String Lastname=etlastname.getText().toString();

                Intent intent=new Intent(ExplicitIntent.this,ExplicitResult.class);
                intent.putExtra("first_name",Firstname);
                intent.putExtra("last_name",Lastname);
                startActivity(intent);
            }
        });
    }
}