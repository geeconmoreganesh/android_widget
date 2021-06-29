package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRatingBar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBar_Demo extends AppCompatActivity {

    private AppCompatRatingBar ratingBar;
    private AppCompatButton submit;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar__demo);

        ratingBar = (AppCompatRatingBar) findViewById(R.id.rating);
        submit = (AppCompatButton) findViewById(R.id.submit);
        result = (TextView) findViewById(R.id.result);

//        Float ratingNumber = ratingBar.getRating();
//        String myresult=Float.toString(ratingNumber);
//        result.setText(myresult);
//        --------------or--------------------
//        result.setText(Float.toString(ratingNumber));
//        --------------or--------------------
//        result.setText(String.valueOf(ratingNumber));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating1="Rating : "+ratingBar.getRating();
                String totalStars="Total Stars : "+ratingBar.getNumStars();
                result.setText(rating1+totalStars);
                Toast.makeText(RatingBar_Demo.this, "Your Rating is:"+rating1+totalStars, Toast.LENGTH_SHORT).show();
            }
        });

    }
}