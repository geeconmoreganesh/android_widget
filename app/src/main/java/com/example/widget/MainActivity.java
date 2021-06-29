package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton btn1;
    private AppCompatButton toastBtn2;
    private AppCompatButton radioBtn3;
    private AppCompatButton checkBtn4;
    private AppCompatButton toggleBtn5;
    private AppCompatButton switchBtn6;
    private AppCompatButton imageBtn7;
    private AppCompatButton spinnerBtn8;
    private AppCompatButton ratingBtn9;
    private AppCompatButton seekBtn10;
    private AppCompatButton progressBtn11;
    private AppCompatButton searchviewBtn12;
    private AppCompatButton alertBtn13;
    private AppCompatButton dateBtn14;
    private AppCompatButton timeBtn15;
    private AppCompatButton optionMenuBtn16;
    private AppCompatButton popUpMenuBtn17;
    private AppCompatButton bottomNavigationBtn18;
    private AppCompatButton custombottomNavigationBtn19;
    private AppCompatButton navigationDrawerBtn20;
    private AppCompatButton customnavigationDrawerBtn21;
    private AppCompatButton recyclerViewBtn22;
    private AppCompatButton ImplicitIntent;
    private AppCompatButton ExplicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (AppCompatButton) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Button_Demo.class);
                startActivity(intent);
            }
        });

        toastBtn2 = (AppCompatButton) findViewById(R.id.toast_btn2);
        toastBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Toast_Demo.class);
                startActivity(intent);
            }
        });

        radioBtn3 = (AppCompatButton) findViewById(R.id.radio_btn3);
        radioBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RadioButton_Demo.class);
                startActivity(intent);
            }
        });

        checkBtn4 = (AppCompatButton) findViewById(R.id.check_btn4);
        checkBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CheckBox_Demo.class);
                startActivity(intent);
            }
        });

        toggleBtn5 = (AppCompatButton) findViewById(R.id.toggle_btn5);
        toggleBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ToggleButton_Demo.class);
                startActivity(intent);
            }
        });

        switchBtn6 = (AppCompatButton) findViewById(R.id.switch_btn6);
        switchBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SwitchButton_Demo.class);
                startActivity(intent);
            }
        });

        imageBtn7 = (AppCompatButton) findViewById(R.id.image_btn7);
        imageBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ImageButton_Demo.class);
                startActivity(intent);
            }
        });

        spinnerBtn8 = (AppCompatButton) findViewById(R.id.spinner_btn8);
        spinnerBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Spinner_Demo.class);
                startActivity(intent);
            }
        });

        ratingBtn9 = (AppCompatButton) findViewById(R.id.rating_btn9);
        ratingBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RatingBar_Demo.class);
                startActivity(intent);
            }
        });

        seekBtn10 = (AppCompatButton) findViewById(R.id.seek_btn10);
        seekBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SeekBar_Demo.class);
                startActivity(intent);
            }
        });

        progressBtn11 = (AppCompatButton) findViewById(R.id.progress_btn11);
        progressBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProgressBar_Demo.class);
                startActivity(intent);
            }
        });

        searchviewBtn12 = (AppCompatButton) findViewById(R.id.search_btn12);
        searchviewBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SearchView_Demo.class);
                startActivity(intent);
            }
        });

        alertBtn13 = (AppCompatButton) findViewById(R.id.alert_btn13);
        alertBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AlertDialog_Demo.class);
                startActivity(intent);
            }
        });

        dateBtn14 = (AppCompatButton) findViewById(R.id.date_btn14);
        dateBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DatePicker_Demo.class);
                startActivity(intent);
            }
        });

        timeBtn15 = (AppCompatButton) findViewById(R.id.time_btn15);
        timeBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TimePicker_Demo.class);
                startActivity(intent);
            }
        });

        optionMenuBtn16 = (AppCompatButton) findViewById(R.id.optionMenu_btn16);
        optionMenuBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Optionmenu_Demo.class);
                startActivity(intent);
            }
        });

        popUpMenuBtn17 = (AppCompatButton) findViewById(R.id.popUpMenu_btn17);
        popUpMenuBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PopUpMenu_Demo.class);
                startActivity(intent);
            }
        });

        bottomNavigationBtn18 = (AppCompatButton) findViewById(R.id.bottomNavigation_btn18);
        bottomNavigationBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BottomNavigation_Demo.class);
                startActivity(intent);
            }
        });

        custombottomNavigationBtn19 = (AppCompatButton) findViewById(R.id.custombottomNavigationBtn19);
        custombottomNavigationBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CustomBottomNavigation_Demo.class);
                startActivity(intent);
            }
        });

        navigationDrawerBtn20 = (AppCompatButton) findViewById(R.id.navigationDrawerBtn20);
        navigationDrawerBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NavigationDrawer_Demo.class);
                startActivity(intent);
            }
        });

        customnavigationDrawerBtn21 = (AppCompatButton) findViewById(R.id.customnavigationDrawerBtn21);
        customnavigationDrawerBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CustomNavigationDrawer.class);
                startActivity(intent);
            }
        });

        recyclerViewBtn22 = (AppCompatButton) findViewById(R.id.recyclerViewBtn22);
        recyclerViewBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RecyclerView_Demo.class);
                startActivity(intent);
            }
        });

        ImplicitIntent = (AppCompatButton) findViewById(R.id.Implicit_Intent);
        ImplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ImplicitIntent.class);
                startActivity(intent);
            }
        });

        ExplicitIntent = (AppCompatButton) findViewById(R.id.Explicit_Intent);
        ExplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ExplicitIntent.class);
                startActivity(intent);
            }
        });

    }

}