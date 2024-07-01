package com.tamilcalender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class vasthu extends AppCompatActivity {

    private TextView textView;
    private Handler handler;
    private String[] texts = {
            "Text 1",
            "Text 2",
            "Text 3"
            // Add more texts as needed
    };
    private int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vasthu);


        textView = findViewById(R.id.textView4);
        handler = new Handler(Looper.getMainLooper());

        // Start the text changing task
        changeTextPeriodically();
    }

    private void changeTextPeriodically() {
        // Post a delayed task to update the text after an interval
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Update the text
                updateText();

                // Schedule the next update
                changeTextPeriodically();
            }
        }, 86400000); // Change text every 5 seconds (adjust as needed)
    }

    private void updateText() {
        // Update text to the next text in the array
        textView.setText(texts[currentIndex]);

        // Move to the next text in the array
        currentIndex = (currentIndex + 1) % texts.length;
    }
}