package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ExplicitResult extends AppCompatActivity {

    private TextView UserfirstName;
    private TextView UserlastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_result);

        UserfirstName = (TextView) findViewById(R.id.first_name);
        UserlastName = (TextView) findViewById(R.id.last_name);

        Bundle bundle=getIntent().getExtras();
        String FirstName=bundle.getString("first_name");
        String LastName=bundle.getString("last_name");

        UserfirstName.setText(FirstName);
        UserlastName.setText(LastName);


    }
}