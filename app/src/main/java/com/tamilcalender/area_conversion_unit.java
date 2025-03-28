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

public class area_conversion_unit extends AppCompatActivity {

    private AdView adView;
    private Button share,answer,answer1;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19;
    private String[] listitems,listitems1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_conversion_unit);

        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView11);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems1 = getResources().getStringArray(R.array.units_area);
        ed1=findViewById(R.id.editTextNumberDecimal2);

        sp1=findViewById(R.id.spinner);
        sp2=findViewById(R.id.spinner2);

        answer=findViewById(R.id.button94);

        tx1 = findViewById(R.id.textView764);
        tx2 = findViewById(R.id.textView765);
        tx3 = findViewById(R.id.textView734);
        tx4 = findViewById(R.id.textView844);
        tx5 = findViewById(R.id.textView846);
        tx6 = findViewById(R.id.textView847);
        tx7 = findViewById(R.id.textView848);
        tx8 = findViewById(R.id.textView849);
        tx9 = findViewById(R.id.textView850);
        tx10 = findViewById(R.id.textView851);
        tx11 = findViewById(R.id.textView852);
        tx12 = findViewById(R.id.textView853);
        tx13 = findViewById(R.id.textView854);
        tx14 = findViewById(R.id.textView855);
        tx15 = findViewById(R.id.textView856);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.units_area, android.R.layout.simple_spinner_item);
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
                    case "சதுர_மீட்டர்":
                        if (outputUnitValue.equals("சதுர_கிலோமீட்டர்")) {
                            result = inputVal / 1000000;
                        } else if (outputUnitValue.equals("சதுர_மைல்")) {
                            result = inputVal / (2.59*1000000);
                        } else if (outputUnitValue.equals("சதுர_முற்றம்")) {
                            result = inputVal * 1.196;
                        } else if (outputUnitValue.equals("சதுர_அடி")) {
                            result = inputVal * 10.764;
                        } else if (outputUnitValue.equals("சதுர_அங்குலம்")) {
                            result = inputVal * 1550;
                        } else if (outputUnitValue.equals("ஹெக்டேர்")) {
                            result = inputVal / 10000;
                        } else if (outputUnitValue.equals("ஏக்கர்")) {
                            result = inputVal / 4047;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "சதுர_கிலோமீட்டர்":
                        if (outputUnitValue.equals("சதுர_மீட்டர்")) {
                            result = inputVal * 1000000;
                        } else if (outputUnitValue.equals("சதுர_மைல்")) {
                            result = inputVal / 2.59;
                        } else if (outputUnitValue.equals("சதுர_முற்றம்")) {
                            result = inputVal * 1.196000000;
                        } else if (outputUnitValue.equals("சதுர_அடி")) {
                            result = inputVal * 1.0760000000;
                        } else if (outputUnitValue.equals("சதுர_அங்குலம்")) {
                            result = inputVal * 1.55000000000;
                        } else if (outputUnitValue.equals("ஹெக்டேர்")) {
                            result = inputVal * 100;
                        } else if (outputUnitValue.equals("ஏக்கர்")) {
                            result = inputVal * 247.1;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "சதுர_மைல்":
                        if (outputUnitValue.equals("சதுர_மீட்டர்")) {
                            result = inputVal * 2.59000000;
                        } else if (outputUnitValue.equals("சதுர_கிலோமீட்டர்")) {
                            result = inputVal * 2.59;
                        } else if (outputUnitValue.equals("சதுர_முற்றம்")) {
                            result = inputVal * 3.098000000;
                        } else if (outputUnitValue.equals("சதுர_அடி")) {
                            result = inputVal * 2.7880000000;
                        } else if (outputUnitValue.equals("சதுர_அங்குலம்")) {
                            result = inputVal * 4.014000000000;
                        } else if (outputUnitValue.equals("ஹெக்டேர்")) {
                            result = inputVal * 259;
                        } else if (outputUnitValue.equals("ஏக்கர்")) {
                            result = inputVal * 640;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "சதுர_முற்றம்":
                        if (outputUnitValue.equals("சதுர_மீட்டர்")) {
                            result = inputVal / 1.196;
                        } else if (outputUnitValue.equals("சதுர_கிலோமீட்டர்")) {
                            result = inputVal * 1.196000000;
                        } else if (outputUnitValue.equals("சதுர_மைல்")) {
                            result = inputVal / 3.22830000000;
                        } else if (outputUnitValue.equals("சதுர_அடி")) {
                            result = inputVal * 9;
                        } else if (outputUnitValue.equals("சதுர_அங்குலம்")) {
                            result = inputVal * 1296;
                        } else if (outputUnitValue.equals("ஹெக்டேர்")) {
                            result = inputVal / 11960;
                        } else if (outputUnitValue.equals("ஏக்கர்")) {
                            result = inputVal / 4840;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "சதுர_அடி":
                        if (outputUnitValue.equals("சதுர_மீட்டர்")) {
                            result = inputVal / 10.764;
                        } else if (outputUnitValue.equals("சதுர_கிலோமீட்டர்")) {
                            result = inputVal / 1.0760000000;
                        } else if (outputUnitValue.equals("சதுர_மைல்")) {
                            result = inputVal / 2.7880000000;
                        } else if (outputUnitValue.equals("சதுர_முற்றம்")) {
                            result = inputVal / 9;
                        } else if (outputUnitValue.equals("சதுர_அங்குலம்")) {
                            result = inputVal * 144;
                        } else if (outputUnitValue.equals("ஹெக்டேர்")) {
                            result = inputVal / 107600;
                        } else if (outputUnitValue.equals("ஏக்கர்")) {
                            result = inputVal / 4356;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "சதுர_அங்குலம்":
                        if (outputUnitValue.equals("சதுர_மீட்டர்")) {
                            result = inputVal / 1550;
                        } else if (outputUnitValue.equals("சதுர_கிலோமீட்டர்")) {
                            result = inputVal / 1.55000000000;
                        } else if (outputUnitValue.equals("சதுர_மைல்")) {
                            result = inputVal / 4.014000000000;
                        } else if (outputUnitValue.equals("சதுர_முற்றம்")) {
                            result = inputVal / 1296;
                        } else if (outputUnitValue.equals("சதுர_அடி")) {
                            result = inputVal / 144;
                        } else if (outputUnitValue.equals("ஹெக்டேர்")) {
                            result = inputVal / 1.550000000;
                        } else if (outputUnitValue.equals("ஏக்கர்")) {
                            result = inputVal / 6.273000000;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "ஹெக்டேர்":
                        if (outputUnitValue.equals("சதுர_மீட்டர்")) {
                            result = inputVal *100000;
                        } else if (outputUnitValue.equals("சதுர_கிலோமீட்டர்")) {
                            result = inputVal / 100;
                        } else if (outputUnitValue.equals("சதுர_மைல்")) {
                            result = inputVal / 259;
                        } else if (outputUnitValue.equals("சதுர_முற்றம்")) {
                            result = inputVal * 11960;
                        } else if (outputUnitValue.equals("சதுர_அடி")) {
                            result = inputVal * 107600;
                        } else if (outputUnitValue.equals("சதுர_அங்குலம்")) {
                            result = inputVal * 1.550000000;
                        } else if (outputUnitValue.equals("ஏக்கர்")) {
                            result = inputVal * 2.471;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "ஏக்கர்":
                        if (outputUnitValue.equals("சதுர_மீட்டர்")) {
                            result = inputVal * 4047;
                        } else if (outputUnitValue.equals("சதுர_கிலோமீட்டர்")) {
                            result = inputVal / 247.1;
                        } else if (outputUnitValue.equals("சதுர_மைல்")) {
                            result = inputVal / 640;
                        } else if (outputUnitValue.equals("சதுர_முற்றம்")) {
                            result = inputVal * 4840;
                        } else if (outputUnitValue.equals("சதுர_அடி")) {
                            result = inputVal * 43560;
                        } else if (outputUnitValue.equals("சதுர_அங்குலம்")) {
                            result = inputVal * 6.273000000;
                        } else if (outputUnitValue.equals("ஹெக்டேர்")) {
                            result = inputVal / 2.471;
                        } else {
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