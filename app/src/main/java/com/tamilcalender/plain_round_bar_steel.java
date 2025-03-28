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

public class plain_round_bar_steel extends AppCompatActivity {
    private Button share,calculate;
    private String[] listitems,listitems1;
    private Spinner sp1,sp2,sp3;
    EditText ed1,ed2,ed3,ed4;
    TextView tx1,tx2;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plain_round_bar_steel);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView34);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinnerr255);
        sp2=findViewById(R.id.spinnerr26);
        sp3=findViewById(R.id.spinner27);

        ed1=findViewById(R.id.editTextNumberDecimal47);
        ed2=findViewById(R.id.editTextNumberDecimal48);
        ed3=findViewById(R.id.editTextNumberDecimal49);
        ed4=findViewById(R.id.editTextNumberDecimal50);

        tx1 = findViewById(R.id.textView841);
        tx2 = findViewById(R.id.textView842);


        ArrayAdapter adapter = new ArrayAdapter(plain_round_bar_steel.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(plain_round_bar_steel.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(plain_round_bar_steel.this, android.R.layout.simple_spinner_item, listitems1);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);
        /******************************************************************************
         0th activity button id allocation
         ******************************************************************************/
        share=findViewById(R.id.button72);
        calculate=findViewById(R.id.button101);
        share();
        answer();
    }

    private void answer() {

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r1 = sp1.getSelectedItem().toString();
                String r2 = sp2.getSelectedItem().toString();
                String r3 = sp3.getSelectedItem().toString();

                Float diametter = Float.valueOf(ed1.getText().toString());
                Float length = Float.valueOf(ed2.getText().toString());
                Float numbers = Float.valueOf(ed3.getText().toString());
                Float price = Float.valueOf(ed4.getText().toString());
                float result1 = 0.0F;
                float result2 = 0.0F;

                //Todo: unit conversion
                switch (r3) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result1 = (float) (diametter / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (diametter / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (diametter / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = diametter / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (diametter / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (diametter / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (diametter / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (diametter / 0.000189394);
                        } else {
                            result1 = diametter;
                        }
                        break;
                }
                switch (r3) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (length / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (length / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (length / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = length / 12;
                        } else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (length / 304.8);
                        } else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (length / 30.48);
                        } else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (length / 0.000164579);
                        } else if (r2.equals("மைல்")) {
                            result2 = (float) (length / 0.000189394);
                        } else {
                            result2 = length;
                        }
                        break;
                }
                //Todo:calculate
                float radius  = (result1 / 2);
                float desity_of_steel  = 490;//lbs
                float volume  =((22/7) * (radius * radius) * result2);
                float weight_kg  = (float) (volume * desity_of_steel * 0.453592);//1pound=0.453592
                float weight_total_kg_no  = (float) (weight_kg * numbers);
                float weight_kg_price  = (float) (weight_total_kg_no * price);

                tx1.setText(String.valueOf(weight_total_kg_no+ "  கிலோகிராம்  "));
                tx2.setText(String.valueOf(weight_kg_price+"  விலை  "));

                Toast.makeText(plain_round_bar_steel.this, r1, Toast.LENGTH_LONG).show();

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