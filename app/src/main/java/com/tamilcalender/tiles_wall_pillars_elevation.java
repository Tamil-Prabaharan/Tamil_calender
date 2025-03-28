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

public class tiles_wall_pillars_elevation extends AppCompatActivity {

    private AdView adView;
    private Button share,answer;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiles_wall_pillars_elevation);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView51);
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
        sp6=findViewById(R.id.spinner59);


        ed1=findViewById(R.id.editTextNumberDecimal2);
        ed2=findViewById(R.id.editTextNumberDecimal3);
        ed3=findViewById(R.id.editTextNumberDecimal4);
        ed4=findViewById(R.id.editTextNumberDecimal5);
        ed5=findViewById(R.id.editTextNumberDecimal6);
        ed6=findViewById(R.id.editTextNumberDecimal7);
        ed7=findViewById(R.id.editTextNumberDecimal9);
        ed8=findViewById(R.id.editTextNumberDecimal10);
        ed9=findViewById(R.id.editTextNumberDecimal16);
        ed10=findViewById(R.id.editTextNumberDecimal17);
        ed11=findViewById(R.id.editTextNumberDecimal18);

        answer=findViewById(R.id.button73);

        tx1 = findViewById(R.id.textView765);
        tx2 = findViewById(R.id.textView767);
        tx3 = findViewById(R.id.textView769);
        tx4 = findViewById(R.id.textView771);
        tx5 = findViewById(R.id.textView788);
        tx6 = findViewById(R.id.textView790);
        tx7 = findViewById(R.id.textView793);
        tx8 = findViewById(R.id.textView795);
        tx9 = findViewById(R.id.textView797);

        ArrayAdapter adapter = new ArrayAdapter(tiles_wall_pillars_elevation.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(tiles_wall_pillars_elevation.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(tiles_wall_pillars_elevation.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(tiles_wall_pillars_elevation.this, android.R.layout.simple_spinner_item, listitems);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(tiles_wall_pillars_elevation.this, android.R.layout.simple_spinner_item, listitems);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        ArrayAdapter adapter5 = new ArrayAdapter(tiles_wall_pillars_elevation.this, android.R.layout.simple_spinner_item, listitems1);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp6.setAdapter(adapter5);

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
                String r5 = sp5.getSelectedItem().toString();
                String r6 = sp6.getSelectedItem().toString();

                Float wall_length = Float.valueOf(ed1.getText().toString());
                Float wall_height = Float.valueOf(ed2.getText().toString());
                Float corner_beeding_height = Float.valueOf(ed3.getText().toString());
                Float one_cemenet_bag = Float.valueOf(ed4.getText().toString());
                Float tile_length = Float.valueOf(ed5.getText().toString());
                Float tile_height = Float.valueOf(ed6.getText().toString());
                Float one_tiles_price = Float.valueOf(ed7.getText().toString());
                Float one_cemenet_bag_price = Float.valueOf(ed8.getText().toString());
                Float flex_quick_price = Float.valueOf(ed9.getText().toString());
                Float color_Powder_price = Float.valueOf(ed10.getText().toString());
                Float beeding_price = Float.valueOf(ed11.getText().toString());

                float result1 = 0.0F;
                float result2 = 0.0F;
                float result3 = 0.0F;
                float result4 = 0.0F;
                float result5 = 0.0F;

                switch (r6) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result1 = (float) (wall_length / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (wall_length / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (wall_length / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = wall_length / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (wall_length / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (wall_length / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (wall_length / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (wall_length / 0.000189394);
                        } else {
                            result1 = wall_length;
                        }
                        break;
                }
                switch (r6) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (wall_height / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (wall_height / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (wall_height / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = wall_height / 12;
                        }  else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (wall_height / 304.8);
                        }  else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (wall_height / 30.48);
                        }  else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (wall_height / 0.000164579);
                        }  else if (r2.equals("மைல்")) {
                            result2 = (float) (wall_height / 0.000189394);
                        } else {
                            result2 = wall_height;
                        }
                        break;
                }
                switch (r6) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (corner_beeding_height / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (corner_beeding_height / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (corner_beeding_height / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = corner_beeding_height / 12;
                        }  else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (corner_beeding_height / 304.8);
                        }  else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (corner_beeding_height / 30.48);
                        }  else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (corner_beeding_height / 0.000164579);
                        }  else if (r3.equals("மைல்")) {
                            result3 = (float) (corner_beeding_height / 0.000189394);
                        } else {
                            result3 = corner_beeding_height;
                        }
                        break;
                }
                switch (r6) {
                    case "அடி":
                        if (r4.equals("மீட்டர்")) {
                            result4 = (float) (tile_length / 0.3048);
                        } else if (r4.equals("கிலோமீட்டர்")) {
                            result4 = (float) (tile_length / 0.0003048);
                        } else if (r4.equals("முற்றம்")) {
                            result4 = (float) (tile_length / 0.333333333);
                        } else if (r4.equals("இன்ச்")) {
                            result4 = tile_length / 12;
                        }  else if (r4.equals("மில்லிமீட்டர்")) {
                            result4 = (float) (tile_length / 304.8);
                        }  else if (r4.equals("சென்டிமீட்டர்")) {
                            result4 = (float) (tile_length / 30.48);
                        }  else if (r4.equals("கடல் மைல்")) {
                            result4 = (float) (tile_length / 0.000164579);
                        }  else if (r4.equals("மைல்")) {
                            result4 = (float) (tile_length / 0.000189394);
                        } else {
                            result4 = tile_length;
                        }
                        break;
                }
                switch (r6) {
                    case "அடி":
                        if (r5.equals("மீட்டர்")) {
                            result5 = (float) (tile_height / 0.3048);
                        } else if (r5.equals("கிலோமீட்டர்")) {
                            result5 = (float) (tile_height / 0.0003048);
                        } else if (r5.equals("முற்றம்")) {
                            result5 = (float) (tile_height / 0.333333333);
                        } else if (r5.equals("இன்ச்")) {
                            result5 = tile_height / 12;
                        }  else if (r5.equals("மில்லிமீட்டர்")) {
                            result5 = (float) (tile_height / 304.8);
                        }  else if (r5.equals("சென்டிமீட்டர்")) {
                            result5 = (float) (tile_height / 30.48);
                        }  else if (r5.equals("கடல் மைல்")) {
                            result5 = (float) (tile_height / 0.000164579);
                        }  else if (r5.equals("மைல்")) {
                            result5 = (float) (tile_height / 0.000189394);
                        } else {
                            result5 = tile_height;
                        }
                        break;
                }

                //Todo:calculate wall area
                float wall_area = result1 * result2;
                //Todo:calculate tiles area
                float tiles_area = result4 * result5;
                //Todo:calculate number of tiles
                float number_tiles = wall_area / tiles_area;
                //Todo:calculate number of tiles
                float number_cement_bags = (wall_area /100) * one_cemenet_bag;
                //Todo:calculate number of tiles
                float number_beeding = result2 / result3;
                //Todo:calculate color powder number kg
                float color_powder_kg = (wall_area/100) * 1;
                //Todo:calculate flex quick
                float flex_quick_ml = (wall_area/100) * 4;
                //Todo:calculate price
                float flex_quick_ml_price = flex_quick_ml * flex_quick_price;
                float number_beeding_price = number_beeding * beeding_price;
                float color_powder_kg_price = color_powder_kg * color_Powder_price;
                float number_cement_bags_price = number_cement_bags * one_cemenet_bag_price;
                float number_tiles_price = number_tiles * one_tiles_price;


                tx1.setText(String.valueOf(number_tiles));
                tx2.setText(String.valueOf(number_tiles_price));
                tx3.setText(String.valueOf(number_cement_bags));
                tx4.setText(String.valueOf(number_cement_bags_price));
                tx5.setText(String.valueOf(flex_quick_ml));
                tx6.setText(String.valueOf(flex_quick_ml_price));
                tx7.setText(String.valueOf(color_powder_kg));
                tx8.setText(String.valueOf(color_powder_kg_price));
                tx9.setText(String.valueOf(number_beeding_price +" price " + number_beeding + " nos "));



                Toast.makeText(tiles_wall_pillars_elevation.this, r1, Toast.LENGTH_LONG).show();

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