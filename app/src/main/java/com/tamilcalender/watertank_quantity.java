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

public class watertank_quantity extends AppCompatActivity {
    private AdView adView;

    private Button share,answer;;
    private Spinner sp1,sp2,sp3,sp4;
    private String[] listitems,listitems1;
    TextView tx1;
    EditText ed1,ed2,ed3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watertank_quantity);

        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView2);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);


        //todo:WATER TANK
        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);

        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);
        sp3=findViewById(R.id.spinner3);
        sp4=findViewById(R.id.spinneeeeer5);


        ed1=findViewById(R.id.editTextNumberDecimal2);
        ed2=findViewById(R.id.editTextNumberDecimal3);
        ed3=findViewById(R.id.editTextNumberDecimal4);

        tx1 = findViewById(R.id.textView765);

        ArrayAdapter adapter = new ArrayAdapter(watertank_quantity.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(watertank_quantity.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(watertank_quantity.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(watertank_quantity.this, android.R.layout.simple_spinner_item, listitems1);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        /******************************************************************************
         0th activity button id allocation***/
        share=findViewById(R.id.button72);
        answer=findViewById(R.id.button94);
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

                Float wall_inner_length = Float.valueOf(ed1.getText().toString());
                Float wall_inner_height = Float.valueOf(ed2.getText().toString());
                Float wall_inner_width = Float.valueOf(ed3.getText().toString());
                float result = 0.0F;
                float result1 = 0.0F;
                float result2 = 0.0F;
                switch (r4) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result = (float) (wall_inner_length / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result = (float) (wall_inner_length / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result = (float) (wall_inner_length / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result = wall_inner_length / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result = (float) (wall_inner_length / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result = (float) (wall_inner_length / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result = (float) (wall_inner_length / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result = (float) (wall_inner_length / 0.000189394);
                        } else {
                            result = wall_inner_length;
                        }
                        break;
                }
                switch (r4) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result1 = (float) (wall_inner_height / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result1 = (float) (wall_inner_height / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result1 = (float) (wall_inner_height / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result1 = wall_inner_height / 12;
                        }  else if (r2.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (wall_inner_height / 304.8);
                        }  else if (r2.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (wall_inner_height / 30.48);
                        }  else if (r2.equals("கடல் மைல்")) {
                            result1 = (float) (wall_inner_height / 0.000164579);
                        }  else if (r2.equals("மைல்")) {
                            result1 = (float) (wall_inner_height / 0.000189394);
                        } else {
                            result1 = wall_inner_height;
                        }
                        break;
                }
                switch (r4) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result2 = (float) (wall_inner_width / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result2 = (float) (wall_inner_width / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result2 = (float) (wall_inner_width / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result2 = wall_inner_width / 12;
                        }  else if (r3.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (wall_inner_width / 304.8);
                        }  else if (r3.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (wall_inner_width / 30.48);
                        }  else if (r3.equals("கடல் மைல்")) {
                            result2 = (float) (wall_inner_width / 0.000164579);
                        }  else if (r3.equals("மைல்")) {
                            result2 = (float) (wall_inner_width / 0.000189394);
                        } else {
                            result2 = wall_inner_width;
                        }
                        break;

                }
                //Todo:calculate wall area
                float wall_area = result * result1 * result2 ;
                //Todo:calculate water
                float liter_water = (float) (wall_area * 28.31);


                tx1.setText(String.valueOf(wall_area +"cu.ft   " + liter_water + "liter"));


                Toast.makeText(watertank_quantity.this, r1, Toast.LENGTH_LONG).show();
                Toast.makeText(watertank_quantity.this, r2, Toast.LENGTH_LONG).show();
                Toast.makeText(watertank_quantity.this, r3, Toast.LENGTH_LONG).show();

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