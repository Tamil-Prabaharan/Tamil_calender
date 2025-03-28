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

public class square_rectangle_shape_weight extends AppCompatActivity {
    private Button share,calculate;
    private String[] listitems,listitems1;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    TextView tx1,tx2;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_rectangle_shape_weight);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView45);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinnerr255);
        sp2=findViewById(R.id.spinnerr26);
        sp3=findViewById(R.id.spinner27);
        sp4=findViewById(R.id.spinner28);
        sp5=findViewById(R.id.spinner30);
        sp6=findViewById(R.id.spinner79);

        ed1=findViewById(R.id.editTextNumberDecimal47);
        ed2=findViewById(R.id.editTextNumberDecimal48);
        ed3=findViewById(R.id.editTextNumberDecimal49);
        ed4=findViewById(R.id.editTextNumberDecimal50);
        ed5=findViewById(R.id.editTextNumberDecimal55);
        ed6=findViewById(R.id.editTextNumberDecimal51);
        ed7=findViewById(R.id.editTextNumberDecimal52);

        tx1 = findViewById(R.id.textView841);
        tx2 = findViewById(R.id.textView842);


        ArrayAdapter adapter = new ArrayAdapter(square_rectangle_shape_weight.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(square_rectangle_shape_weight.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(square_rectangle_shape_weight.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(square_rectangle_shape_weight.this, android.R.layout.simple_spinner_item, listitems);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(square_rectangle_shape_weight.this, android.R.layout.simple_spinner_item, listitems);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        ArrayAdapter adapter5 = new ArrayAdapter(square_rectangle_shape_weight.this, android.R.layout.simple_spinner_item, listitems1);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp6.setAdapter(adapter5);
        /******************************************************************************
         0th activity button id allocation***/
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
                String r4 = sp4.getSelectedItem().toString();
                String r5 = sp5.getSelectedItem().toString();
                String r6 = sp6.getSelectedItem().toString();

                Float length1 = Float.valueOf(ed1.getText().toString());
                Float length2 = Float.valueOf(ed2.getText().toString());
                Float length3 = Float.valueOf(ed3.getText().toString());
                Float length4 = Float.valueOf(ed4.getText().toString());
                Float length5 = Float.valueOf(ed5.getText().toString());
                Float number = Float.valueOf(ed6.getText().toString());
                Float price = Float.valueOf(ed7.getText().toString());
                float result1 = 0.0F;
                float result2 = 0.0F;
                float result3 = 0.0F;
                float result4 = 0.0F;
                float result5 = 0.0F;

                //Todo: unit conversion
                switch (r6) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result1 = (float) (length1 / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (length1 / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (length1 / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = length1 / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (length1 / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (length1 / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (length1 / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (length1 / 0.000189394);
                        } else {
                            result1 = length1;
                        }
                        break;
                }
                switch (r6) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (length2 / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (length2 / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (length2 / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = length2 / 12;
                        } else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (length2 / 304.8);
                        } else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (length2 / 30.48);
                        } else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (length2 / 0.000164579);
                        } else if (r2.equals("மைல்")) {
                            result2 = (float) (length2 / 0.000189394);
                        } else {
                            result2 = length2;
                        }
                        break;
                }
                switch (r6) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (length3 / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (length3 / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (length3 / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = length3 / 12;
                        } else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (length3 / 304.8);
                        } else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (length3 / 30.48);
                        } else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (length3 / 0.000164579);
                        } else if (r3.equals("மைல்")) {
                            result3 = (float) (length3 / 0.000189394);
                        } else {
                            result3 = length3;
                        }
                        break;
                }
                switch (r6) {
                    case "அடி":
                        if (r4.equals("மீட்டர்")) {
                            result4 = (float) (length4 / 0.3048);
                        } else if (r4.equals("கிலோமீட்டர்")) {
                            result4 = (float) (length4 / 0.0003048);
                        } else if (r4.equals("முற்றம்")) {
                            result4 = (float) (length4 / 0.333333333);
                        } else if (r4.equals("இன்ச்")) {
                            result4 = length4 / 12;
                        } else if (r4.equals("மில்லிமீட்டர்")) {
                            result4 = (float) (length4 / 304.8);
                        } else if (r4.equals("சென்டிமீட்டர்")) {
                            result4 = (float) (length4 / 30.48);
                        } else if (r4.equals("கடல் மைல்")) {
                            result4 = (float) (length4 / 0.000164579);
                        } else if (r4.equals("மைல்")) {
                            result4 = (float) (length4 / 0.000189394);
                        } else {
                            result4 = length4;
                        }
                        break;
                }
                switch (r6) {
                    case "அடி":
                        if (r5.equals("மீட்டர்")) {
                            result5 = (float) (length5 / 0.3048);
                        } else if (r5.equals("கிலோமீட்டர்")) {
                            result5 = (float) (length5 / 0.0003048);
                        } else if (r5.equals("முற்றம்")) {
                            result5 = (float) (length5 / 0.333333333);
                        } else if (r5.equals("இன்ச்")) {
                            result5 = length5 / 12;
                        } else if (r5.equals("மில்லிமீட்டர்")) {
                            result5 = (float) (length5 / 304.8);
                        } else if (r5.equals("சென்டிமீட்டர்")) {
                            result5 = (float) (length5 / 30.48);
                        } else if (r5.equals("கடல் மைல்")) {
                            result5 = (float) (length5 / 0.000164579);
                        } else if (r5.equals("மைல்")) {
                            result5 = (float) (length5 / 0.000189394);
                        } else {
                            result5 = length5;
                        }
                        break;
                }


                //Todo:calculate
                float volume  = (result1 * result2 * result5);
                float desity_of_steel  = 490;//lbs
                float weight_kg  = (float) (volume * desity_of_steel * 0.453592);//1pound=0.453592
                float weight_total_kg_no1  = (float) (weight_kg * number);

                float volume2  = (result3 * result4 * result5);
                float desity_of_steel2  = 490;//lbs
                float weight_kg2  = (float) (volume2 * desity_of_steel2 * 0.453592);//1pound=0.453592
                float weight_total_kg_no2  = (float) (weight_kg2 * number);

                float total  = (float) (weight_total_kg_no1 - weight_total_kg_no2);

                float weight_kg_price  = (float) (total * price);

                tx1.setText(String.valueOf(total + "  கிலோகிராம்  "));
                tx2.setText(String.valueOf(weight_kg_price +"  விலை  "));

                Toast.makeText(square_rectangle_shape_weight.this, r1, Toast.LENGTH_LONG).show();

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