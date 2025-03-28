package com.tamilcalender;

import static android.app.ProgressDialog.show;

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


public class brick_mortar extends AppCompatActivity {

    private AdView adView;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10;
    private Button share;
    private Button answer;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brick_mortar);



        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView13);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);


        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);
        sp3=findViewById(R.id.spinner3);
        sp4=findViewById(R.id.spinner4);
        sp5=findViewById(R.id.spinneeeeer5);
        sp6=findViewById(R.id.spinner6);
        sp7=findViewById(R.id.spinner7);
        sp8=findViewById(R.id.spinner8);
        sp9=findViewById(R.id.spinner9);
        sp10=findViewById(R.id.sspinner5);

        ed1=findViewById(R.id.editTextNumberDecimal2);
        ed2=findViewById(R.id.editTextNumberDecimal3);
        ed3=findViewById(R.id.editTextNumberDecimal4);
        ed4=findViewById(R.id.editTextNumberSigned);
        ed5=findViewById(R.id.editTextNumberSigned2);
        ed6=findViewById(R.id.editTextNumberSigned3);
        ed7=findViewById(R.id.editTextNumberDecimal5);
        ed8=findViewById(R.id.editTextNumberDecimal6);
        ed9=findViewById(R.id.editTextNumberDecimal7);
        ed10=findViewById(R.id.editTextNumberDecimal8);
        ed11=findViewById(R.id.editTextNumberDecimal13);
        ed12=findViewById(R.id.editTextNumberDecimal14);
        ed13=findViewById(R.id.editTextNumberDecimal15);
        ed14=findViewById(R.id.editTextNumberDecimal9);
        ed15=findViewById(R.id.editTextNumberDecimal10);
        ed16=findViewById(R.id.editTextNumberDecimal11);
        ed17=findViewById(R.id.editTextNumberDecimal12);

        answer=findViewById(R.id.button74);

        tx1 = findViewById(R.id.textView765);
        tx2 = findViewById(R.id.textView767);
        tx3 = findViewById(R.id.textView769);
        tx4 = findViewById(R.id.textView771);
        tx5 = findViewById(R.id.textView773);
        tx6 = findViewById(R.id.textView775);
        tx7 = findViewById(R.id.textView777);
        tx8 = findViewById(R.id.textView779);



        ArrayAdapter adapter = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        ArrayAdapter adapter5 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp6.setAdapter(adapter5);

        ArrayAdapter adapter6 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp7.setAdapter(adapter6);

        ArrayAdapter adapter7 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter7.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp8.setAdapter(adapter7);

        ArrayAdapter adapter8 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems);
        adapter8.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp9.setAdapter(adapter8);

        ArrayAdapter adapter9 = new ArrayAdapter(brick_mortar.this, android.R.layout.simple_spinner_item, listitems1);
        adapter9.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp10.setAdapter(adapter9);


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
                String r5 = sp5.getSelectedItem().toString();
                String r6 = sp6.getSelectedItem().toString();
                String r7 = sp7.getSelectedItem().toString();
                String r8 = sp8.getSelectedItem().toString();
                String r9 = sp9.getSelectedItem().toString();
                String r10 = sp10.getSelectedItem().toString();

                Float wall_length = Float.valueOf(ed1.getText().toString());
                Float wall_width = Float.valueOf(ed2.getText().toString());
                Float wall_thickness = Float.valueOf(ed3.getText().toString());
                Float cement_ratio = Float.valueOf(ed4.getText().toString());
                Float sand_ratio = Float.valueOf(ed5.getText().toString());
                Float cement_sand_mortar = Float.valueOf(ed6.getText().toString());
                Float one_cemenet_bag = Float.valueOf(ed7.getText().toString());
                Float brick_length = Float.valueOf(ed8.getText().toString());
                Float brick_width = Float.valueOf(ed9.getText().toString());
                Float brick_thickness = Float.valueOf(ed10.getText().toString());
                Float window_length = Float.valueOf(ed11.getText().toString());
                Float window_width = Float.valueOf(ed12.getText().toString());
                Float window_thickness = Float.valueOf(ed13.getText().toString());
                Float one_brick_price = Float.valueOf(ed14.getText().toString());
                Float one_cement_bag_price = Float.valueOf(ed15.getText().toString());
                Float sand_unit_price = Float.valueOf(ed16.getText().toString());
                Float water_liter_price = Float.valueOf(ed17.getText().toString());

                float result = 0.0F;
                float result2 = 0.0F;
                float result3 = 0.0F;
                float result4 = 0.0F;
                float result5 = 0.0F;
                float result6 = 0.0F;
                float result7 = 0.0F;
                float result8 = 0.0F;
                float result9 = 0.0F;

                switch (r10) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result = (float) (wall_length / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result = (float) (wall_length / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result = (float) (wall_length / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result = wall_length / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result = (float) (wall_length / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result = (float) (wall_length / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result = (float) (wall_length / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result = (float) (wall_length / 0.000189394);
                        } else {
                            result = wall_length;
                        }
                        break;
                }
                switch (r10) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (wall_width / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (wall_width / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (wall_width / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = wall_width / 12;
                        }  else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (wall_width / 304.8);
                        }  else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (wall_width / 30.48);
                        }  else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (wall_width / 0.000164579);
                        }  else if (r2.equals("மைல்")) {
                            result2 = (float) (wall_width / 0.000189394);
                        } else {
                            result2 = wall_width;
                        }
                        break;
                }
                switch (r10) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (wall_thickness / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (wall_thickness / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (wall_thickness / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = wall_thickness / 12;
                        }  else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (wall_thickness / 304.8);
                        }  else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (wall_thickness / 30.48);
                        }  else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (wall_thickness / 0.000164579);
                        }  else if (r3.equals("மைல்")) {
                            result3 = (float) (wall_thickness / 0.000189394);
                        } else {
                            result3 = wall_thickness;
                        }
                        break;
                }
                switch (r10) {
                    case "அடி":
                        if (r4.equals("மீட்டர்")) {
                            result4 = (float) (brick_length / 0.3048);
                        } else if (r4.equals("கிலோமீட்டர்")) {
                            result4 = (float) (brick_length / 0.0003048);
                        } else if (r4.equals("முற்றம்")) {
                            result4 = (float) (brick_length / 0.333333333);
                        } else if (r4.equals("இன்ச்")) {
                            result4 = brick_length / 12;
                        }  else if (r4.equals("மில்லிமீட்டர்")) {
                            result4 = (float) (brick_length / 304.8);
                        }  else if (r4.equals("சென்டிமீட்டர்")) {
                            result4 = (float) (brick_length / 30.48);
                        }  else if (r4.equals("கடல் மைல்")) {
                            result4 = (float) (brick_length / 0.000164579);
                        }  else if (r4.equals("மைல்")) {
                            result4 = (float) (brick_length / 0.000189394);
                        } else {
                            result4 = brick_length;
                        }
                        break;
                }
                switch (r10) {
                    case "அடி":
                        if (r5.equals("மீட்டர்")) {
                            result5 = (float) (brick_width / 0.3048);
                        } else if (r5.equals("கிலோமீட்டர்")) {
                            result5 = (float) (brick_width / 0.0003048);
                        } else if (r5.equals("முற்றம்")) {
                            result5 = (float) (brick_width / 0.333333333);
                        } else if (r5.equals("இன்ச்")) {
                            result5 = brick_width / 12;
                        }  else if (r5.equals("மில்லிமீட்டர்")) {
                            result5 = (float) (brick_width / 304.8);
                        }  else if (r5.equals("சென்டிமீட்டர்")) {
                            result5 = (float) (brick_width / 30.48);
                        }  else if (r5.equals("கடல் மைல்")) {
                            result5 = (float) (brick_width / 0.000164579);
                        }  else if (r5.equals("மைல்")) {
                            result5 = (float) (brick_width / 0.000189394);
                        } else {
                            result5 = brick_width;
                        }
                        break;
                }
                switch (r10) {
                    case "அடி":
                        if (r6.equals("மீட்டர்")) {
                            result6 = (float) (brick_thickness / 0.3048);
                        } else if (r6.equals("கிலோமீட்டர்")) {
                            result6 = (float) (brick_thickness / 0.0003048);
                        } else if (r6.equals("முற்றம்")) {
                            result6 = (float) (brick_thickness / 0.333333333);
                        } else if (r6.equals("இன்ச்")) {
                            result6 = brick_thickness / 12;
                        }  else if (r6.equals("மில்லிமீட்டர்")) {
                            result6 = (float) (brick_thickness / 304.8);
                        }  else if (r6.equals("சென்டிமீட்டர்")) {
                            result6 = (float) (brick_thickness / 30.48);
                        }  else if (r6.equals("கடல் மைல்")) {
                            result6 = (float) (brick_thickness / 0.000164579);
                        }  else if (r6.equals("மைல்")) {
                            result6 = (float) (brick_thickness / 0.000189394);
                        } else {
                            result6 = brick_thickness;
                        }
                        break;
                }
                switch (r10) {
                    case "அடி":
                        if (r7.equals("மீட்டர்")) {
                            result7 = (float) (window_length / 0.3048);
                        } else if (r7.equals("கிலோமீட்டர்")) {
                            result7 = (float) (window_length / 0.0003048);
                        } else if (r7.equals("முற்றம்")) {
                            result7 = (float) (window_length / 0.333333333);
                        } else if (r7.equals("இன்ச்")) {
                            result7 = window_length / 12;
                        }  else if (r7.equals("மில்லிமீட்டர்")) {
                            result7 = (float) (window_length / 304.8);
                        }  else if (r7.equals("சென்டிமீட்டர்")) {
                            result7 = (float) (window_length / 30.48);
                        }  else if (r7.equals("கடல் மைல்")) {
                            result7 = (float) (window_length / 0.000164579);
                        }  else if (r7.equals("மைல்")) {
                            result7 = (float) (window_length / 0.000189394);
                        } else {
                            result7 = window_length;
                        }
                        break;
                }
                switch (r10) {
                    case "அடி":
                        if (r8.equals("மீட்டர்")) {
                            result8 = (float) (window_width / 0.3048);
                        } else if (r8.equals("கிலோமீட்டர்")) {
                            result8 = (float) (window_width / 0.0003048);
                        } else if (r8.equals("முற்றம்")) {
                            result8 = (float) (window_width / 0.333333333);
                        } else if (r8.equals("இன்ச்")) {
                            result8 = window_width / 12;
                        }  else if (r8.equals("மில்லிமீட்டர்")) {
                            result8 = (float) (window_width / 304.8);
                        }  else if (r8.equals("சென்டிமீட்டர்")) {
                            result8 = (float) (window_width / 30.48);
                        }  else if (r8.equals("கடல் மைல்")) {
                            result8 = (float) (window_width / 0.000164579);
                        }  else if (r8.equals("மைல்")) {
                            result8 = (float) (window_width / 0.000189394);
                        } else {
                            result8 = window_width;
                        }
                        break;
                }
                switch (r10) {
                    case "அடி":
                        if (r9.equals("மீட்டர்")) {
                            result9 = (float) (window_thickness / 0.3048);
                        } else if (r9.equals("கிலோமீட்டர்")) {
                            result9 = (float) (window_thickness / 0.0003048);
                        } else if (r9.equals("முற்றம்")) {
                            result9 = (float) (window_thickness / 0.333333333);
                        } else if (r9.equals("இன்ச்")) {
                            result9 = window_thickness / 12;
                        }  else if (r9.equals("மில்லிமீட்டர்")) {
                            result9 = (float) (window_thickness / 304.8);
                        }  else if (r9.equals("சென்டிமீட்டர்")) {
                            result9 = (float) (window_thickness / 30.48);
                        }  else if (r9.equals("கடல் மைல்")) {
                            result9 = (float) (window_thickness / 0.000164579);
                        }  else if (r9.equals("மைல்")) {
                            result9 = (float) (window_thickness / 0.000189394);
                        } else {
                            result9 = window_thickness;
                        }
                        break;
                }

                //Todo:calculate wall volume
                float wall_volume = result * result2 * result3;
                //Todo:calculate window volume
                float window_volume = result7 * result8 * result9;
                //Todo:calculate brick volume
                float brick_volume = result4 * result5 * result6;
                //Todo:add cement and sand
                float cement_sand_add_ratio = cement_ratio + sand_ratio;
                //Todo:find dry mortar
                float morTar = ((cement_sand_mortar/100)*wall_volume);
                double DryVolume = morTar*1.27;
                //Todo:subtract window volume from wall volume
                float total_wall_volume = wall_volume - window_volume;
                //Todo:subtract mortar volume from total brick mortar volume
                //Todo:number of bricks is divide brick volume from brick_in_wall_volume
                float brick_in_wall_volume = total_wall_volume - cement_sand_mortar;
                float number_bricks = brick_in_wall_volume / brick_volume;
                //Todo:cement volume of cu.ft & number of bags
                float cement_volume = (float) ((cement_ratio / cement_sand_add_ratio)*DryVolume);
                float cement_number_bag = (float) (cement_volume / one_cemenet_bag);
                //Todo:sand volume number of cu.ft & unit
                float sand_volume = (float) ((sand_ratio / cement_sand_add_ratio)*DryVolume);
                float unit_sand = (float) (sand_volume / 100);
                //Todo:water volume number of cu.ft & liter
                float weight_cement = (float) (cement_volume * 94);
                float water = (float) (weight_cement * 0.55);
                float gallon_water = (float) (water / 8.34);
                float liter_water = (float) (gallon_water * 3.78541);
                //Todo:price brick,cement,sand,water
                float price_water = (float) (liter_water * water_liter_price);
                float price_brick = (float) (number_bricks * one_brick_price);
                float price_cement = (float) (cement_number_bag * one_cement_bag_price);
                float price_sand = (float) (unit_sand * sand_unit_price);

                tx1.setText(String.valueOf(number_bricks));
                tx2.setText(String.valueOf(price_brick));
                tx3.setText(String.valueOf(cement_number_bag));
                tx4.setText(String.valueOf(price_cement));
                tx5.setText(String.valueOf(unit_sand));
                tx6.setText(String.valueOf(price_sand));
                tx7.setText(String.valueOf(liter_water));
                tx8.setText(String.valueOf(price_water));

                Toast.makeText(brick_mortar.this, r1, Toast.LENGTH_LONG).show();

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
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share using"));

            }
        });

    }
}




