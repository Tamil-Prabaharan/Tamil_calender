package com.tamilcalender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class staircase_caculate extends AppCompatActivity {


    private Button share,answer,answer1;;
    private Spinner sp1,sp2,sp3,sp4,sp5;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12;
    EditText ed1,ed2,ed3,ed4;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staircase_caculate);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView47);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);
        sp3=findViewById(R.id.spinner3);
        sp4=findViewById(R.id.spinner241);
        sp5=findViewById(R.id.spinner72);

        ed1=findViewById(R.id.editTextNumberDecimal2);
        ed2=findViewById(R.id.editTextNumberDecimal3);
        ed3=findViewById(R.id.editTextNumberDecimal4);
        ed4=findViewById(R.id.editTextNumberDecimal27);

        answer=findViewById(R.id.button100);
        answer1=findViewById(R.id.button94);

        tx1 = findViewById(R.id.textView765);

        ArrayAdapter adapter = new ArrayAdapter(staircase_caculate.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(staircase_caculate.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(staircase_caculate.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(staircase_caculate.this, android.R.layout.simple_spinner_item, listitems);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(staircase_caculate.this, android.R.layout.simple_spinner_item, listitems1);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        /******************************************************************************
         0th activity button id allocation***/
        share=findViewById(R.id.button72);
        share();
        answer();

    }

    private void answer() {
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r1 = sp1.getSelectedItem().toString();
                String r2 = sp2.getSelectedItem().toString();

                String r5 = sp5.getSelectedItem().toString();

                Float stair_length = Float.valueOf(ed1.getText().toString());
                Float wall_width = Float.valueOf(ed2.getText().toString());

                float result1 = 0.0F;
                float result2 = 0.0F;

                //Todo: unit conversion
                switch (r5) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result1 = (float) (stair_length / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (stair_length / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (stair_length / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = stair_length / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (stair_length / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (stair_length / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (stair_length / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (stair_length / 0.000189394);
                        } else {
                            result1 = stair_length;
                        }
                        break;
                }
                switch (r5) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (wall_width / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (wall_width / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (wall_width / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = wall_width / 12;
                        } else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (wall_width / 304.8);
                        } else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (wall_width / 30.48);
                        } else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (wall_width / 0.000164579);
                        } else if (r2.equals("மைல்")) {
                            result2 = (float) (wall_width / 0.000189394);
                        } else {
                            result2 = wall_width;
                        }
                        break;
                }

                //Todo:calculate number of steps
                float number_stair = result1 / result2;

                tx1.setText(String.valueOf(number_stair +" steps"));

                Toast.makeText(staircase_caculate.this, r1, Toast.LENGTH_LONG).show();

            }
        });

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r3 = sp3.getSelectedItem().toString();
                String r4 = sp4.getSelectedItem().toString();
                String r5 = sp5.getSelectedItem().toString();

                Float stair_height = Float.valueOf(ed3.getText().toString());
                Float stair_riser = Float.valueOf(ed4.getText().toString());

                float result3 = 0.0F;
                float result4 = 0.0F;
                //Todo: unit conversion
                switch (r5) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (stair_height / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (stair_height / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (stair_height / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = stair_height / 12;
                        } else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (stair_height / 304.8);
                        } else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (stair_height / 30.48);
                        } else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (stair_height / 0.000164579);
                        } else if (r3.equals("மைல்")) {
                            result3 = (float) (stair_height / 0.000189394);
                        } else {
                            result3 = stair_height;
                        }
                        break;
                }
                switch (r5) {
                    case "அடி":
                        if (r4.equals("மீட்டர்")) {
                            result4 = (float) (stair_riser / 0.3048);
                        } else if (r4.equals("கிலோமீட்டர்")) {
                            result4 = (float) (stair_riser / 0.0003048);
                        } else if (r4.equals("முற்றம்")) {
                            result4 = (float) (stair_riser / 0.333333333);
                        } else if (r4.equals("இன்ச்")) {
                            result4 = stair_riser / 12;
                        } else if (r4.equals("மில்லிமீட்டர்")) {
                            result4 = (float) (stair_riser / 304.8);
                        } else if (r4.equals("சென்டிமீட்டர்")) {
                            result4 = (float) (stair_riser / 30.48);
                        } else if (r4.equals("கடல் மைல்")) {
                            result4 = (float) (stair_riser / 0.000164579);
                        } else if (r4.equals("மைல்")) {
                            result4 = (float) (stair_riser / 0.000189394);
                        } else {
                            result4 = stair_riser;
                        }
                        break;
                }

                //Todo:calculate number of steps
                float number_stair = result3 / result4;

                tx1.setText(String.valueOf(number_stair +" steps"));

                Toast.makeText(staircase_caculate.this, r3, Toast.LENGTH_LONG).show();

            }
        });
    }

    /******************************************************************************
     share activity brief explain below
     **********************************************************************************/
    private void share() {
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download this App";
                String Sub = "https://play.google.com/store/apps/details?id=com.tamilcalender&hl=en-IN";
                intent.putExtra(Intent.EXTRA_TEXT,Body);
                intent.putExtra(Intent.EXTRA_TEXT,Sub);
                startActivity(Intent.createChooser(intent,"Share using"));

            }
        });
    }
}