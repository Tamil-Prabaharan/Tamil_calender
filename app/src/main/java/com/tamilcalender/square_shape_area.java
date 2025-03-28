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

public class square_shape_area extends AppCompatActivity {

    private Button share,answer;
    private Spinner sp1,sp2;
    private String[] listitems,listitems1;
    TextView tx1,tx2;
    EditText ed1;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_shape_area);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView46);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units1);
        listitems1 = getResources().getStringArray(R.array.units);
        sp1=findViewById(R.id.spinnerr255);
        sp2=findViewById(R.id.spinner74);

        ed1=findViewById(R.id.editTextNumberDecimal47);

        answer=findViewById(R.id.button101);

        tx1 = findViewById(R.id.textView841);
        tx2 = findViewById(R.id.textView842);


        ArrayAdapter adapter = new ArrayAdapter(square_shape_area.this, android.R.layout.simple_spinner_item, listitems);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp1.setAdapter(adapter);

        ArrayAdapter adapter1 = new ArrayAdapter(square_shape_area.this, android.R.layout.simple_spinner_item, listitems1);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp2.setAdapter(adapter1);

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

                Float l1 = Float.valueOf(ed1.getText().toString());
                float result1 = 0.0F;
                //Todo: unit conversion
                switch (r2) {
                    case "அடி":
                        if (r1.equals("மீட்டர்")) {
                            result1 = (float) (l1 / 0.3048);
                        } else if (r1.equals("கிலோமீட்டர்")) {
                            result1 = (float) (l1 / 0.0003048);
                        } else if (r1.equals("முற்றம்")) {
                            result1 = (float) (l1 / 0.333333333);
                        } else if (r1.equals("இன்ச்")) {
                            result1 = l1 / 12;
                        } else if (r1.equals("மில்லிமீட்டர்")) {
                            result1 = (float) (l1 / 304.8);
                        } else if (r1.equals("சென்டிமீட்டர்")) {
                            result1 = (float) (l1 / 30.48);
                        } else if (r1.equals("கடல் மைல்")) {
                            result1 = (float) (l1 / 0.000164579);
                        } else if (r1.equals("மைல்")) {
                            result1 = (float) (l1 / 0.000189394);
                        } else {
                            result1 = l1;
                        }
                        break;
                }

                //Todo:calculate square shape
                float a  = (float) (result1 * result1);
                float p  = (float) (4 * result1);

                tx1.setText(String.valueOf(a+" area "));
                tx2.setText(String.valueOf(p+" perimeter "));

                Toast.makeText(square_shape_area.this, r1, Toast.LENGTH_LONG).show();


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