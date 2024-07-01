package com.tamilcalender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pandigaiandarasuvidumurai extends AppCompatActivity {

    private Button indhu,crishthumas,muslim,arasinarvidumurai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandigaiandarasuvidumurai);

        indhu = (Button) findViewById(R.id.button8);

        indhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity12();
            }

        });
        crishthumas = (Button) findViewById(R.id.button9);

        crishthumas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity13();
            }

        });
        muslim = (Button) findViewById(R.id.button10);

        muslim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity14();
            }

        });

        arasinarvidumurai = (Button) findViewById(R.id.button11);

        arasinarvidumurai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity15();
            }

        });
    }
    private void activity12() {
        Intent intent = new Intent(this,inthupandigai.class);
        startActivity(intent);

    }
    private void activity13() {
        Intent intent = new Intent(this,christumas_pandigai.class);
        startActivity(intent);

    }
    private void activity14() {
        Intent intent = new Intent(this,muslim_pandigai.class);
        startActivity(intent);

    }
    private void activity15() {
        Intent intent = new Intent(this,arasinar_vidumurai.class);
        startActivity(intent);

    }
}