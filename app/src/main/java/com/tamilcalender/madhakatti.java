package com.tamilcalender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class madhakatti extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madhakatti);

        textView = findViewById(R.id.textView497);

        // Get the current date
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String dateString = sdf.format(currentDate);

        // Show text based on the current date
        showTextBasedOnDate(dateString);

    }
    private void showTextBasedOnDate(String date) {
        switch (date) {
            case "2024-03-16":
                textView.setText("Special Event on March 17th!");
                break;
            case "2024-03-17":
                textView.setText("Special Event on March 16th!");
                break;
            // Add more cases for other dates as needed
            default:
                textView.setText("No special event today.");
        }
    }
}