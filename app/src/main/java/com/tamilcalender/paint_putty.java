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

public class paint_putty extends AppCompatActivity {

    private AdView adView;
    private Button share,answer,answer1;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    private String[] listitems,listitems1,listitems2,listitems3;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint_putty);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView30);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        listitems2 = getResources().getStringArray(R.array.units_area_coverage1);
        listitems3 = getResources().getStringArray(R.array.units_area_coverage);
        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);
        sp3=findViewById(R.id.spinner63);
        sp4=findViewById(R.id.spinner61);
        sp5=findViewById(R.id.spinner62);
        sp6=findViewById(R.id.spinner60);
        sp7=findViewById(R.id.spinner64);


        ed1=findViewById(R.id.editTextNumberDecimal2);
        ed2=findViewById(R.id.editTextNumberDecimal3);
        ed3=findViewById(R.id.editTextNumberDecimal4);
        ed4=findViewById(R.id.editTextNumberDecimal20);
        ed5=findViewById(R.id.editTextNumberDecimal21);
        ed6=findViewById(R.id.editTextNumberDecimal6);
        ed7=findViewById(R.id.editTextNumberDecimal7);
        ed8=findViewById(R.id.editTextNumberr4);
        ed9=findViewById(R.id.editTextNumber5);
        ed10=findViewById(R.id.editTextNumberDecimal9);
        ed11=findViewById(R.id.editTextNumberDecimal10);
        ed12=findViewById(R.id.editTextNumberDecimal12);
        ed13=findViewById(R.id.editTextNumberDecimal16);
        ed14=findViewById(R.id.editTextNumberDecimal17);
        ed15=findViewById(R.id.editTextNumberDecimal18);

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
        tx11 = findViewById(R.id.textView797);

        ArrayAdapter adapter = new ArrayAdapter(paint_putty.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(paint_putty.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(paint_putty.this, android.R.layout.simple_spinner_item, listitems1);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(paint_putty.this, android.R.layout.simple_spinner_item, listitems2);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(paint_putty.this, android.R.layout.simple_spinner_item, listitems2);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        ArrayAdapter adapter5 = new ArrayAdapter(paint_putty.this, android.R.layout.simple_spinner_item, listitems2);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp6.setAdapter(adapter5);

        ArrayAdapter adapter6 = new ArrayAdapter(paint_putty.this, android.R.layout.simple_spinner_item, listitems3);
        adapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp7.setAdapter(adapter6);

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

                Float wall_length = Float.valueOf(ed1.getText().toString());
                Float wall_width = Float.valueOf(ed2.getText().toString());
                Float number_coats_putty = Float.valueOf(ed3.getText().toString());
                Float number_thagadu = Float.valueOf(ed4.getText().toString());
                Float putty_coverage = Float.valueOf(ed5.getText().toString());
                Float number_coats_paint = Float.valueOf(ed6.getText().toString());
                Float number_coats_primer = Float.valueOf(ed7.getText().toString());
                Float paint_coverage = Float.valueOf(ed8.getText().toString());
                Float primer_coverage = Float.valueOf(ed9.getText().toString());
                Float paint_liter_price = Float.valueOf(ed10.getText().toString());
                Float primer_liter_price = Float.valueOf(ed11.getText().toString());
                Float putty_liter_price = Float.valueOf(ed12.getText().toString());
                Float waste_cloth_price = Float.valueOf(ed13.getText().toString());
                Float emery_paper_price = Float.valueOf(ed14.getText().toString());
                Float thagadu_price = Float.valueOf(ed15.getText().toString());
                float result1 = 0.0F;
                float result2 = 0.0F;
                float result3 = 0.0F;
                float result4 = 0.0F;
                float result5 = 0.0F;
                //Todo: unit conversion
                switch (r3) {
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
                switch (r3) {
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

                //Todo:area coverage unit conversion
                switch (r7) {
                    case "சதுர_அடி":
                        if (r4.equals("சதுர_மீட்டர்")) {
                            result3 = (float) (putty_coverage / 0.092903);
                        } else if (r4.equals("சதுர_முற்றம்")) {
                            result3 = (float) (putty_coverage / 0.111111);
                        }else if (r4.equals("சதுர_இன்ச்")) {
                            result3 = putty_coverage / 144;
                        }else {
                            result3 = putty_coverage;
                        }
                        break;
                }
                switch (r7) {
                    case "சதுர_அடி":
                        if (r5.equals("சதுர_மீட்டர்")) {
                            result4 = (float) (paint_coverage / 0.092903);
                        } else if (r5.equals("சதுர_முற்றம்")) {
                            result4 = (float) (paint_coverage / 0.111111);
                        }else if (r5.equals("சதுர_இன்ச்")) {
                            result4 = paint_coverage / 144;
                        }else {
                            result4 = paint_coverage;
                        }
                        break;
                }
                switch (r7) {
                    case "சதுர_அடி":
                        if (r6.equals("சதுர_மீட்டர்")) {
                            result5 = (float) (primer_coverage / 0.092903);
                        } else if (r6.equals("சதுர_முற்றம்")) {
                            result5 = (float) (primer_coverage / 0.111111);
                        }else if (r6.equals("சதுர_இன்ச்")) {
                            result5 = primer_coverage / 144;
                        }else {
                            result5 = primer_coverage;
                        }
                        break;
                }
                //Todo:calculate wall volume
                float wall_area = result1 * result2;
                //Todo:calculate putty
                float litter_putty = wall_area / result3 ;
                float kg_putty = wall_area / 20 ;
                float litter_putty_full_wall = litter_putty * number_coats_putty ;
                float kg_putty_full_wall = kg_putty * number_coats_putty ;
                //Todo:calculate paint
                float litter_paint = wall_area / result4 ;
                float litter_paint_full_wall = litter_paint * number_coats_paint ;
                //Todo:calculate primer
                float litter_primer = wall_area / result5 ;
                float litter_primer_full_wall = litter_primer * number_coats_primer ;
                //Todo:calculate waste cloth
                float waste_cloth_kg = (float) ((wall_area / 100) * 0.2);
                //Todo:calculate emery paper
                float emery_paper = (wall_area / 100) * 5;
                //Todo:calculate thagadu
                float thagadu = number_thagadu;
                //Todo:calculate price
                float putty_liter_full_price = litter_putty_full_wall * putty_liter_price;
                float paint_liter_full_wall_price = litter_paint_full_wall * paint_liter_price;
                float primer_liter_full_wall_price = litter_primer_full_wall * primer_liter_price;
                float waste_cloth_full_wall_price = waste_cloth_kg * waste_cloth_price;
                float emery_paper_full_wall_price = emery_paper * emery_paper_price;
                float thagadu_full_wall_price = thagadu * thagadu_price;


                tx1.setText(String.valueOf(litter_paint_full_wall));
                tx2.setText(String.valueOf(paint_liter_full_wall_price));
                tx3.setText(String.valueOf(litter_primer_full_wall));
                tx4.setText(String.valueOf(primer_liter_full_wall_price));
                tx5.setText(String.valueOf(litter_putty_full_wall+" liter "+" or "+kg_putty +" kg "));
                tx6.setText(String.valueOf(putty_liter_full_price+" liter "));
                tx7.setText(String.valueOf(thagadu));
                tx8.setText(String.valueOf(thagadu_full_wall_price));
                tx9.setText(String.valueOf(emery_paper));
                tx10.setText(String.valueOf(emery_paper_full_wall_price));
                tx11.setText(String.valueOf(waste_cloth_full_wall_price +" price "+ waste_cloth_kg +" kg " ));



                Toast.makeText(paint_putty.this, r1, Toast.LENGTH_LONG).show();


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