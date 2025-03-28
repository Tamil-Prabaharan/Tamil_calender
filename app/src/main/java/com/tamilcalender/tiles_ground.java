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

public class tiles_ground extends AppCompatActivity {

    private AdView adView;
    private Button share,answer;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiles_ground);
        
        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView50);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);
        sp3=findViewById(R.id.spinner3);
        sp4=findViewById(R.id.spinner10);
        sp5=findViewById(R.id.spinner4);
        sp6=findViewById(R.id.spinneeeeer5);
        sp7=findViewById(R.id.spinner6);
        sp8=findViewById(R.id.spinner58);


        ed1=findViewById(R.id.editTextNumberDecimal2);
        ed2=findViewById(R.id.editTextNumberDecimal3);
        ed3=findViewById(R.id.editTextNumberDecimal4);
        ed4=findViewById(R.id.editTextNumberDecimal19);
        ed5=findViewById(R.id.editTextNumberSigned);
        ed6=findViewById(R.id.editTextNumberSigned2);
        ed7=findViewById(R.id.editTextNumberDecimal5);
        ed8=findViewById(R.id.editTextNumberDecimal6);
        ed9=findViewById(R.id.editTextNumberDecimal7);
        ed10=findViewById(R.id.editTextNumberDecimal8);
        ed11=findViewById(R.id.editTextNumberDecimal9);
        ed12=findViewById(R.id.editTextNumberDecimal10);
        ed13=findViewById(R.id.editTextNumberDecimal11);
        ed14=findViewById(R.id.editTextNumberDecimal12);
        ed15=findViewById(R.id.editTextNumberDecimal16);
        ed16=findViewById(R.id.editTextNumberDecimal17);
        ed17=findViewById(R.id.editTextNumberDecimal18);

        answer=findViewById(R.id.button73);

        tx1 = findViewById(R.id.textView765);
        tx2 = findViewById(R.id.textView767);
        tx3 = findViewById(R.id.textView769);
        tx4 = findViewById(R.id.textView771);
        tx5 = findViewById(R.id.textView773);
        tx6 = findViewById(R.id.textView775);
        tx7 = findViewById(R.id.textView788);
        tx8 = findViewById(R.id.textView790);
        tx9 = findViewById(R.id.textView793);
        tx10 = findViewById(R.id.textView795);
        tx11 = findViewById(R.id.textView797);
        tx12 = findViewById(R.id.textView863);



        ArrayAdapter adapter = new ArrayAdapter(tiles_ground.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(tiles_ground.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(tiles_ground.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(tiles_ground.this, android.R.layout.simple_spinner_item, listitems);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(tiles_ground.this, android.R.layout.simple_spinner_item, listitems);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        ArrayAdapter adapter5 = new ArrayAdapter(tiles_ground.this, android.R.layout.simple_spinner_item, listitems);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp6.setAdapter(adapter5);

        ArrayAdapter adapter6 = new ArrayAdapter(tiles_ground.this, android.R.layout.simple_spinner_item, listitems);
        adapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp7.setAdapter(adapter6);

        ArrayAdapter adapter7 = new ArrayAdapter(tiles_ground.this, android.R.layout.simple_spinner_item, listitems1);
        adapter7.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp8.setAdapter(adapter7);



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
                String r7 = sp7.getSelectedItem().toString();
                String r8 = sp8.getSelectedItem().toString();

                Float floor_length = Float.valueOf(ed1.getText().toString());
                Float floor_width = Float.valueOf(ed2.getText().toString());
                Float floor_thickness = Float.valueOf(ed3.getText().toString());
                Float skirting_height = Float.valueOf(ed4.getText().toString());
                Float cement_ratio = Float.valueOf(ed5.getText().toString());
                Float sand_ratio = Float.valueOf(ed6.getText().toString());
                Float one_cemenet_bag = Float.valueOf(ed7.getText().toString());
                Float tiles_length = Float.valueOf(ed8.getText().toString());
                Float tiles_width = Float.valueOf(ed9.getText().toString());
                Float tiles_thickness = Float.valueOf(ed10.getText().toString());
                Float one_tiles_price = Float.valueOf(ed11.getText().toString());
                Float one_cement_bag_price = Float.valueOf(ed12.getText().toString());
                Float sand_unit_price = Float.valueOf(ed13.getText().toString());
                Float water_liter_price = Float.valueOf(ed14.getText().toString());
                Float flex_quick_price = Float.valueOf(ed15.getText().toString());
                Float one_kg_powder_price = Float.valueOf(ed16.getText().toString());
                Float spacer_price = Float.valueOf(ed17.getText().toString());

                float result1 = 0.0F;
                float result2 = 0.0F;
                float result3 = 0.0F;
                float result4 = 0.0F;
                float result5 = 0.0F;
                float result6 = 0.0F;
                float result7 = 0.0F;

                switch (r8) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result1 = (float) (floor_length / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (floor_length / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (floor_length / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = floor_length / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (floor_length / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (floor_length / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (floor_length / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (floor_length / 0.000189394);
                        } else {
                            result1 = floor_length;
                        }
                        break;
                }
                switch (r8) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (floor_width / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (floor_width / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (floor_width / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = floor_width / 12;
                        }  else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (floor_width / 304.8);
                        }  else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (floor_width / 30.48);
                        }  else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (floor_width / 0.000164579);
                        }  else if (r2.equals("மைல்")) {
                            result2 = (float) (floor_width / 0.000189394);
                        } else {
                            result2 = floor_width;
                        }
                        break;
                }
                switch (r8) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (floor_thickness / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (floor_thickness / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (floor_thickness / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = floor_thickness / 12;
                        }  else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (floor_thickness / 304.8);
                        }  else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (floor_thickness / 30.48);
                        }  else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (floor_thickness / 0.000164579);
                        }  else if (r3.equals("மைல்")) {
                            result3 = (float) (floor_thickness / 0.000189394);
                        } else {
                            result3 = floor_thickness;
                        }
                        break;
                }
                switch (r8) {
                    case "அடி":
                        if (r4.equals("மீட்டர்")) {
                            result4 = (float) (skirting_height / 0.3048);
                        } else if (r4.equals("கிலோமீட்டர்")) {
                            result4 = (float) (skirting_height / 0.0003048);
                        } else if (r4.equals("முற்றம்")) {
                            result4 = (float) (skirting_height / 0.333333333);
                        } else if (r4.equals("இன்ச்")) {
                            result4 = skirting_height / 12;
                        }  else if (r4.equals("மில்லிமீட்டர்")) {
                            result4 = (float) (skirting_height / 304.8);
                        }  else if (r4.equals("சென்டிமீட்டர்")) {
                            result4 = (float) (skirting_height / 30.48);
                        }  else if (r4.equals("கடல் மைல்")) {
                            result4 = (float) (skirting_height / 0.000164579);
                        }  else if (r4.equals("மைல்")) {
                            result4 = (float) (skirting_height / 0.000189394);
                        } else {
                            result4 = skirting_height;
                        }
                        break;
                }
                switch (r8) {
                    case "அடி":
                        if (r5.equals("மீட்டர்")) {
                            result5 = (float) (tiles_length / 0.3048);
                        } else if (r5.equals("கிலோமீட்டர்")) {
                            result5 = (float) (tiles_length / 0.0003048);
                        } else if (r5.equals("முற்றம்")) {
                            result5 = (float) (tiles_length / 0.333333333);
                        } else if (r5.equals("இன்ச்")) {
                            result5 = tiles_length / 12;
                        }  else if (r5.equals("மில்லிமீட்டர்")) {
                            result5 = (float) (tiles_length / 304.8);
                        }  else if (r5.equals("சென்டிமீட்டர்")) {
                            result5 = (float) (tiles_length / 30.48);
                        }  else if (r5.equals("கடல் மைல்")) {
                            result5 = (float) (tiles_length / 0.000164579);
                        }  else if (r5.equals("மைல்")) {
                            result5 = (float) (tiles_length / 0.000189394);
                        } else {
                            result5 = tiles_length;
                        }
                        break;
                }
                switch (r8) {
                    case "அடி":
                        if (r6.equals("மீட்டர்")) {
                            result6 = (float) (tiles_width / 0.3048);
                        } else if (r6.equals("கிலோமீட்டர்")) {
                            result6 = (float) (tiles_width / 0.0003048);
                        } else if (r6.equals("முற்றம்")) {
                            result6 = (float) (tiles_width / 0.333333333);
                        } else if (r6.equals("இன்ச்")) {
                            result6 = tiles_width / 12;
                        }  else if (r6.equals("மில்லிமீட்டர்")) {
                            result6 = (float) (tiles_width / 304.8);
                        }  else if (r6.equals("சென்டிமீட்டர்")) {
                            result6 = (float) (tiles_width / 30.48);
                        }  else if (r6.equals("கடல் மைல்")) {
                            result6 = (float) (tiles_width / 0.000164579);
                        }  else if (r6.equals("மைல்")) {
                            result6 = (float) (tiles_width / 0.000189394);
                        } else {
                            result6 = tiles_width;
                        }
                        break;
                }
                switch (r8) {
                    case "அடி":
                        if (r6.equals("மீட்டர்")) {
                            result6 = (float) (tiles_thickness / 0.3048);
                        } else if (r6.equals("கிலோமீட்டர்")) {
                            result6 = (float) (tiles_thickness / 0.0003048);
                        } else if (r6.equals("முற்றம்")) {
                            result6 = (float) (tiles_thickness / 0.333333333);
                        } else if (r6.equals("இன்ச்")) {
                            result6 = tiles_thickness / 12;
                        }  else if (r6.equals("மில்லிமீட்டர்")) {
                            result6 = (float) (tiles_thickness / 304.8);
                        }  else if (r6.equals("சென்டிமீட்டர்")) {
                            result6 = (float) (tiles_thickness / 30.48);
                        }  else if (r6.equals("கடல் மைல்")) {
                            result6 = (float) (tiles_thickness / 0.000164579);
                        }  else if (r6.equals("மைல்")) {
                            result6 = (float) (tiles_thickness / 0.000189394);
                        } else {
                            result6 = tiles_thickness;
                        }
                        break;
                }

                //Todo:calculate cement sand mortar bed
                float floor_bed_volume = result1 * result2 * result3;
                float floor_area = result1 * result2;
                //Todo:dry volume
                float dry_volume = (float) (floor_bed_volume * 1.33);
                //Todo:add cement and sand
                float cement_sand_add_ratio = cement_ratio + sand_ratio;
                //Todo:cement volume of cu.ft & number of bags
                float cement_volume = (float) ((cement_ratio / cement_sand_add_ratio)*dry_volume);
                float cement_number_bag = (float) (cement_volume / one_cemenet_bag);
                //Todo:sand volume number of cu.ft & unit
                float sand_volume = (float) ((sand_ratio / cement_sand_add_ratio)*dry_volume);
                float unit_sand = (float) (sand_volume / 100);
                //Todo:calculate skirting
                float skirting_running_feet = 2*(result1+result2);
                float skirting_area = skirting_running_feet * result4;
                //Todo:calculate tiles area
                float tiles_area = (result5 * result6);
                //Todo:calculate number of tiles
                float number_tiles = (result1 * result2)/tiles_area;
                float number_tiles_skirting = skirting_area/tiles_area;
                float overall_tiles = number_tiles + number_tiles_skirting;
                //Todo:calculate number of spacer
                float number_spacer = (float) (overall_tiles * 1.5);
                //Todo:calculate color powder number kg
                float color_powder_kg = (floor_area/100) * 1;
                //Todo:calculate flex quick
                float flex_quick_ml = (floor_area/100) * 4;
                //Todo:calculate price
                float flex_quick_ml_price = flex_quick_price * flex_quick_ml;
                float color_powder_kg_price = color_powder_kg * one_kg_powder_price;
                float number_spacer_price = number_spacer * spacer_price;
                float unit_sand_price = unit_sand * sand_unit_price;
                float cement_number_bag_price = cement_number_bag * one_cement_bag_price;
                float overall_tiles_price = overall_tiles * one_tiles_price;


                tx1.setText(String.valueOf(overall_tiles));
                tx2.setText(String.valueOf(overall_tiles_price));
                tx3.setText(String.valueOf(cement_number_bag));
                tx4.setText(String.valueOf(cement_number_bag_price));
                tx5.setText(String.valueOf(unit_sand));
                tx6.setText(String.valueOf(unit_sand_price));
                tx7.setText(String.valueOf(flex_quick_ml));
                tx8.setText(String.valueOf(flex_quick_ml_price));
                tx9.setText(String.valueOf(color_powder_kg));
                tx10.setText(String.valueOf(color_powder_kg_price));
                tx11.setText(String.valueOf(number_spacer));
                tx12.setText(String.valueOf(number_spacer_price));

                Toast.makeText(tiles_ground.this, r1, Toast.LENGTH_LONG).show();

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