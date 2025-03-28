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

public class length_conversion_unit extends AppCompatActivity {
    private AdView adView;
    private Button share,answer,answer1;;
    private Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15,ed16,ed17,ed18,ed19;
    private String[] listitems,listitems1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_conversion_unit);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView26);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        listitems = getResources().getStringArray(R.array.units);
        listitems1 = getResources().getStringArray(R.array.units1);
        ed1=findViewById(R.id.editTextNumberDecimal2);
        ed2=findViewById(R.id.editTextNumberDecimal3);

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
                R.array.units1, android.R.layout.simple_spinner_item);
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
                    case "மீட்டர்":
                        if (outputUnitValue.equals("கிலோமீட்டர்")) {
                            result = inputVal / 1000;
                        } else if (outputUnitValue.equals("முற்றம்")) {
                            result = inputVal * 1.09361;
                        } else if (outputUnitValue.equals("அடி")) {
                            result = inputVal * 3.28084;
                        } else if (outputUnitValue.equals("இன்ச்")) {
                            result = inputVal * 39.37;
                        } else if (outputUnitValue.equals("மில்லிமீட்டர்")) {
                            result = inputVal * 1000;
                        } else if (outputUnitValue.equals("சென்டிமீட்டர்")) {
                            result = inputVal * 100;
                        } else if (outputUnitValue.equals("கடல் மைல்")) {
                            result = inputVal / 1852;
                        } else if (outputUnitValue.equals("மைல்")) {
                            result = inputVal / 1609;
                        }   else {
                            result = inputVal;
                        }
                        break;
                    case "கிலோமீட்டர்":
                        if (outputUnitValue.equals("மீட்டர்")) {
                            result = inputVal * 1000;
                        } else if (outputUnitValue.equals("முற்றம்")) {
                            result = inputVal * 1093.61;
                        } else if (outputUnitValue.equals("அடி")) {
                            result = inputVal * 3280.84;
                        } else if (outputUnitValue.equals("இன்ச்")) {
                            result = inputVal * 36;
                        } else if (outputUnitValue.equals("மில்லிமீட்டர்")) {
                            result = inputVal * 39370;
                        } else if (outputUnitValue.equals("சென்டிமீட்டர்")) {
                            result = inputVal * 100000;
                        } else if (outputUnitValue.equals("கடல் மைல்")) {
                            result = inputVal / 1.852;
                        } else if (outputUnitValue.equals("மைல்")) {
                            result = inputVal / 0.621371;
                        }   else {
                            result = inputVal;
                        }
                        break;
                    case "முற்றம்":
                        if (outputUnitValue.equals("மீட்டர்")) {
                            result = inputVal / 1.09361;
                        } else if (outputUnitValue.equals("கிலோமீட்டர்")) {
                            result = inputVal / 1093.61;
                        } else if (outputUnitValue.equals("அடி")) {
                            result = inputVal * 3;
                        } else if (outputUnitValue.equals("இன்ச்")) {
                            result = inputVal * 36;
                        } else if (outputUnitValue.equals("மில்லிமீட்டர்")) {
                            result = inputVal * 914.4;
                        } else if (outputUnitValue.equals("சென்டிமீட்டர்")) {
                            result = inputVal / 91.44;
                        } else if (outputUnitValue.equals("கடல் மைல்")) {
                            result = inputVal * 2025;
                        } else if (outputUnitValue.equals("மைல்")) {
                            result = inputVal / 1760;
                        }  else {
                            result = inputVal;
                        }
                        break;
                    case "அடி":
                        if (outputUnitValue.equals("மீட்டர்")) {
                            result = inputVal / 3.28084;
                        } else if (outputUnitValue.equals("கிலோமீட்டர்")) {
                            result = inputVal / 3280.84;
                        } else if (outputUnitValue.equals("முற்றம்")) {
                            result = inputVal / 3;
                        } else if (outputUnitValue.equals("இன்ச்")) {
                            result = inputVal * 12;
                        }  else if (outputUnitValue.equals("மில்லிமீட்டர்")) {
                            result = inputVal * 304.8;
                        }  else if (outputUnitValue.equals("சென்டிமீட்டர்")) {
                            result = inputVal * 30.48;
                        }  else if (outputUnitValue.equals("கடல் மைல்")) {
                            result = inputVal / 6076;
                        }  else if (outputUnitValue.equals("மைல்")) {
                            result = inputVal / 5280;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "இன்ச்":
                        if (outputUnitValue.equals("மீட்டர்")) {
                            result = inputVal / 39.37;
                        } else if (outputUnitValue.equals("கிலோமீட்டர்")) {
                            result = inputVal / 39370;
                        } else if (outputUnitValue.equals("முற்றம்")) {
                            result = inputVal / 36;
                        } else if (outputUnitValue.equals("அடி")) {
                            result = inputVal / 12;
                        }  else if (outputUnitValue.equals("மில்லிமீட்டர்")) {
                            result = inputVal * 25.4;
                        }  else if (outputUnitValue.equals("சென்டிமீட்டர்")) {
                            result = inputVal * 2.54;
                        }  else if (outputUnitValue.equals("கடல் மைல்")) {
                            result = inputVal / 72910;
                        }  else if (outputUnitValue.equals("மைல்")) {
                            result = inputVal / 63360;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "மில்லிமீட்டர்":
                        if (outputUnitValue.equals("மீட்டர்")) {
                            result = inputVal / 1000;
                        } else if (outputUnitValue.equals("கிலோமீட்டர்")) {
                            result = inputVal / 1e-6;
                        } else if (outputUnitValue.equals("முற்றம்")) {
                            result = inputVal / 914.4;
                        } else if (outputUnitValue.equals("அடி")) {
                            result = inputVal / 304.8;
                        }  else if (outputUnitValue.equals("இன்ச்")) {
                            result = inputVal * 25.4;
                        }  else if (outputUnitValue.equals("சென்டிமீட்டர்")) {
                            result = inputVal / 10;
                        }  else if (outputUnitValue.equals("கடல் மைல்")) {
                            result = inputVal / 1.852000000;
                        }  else if (outputUnitValue.equals("மைல்")) {
                            result = inputVal / 1.609000000;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "கடல் மைல்":
                        if (outputUnitValue.equals("மீட்டர்")) {
                            result = inputVal * 1852;
                        } else if (outputUnitValue.equals("கிலோமீட்டர்")) {
                            result = inputVal * 1.852;
                        } else if (outputUnitValue.equals("முற்றம்")) {
                            result = inputVal * 2025;
                        } else if (outputUnitValue.equals("அடி")) {
                            result = inputVal * 6076;
                        }  else if (outputUnitValue.equals("இன்ச்")) {
                            result = inputVal * 72910;
                        }  else if (outputUnitValue.equals("சென்டிமீட்டர்")) {
                            result = inputVal * 185200;
                        }  else if (outputUnitValue.equals("மில்லிமீட்டர்")) {
                            result = inputVal * 1.852000000;
                        }  else if (outputUnitValue.equals("மைல்")) {
                            result = inputVal * 1.151;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "சென்டிமீட்டர்":
                        if (outputUnitValue.equals("மீட்டர்")) {
                            result = inputVal / 100;
                        } else if (outputUnitValue.equals("கிலோமீட்டர்")) {
                            result = inputVal / 100000;
                        } else if (outputUnitValue.equals("முற்றம்")) {
                            result = inputVal / 91.44;
                        } else if (outputUnitValue.equals("அடி")) {
                            result = inputVal / 30.48;
                        }  else if (outputUnitValue.equals("இன்ச்")) {
                            result = inputVal / 2.54;
                        }  else if (outputUnitValue.equals("கடல் மைல்")) {
                            result = inputVal / 185200;
                        }  else if (outputUnitValue.equals("மில்லிமீட்டர்")) {
                            result = inputVal * 10;
                        }  else if (outputUnitValue.equals("மைல்")) {
                            result = inputVal / 160900;
                        } else {
                            result = inputVal;
                        }
                        break;
                    case "மைல்":
                        if (outputUnitValue.equals("மீட்டர்")) {
                            result = inputVal * 1609;
                        } else if (outputUnitValue.equals("கிலோமீட்டர்")) {
                            result = inputVal * 1.609;
                        } else if (outputUnitValue.equals("முற்றம்")) {
                            result = inputVal * 1760;
                        } else if (outputUnitValue.equals("அடி")) {
                            result = inputVal * 5280;
                        }  else if (outputUnitValue.equals("இன்ச்")) {
                            result = inputVal * 63360;
                        }  else if (outputUnitValue.equals("கடல் மைல்")) {
                            result = inputVal / 1.151;
                        }  else if (outputUnitValue.equals("மில்லிமீட்டர்")) {
                            result = inputVal * 1.609000000;
                        }  else if (outputUnitValue.equals("சென்டிமீட்டர்")) {
                            result = inputVal * 160900;
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