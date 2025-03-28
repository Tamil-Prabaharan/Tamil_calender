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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class reinforcement_steel_all extends AppCompatActivity {
    private AdView adView;
    private Button share,answer,answer1,answer2,answer3,answer4;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10,sp11,sp12,sp13,sp14,sp15,sp16,sp17,sp18,sp19,sp20,sp21,sp22,sp23,sp24,sp25;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19,ed20
            ,ed21,ed22,ed23,ed24,ed25,ed26,ed27,ed28,ed29,ed30,ed31,ed32;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reinforcement_steel_all);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView39);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);
        sp3=findViewById(R.id.spinner3);
        sp4=findViewById(R.id.spinner18);
        sp5=findViewById(R.id.spinner19);
        sp6=findViewById(R.id.spinner47);
        sp7=findViewById(R.id.spinner48);
        sp8=findViewById(R.id.spinner49);
        sp9=findViewById(R.id.spinner50);
        sp10=findViewById(R.id.spinner52);
        sp11=findViewById(R.id.spinner53);
        sp12=findViewById(R.id.spinner4);
        sp13=findViewById(R.id.spinneeeeer5);
        sp14=findViewById(R.id.spinner6);
        sp15=findViewById(R.id.spinner14);
        sp16=findViewById(R.id.spinner20);
        sp17=findViewById(R.id.spinner21);
        sp18=findViewById(R.id.spinner7);
        sp19=findViewById(R.id.spinner8);
        sp20=findViewById(R.id.spinner9);
        sp21=findViewById(R.id.spinner16);
        sp22=findViewById(R.id.spinner17);
        sp23=findViewById(R.id.spinner22);
        sp24=findViewById(R.id.spinner23);
        sp25=findViewById(R.id.spinner71);

        ed1=findViewById(R.id.editTextNumberDecimal2);
        ed2=findViewById(R.id.editTextNumberDecimal3);
        ed3=findViewById(R.id.editTextNumberDecimal4);
        ed4=findViewById(R.id.editTextNumberDecimal39);
        ed5=findViewById(R.id.editTextNumberDecimal40);
        ed6=findViewById(R.id.editTextNumberSigned3);

        ed7=findViewById(R.id.editTextNumberDecimal5);
        ed8=findViewById(R.id.editTextNumberDecimal32);
        ed9=findViewById(R.id.editTextNumberDecimal69);
        ed10=findViewById(R.id.editTextNumberDecimal34);
        ed11=findViewById(R.id.editTextNumberDecimal33);
        ed12=findViewById(R.id.editTextNumberDecimal41);
        ed13=findViewById(R.id.editTextNumberDecimal42);
        ed31=findViewById(R.id.editTextNumberDecimal70);

        ed14=findViewById(R.id.editTextNumberDecimal6);
        ed15=findViewById(R.id.editTextNumberDecimal7);
        ed16=findViewById(R.id.editTextNumberDecimal8);
        ed17=findViewById(R.id.editTextNumberDecimal35);
        ed18=findViewById(R.id.editTextNumberDecimal36);
        ed19=findViewById(R.id.editTextNumberDecimal43);
        ed20=findViewById(R.id.editTextNumberDecimal44);
        ed32=findViewById(R.id.editTextNumberDecimal71);

        ed21=findViewById(R.id.editTextNumberDecimal13);
        ed22=findViewById(R.id.editTextNumberDecimal14);
        ed23=findViewById(R.id.editTextNumberDecimal15);
        ed24=findViewById(R.id.editTextNumberDecimal37);
        ed25=findViewById(R.id.editTextNumberDecimal38);
        ed26=findViewById(R.id.editTextNumberDecimal45);
        ed27=findViewById(R.id.editTextNumberDecimal46);

        ed28=findViewById(R.id.editTextNumberDecimal9);
        ed29=findViewById(R.id.editTextNumberDecimal10);
        ed30=findViewById(R.id.editTextNumberDecimal11);

        answer=findViewById(R.id.button73);

        tx1 = findViewById(R.id.textView764);
        tx2 = findViewById(R.id.textView765);
        tx3 = findViewById(R.id.textView766);
        tx4 = findViewById(R.id.textView767);

        ArrayAdapter adapter = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        ArrayAdapter adapter5 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp6.setAdapter(adapter5);

        ArrayAdapter adapter6 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp7.setAdapter(adapter6);

        ArrayAdapter adapter7 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter7.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp8.setAdapter(adapter7);

        ArrayAdapter adapter8 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter8.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp9.setAdapter(adapter8);

        ArrayAdapter adapter9 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter9.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp10.setAdapter(adapter9);

        ArrayAdapter adapter10 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter10.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp11.setAdapter(adapter10);

        ArrayAdapter adapter11 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter11.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp12.setAdapter(adapter11);

        ArrayAdapter adapter12 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter12.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp13.setAdapter(adapter12);

        ArrayAdapter adapter13 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter13.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp14.setAdapter(adapter13);

        ArrayAdapter adapter14 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter14.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp15.setAdapter(adapter14);

        ArrayAdapter adapter15 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter15.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp16.setAdapter(adapter15);

        ArrayAdapter adapter16 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter16.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp17.setAdapter(adapter16);

        ArrayAdapter adapter17 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter17.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp18.setAdapter(adapter17);

        ArrayAdapter adapter18 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter18.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp19.setAdapter(adapter18);

        ArrayAdapter adapter19 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter19.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp20.setAdapter(adapter19);

        ArrayAdapter adapter20 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter20.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp21.setAdapter(adapter20);

        ArrayAdapter adapter21 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter21.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp22.setAdapter(adapter21);

        ArrayAdapter adapter22 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter22.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp23.setAdapter(adapter22);

        ArrayAdapter adapter23 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems);
        adapter23.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp24.setAdapter(adapter23);

        ArrayAdapter adapter24 = new ArrayAdapter(reinforcement_steel_all.this, android.R.layout.simple_spinner_item, listitems1);
        adapter24.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp25.setAdapter(adapter24);


        answer1=findViewById(R.id.button63);
        answer2=findViewById(R.id.button95);
        answer3=findViewById(R.id.button98);
        answer4=findViewById(R.id.button99);

        answer=findViewById(R.id.button73);
        share=findViewById(R.id.button72);
        share();
        answer();

    }
    /*******************************************************************************************************************/
    private void answer() {
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r1 = sp1.getSelectedItem().toString();
                String r2 = sp2.getSelectedItem().toString();
                String r3 = sp3.getSelectedItem().toString();
                String r4 = sp4.getSelectedItem().toString();
                String r5 = sp5.getSelectedItem().toString();
                String r25 = sp25.getSelectedItem().toString();

                Float base_length = Float.valueOf(ed1.getText().toString());
                Float base_width = Float.valueOf(ed2.getText().toString());
                Float spacing = Float.valueOf(ed3.getText().toString());
                Float mainbar_dia = Float.valueOf(ed4.getText().toString());
                Float distributionbar_dia = Float.valueOf(ed5.getText().toString());
                Float height_base = Float.valueOf(ed6.getText().toString());

                Float kattukambi_price = Float.valueOf(ed28.getText().toString());
                Float steelkg_price = Float.valueOf(ed29.getText().toString());

                float result1 = 0.0F;
                float result2 = 0.0F;
                float result3 = 0.0F;
                float result4 = 0.0F;
                float result5 = 0.0F;
                //Todo: unit conversion
                switch (r25) {
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
                switch (r25) {
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
                switch (r25) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (spacing / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (spacing / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (spacing / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = spacing / 12;
                        } else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (spacing / 304.8);
                        } else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (spacing / 30.48);
                        } else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (spacing / 0.000164579);
                        } else if (r3.equals("மைல்")) {
                            result3 = (float) (spacing / 0.000189394);
                        } else {
                            result3 = spacing;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r4.equals("மீட்டர்")) {
                            result4 = (float) (mainbar_dia / 0.3048);
                        } else if (r4.equals("கிலோமீட்டர்")) {
                            result4 = (float) (mainbar_dia / 0.0003048);
                        } else if (r4.equals("முற்றம்")) {
                            result4 = (float) (mainbar_dia / 0.333333333);
                        } else if (r4.equals("இன்ச்")) {
                            result4 = mainbar_dia / 12;
                        } else if (r4.equals("மில்லிமீட்டர்")) {
                            result4 = (float) (mainbar_dia / 304.8);
                        } else if (r4.equals("சென்டிமீட்டர்")) {
                            result4 = (float) (mainbar_dia / 30.48);
                        } else if (r4.equals("கடல் மைல்")) {
                            result4 = (float) (mainbar_dia / 0.000164579);
                        } else if (r4.equals("மைல்")) {
                            result4 = (float) (mainbar_dia / 0.000189394);
                        } else {
                            result4 = mainbar_dia;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r5.equals("மீட்டர்")) {
                            result5 = (float) (distributionbar_dia / 0.3048);
                        } else if (r5.equals("கிலோமீட்டர்")) {
                            result5 = (float) (distributionbar_dia / 0.0003048);
                        } else if (r5.equals("முற்றம்")) {
                            result5 = (float) (distributionbar_dia / 0.333333333);
                        } else if (r5.equals("இன்ச்")) {
                            result5 = distributionbar_dia / 12;
                        } else if (r5.equals("மில்லிமீட்டர்")) {
                            result5 = (float) (distributionbar_dia / 304.8);
                        } else if (r5.equals("சென்டிமீட்டர்")) {
                            result5 = (float) (distributionbar_dia / 30.48);
                        } else if (r5.equals("கடல் மைல்")) {
                            result5 = (float) (distributionbar_dia / 0.000164579);
                        } else if (r5.equals("மைல்")) {
                            result5 = (float) (distributionbar_dia / 0.000189394);
                        } else {
                            result5 = distributionbar_dia;
                        }
                        break;
                }

                //Todo:calculate length
                float b_one_bar_length  = (float) (result1 - 0.1666);
                float b_number_bars  = (float) (b_one_bar_length / result3);
                float b_total_one_bar_length  = (float) (b_number_bars * b_one_bar_length);
                //Todo:calculate width
                float b_one_bar_width  = (float) (result2 - 0.1666);
                float b_number_bars_width  = (float) (b_one_bar_width / result3);
                float b_total_one_bar_length_width  = (float) (b_number_bars_width * b_one_bar_width);
                //Todo:calculate base
                float overall_bars_length  = (float) (b_total_one_bar_length + b_total_one_bar_length_width + height_base);
                float diameter  = (float) (result4 * result4 / 162);
                float diameter1  = (float) (result5 * result5 / 162);
                //Todo:calculate weight
                float overall_weight_bars_length  = (float) ( (overall_bars_length * diameter)/3.28084);
                float overall_weight_bars_length1  = (float) ( (overall_bars_length * diameter1)/3.28084);
                float overall_weight_bars_length2  = (float) (overall_weight_bars_length + overall_weight_bars_length1);
                //Todo:calculate kattukambi weight
                float overall_kattukambi_weight  = (float) ((float) ((overall_weight_bars_length2) / 100));
                float overall_kattukambi_weight_price  = (float) overall_kattukambi_weight*kattukambi_price;
                //Todo:calculate price
                float overall_weight_bars_length_rate  = (float) ((float) (overall_weight_bars_length2 * steelkg_price));
                tx1.setText(String.valueOf(overall_weight_bars_length_rate  + "  steel price  "+overall_weight_bars_length2+"  weight  "
                        +overall_kattukambi_weight_price+"  winding price  "+overall_kattukambi_weight+"  winding weight  "));


            }
        });
/*******************************************************************************************************************/
/*******************************************************************************************************************/

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String r6 = sp6.getSelectedItem().toString();
                String r7 = sp7.getSelectedItem().toString();
                String r8 = sp8.getSelectedItem().toString();
                String r9 = sp9.getSelectedItem().toString();
                String r10 = sp10.getSelectedItem().toString();
                String r11 = sp11.getSelectedItem().toString();
                String r25 = sp25.getSelectedItem().toString();

                Float post_width = Float.valueOf(ed7.getText().toString());
                Float post_length = Float.valueOf(ed8.getText().toString());
                Float post_height = Float.valueOf(ed9.getText().toString());
                Float spacing = Float.valueOf(ed10.getText().toString());
                Float no_mainbar = Float.valueOf(ed11.getText().toString());
                Float no_distribution = Float.valueOf(ed31.getText().toString());
                Float mainbar_dia = Float.valueOf(ed12.getText().toString());
                Float distributionbar_dia = Float.valueOf(ed13.getText().toString());

                Float kattukambi_price = Float.valueOf(ed28.getText().toString());
                Float steelkg_price = Float.valueOf(ed29.getText().toString());
                float result6 = 0.0F;
                float result7 = 0.0F;
                float result8 = 0.0F;
                float result9 = 0.0F;
                float result10 = 0.0F;
                float result11 = 0.0F;
                //Todo: unit conversion
                switch (r25) {
                    case "அடி":
                        if (r6.equals("மீட்டர்")) {
                            result6 = (float) (post_width / 0.3048);
                        } else if (r6.equals("கிலோமீட்டர்")) {
                            result6 = (float) (post_width / 0.0003048);
                        } else if (r6.equals("முற்றம்")) {
                            result6 = (float) (post_width / 0.333333333);
                        } else if (r6.equals("இன்ச்")) {
                            result6 = post_width / 12;
                        } else if (r6.equals("மில்லிமீட்டர்")) {
                            result6 = (float) (post_width / 304.8);
                        } else if (r6.equals("சென்டிமீட்டர்")) {
                            result6 = (float) (post_width / 30.48);
                        } else if (r6.equals("கடல் மைல்")) {
                            result6 = (float) (post_width / 0.000164579);
                        } else if (r6.equals("மைல்")) {
                            result6 = (float) (post_width / 0.000189394);
                        } else {
                            result6 = post_width;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r7.equals("மீட்டர்")) {
                            result7 = (float) (post_length / 0.3048);
                        } else if (r7.equals("கிலோமீட்டர்")) {
                            result7 = (float) (post_length / 0.0003048);
                        } else if (r7.equals("முற்றம்")) {
                            result7 = (float) (post_length / 0.333333333);
                        } else if (r7.equals("இன்ச்")) {
                            result7 = post_length / 12;
                        } else if (r7.equals("மில்லிமீட்டர்")) {
                            result7 = (float) (post_length / 304.8);
                        } else if (r7.equals("சென்டிமீட்டர்")) {
                            result7= (float) (post_length / 30.48);
                        } else if (r7.equals("கடல் மைல்")) {
                            result7 = (float) (post_length / 0.000164579);
                        } else if (r7.equals("மைல்")) {
                            result7 = (float) (post_length / 0.000189394);
                        } else {
                            result7 = post_length;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r8.equals("மீட்டர்")) {
                            result8 = (float) (post_height / 0.3048);
                        } else if (r8.equals("கிலோமீட்டர்")) {
                            result8 = (float) (post_height / 0.0003048);
                        } else if (r8.equals("முற்றம்")) {
                            result8 = (float) (post_height / 0.333333333);
                        } else if (r8.equals("இன்ச்")) {
                            result8 = post_height / 12;
                        } else if (r8.equals("மில்லிமீட்டர்")) {
                            result8 = (float) (post_height / 304.8);
                        } else if (r8.equals("சென்டிமீட்டர்")) {
                            result8= (float) (post_height / 30.48);
                        } else if (r8.equals("கடல் மைல்")) {
                            result8 = (float) (post_height / 0.000164579);
                        } else if (r8.equals("மைல்")) {
                            result8 = (float) (post_height / 0.000189394);
                        } else {
                            result8 = post_height;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r9.equals("மீட்டர்")) {
                            result9 = (float) (spacing / 0.3048);
                        } else if (r9.equals("கிலோமீட்டர்")) {
                            result9 = (float) (spacing / 0.0003048);
                        } else if (r9.equals("முற்றம்")) {
                            result9 = (float) (spacing / 0.333333333);
                        } else if (r9.equals("இன்ச்")) {
                            result9 = spacing / 12;
                        } else if (r9.equals("மில்லிமீட்டர்")) {
                            result9 = (float) (spacing / 304.8);
                        } else if (r9.equals("சென்டிமீட்டர்")) {
                            result9= (float) (spacing / 30.48);
                        } else if (r9.equals("கடல் மைல்")) {
                            result9 = (float) (spacing / 0.000164579);
                        } else if (r9.equals("மைல்")) {
                            result9 = (float) (spacing / 0.000189394);
                        } else {
                            result9 = spacing;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r10.equals("மீட்டர்")) {
                            result10 = (float) (mainbar_dia / 0.3048);
                        } else if (r10.equals("கிலோமீட்டர்")) {
                            result10 = (float) (mainbar_dia / 0.0003048);
                        } else if (r10.equals("முற்றம்")) {
                            result10 = (float) (mainbar_dia / 0.333333333);
                        } else if (r10.equals("இன்ச்")) {
                            result10 = mainbar_dia / 12;
                        } else if (r10.equals("மில்லிமீட்டர்")) {
                            result10 = (float) (mainbar_dia / 304.8);
                        } else if (r10.equals("சென்டிமீட்டர்")) {
                            result10= (float) (mainbar_dia / 30.48);
                        } else if (r10.equals("கடல் மைல்")) {
                            result10 = (float) (mainbar_dia / 0.000164579);
                        } else if (r10.equals("மைல்")) {
                            result10 = (float) (mainbar_dia / 0.000189394);
                        } else {
                            result10 = mainbar_dia;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r11.equals("மீட்டர்")) {
                            result11 = (float) (distributionbar_dia / 0.3048);
                        } else if (r11.equals("கிலோமீட்டர்")) {
                            result11 = (float) (distributionbar_dia / 0.0003048);
                        } else if (r11.equals("முற்றம்")) {
                            result11 = (float) (distributionbar_dia / 0.333333333);
                        } else if (r11.equals("இன்ச்")) {
                            result11 = distributionbar_dia / 12;
                        } else if (r11.equals("மில்லிமீட்டர்")) {
                            result11 = (float) (distributionbar_dia / 304.8);
                        } else if (r11.equals("சென்டிமீட்டர்")) {
                            result11= (float) (distributionbar_dia / 30.48);
                        } else if (r11.equals("கடல் மைல்")) {
                            result11 = (float) (distributionbar_dia / 0.000164579);
                        } else if (r11.equals("மைல்")) {
                            result11 = (float) (distributionbar_dia / 0.000189394);
                        } else {
                            result11 = distributionbar_dia;
                        }
                        break;
                }


                //Todo:calculate post ring
                float post_ring  = (float) (2 * (result6 + result7));
                //Todo:calculate number ring
                float number_ring  = (float) (result8 / result9);
                float number_ring_length  = (float) (number_ring * post_ring);
                //Todo:calculate main & distribution bar
                float no_mainbar_length  = (float) (no_mainbar * result8);
                float no_distribution_length  = (float) (no_distribution * result8);
                //Todo:calculate weight
                float wt_main_bar  = (float) ((float) (no_mainbar_length * (result10 * result10 /162))/3.28084);
                float wt_distri_bar  = (float) ((float) (no_distribution_length * (result11 * result11 /162))/3.28084);
                float wt_ring_bar  = (float) ((float) (number_ring_length * (64/162))/3.28084);
                float over_all_wt_post  = (float) (wt_main_bar + wt_distri_bar + wt_ring_bar);
                float kattukambi_weight1  = (over_all_wt_post/100);
                //Todo:calculate price
                float overall_weight_bars_length_rate  = (float) ((float) (over_all_wt_post * steelkg_price));
                float overall_kattukambi_weight1  = (kattukambi_weight1 * kattukambi_price);
                tx2.setText(String.valueOf(overall_weight_bars_length_rate  + "  steel price  "
                        +overall_kattukambi_weight1+"  winding price  "+over_all_wt_post+" weight "));


            }
        });
/*******************************************************************************************************************/
/*******************************************************************************************************************/
/*******************************************************************************************************************/
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String r12 = sp12.getSelectedItem().toString();
                String r13 = sp13.getSelectedItem().toString();
                String r14 = sp14.getSelectedItem().toString();
                String r15 = sp15.getSelectedItem().toString();
                String r16 = sp16.getSelectedItem().toString();
                String r17 = sp17.getSelectedItem().toString();
                String r25 = sp25.getSelectedItem().toString();

                Float beam_width = Float.valueOf(ed14.getText().toString());
                Float beam_length = Float.valueOf(ed15.getText().toString());
                Float beam_height = Float.valueOf(ed16.getText().toString());
                Float spacing_beam = Float.valueOf(ed17.getText().toString());
                Float no_mainbar_beam = Float.valueOf(ed18.getText().toString());
                Float no_distribution_beam = Float.valueOf(ed32.getText().toString());
                Float mainbar_dia_beam = Float.valueOf(ed19.getText().toString());
                Float distributionbar_dia_beam = Float.valueOf(ed20.getText().toString());

                Float kattukambi_price = Float.valueOf(ed28.getText().toString());
                Float steelkg_price = Float.valueOf(ed29.getText().toString());
                float result12 = 0.0F;
                float result13 = 0.0F;
                float result14 = 0.0F;
                float result15 = 0.0F;
                float result16 = 0.0F;
                float result17 = 0.0F;
                //Todo: unit conversion
                switch (r25) {
                    case "அடி":
                        if (r12.equals("மீட்டர்")) {
                            result12 = (float) (beam_width / 0.3048);
                        } else if (r12.equals("கிலோமீட்டர்")) {
                            result12 = (float) (beam_width / 0.0003048);
                        } else if (r12.equals("முற்றம்")) {
                            result12 = (float) (beam_width / 0.333333333);
                        } else if (r12.equals("இன்ச்")) {
                            result12 = beam_width / 12;
                        } else if (r12.equals("மில்லிமீட்டர்")) {
                            result12 = (float) (beam_width / 304.8);
                        } else if (r12.equals("சென்டிமீட்டர்")) {
                            result12 = (float) (beam_width / 30.48);
                        } else if (r12.equals("கடல் மைல்")) {
                            result12 = (float) (beam_width / 0.000164579);
                        } else if (r12.equals("மைல்")) {
                            result12 = (float) (beam_width / 0.000189394);
                        } else {
                            result12 = beam_width;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r13.equals("மீட்டர்")) {
                            result13 = (float) (beam_length / 0.3048);
                        } else if (r13.equals("கிலோமீட்டர்")) {
                            result13 = (float) (beam_length / 0.0003048);
                        } else if (r13.equals("முற்றம்")) {
                            result13 = (float) (beam_length / 0.333333333);
                        } else if (r13.equals("இன்ச்")) {
                            result13 = beam_length / 12;
                        } else if (r13.equals("மில்லிமீட்டர்")) {
                            result13 = (float) (beam_length / 304.8);
                        } else if (r13.equals("சென்டிமீட்டர்")) {
                            result13 = (float) (beam_length / 30.48);
                        } else if (r13.equals("கடல் மைல்")) {
                            result13 = (float) (beam_length / 0.000164579);
                        } else if (r13.equals("மைல்")) {
                            result13 = (float) (beam_length / 0.000189394);
                        } else {
                            result13 = beam_length;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r14.equals("மீட்டர்")) {
                            result14 = (float) (beam_height / 0.3048);
                        } else if (r14.equals("கிலோமீட்டர்")) {
                            result14 = (float) (beam_height / 0.0003048);
                        } else if (r14.equals("முற்றம்")) {
                            result14 = (float) (beam_height / 0.333333333);
                        } else if (r14.equals("இன்ச்")) {
                            result14 = beam_height / 12;
                        } else if (r14.equals("மில்லிமீட்டர்")) {
                            result14 = (float) (beam_height / 304.8);
                        } else if (r14.equals("சென்டிமீட்டர்")) {
                            result14 = (float) (beam_height / 30.48);
                        } else if (r14.equals("கடல் மைல்")) {
                            result14 = (float) (beam_height / 0.000164579);
                        } else if (r14.equals("மைல்")) {
                            result14 = (float) (beam_height / 0.000189394);
                        } else {
                            result14 = beam_height;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r15.equals("மீட்டர்")) {
                            result15 = (float) (spacing_beam / 0.3048);
                        } else if (r15.equals("கிலோமீட்டர்")) {
                            result15 = (float) (spacing_beam / 0.0003048);
                        } else if (r15.equals("முற்றம்")) {
                            result15 = (float) (spacing_beam / 0.333333333);
                        } else if (r15.equals("இன்ச்")) {
                            result15 = spacing_beam / 12;
                        } else if (r15.equals("மில்லிமீட்டர்")) {
                            result15 = (float) (spacing_beam / 304.8);
                        } else if (r15.equals("சென்டிமீட்டர்")) {
                            result15 = (float) (spacing_beam / 30.48);
                        } else if (r15.equals("கடல் மைல்")) {
                            result15 = (float) (spacing_beam / 0.000164579);
                        } else if (r15.equals("மைல்")) {
                            result15 = (float) (spacing_beam / 0.000189394);
                        } else {
                            result15 = spacing_beam;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r16.equals("மீட்டர்")) {
                            result16 = (float) (mainbar_dia_beam / 0.3048);
                        } else if (r16.equals("கிலோமீட்டர்")) {
                            result16 = (float) (mainbar_dia_beam / 0.0003048);
                        } else if (r16.equals("முற்றம்")) {
                            result16 = (float) (mainbar_dia_beam / 0.333333333);
                        } else if (r16.equals("இன்ச்")) {
                            result16 = mainbar_dia_beam / 12;
                        } else if (r16.equals("மில்லிமீட்டர்")) {
                            result16 = (float) (mainbar_dia_beam / 304.8);
                        } else if (r16.equals("சென்டிமீட்டர்")) {
                            result16 = (float) (mainbar_dia_beam / 30.48);
                        } else if (r16.equals("கடல் மைல்")) {
                            result16 = (float) (mainbar_dia_beam / 0.000164579);
                        } else if (r16.equals("மைல்")) {
                            result16 = (float) (mainbar_dia_beam / 0.000189394);
                        } else {
                            result16 = mainbar_dia_beam;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r17.equals("மீட்டர்")) {
                            result17 = (float) (distributionbar_dia_beam / 0.3048);
                        } else if (r17.equals("கிலோமீட்டர்")) {
                            result17 = (float) (distributionbar_dia_beam / 0.0003048);
                        } else if (r17.equals("முற்றம்")) {
                            result17 = (float) (distributionbar_dia_beam / 0.333333333);
                        } else if (r17.equals("இன்ச்")) {
                            result17 = distributionbar_dia_beam / 12;
                        } else if (r17.equals("மில்லிமீட்டர்")) {
                            result17 = (float) (distributionbar_dia_beam / 304.8);
                        } else if (r17.equals("சென்டிமீட்டர்")) {
                            result17 = (float) (distributionbar_dia_beam / 30.48);
                        } else if (r17.equals("கடல் மைல்")) {
                            result17 = (float) (distributionbar_dia_beam / 0.000164579);
                        } else if (r17.equals("மைல்")) {
                            result17 = (float) (distributionbar_dia_beam / 0.000189394);
                        } else {
                            result17 = distributionbar_dia_beam;
                        }
                        break;
                }



                //Todo:calculate beam ring
                float beam_ring  = (float) (2 * (result12 + result14));
                //Todo:calculate number ring
                float number_ring  = (float) (result13 / result15);
                float number_ring_length  = (float) (number_ring * beam_ring);
                //Todo:calculate main & distribution bar
                float no_mainbar_length  = (float) (no_mainbar_beam * result13);
                float no_distribution_length  = (float) (no_distribution_beam * result13);
                //Todo:calculate weight
                float wt_main_bar  = (float) ((float) (no_mainbar_length * (result16 * result16 /162))/3.28084);
                float wt_distri_bar  = (float) ((float) (no_distribution_length * (result17 * result17 /162))/3.28084);
                float wt_ring_bar  = (float) ((float) (number_ring_length * (64/162))/3.28084);
                float over_all_wt_beam  = (float) (wt_main_bar + wt_distri_bar + wt_ring_bar);
                float kattukambi_weight1  = (over_all_wt_beam/100);
                //Todo:calculate price
                float overall_weight_bars_length_rate  = (float) ((float) (over_all_wt_beam * steelkg_price));
                float overall_kattukambi_weight1  = (kattukambi_weight1 * kattukambi_price);
                tx3.setText(String.valueOf(overall_weight_bars_length_rate  + "  steel price  "
                        +overall_kattukambi_weight1+"  winding price  "+over_all_wt_beam+"  weight  "));

            }
        });
/*******************************************************************************************************************/
/*******************************************************************************************************************/
/*******************************************************************************************************************/
/*******************************************************************************************************************/
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r18 = sp18.getSelectedItem().toString();
                String r19 = sp19.getSelectedItem().toString();
                String r20 = sp20.getSelectedItem().toString();
                String r21 = sp21.getSelectedItem().toString();
                String r22 = sp22.getSelectedItem().toString();
                String r23 = sp23.getSelectedItem().toString();
                String r24 = sp24.getSelectedItem().toString();
                String r25 = sp25.getSelectedItem().toString();

                Float slab_length = Float.valueOf(ed21.getText().toString());
                Float slab_width = Float.valueOf(ed22.getText().toString());
                Float slab_height = Float.valueOf(ed23.getText().toString());
                Float spacing_slab = Float.valueOf(ed24.getText().toString());
                Float no_slab = Float.valueOf(ed25.getText().toString());
                Float mainbar_dia_slab = Float.valueOf(ed26.getText().toString());
                Float distributionbar_dia_slab = Float.valueOf(ed27.getText().toString());

                Float kattukambi_price = Float.valueOf(ed28.getText().toString());
                Float steelkg_price = Float.valueOf(ed29.getText().toString());
                float result18 = 0.0F;
                float result19 = 0.0F;
                float result20 = 0.0F;
                float result21 = 0.0F;
                float result22 = 0.0F;
                float result23 = 0.0F;
                float result24 = 0.0F;
                //Todo: unit conversion
                switch (r25) {
                    case "அடி":
                        if (r18.equals("மீட்டர்")) {
                            result18 = (float) (slab_length / 0.3048);
                        } else if (r18.equals("கிலோமீட்டர்")) {
                            result18 = (float) (slab_length / 0.0003048);
                        } else if (r18.equals("முற்றம்")) {
                            result18 = (float) (slab_length / 0.333333333);
                        } else if (r18.equals("இன்ச்")) {
                            result18 = slab_length / 12;
                        } else if (r18.equals("மில்லிமீட்டர்")) {
                            result18 = (float) (slab_length / 304.8);
                        } else if (r18.equals("சென்டிமீட்டர்")) {
                            result18 = (float) (slab_length / 30.48);
                        } else if (r18.equals("கடல் மைல்")) {
                            result18 = (float) (slab_length / 0.000164579);
                        } else if (r18.equals("மைல்")) {
                            result18 = (float) (slab_length / 0.000189394);
                        } else {
                            result18 = slab_length;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r19.equals("மீட்டர்")) {
                            result19 = (float) (slab_width / 0.3048);
                        } else if (r19.equals("கிலோமீட்டர்")) {
                            result19 = (float) (slab_width / 0.0003048);
                        } else if (r19.equals("முற்றம்")) {
                            result19 = (float) (slab_width / 0.333333333);
                        } else if (r19.equals("இன்ச்")) {
                            result19 = slab_width / 12;
                        } else if (r19.equals("மில்லிமீட்டர்")) {
                            result19 = (float) (slab_width / 304.8);
                        } else if (r19.equals("சென்டிமீட்டர்")) {
                            result19 = (float) (slab_width / 30.48);
                        } else if (r19.equals("கடல் மைல்")) {
                            result19 = (float) (slab_width / 0.000164579);
                        } else if (r19.equals("மைல்")) {
                            result19 = (float) (slab_width / 0.000189394);
                        } else {
                            result19 = slab_width;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r20.equals("மீட்டர்")) {
                            result20 = (float) (slab_height / 0.3048);
                        } else if (r20.equals("கிலோமீட்டர்")) {
                            result20 = (float) (slab_height / 0.0003048);
                        } else if (r20.equals("முற்றம்")) {
                            result20 = (float) (slab_height / 0.333333333);
                        } else if (r20.equals("இன்ச்")) {
                            result20 = slab_height / 12;
                        } else if (r20.equals("மில்லிமீட்டர்")) {
                            result20 = (float) (slab_height / 304.8);
                        } else if (r20.equals("சென்டிமீட்டர்")) {
                            result20 = (float) (slab_height / 30.48);
                        } else if (r20.equals("கடல் மைல்")) {
                            result20 = (float) (slab_height / 0.000164579);
                        } else if (r20.equals("மைல்")) {
                            result20 = (float) (slab_height / 0.000189394);
                        } else {
                            result20 = slab_height;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r21.equals("மீட்டர்")) {
                            result21 = (float) (spacing_slab / 0.3048);
                        } else if (r21.equals("கிலோமீட்டர்")) {
                            result21 = (float) (spacing_slab / 0.0003048);
                        } else if (r21.equals("முற்றம்")) {
                            result21 = (float) (spacing_slab / 0.333333333);
                        } else if (r21.equals("இன்ச்")) {
                            result21 = spacing_slab / 12;
                        } else if (r21.equals("மில்லிமீட்டர்")) {
                            result21 = (float) (spacing_slab / 304.8);
                        } else if (r21.equals("சென்டிமீட்டர்")) {
                            result21 = (float) (spacing_slab / 30.48);
                        } else if (r21.equals("கடல் மைல்")) {
                            result21 = (float) (spacing_slab / 0.000164579);
                        } else if (r21.equals("மைல்")) {
                            result21 = (float) (spacing_slab / 0.000189394);
                        } else {
                            result21 = spacing_slab;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r22.equals("மீட்டர்")) {
                            result22 = (float) (no_slab / 0.3048);
                        } else if (r22.equals("கிலோமீட்டர்")) {
                            result22 = (float) (no_slab / 0.0003048);
                        } else if (r22.equals("முற்றம்")) {
                            result22 = (float) (no_slab / 0.333333333);
                        } else if (r22.equals("இன்ச்")) {
                            result22 = no_slab / 12;
                        } else if (r22.equals("மில்லிமீட்டர்")) {
                            result22 = (float) (no_slab / 304.8);
                        } else if (r22.equals("சென்டிமீட்டர்")) {
                            result22 = (float) (no_slab / 30.48);
                        } else if (r22.equals("கடல் மைல்")) {
                            result22 = (float) (no_slab / 0.000164579);
                        } else if (r22.equals("மைல்")) {
                            result22 = (float) (no_slab / 0.000189394);
                        } else {
                            result22 = no_slab;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r23.equals("மீட்டர்")) {
                            result23 = (float) (mainbar_dia_slab / 0.3048);
                        } else if (r23.equals("கிலோமீட்டர்")) {
                            result23 = (float) (mainbar_dia_slab / 0.0003048);
                        } else if (r23.equals("முற்றம்")) {
                            result23 = (float) (mainbar_dia_slab / 0.333333333);
                        } else if (r23.equals("இன்ச்")) {
                            result23 = mainbar_dia_slab / 12;
                        } else if (r23.equals("மில்லிமீட்டர்")) {
                            result23 = (float) (mainbar_dia_slab / 304.8);
                        } else if (r23.equals("சென்டிமீட்டர்")) {
                            result23 = (float) (mainbar_dia_slab / 30.48);
                        } else if (r23.equals("கடல் மைல்")) {
                            result23 = (float) (mainbar_dia_slab / 0.000164579);
                        } else if (r23.equals("மைல்")) {
                            result23 = (float) (mainbar_dia_slab / 0.000189394);
                        } else {
                            result23 = mainbar_dia_slab;
                        }
                        break;
                }
                switch (r25) {
                    case "அடி":
                        if (r24.equals("மீட்டர்")) {
                            result24 = (float) (distributionbar_dia_slab / 0.3048);
                        } else if (r24.equals("கிலோமீட்டர்")) {
                            result24 = (float) (distributionbar_dia_slab / 0.0003048);
                        } else if (r24.equals("முற்றம்")) {
                            result24 = (float) (distributionbar_dia_slab / 0.333333333);
                        } else if (r24.equals("இன்ச்")) {
                            result24 = distributionbar_dia_slab / 12;
                        } else if (r24.equals("மில்லிமீட்டர்")) {
                            result24 = (float) (distributionbar_dia_slab / 304.8);
                        } else if (r24.equals("சென்டிமீட்டர்")) {
                            result24 = (float) (distributionbar_dia_slab / 30.48);
                        } else if (r24.equals("கடல் மைல்")) {
                            result24 = (float) (distributionbar_dia_slab / 0.000164579);
                        } else if (r24.equals("மைல்")) {
                            result24 = (float) (distributionbar_dia_slab / 0.000189394);
                        } else {
                            result24 = distributionbar_dia_slab;
                        }
                        break;
                }


                //Todo:calculate slab bars
                float slab_width_direction  = (float) (result19 - 0.25);
                float slab_width_no_bars  = (float) (slab_width_direction / result21)+1;
                float slab_width_total  = (float) (slab_width_no_bars * slab_width_direction);
                float slab_length_direction  = (float) (result18 - 0.25);
                float slab_length_no_bars  = (float) (slab_length_direction / result21)+1;
                float slab_length_total  = (float) (slab_length_no_bars * slab_length_direction);
                float total_length_width  = (float) (slab_length_total + slab_width_total);
                //Todo:calculate weight
                float wt_main_bar  = (float) ((total_length_width * (result23 * result23 /162))/3.28084);
                float wt_distri_bar  = (float) ((total_length_width * (result24 * result24 /162))/3.28084);
                float total_wt = wt_main_bar + wt_distri_bar ;
                float total_wt_no = total_wt * no_slab;
                float kattukambi_weight1  = (total_wt/100);
                //Todo:calculate price
                float overall_weight_bars_length_rate  = (float) ((float) (total_wt_no * steelkg_price));
                float overall_kattukambi_weight1  = (kattukambi_weight1 * kattukambi_price);
                tx4.setText(String.valueOf(overall_weight_bars_length_rate  + "  steel price  "
                        +overall_kattukambi_weight1+"  winding price  "+total_wt_no+" weight "));

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