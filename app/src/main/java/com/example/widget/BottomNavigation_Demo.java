package com.example.widget;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation_Demo extends AppCompatActivity {

    private BottomNavigationView bottomnavigate1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation__demo);

        components();
    }
    public void components()
    {
        bottomnavigate1 = (BottomNavigationView) findViewById(R.id.bottomnavigate_1);
        bottomnavigate1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.item1:
                        Toast.makeText(BottomNavigation_Demo.this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.item2:
                        Toast.makeText(BottomNavigation_Demo.this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.item3:
                        Toast.makeText(BottomNavigation_Demo.this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.item4:
                        Toast.makeText(BottomNavigation_Demo.this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return true;
                }
            }
        });
    }
}