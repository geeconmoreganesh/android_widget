package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ImplicitIntent extends AppCompatActivity {

    private AppCompatButton share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        share = (AppCompatButton) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Share My App");
                intent.putExtra(Intent.EXTRA_TEXT,"Welcome to here");

                intent.setType("text/plain");
                startActivity(intent);

            }
        });

    }
}