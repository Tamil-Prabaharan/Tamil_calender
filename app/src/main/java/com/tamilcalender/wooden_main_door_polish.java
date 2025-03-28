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

public class wooden_main_door_polish extends AppCompatActivity {
    private AdView adView;
    private Button share,answer,answer1;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wooden_main_door_polish);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView65);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinner51);
        sp2=findViewById(R.id.spinner54);
        sp3=findViewById(R.id.spinner15);

        ed1=findViewById(R.id.editTextNumberDecimal24);
        ed2=findViewById(R.id.editTextNumberDecimal25);
        ed3=findViewById(R.id.editTextNumberDecimal26);
        ed4=findViewById(R.id.editTextNumberDecimal9);
        ed5=findViewById(R.id.editTextNumberDecimal12);
        ed6=findViewById(R.id.editTextNumberDecimal16);
        ed7=findViewById(R.id.editTextNumberDecimal17);
        ed8=findViewById(R.id.editTextNumberDecimal18);
        ed9=findViewById(R.id.editTextNumberDecimal23);

        answer=findViewById(R.id.button73);

        tx1 = findViewById(R.id.textView765);
        tx2 = findViewById(R.id.textView767);
        tx3 = findViewById(R.id.textView769);
        tx4 = findViewById(R.id.textView771);
        tx5 = findViewById(R.id.textView777);
        tx6 = findViewById(R.id.textView779);
        tx7 = findViewById(R.id.textView788);
        tx8 = findViewById(R.id.textView790);
        tx9 = findViewById(R.id.textView793);
        tx10 = findViewById(R.id.textView795);
        tx11 = findViewById(R.id.textView807);

        ArrayAdapter adapter = new ArrayAdapter(wooden_main_door_polish.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(wooden_main_door_polish.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(wooden_main_door_polish.this, android.R.layout.simple_spinner_item, listitems1);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);


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

                Float door_length = Float.valueOf(ed1.getText().toString());
                Float door_height = Float.valueOf(ed2.getText().toString());
                Float door_thickness = Float.valueOf(ed3.getText().toString());
                Float varnish_liter_rate = Float.valueOf(ed4.getText().toString());
                Float polyurithean_liter_rate = Float.valueOf(ed5.getText().toString());
                Float waste_cloth_rate = Float.valueOf(ed6.getText().toString());
                Float paint_liter_rate = Float.valueOf(ed7.getText().toString());
                Float thinner_liter_rate = Float.valueOf(ed8.getText().toString());
                Float primer_liter_rate = Float.valueOf(ed9.getText().toString());
                float result1 = 0.0F;
                float result2 = 0.0F;

                //Todo: unit conversion
                switch (r3) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result1 = (float) (door_length / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (door_length / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (door_length / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = door_length / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (door_length / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (door_length / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (door_length / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (door_length / 0.000189394);
                        } else {
                            result1 = door_length;
                        }
                        break;
                }
                switch (r3) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (door_height / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (door_height / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (door_height / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = door_height / 12;
                        } else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (door_height / 304.8);
                        } else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (door_height / 30.48);
                        } else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (door_height / 0.000164579);
                        } else if (r2.equals("மைல்")) {
                            result2 = (float) (door_height / 0.000189394);
                        } else {
                            result2 = door_height;
                        }
                        break;
                }


                //Todo:calculate wood square feet
                float wood_square_feet  = (result1 * result2) * 2;
                //Todo:calculate wood filler
                float wood_filler  = wood_square_feet / 200;
                //Todo:calculate varnish
                float varnish  = wood_square_feet / 200;
                float varnish_ml  = (float) (varnish * 3785.41);
                float varnish_l  = (float) (varnish_ml / 1000);
                //Todo:calculate primer
                float primer  = wood_square_feet / 200;
                float primer_ml  = (float) (primer * 3785.41);
                float primer_l  = (float) (primer_ml / 1000);
                //Todo:calculate paint or stain
                float paint  = wood_square_feet / 300;
                float paint_ml  = (float) (paint * 3785.41);
                float paint_l  = (float) (paint_ml / 1000);
                //Todo:calculate polyurithane
                float polyurithane  = wood_square_feet / 300;
                float polyurithane_ml  = (float) (polyurithane * 3785.41);
                float polyurithane_l  = (float) (polyurithane_ml / 1000);
                //Todo:calculate thinner
                float thinner_ml  = (float) (300*1);
                float thinner_l  = (float) (thinner_ml / 1000);
                //Todo:calculate cloth
                float cloth  = 250 *1;
                //Todo:calculate price
                float polyurithean_rate  = polyurithane_l * polyurithean_liter_rate;
                float primer_rate  = primer_l * primer_liter_rate;
                float thinner_rate  = thinner_l * thinner_liter_rate;
                float paint_rate  = paint_l * paint_liter_rate;
                float varnish_rate  = varnish_l * varnish_liter_rate;
                float cloth_rate  = cloth * waste_cloth_rate;



                tx1.setText(String.valueOf(varnish_l));
                tx2.setText(String.valueOf(varnish_rate));
                tx3.setText(String.valueOf(polyurithane_l));
                tx4.setText(String.valueOf(polyurithean_rate));
                tx5.setText(String.valueOf(paint_l));
                tx6.setText(String.valueOf(paint_rate));
                tx7.setText(String.valueOf(thinner_l));
                tx8.setText(String.valueOf(thinner_rate));
                tx9.setText(String.valueOf(primer_l));
                tx10.setText(String.valueOf(primer_rate));
                tx11.setText(String.valueOf(cloth_rate+" gram "));

                Toast.makeText(wooden_main_door_polish.this, r1, Toast.LENGTH_LONG).show();


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