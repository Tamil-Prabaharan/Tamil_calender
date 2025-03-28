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

public class R_R_masontry_and_course_rubble extends AppCompatActivity {
    private AdView adView;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp0;
    private Button share;
    private Button answer;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rr_masontry_and_course_rubble);

        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView37);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinner44);
        sp2=findViewById(R.id.spinner45);
        sp3=findViewById(R.id.spinner46);
        sp4=findViewById(R.id.spinner4);
        sp5=findViewById(R.id.spinneeeeer5);
        sp6=findViewById(R.id.spinner6);
        sp7=findViewById(R.id.spinner69);

        ed1=findViewById(R.id.editTextNumberDecimal24);
        ed2=findViewById(R.id.editTextNumberDecimal25);
        ed3=findViewById(R.id.editTextNumberDecimal26);
        ed4=findViewById(R.id.editTextNumberDecimal30);
        ed5=findViewById(R.id.editTextNumberDecimal31);
        ed6=findViewById(R.id.editTextNumberDecimal6);
        ed7=findViewById(R.id.editTextNumberDecimal7);
        ed8=findViewById(R.id.editTextNumberDecimal8);
        ed9=findViewById(R.id.editTextNumberDecimal9);
        ed10=findViewById(R.id.editTextNumberDecimal10);
        ed11=findViewById(R.id.editTextNumberDecimal11);
        ed12=findViewById(R.id.editTextNumberDecimal12);
        ed13=findViewById(R.id.editTextNumberDecimal16);

        answer=findViewById(R.id.button73);

        tx1 = findViewById(R.id.textView765);
        tx2 = findViewById(R.id.textView767);
        tx3 = findViewById(R.id.textView769);
        tx4 = findViewById(R.id.textView771);
        tx5 = findViewById(R.id.textView773);
        tx6 = findViewById(R.id.textView775);
        tx7 = findViewById(R.id.textView777);
        tx8 = findViewById(R.id.textView779);
        tx9 = findViewById(R.id.textView819);
        tx10 = findViewById(R.id.textView821);

        ArrayAdapter adapter = new ArrayAdapter(R_R_masontry_and_course_rubble.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(R_R_masontry_and_course_rubble.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(R_R_masontry_and_course_rubble.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(R_R_masontry_and_course_rubble.this, android.R.layout.simple_spinner_item, listitems);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(R_R_masontry_and_course_rubble.this, android.R.layout.simple_spinner_item, listitems);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        ArrayAdapter adapter5 = new ArrayAdapter(R_R_masontry_and_course_rubble.this, android.R.layout.simple_spinner_item, listitems);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp6.setAdapter(adapter5);

        ArrayAdapter adapter6 = new ArrayAdapter(R_R_masontry_and_course_rubble.this, android.R.layout.simple_spinner_item, listitems1);
        adapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp7.setAdapter(adapter6);
        /******************************************************************************
         0th activity button id allocation***/
        share=findViewById(R.id.button73);
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

                Float wall_length = Float.valueOf(ed1.getText().toString());
                Float wall_thickness = Float.valueOf(ed2.getText().toString());
                Float wall_width = Float.valueOf(ed3.getText().toString());
                Float cement_ratio = Float.valueOf(ed4.getText().toString());
                Float sand_ratio = Float.valueOf(ed5.getText().toString());
                Float stone_length = Float.valueOf(ed6.getText().toString());
                Float stone_width = Float.valueOf(ed7.getText().toString());
                Float stone_thickness = Float.valueOf(ed8.getText().toString());
                Float unit_course_rubble_rate = Float.valueOf(ed9.getText().toString());
                Float one_cement_bag_price = Float.valueOf(ed10.getText().toString());
                Float sand_unit_price = Float.valueOf(ed11.getText().toString());
                Float water_liter_price = Float.valueOf(ed12.getText().toString());
                Float unit_soling_rate = Float.valueOf(ed13.getText().toString());
                float result1 = 0.0F;
                float result2 = 0.0F;
                float result3 = 0.0F;
                float result4 = 0.0F;
                float result5 = 0.0F;
                float result6 = 0.0F;
                //Todo: unit conversion
                switch (r7) {
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
                switch (r7) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (wall_thickness / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (wall_thickness / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (wall_thickness / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = wall_thickness / 12;
                        } else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (wall_thickness / 304.8);
                        } else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (wall_thickness / 30.48);
                        } else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (wall_thickness / 0.000164579);
                        } else if (r2.equals("மைல்")) {
                            result2 = (float) (wall_thickness / 0.000189394);
                        } else {
                            result2 = wall_thickness;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (wall_width / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (wall_width / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (wall_width / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = wall_width / 12;
                        } else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (wall_width / 304.8);
                        } else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (wall_width / 30.48);
                        } else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (wall_width / 0.000164579);
                        } else if (r3.equals("மைல்")) {
                            result3 = (float) (wall_width / 0.000189394);
                        } else {
                            result3 = wall_width;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r4.equals("மீட்டர்")) {
                            result4 = (float) (stone_length / 0.3048);
                        } else if (r4.equals("கிலோமீட்டர்")) {
                            result4 = (float) (stone_length / 0.0003048);
                        } else if (r4.equals("முற்றம்")) {
                            result4 = (float) (stone_length / 0.333333333);
                        } else if (r4.equals("இன்ச்")) {
                            result4 = stone_length / 12;
                        } else if (r4.equals("மில்லிமீட்டர்")) {
                            result4 = (float) (stone_length / 304.8);
                        } else if (r4.equals("சென்டிமீட்டர்")) {
                            result4 = (float) (stone_length / 30.48);
                        } else if (r4.equals("கடல் மைல்")) {
                            result4 = (float) (stone_length / 0.000164579);
                        } else if (r4.equals("மைல்")) {
                            result4 = (float) (stone_length / 0.000189394);
                        } else {
                            result4 = stone_length;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r5.equals("மீட்டர்")) {
                            result5 = (float) (stone_width / 0.3048);
                        } else if (r5.equals("கிலோமீட்டர்")) {
                            result5 = (float) (stone_width / 0.0003048);
                        } else if (r5.equals("முற்றம்")) {
                            result5 = (float) (stone_width / 0.333333333);
                        } else if (r5.equals("இன்ச்")) {
                            result5 = stone_width / 12;
                        } else if (r5.equals("மில்லிமீட்டர்")) {
                            result5 = (float) (stone_width / 304.8);
                        } else if (r5.equals("சென்டிமீட்டர்")) {
                            result5 = (float) (stone_width / 30.48);
                        } else if (r5.equals("கடல் மைல்")) {
                            result5 = (float) (stone_width / 0.000164579);
                        } else if (r5.equals("மைல்")) {
                            result5 = (float) (stone_width / 0.000189394);
                        } else {
                            result5 = stone_width;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r6.equals("மீட்டர்")) {
                            result6 = (float) (stone_thickness / 0.3048);
                        } else if (r6.equals("கிலோமீட்டர்")) {
                            result6 = (float) (stone_thickness / 0.0003048);
                        } else if (r6.equals("முற்றம்")) {
                            result6 = (float) (stone_thickness / 0.333333333);
                        } else if (r6.equals("இன்ச்")) {
                            result6 = stone_thickness / 12;
                        } else if (r6.equals("மில்லிமீட்டர்")) {
                            result6 = (float) (stone_thickness / 304.8);
                        } else if (r6.equals("சென்டிமீட்டர்")) {
                            result6 = (float) (stone_thickness / 30.48);
                        } else if (r6.equals("கடல் மைல்")) {
                            result6 = (float) (stone_thickness / 0.000164579);
                        } else if (r6.equals("மைல்")) {
                            result6 = (float) (stone_thickness / 0.000189394);
                        } else {
                            result6 = stone_thickness;
                        }
                        break;
                }


                //Todo:calculate wall volume
                float wall_volume = result1 * result2 * result3;
                //Todo:calculate cubic feet to m3
                float outer_wall_cubic_feet_m3 = (float) (wall_volume  *  0.0283168466);
                //Todo:calculate stone volume
                float stone_volume = result4 * result5 * result6;
                //Todo:calculate choling volume
                float choling_volume = wall_volume * (25/100);
                //Todo:calculate outer wall stone volume
                float outer_wall_stone_volume = wall_volume - choling_volume;
                //Todo:calculate outer wall stone number
                float outer_wall_stone_number = outer_wall_stone_volume / stone_volume;
                //Todo:calculate unit outer wall stone
                float unit_outer_wall_stone = outer_wall_stone_volume / 100;
                //Todo:calculate unit choling
                float unit_choling = choling_volume / 100;
                //Todo:calculate number cement
                float total_ratio = cement_ratio + sand_ratio ;
                float number_cement = (cement_ratio / total_ratio) * outer_wall_cubic_feet_m3;
                float number_cement_bag_kg = number_cement * 1440;
                float number_cement_bag = number_cement_bag_kg / 50;
                //Todo:calculate sand
                float sand_volume  = (float) (sand_ratio / total_ratio) * outer_wall_cubic_feet_m3;
                float sand_volume_kg  = (float) sand_volume  * 1650;
                float sand_volume_cuft  = (float) sand_volume_kg  / 47;
                float sand_volume_unit  = (float) sand_volume_cuft  / 100;
                //Todo:calculate water
                float water_volume  = (float) 0.5 * number_cement_bag_kg;
                //Todo:calculate price
                float water_volume_P  = (float) water_volume * water_liter_price;
                float number_cement_bag_P  = (float) number_cement_bag * one_cement_bag_price;
                float sand_volume_unit_P  = (float) sand_volume_unit * sand_unit_price;
                float unit_outer_wall_stone_P  = (float) unit_outer_wall_stone * unit_course_rubble_rate;
                float unit_choling_P  = (float) unit_choling * unit_soling_rate;


                tx1.setText(String.valueOf(outer_wall_stone_number));
                tx2.setText(String.valueOf(unit_outer_wall_stone_P));
                tx3.setText(String.valueOf(number_cement_bag));
                tx4.setText(String.valueOf(number_cement_bag_P));
                tx5.setText(String.valueOf(sand_volume_unit));
                tx6.setText(String.valueOf(sand_volume_unit_P));
                tx7.setText(String.valueOf(water_volume));
                tx8.setText(String.valueOf(water_volume_P));
                tx9.setText(String.valueOf(unit_choling));
                tx10.setText(String.valueOf(unit_choling_P));

                Toast.makeText(R_R_masontry_and_course_rubble.this, r1, Toast.LENGTH_LONG).show();

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