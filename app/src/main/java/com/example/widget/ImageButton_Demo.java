package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ImageButton_Demo extends AppCompatActivity {

    private AppCompatImageButton img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button__demo);

        img1 = (AppCompatImageButton) findViewById(R.id.img_1);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageButton_Demo.this, "You Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}