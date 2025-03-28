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

public class basement_floor_concrete extends AppCompatActivity {

    private AdView adView;
    private Button share,answer,answer1;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basement_floor_concrete);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView12);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);


        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinner38);
        sp2=findViewById(R.id.spinner39);
        sp3=findViewById(R.id.spinner40);
        sp4=findViewById(R.id.spinner68);


        ed1=findViewById(R.id.editTextNumberDecimal24);
        ed2=findViewById(R.id.editTextNumberDecimal25);
        ed3=findViewById(R.id.editTextNumberDecimal26);
        ed4=findViewById(R.id.editTextNumberDecimal30);
        ed5=findViewById(R.id.editTextNumberDecimal31);
        ed6=findViewById(R.id.editTextNumberDecimal67);
        ed7=findViewById(R.id.editTextNumberDecimal10);
        ed8=findViewById(R.id.editTextNumberDecimal11);
        ed9=findViewById(R.id.editTextNumberDecimal12);
        ed10=findViewById(R.id.editTextNumberDecimal16);

        answer=findViewById(R.id.button73);

        tx1 = findViewById(R.id.textView765);
        tx2 = findViewById(R.id.textView767);
        tx3 = findViewById(R.id.textView769);
        tx4 = findViewById(R.id.textView771);
        tx5 = findViewById(R.id.textView773);
        tx6 = findViewById(R.id.textView775);
        tx7 = findViewById(R.id.textView777);
        tx8 = findViewById(R.id.textView790);

        ArrayAdapter adapter = new ArrayAdapter(basement_floor_concrete.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(basement_floor_concrete.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(basement_floor_concrete.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(basement_floor_concrete.this, android.R.layout.simple_spinner_item, listitems1);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);
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
                String r3 = sp3.getSelectedItem().toString();
                String r4 = sp4.getSelectedItem().toString();

                Float base_length = Float.valueOf(ed1.getText().toString());
                Float base_width = Float.valueOf(ed2.getText().toString());
                Float base_height = Float.valueOf(ed3.getText().toString());
                Float cement = Float.valueOf(ed4.getText().toString());
                Float sand = Float.valueOf(ed5.getText().toString());
                Float aggregate = Float.valueOf(ed6.getText().toString());
                Float cement_bag_rate = Float.valueOf(ed7.getText().toString());
                Float sand_rate = Float.valueOf(ed8.getText().toString());
                Float water_rate = Float.valueOf(ed9.getText().toString());
                Float aggregate_rate = Float.valueOf(ed10.getText().toString());
                float result1 = 0.0F;
                float result2 = 0.0F;
                float result3 = 0.0F;
                //Todo: unit conversion
                switch (r4) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result1 = (float) (base_length / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (base_length / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (base_length / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = base_length / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (base_length / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (base_length / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (base_length / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (base_length / 0.000189394);
                        } else {
                            result1 = base_length;
                        }
                        break;
                }
                switch (r4) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (base_width / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (base_width / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (base_width / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = base_width / 12;
                        } else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (base_width / 304.8);
                        } else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (base_width / 30.48);
                        } else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (base_width / 0.000164579);
                        } else if (r2.equals("மைல்")) {
                            result2 = (float) (base_width / 0.000189394);
                        } else {
                            result2 = base_width;
                        }
                        break;
                }
                switch (r4) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (base_height / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (base_height / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (base_height / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = base_height / 12;
                        } else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (base_height / 304.8);
                        } else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (base_height / 30.48);
                        } else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (base_height / 0.000164579);
                        } else if (r3.equals("மைல்")) {
                            result3 = (float) (base_height / 0.000189394);
                        } else {
                            result3 = base_height;
                        }
                        break;
                }



                //Todo:calculate pcc volume
                float pcc_volume  = (result1 * result2 * result3);

                float tatal_ratio = cement + sand + aggregate ;
                //Todo:calculate cubic feet to m3
                float cubic_feet_m3  = (float) (pcc_volume *  0.0283168466);
                //Todo:calculate cement kg
                float cement_kg  = (float) (cement / tatal_ratio) * cubic_feet_m3 * 1440;
                //Todo:calculate no bags
                float no_bags  = (float) (cement_kg / 50);
                //Todo:calculate sand
                float sand_volume  = (float) (sand / tatal_ratio) * cubic_feet_m3;
                float sand_volume_kg  = (float) sand_volume  * 1650;
                float sand_volume_cuft  = (float) sand_volume_kg  / 47;
                float sand_volume_unit  = (float) sand_volume_cuft  / 100;
                //Todo:calculate aggregate
                float aggregate_volume  = (float) (aggregate / tatal_ratio) * cubic_feet_m3;
                float aggregate_volume_kg  = (float) aggregate_volume  * 1700;
                float aggregate_volume_cuft  = (float) aggregate_volume_kg  / 47;
                float aggregate_volume_unit  = (float) aggregate_volume_cuft  / 100;
                //Todo:calculate water
                float water_volume  = (float) 0.5 * cement_kg;
                //Todo:calculate price
                float water_volume_P  = (float) water_volume * water_rate;
                float cement_volume_P  = (float) no_bags * cement_bag_rate;
                float sand_volume_P  = (float) sand_volume_unit * sand_rate;
                float agggregate_volume_P  = (float) aggregate_volume_unit * aggregate_rate;


                tx1.setText(String.valueOf(aggregate_volume_unit));
                tx2.setText(String.valueOf(agggregate_volume_P));
                tx3.setText(String.valueOf(no_bags));
                tx4.setText(String.valueOf(cement_volume_P));
                tx5.setText(String.valueOf(sand_volume_unit));
                tx6.setText(String.valueOf(sand_volume_P));
                tx7.setText(String.valueOf(water_volume));
                tx8.setText(String.valueOf(water_volume_P));

                Toast.makeText(basement_floor_concrete.this, r1, Toast.LENGTH_LONG).show();

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