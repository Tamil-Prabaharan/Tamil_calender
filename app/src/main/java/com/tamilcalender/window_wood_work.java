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

public class window_wood_work extends AppCompatActivity {
    private AdView adView;
    private Button share,answer,answer1;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    private String[] listitems,listitems1;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_wood_work);



        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView63);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinner7);
        sp2=findViewById(R.id.spinner8);
        sp3=findViewById(R.id.spinner32);
        sp4=findViewById(R.id.spinner11);
        sp5=findViewById(R.id.spinner12);
        sp6=findViewById(R.id.spinner33);
        sp7=findViewById(R.id.spinner34);

        ed1=findViewById(R.id.editTextNumberDecimal13);
        ed2=findViewById(R.id.editTextNumberDecimal14);
        ed3=findViewById(R.id.editTextNumberDecimal56);
        ed4=findViewById(R.id.editTextNumberDecimal22);
        ed5=findViewById(R.id.editTextNumberDecimal57);
        ed6=findViewById(R.id.editTextNumberDecimal58);
        ed7=findViewById(R.id.editTextNumberDecimal59);
        ed8=findViewById(R.id.editTextNumberDecimal60);
        ed9=findViewById(R.id.editTextNumberDecimal61);
        ed10=findViewById(R.id.editTextNumberDecimal62);
        ed11=findViewById(R.id.editTextNumberDecimal9);
        ed12=findViewById(R.id.editTextNumberDecimal10);
        ed13=findViewById(R.id.editTextNumberDecimal12);
        ed14=findViewById(R.id.editTextNumberDecimal16);
        ed15=findViewById(R.id.editTextNumberDecimal17);
        ed16=findViewById(R.id.editTextNumberDecimal18);
        ed17=findViewById(R.id.editTextNumberDecimal23);
        ed18=findViewById(R.id.editTextNumberDecimal64);
        ed19=findViewById(R.id.editTextNumberDecimal65);

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
        tx12 = findViewById(R.id.textView805);
        tx13 = findViewById(R.id.textView807);

        ArrayAdapter adapter = new ArrayAdapter(window_wood_work.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(window_wood_work.this, android.R.layout.simple_spinner_item, listitems);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter(window_wood_work.this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp3.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter(window_wood_work.this, android.R.layout.simple_spinner_item, listitems);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp4.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter(window_wood_work.this, android.R.layout.simple_spinner_item, listitems);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp5.setAdapter(adapter4);

        ArrayAdapter adapter5 = new ArrayAdapter(window_wood_work.this, android.R.layout.simple_spinner_item, listitems);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp6.setAdapter(adapter5);

        ArrayAdapter adapter6 = new ArrayAdapter(window_wood_work.this, android.R.layout.simple_spinner_item, listitems1);
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

                Float window_length = Float.valueOf(ed1.getText().toString());
                Float window_height = Float.valueOf(ed2.getText().toString());
                Float number_window_doors = Float.valueOf(ed3.getText().toString());
                Float window_wood_width = Float.valueOf(ed4.getText().toString());
                Float window_wood_height = Float.valueOf(ed5.getText().toString());
                Float window_door_wood_width = Float.valueOf(ed6.getText().toString());
                Float window_door_wood_height = Float.valueOf(ed7.getText().toString());
                Float grill_kg_sq_ft = Float.valueOf(ed8.getText().toString());
                Float grill_work_price = Float.valueOf(ed9.getText().toString());
                Float grill_transport_price = Float.valueOf(ed10.getText().toString());
                Float glass_price = Float.valueOf(ed11.getText().toString());
                Float grill_kg_sq_ft_price = Float.valueOf(ed12.getText().toString());
                Float wood_price = Float.valueOf(ed13.getText().toString());
                Float launch_price = Float.valueOf(ed14.getText().toString());
                Float handle_price = Float.valueOf(ed15.getText().toString());
                Float screw_price = Float.valueOf(ed16.getText().toString());
                Float heel_price = Float.valueOf(ed17.getText().toString());
                Float length_wood_number = Float.valueOf(ed16.getText().toString());
                Float height_wood_number = Float.valueOf(ed17.getText().toString());
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
                            result1 = (float) (window_length / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (window_length / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (window_length / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = window_length / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (window_length / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (window_length / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (window_length / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (window_length / 0.000189394);
                        } else {
                            result1 = window_length;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r2.equals("மீட்டர்")) {
                            result2 = (float) (window_height / 0.3048);
                        } else if (r2.equals("கிலோமீட்டர்")) {
                            result2 = (float) (window_height / 0.0003048);
                        } else if (r2.equals("முற்றம்")) {
                            result2 = (float) (window_height / 0.333333333);
                        } else if (r2.equals("இன்ச்")) {
                            result2 = window_height / 12;
                        } else if (r2.equals("மில்லிமீட்டர்")) {
                            result2 = (float) (window_height / 304.8);
                        } else if (r2.equals("சென்டிமீட்டர்")) {
                            result2 = (float) (window_height / 30.48);
                        } else if (r2.equals("கடல் மைல்")) {
                            result2 = (float) (window_height / 0.000164579);
                        } else if (r2.equals("மைல்")) {
                            result2 = (float) (window_height / 0.000189394);
                        } else {
                            result2 = window_height;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r3.equals("மீட்டர்")) {
                            result3 = (float) (window_wood_width / 0.3048);
                        } else if (r3.equals("கிலோமீட்டர்")) {
                            result3 = (float) (window_wood_width / 0.0003048);
                        } else if (r3.equals("முற்றம்")) {
                            result3 = (float) (window_wood_width / 0.333333333);
                        } else if (r3.equals("இன்ச்")) {
                            result3 = window_wood_width / 12;
                        } else if (r3.equals("மில்லிமீட்டர்")) {
                            result3 = (float) (window_wood_width / 304.8);
                        } else if (r3.equals("சென்டிமீட்டர்")) {
                            result3 = (float) (window_wood_width / 30.48);
                        } else if (r3.equals("கடல் மைல்")) {
                            result3 = (float) (window_wood_width / 0.000164579);
                        } else if (r3.equals("மைல்")) {
                            result3 = (float) (window_wood_width / 0.000189394);
                        } else {
                            result3 = window_wood_width;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r4.equals("மீட்டர்")) {
                            result4 = (float) (window_wood_height / 0.3048);
                        } else if (r4.equals("கிலோமீட்டர்")) {
                            result4 = (float) (window_wood_height / 0.0003048);
                        } else if (r4.equals("முற்றம்")) {
                            result4 = (float) (window_wood_height / 0.333333333);
                        } else if (r4.equals("இன்ச்")) {
                            result4 = window_wood_height / 12;
                        } else if (r4.equals("மில்லிமீட்டர்")) {
                            result4 = (float) (window_wood_height / 304.8);
                        } else if (r4.equals("சென்டிமீட்டர்")) {
                            result4 = (float) (window_wood_height / 30.48);
                        } else if (r4.equals("கடல் மைல்")) {
                            result4 = (float) (window_wood_height / 0.000164579);
                        } else if (r4.equals("மைல்")) {
                            result4 = (float) (window_wood_height / 0.000189394);
                        } else {
                            result4 = window_wood_height;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r5.equals("மீட்டர்")) {
                            result5 = (float) (window_door_wood_width / 0.3048);
                        } else if (r5.equals("கிலோமீட்டர்")) {
                            result5 = (float) (window_door_wood_width / 0.0003048);
                        } else if (r5.equals("முற்றம்")) {
                            result5 = (float) (window_door_wood_width / 0.333333333);
                        } else if (r5.equals("இன்ச்")) {
                            result5 = window_door_wood_width / 12;
                        } else if (r5.equals("மில்லிமீட்டர்")) {
                            result5 = (float) (window_door_wood_width / 304.8);
                        } else if (r5.equals("சென்டிமீட்டர்")) {
                            result5 = (float) (window_door_wood_width / 30.48);
                        } else if (r5.equals("கடல் மைல்")) {
                            result5 = (float) (window_door_wood_width / 0.000164579);
                        } else if (r5.equals("மைல்")) {
                            result5 = (float) (window_door_wood_width / 0.000189394);
                        } else {
                            result5 = window_door_wood_width;
                        }
                        break;
                }
                switch (r7) {
                    case "அடி":
                        if (r6.equals("மீட்டர்")) {
                            result6 = (float) (window_door_wood_height / 0.3048);
                        } else if (r6.equals("கிலோமீட்டர்")) {
                            result6 = (float) (window_door_wood_height / 0.0003048);
                        } else if (r6.equals("முற்றம்")) {
                            result6 = (float) (window_door_wood_height / 0.333333333);
                        } else if (r6.equals("இன்ச்")) {
                            result6 = window_door_wood_height / 12;
                        } else if (r6.equals("மில்லிமீட்டர்")) {
                            result6 = (float) (window_door_wood_height / 304.8);
                        } else if (r6.equals("சென்டிமீட்டர்")) {
                            result6 = (float) (window_door_wood_height / 30.48);
                        } else if (r6.equals("கடல் மைல்")) {
                            result6 = (float) (window_door_wood_height / 0.000164579);
                        } else if (r6.equals("மைல்")) {
                            result6 = (float) (window_door_wood_height / 0.000189394);
                        } else {
                            result6 = window_door_wood_height;
                        }
                        break;
                }


                /******
                 float result1 = window_length;
                float result2 = window_height;
                float result3 = window_wood_width;
                float result4 = window_wood_height;
                float result5 = window_door_wood_width;
                float result6 = window_door_wood_height;  ***************/


                //Todo:calculate window
                float window_main_wood  = (result1 * length_wood_number)+(result2 * height_wood_number);
                float window_total_main_wood  = (float) (window_main_wood * result3 * result4);
                //Todo:calculate window frame wood cu.ft
                float frame = result1 / number_window_doors;
                float frame_wood  = (frame * result6 * result5);
                float frame_total_wood  =  (frame_wood * number_window_doors);
                //Todo:calculate total wood cu.ft
                float total_wood  =  (window_total_main_wood + frame_total_wood );
                //Todo:calculate glass
                float glass_square_feet  = number_window_doors * window_door_wood_height * window_door_wood_width ;
                //Todo:calculate handle
                float number_handle  = number_window_doors * 1  ;
                //Todo:calculate launch
                float number_launch  = number_window_doors * 2  ;
                //Todo:calculate screw
                float number_screw  = number_window_doors * 10  ;
                //Todo:calculate heel
                float number_heel  = number_window_doors * 2  ;
                //Todo:calculate square_feet_grill
                float square_feet_grill  =  (result1 * result2 * grill_kg_sq_ft);
                //Todo:calculate price
                float square_feet_grill_price  =  (square_feet_grill * grill_kg_sq_ft_price) + grill_transport_price + grill_work_price;
                float number_heel_price  =  number_heel * heel_price;
                float number_screw_price  =  number_screw * screw_price;
                float number_launch_price  =  number_launch * launch_price;
                float number_handle_price  =  number_handle * handle_price;
                float glass_square_feet_price  =  glass_square_feet * glass_price;
                float total_wood_price  =  total_wood * wood_price;



                tx1.setText(String.valueOf(glass_square_feet));
                tx2.setText(String.valueOf(glass_square_feet_price));
                tx3.setText(String.valueOf(total_wood));
                tx4.setText(String.valueOf(total_wood_price));
                tx5.setText(String.valueOf(number_launch));
                tx6.setText(String.valueOf(number_launch_price));
                tx7.setText(String.valueOf(number_handle));
                tx8.setText(String.valueOf(number_handle_price));
                tx9.setText(String.valueOf(number_screw));
                tx10.setText(String.valueOf(number_screw_price));
                tx11.setText(String.valueOf(number_heel));
                tx12.setText(String.valueOf(number_heel_price));
                tx13.setText(String.valueOf(square_feet_grill_price));



                Toast.makeText(window_wood_work.this, r1, Toast.LENGTH_LONG).show();



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