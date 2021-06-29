package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressBar_Demo extends AppCompatActivity {

    private ProgressBar Progress1;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar__demo);

        Progress1 = (ProgressBar) findViewById(R.id.Progress1);

        progress();

    }
    void  progress()
    {
       Timer timer =new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
              count++;
              Progress1.setProgress(count);
              if(count==100)
              {
                timer.cancel();
              }

            }
        };
        timer.schedule(timerTask,0,100);
    }
}