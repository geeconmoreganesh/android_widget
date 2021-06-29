package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerView_Demo extends AppCompatActivity {
    private RecyclerView rvRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view__demo);

        rvRecycle = (RecyclerView) findViewById(R.id.rv_recycle);

        String[] favourite={"Burger","Samosa","Slicies","Cold Drink","Burger","Samosa","Slicies","Cold Drink","Burger","Samosa","Slicies","Cold Drink"};

        rvRecycle.setLayoutManager(new LinearLayoutManager(this));

        rvRecycle.setAdapter(new Recycler_Adapter(favourite));



    }
}