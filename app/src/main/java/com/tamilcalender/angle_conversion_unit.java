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

public class angle_conversion_unit extends AppCompatActivity {
    private AdView adView;
    private Button share,answer,answer1;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19;
    private String[] listitems,listitems1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle_conversion_unit);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView9);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);


        listitems = getResources().getStringArray(R.array.units_angle);

        ed1=findViewById(R.id.editTextNumberDecimal2);

        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);

        answer=findViewById(R.id.button94);

        tx1 = findViewById(R.id.textView764);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.units_angle, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);

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

                String inputUnitValue = sp1.getSelectedItem().toString();
                String outputUnitValue = sp2.getSelectedItem().toString();
                double inputVal = Double.parseDouble(ed1.getText().toString());
                double result = 0.0;

                // Conversion logic
                switch (inputUnitValue) {
                    case "வில்_விநாடி":
                        if (outputUnitValue.equals("கிரேடியன்")) {
                            result = inputVal / 3240;
                        } else if (outputUnitValue.equals("ரேடியன்")) {
                            result = inputVal * (3.14/648000);
                        }else {
                            result = inputVal;
                        }
                        break;
                    case "கிரேடியன்":
                        if (outputUnitValue.equals("வில்_விநாடி")) {
                            result = inputVal * 3240;
                        } else if (outputUnitValue.equals("ரேடியன்")) {
                            result = inputVal * 0.015708;
                        }else {
                            result = inputVal;
                        }
                        break;
                    case "ரேடியன்":
                        if (outputUnitValue.equals("வில்_விநாடி")) {
                            result = inputVal * 206264.806;
                        } else if (outputUnitValue.equals("கிரேடியன்")) {
                            result = inputVal * 63.662;
                        }else {
                            result = inputVal;
                        }
                        break;
                }
                tx1.setText(String.valueOf(result));


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