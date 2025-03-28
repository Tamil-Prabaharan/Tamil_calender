package com.tamilcalender;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class veetumanai_kuli_kanakku extends AppCompatActivity {
    private AdView adView;
    private EditText length,width,area;
    private Button b1,b2;
    private TextView parapalavu,manai,karupam,varavu,sealavu,yoni,vayathu,rasi,enam,angesam,naksathiram,thithi,varam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veetumanai_kuli_kanakku);


        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        // Find the AdView as defined in the XML
        adView = findViewById(R.id.adView59);
        // Create an ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        // Load the ad into the AdView
        adView.loadAd(adRequest);

        length = (EditText) findViewById(R.id.editTextNumber);
        width  = (EditText)findViewById(R.id.editTextNumber2);
        area   = (EditText)findViewById(R.id.editTextNumberDecimal);

        parapalavu = (TextView) findViewById(R.id.textView616);
        manai  = (TextView)findViewById(R.id.textView617);
        karupam   = (TextView)findViewById(R.id.textView618);
        varavu = (TextView)findViewById(R.id.textView619);
        sealavu  = (TextView)findViewById(R.id.textView620);
        yoni   = (TextView)findViewById(R.id.textView621);
        vayathu = (TextView)findViewById(R.id.textView622);
        rasi  = (TextView)findViewById(R.id.textView623);
        enam   = (TextView)findViewById(R.id.textView624);
        angesam = (TextView)findViewById(R.id.textView625);
        naksathiram  = (TextView)findViewById(R.id.textView626);
        thithi   = (TextView)findViewById(R.id.textView627);
        varam = (TextView)findViewById(R.id.textView628);

        b1   = (Button) findViewById(R.id.button24);
        b2 =(Button) findViewById(R.id.button25);

        l1();
        l2();


    }

    private void l2() {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float area_of_building = Float.parseFloat(area.getText().toString());
                parapalavu.setText(area_of_building + "sq.ft");

                float kuli = (float) (area_of_building/8.03);
                int kuli1 =  Math.round(kuli);
                double kuli2 = (double) (kuli / 8);
                int kuli3 = (int) Math.round(kuli2);
                double kuli4 =(double)  kuli3 - kuli2;
                float kuli5 = (float)  kuli4 * 8;
                int kuli6 =  Math.round(kuli5);


                if (kuli6 == 1 || kuli6 == -1) {
                    manai.setText(kuli1 + " & கருட மனை");
                    manai.setTextColor(Color.GREEN);
                    karupam.setText("உத்தமம்");
                    karupam.setTextColor(Color.GREEN);
                }else if (kuli6 == 2 || kuli6 == -2){
                    manai.setText(kuli1 + " & புறா மனை");
                    karupam.setText("மத்திமம்");
                }else if (kuli6 == 3 || kuli6 == -3){
                    manai.setText(kuli1 + " & பசு மனை");
                    manai.setTextColor(Color.GREEN);
                    karupam.setText("உத்தமம்");
                    karupam.setTextColor(Color.GREEN);
                }else if (kuli6 == 4 || kuli6 == -4){
                    manai.setText(kuli1 + " & காக்கை மனை");
                    karupam.setText("தீது ");
                }else if (kuli6 == 5 || kuli6 == -5){
                    manai.setText(kuli1 + " & சிம்ம மனை");
                    manai.setTextColor(Color.GREEN);
                    karupam.setText("சுபம்.");
                    karupam.setTextColor(Color.GREEN);
                }else if (kuli6 == 6 || kuli6 == -6){
                    manai.setText(kuli1 + " & யானை மனை");
                    karupam.setText("நீச்சம்");
                }else if (kuli6 == 7 || kuli6 == -7){
                    manai.setText(kuli1 + " & நாய் மனை");
                    manai.setTextColor(Color.GREEN);
                    karupam.setText("உத்தமம்");
                }else if (kuli6 == 8 || kuli6 == -8){
                    manai.setText(kuli1 + " & கழுதை மனை");
                    karupam.setText("அதமம் ");
                } else if (kuli6 == 0) {
                    manai.setText(kuli1 + " & கழுதை மனை");
                    karupam.setText("அதமம் ");
                }else {
                    manai.setText("-");
                    karupam.setText("-");
                }



                float varavu1 = (float) ((kuli1 * 8) / 12);
                int varavu2 = Math.round(varavu1);
                float varavu3 = varavu2-varavu1;
                float varavu4 = varavu3 * 12 ;
                int varavu5 = Math.round(varavu4);
                if (varavu5 == 1 || varavu5 == -1){
                    varavu.setText( "ஏகபோகமாய்நடக்கும்");
                } else if (varavu5 == 2 || varavu5 == -2) {
                    varavu.setText("ஏகபோகமாய்நடக்கும்");
                } else if (varavu5 == 3 || varavu5 == -3) {
                    varavu.setText("கீர்த்தியுண்டாம்");
                }else if (varavu5 == 4 || varavu5 == -4) {
                    varavu.setText("கீர்த்தியுண்டாம்");
                }else if (varavu5 == 5 || varavu5 == -5) {
                    varavu.setText("தனதானியமுண்டாம்.");
                }else if (varavu5 == 6 || varavu5 == -6) {
                    varavu.setText("தனதானியமுண்டாம்.");
                }else if (varavu5 == 7 || varavu5 == -7) {
                    varavu.setText("மங்களகரமுண்டாம்.");
                }else if (varavu5 == 8 || varavu5 == -8) {
                    varavu.setText("மங்களகரமுண்டாம்.");
                }else if (varavu5 == 9 || varavu5 == -9) {
                    varavu.setText("போகபாக்கியமுண்டாம்.");
                }else if (varavu5 == 10 || varavu5 == -10) {
                    varavu.setText("காரியசித்தியுண்டாம்.");
                }else if (varavu5 == 11 || varavu5 == -11) {
                    varavu.setText("ஈஸ்வரகடாட்சமுண்டாம்.");
                }else if (varavu5 == 12 || varavu5 == -12) {
                    varavu.setText("சகலநன்மையுமுண்டாம்.");
                }else if (varavu5 == 0){
                    varavu.setText("சகலநன்மையுமுண்டாம்.");
                }else {
                    varavu.setText("-");
                }


                double sealavu1 = (double) kuli1 * 9 /10 ;
                int sealavu2 = (int) Math.round(sealavu1);
                double sealavu3 = (double) sealavu2-sealavu1;
                double sealavu4 = (double) sealavu3 * 10 ;
                int sealavu5 = (int) Math.round(sealavu4);
                if (sealavu5 == 1 || sealavu5 == -1){
                    sealavu.setText( "அவவில்லம்க்ஷிணிக்கும்");
                } else if (sealavu5 == 2 || sealavu5 == -2) {
                    sealavu.setText("அம்மனை தீயினால் சேதப்படும்");
                } else if (sealavu5 == 3 || sealavu5 == -3) {
                    sealavu.setText("அக்குடும்பம் ஷேமமாகயிருக்கும்");
                }else if (sealavu5 == 4 || sealavu5 == -4) {
                    sealavu.setText("புத்திரவிருத்தியுண்டாம்");
                }else if (sealavu5 == 5 || sealavu5 == -5) {
                    sealavu.setText("அதிகவிரையமுண்டாம்.");
                }else if (sealavu5 == 6 || sealavu5 == -6) {
                    sealavu.setText("ஆறோக்கியமுண்டாம்.");
                }else if (sealavu5 == 7 || sealavu5 == -7) {
                    sealavu.setText("அதிக தரித்திரமுண்டாம்.");
                }else if (sealavu5 == 8 || sealavu5 == -8) {
                    sealavu.setText("இலட்கமிவாச மாயிருப்பாள்.");
                }else if (sealavu5 == 9 || sealavu5 == -9) {
                    sealavu.setText("புத்திரகாசம்.");
                }else if (sealavu5 == 10 || sealavu5 == -10) {
                    sealavu.setText("உத்தமமாயிருக்குமென்பதாம்.");
                }else if (sealavu5 == 0){
                    sealavu.setText("உத்தமமாயிருக்குமென்பதாம்.");
                }else {
                    sealavu.setText("-");
                }

                if (varavu5 > sealavu5){
                    varavu.setTextColor(Color.GREEN);
                    sealavu.setTextColor(Color.GREEN);
                }else {
                    varavu.setTextColor(Color.RED);
                    sealavu.setTextColor(Color.RED);
                }


                double yoni1 = (double) kuli1*3/8;
                int yoni2 = (int) Math.round(yoni1);
                double yoni3 =yoni2 - yoni1;
                double yoni4 = yoni3*8;
                int yoni5 = (int) Math.round(yoni4);
                if (yoni5 == 1 || yoni5 == -1){
                    yoni.setText( "நிறைந்தசெல்வப் உண்டாகும்.");
                    yoni.setTextColor(Color.GREEN);
                } else if (yoni5 == 2 || yoni5 == -2) {
                    yoni.setText( "கலகமுண்டாகும்");
                    yoni.setTextColor(Color.RED);
                } else if (yoni5 == 3 || yoni5 == -3) {
                    yoni.setText( "ஜெயம்பொருந்திநடக்கும்");
                    yoni.setTextColor(Color.GREEN);
                } else if (yoni5 == 4 || yoni5 == -4) {
                    yoni.setText( "என்னாளும்பிணியாயிருக்கும் ");
                    yoni.setTextColor(Color.RED);
                } else if (yoni5 == 5 || yoni5 == -5) {
                    yoni.setText( "மேன்மையுஞ்செல்வமுமுண்டாம்");
                    yoni.setTextColor(Color.GREEN);
                } else if (yoni5 == 6 || yoni5 == -6) {
                    yoni.setText( "தனட்சயமாகும் ");
                    yoni.setTextColor(Color.RED);
                } else if (yoni5 == 7 || yoni5 == -7) {
                    yoni.setText( "அதிகலாபம் நலம்");
                    yoni.setTextColor(Color.GREEN);
                } else if (yoni5 == 8 || yoni5 == -8) {
                    yoni.setText( "செல்வம்நீங்குமென்பதாம்");
                    yoni.setTextColor(Color.RED);
                }else if (yoni5 == 0){
                    yoni.setText( "செல்வம்நீங்குமென்பதாம்");
                    yoni.setTextColor(Color.RED);
                }else {
                    yoni.setText(yoni5+ "-");
                }


                double varam1 =(double) kuli1*9/7;
                int varam2 = (int) Math.round(varam1);
                double varam3 = varam2 - varam1;
                double varam4 = varam3 *7;
                int varam5 = (int) Math.round(varam4);
                if (varam5 == 1 || varam5 == -1){
                    varam.setText( "உதவாது.");
                    varam.setTextColor(Color.RED);
                } else if (varam5 == 2 || varam5 == -2) {
                    varam.setText( "சுகங்கொடுக்கும் ");
                    varam.setTextColor(Color.GREEN);
                } else if (varam5 == 3 || varam5 == -3) {
                    varam.setText( "தீமையுண்டாம்");
                    varam.setTextColor(Color.RED);
                } else if (varam5 == 4 || varam5 == -4) {
                    varam.setText( "அம்மனைலட்சுமி விலாசமாயிருக்கும்");
                    varam.setTextColor(Color.GREEN);
                } else if (varam5 == 5 || varam5 == -5) {
                    varam.setText( "புத்திரவிருத்தியுண்டாம் ");
                    varam.setTextColor(Color.GREEN);
                } else if (varam5 == 6 || varam5 == -6) {
                    varam.setText( " அதிகாலம் உண்டாகும்");
                    varam.setTextColor(Color.GREEN);
                } else if (varam5 == 7 || varam5 == -7) {
                    varam.setText( " கலகம்உண்டாகும்");
                    varam.setTextColor(Color.RED);
                }else if (varam5 == 0) {
                    varam.setText( " கலகம்உண்டாகும்");
                    varam.setTextColor(Color.RED);
                }else {
                    varam.setText("-");
                }


                float angesam1 = (float) kuli1*4/9;
                int angesam2 = (int) Math.round(angesam1);
                float angesam3 = angesam2-angesam1;
                float angesam4 = (float) (angesam3 *9);
                int angesam5 = (int) Math.round(angesam4);
                if (angesam5 == 1 || angesam5 == -1){
                    angesam.setText( "அல்லலுண்டாம் .");
                    angesam.setTextColor(Color.RED);
                } else if (angesam5 == 2 || angesam5 == -2) {
                    angesam.setText( "மிக்கபாக்கிய போகங்களுண்டாம் ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 3 || angesam5 == -3) {
                    angesam.setText( "சீலமுண்டாம் ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 4 || angesam5 == -4) {
                    angesam.setText( "தானியவிருத்தி ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 5 || angesam5 == -5) {
                    angesam.setText( "இலாபமுண்டாம்  ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 6 || angesam5 == -6) {
                    angesam.setText( " இராஜபோகமுண்டாம் ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 7 || angesam5 == -7) {
                    angesam.setText( " கலகமும்ஜனப்பகையுமுண்டாம்.");
                    angesam.setTextColor(Color.RED);
                }else if (angesam5 == 8 || angesam5 == -8) {
                    angesam.setText( " மத்திமபலனாயிருக்கும் ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 9 || angesam5 == -9) {
                    angesam.setText( " சகலநன்மையுமுண்டாம்");
                    angesam.setTextColor(Color.GREEN);
                }else if (angesam5 == 0) {
                    angesam.setText( " சகலநன்மையுமுண்டாம்");
                    angesam.setTextColor(Color.GREEN);
                }else {
                    angesam.setText("-");
                }


                float enam1 = kuli1*9/4;
                int enam2 = (int) Math.round(enam1);
                float enam3 = enam2-enam1;
                float enam4 = (float) (enam3 *4);
                int enam5 = (int) Math.round(enam4);
                if (enam5 == 1 || enam5 == -1){
                    enam.setText( "நல்லபலனுண்டாம் .");
                    enam.setTextColor(Color.GREEN);
                } else if (enam5 == 2 || enam5 == -2) {
                    enam.setText( "நல்லபலன் ");
                    enam.setTextColor(Color.GREEN);
                } else if (enam5 == 3 || enam5 == -3) {
                    enam.setText( "உத்தமம் ");
                    enam.setTextColor(Color.GREEN);
                } else if (enam5 == 4 || enam5 == -4) {
                    enam.setText( "பலனில்லை துயரமுண்டாம் ");
                    enam.setTextColor(Color.RED);
                }else if (enam5 == 0){
                    enam.setText( "பலனில்லை துயரமுண்டாம் ");
                    enam.setTextColor(Color.RED);
                }else {
                    enam.setText("-");
                }


                float thithi1 = kuli1*9/30;
                int thithi2 = (int) Math.round(thithi1);
                float thithi3 = thithi2-thithi1;
                float thithi4 = (float) (thithi3 *4);
                int thithi5 = (int) Math.round(thithi4);
                if (thithi5 == 1 || thithi5 == 16 ){
                    thithi.setText( "பிரதமை நலம்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 2 || thithi5 == 17 ) {
                    thithi.setText( "விதியை நலம்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 3 || thithi5 == 18 ) {
                    thithi.setText( "திரிதியை ஜயம்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 4 || thithi5 == 19 ) {
                    thithi.setText( "சதுர்த்தி அபஜயம்");
                    thithi.setTextColor(Color.GREEN);
                }else if (thithi5 == 5 || thithi5 == 20 ) {
                    thithi.setText( "பஞ்சமி புத்திரபாக்கியம்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 6 || thithi5 == 21 ) {
                    thithi.setText( "ஷஷ்டி மேற்கண்டபலன்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 7 || thithi5 == 22 ) {
                    thithi.setText( "சப்தமி நன்மை");
                    thithi.setTextColor(Color.GREEN);
                }else if (thithi5 == 8 || thithi5 == 23 ) {
                    thithi.setText( "அஷ்டமி பிணிகளுண்டாம்");
                    thithi.setTextColor(Color.RED);
                } else if (thithi5 == 9 || thithi5 == 24 ) {
                    thithi.setText( "நவமி அம்மனை ஷீணித்துபோ");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 10 || thithi5 == 25 ) {
                    thithi.setText( "தசமி மங்களகரமாயிருக்கும் ");
                    thithi.setTextColor(Color.GREEN);
                }else if (thithi5 == 11 || thithi5 == 26 ) {
                    thithi.setText( "ஏகாதசி தீமையுண்டாம் ");
                    thithi.setTextColor(Color.RED);
                } else if (thithi5 == 12 || thithi5 == 27 ) {
                    thithi.setText( " துவாதசி அன்னவஸ்திரம் குறைவில்லாதிருக்கும்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 13 || thithi5 == 28 ) {
                    thithi.setText( " திரையோதசி செல்வம்தழைக்கும்");
                    thithi.setTextColor(Color.GREEN);
                }else if (thithi5 == 14 || thithi5 == 29 ) {
                    thithi.setText( "சதுர்த்தசி அம்மனைபாழடையும்");
                    thithi.setTextColor(Color.RED);
                } else if (thithi5 == 15 || thithi5 == 30 || thithi5 == 0) {
                    thithi.setText( "அமாவாசை பூரணபலனாகும்.");
                    thithi.setTextColor(Color.GREEN);
                }else {
                    thithi.setText( "-");
                }

                float rasi1 = kuli1*4/12;
                int rasi2 = (int) Math.round(rasi1);
                float rasi3 = rasi2-rasi1;
                float rasi4 = (float) (rasi3 *12);
                int rasi5 = (int) Math.round(rasi4);
                if (rasi5 <1  ){
                    rasi.setText( "இப்பன்னிரண்டு ராசிகளுள் பதினொன்றாவதான கும்பவிராசி ஒன்றுதான்தீமை.மற்ற பதினொருராசியும் உத்தமமென்றெண்ணப் படும் என்பதாம்.");
                } else {
                    rasi.setText( "இப்பன்னிரண்டு ராசிகளுள் பதினொன்றாவதான கும்பவிராசி ஒன்றுதான்தீமை.மற்ற பதினொருராசியும் உத்தமமென்றெண்ணப் படும் என்பதாம்.");
                }

                if (rasi5 == 11 || rasi5 == -11){
                    rasi.setTextColor(Color.RED);
                }else {
                    rasi.setTextColor(Color.GREEN);
                }


                float vayathu1 = kuli1*27/100;
                vayathu.setText( vayathu1+"வந்த எனக்கல் புள்ளி வைத்து வந்தால் புள்ளிக்கு அடுத்த இரண்டு" +
                        " என்னை எடுத்துக்கொள்ளவும் புள்ளி இல்லாமல் வந்தால் நூறால் வகுக்கவும் பிறகு புள்ளிக்கு" +
                        " அடுத்த இரண்டு என்னை எடுத்துக்கொள்ளவும். ");

                double natchathira1 =(double) kuli1*8/27;
                int natchathira2 = (int) Math.round(natchathira1);
                double natchathira3 = natchathira2 - natchathira1;
                double natchathira4 = natchathira3 *27;
                int natchathira5 = (int) Math.round(natchathira4);
                if (natchathira5 == 1 || natchathira5 == -1){
                    naksathiram.setText( "அஸ்வினி உத்தமம்.");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 2 || natchathira5 == -2) {
                    naksathiram.setText( "பரணி அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 3 || natchathira5 == -3) {
                    naksathiram.setText( "கார்த்திகை அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 4 || natchathira5 == -4) {
                    naksathiram.setText( "ரோகிணி உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 5 || natchathira5 == -5) {
                    naksathiram.setText( "மிருகசீரிடம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 6 || natchathira5 == -6) {
                    naksathiram.setText( "திருவாதிரை உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 7 || natchathira5 == -7) {
                    naksathiram.setText( "புனர்பூசம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 8 || natchathira5 == -8) {
                    naksathiram.setText( "பூசம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                }else if (natchathira5 == 9 || natchathira5 == -9){
                    naksathiram.setText( "ஆயில்யம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                }else if (natchathira5 == 10 || natchathira5 == -10) {
                    naksathiram.setText( "மகம் மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 11 || natchathira5 == -11) {
                    naksathiram.setText( "பூரம் மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 12 || natchathira5 == -12) {
                    naksathiram.setText("உத்திரம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 13 || natchathira5 == -13) {
                    naksathiram.setText( "அஸ்தம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 14 || natchathira5 == -14) {
                    naksathiram.setText( "சித்திரை மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 15 || natchathira5 == -15) {
                    naksathiram.setText( "சுவாதி உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 16 || natchathira5 == -16) {
                    naksathiram.setText( "விசாகம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                }else if (natchathira5 == 17 || natchathira5 == -17){
                    naksathiram.setText( "அனுஷம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                }else if (natchathira5 == 18 || natchathira5 == -18) {
                    naksathiram.setText( "கேட்டை மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 19 || natchathira5 == -19) {
                    naksathiram.setText( "மூலம் மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 20 || natchathira5 == -20) {
                    naksathiram.setText( "பூராடம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 21 || natchathira5 == -21) {
                    naksathiram.setText( "உத்திராடம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 22 || natchathira5 == -22) {
                    naksathiram.setText( "திருவோணம் மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 23 || natchathira5 == -23) {
                    naksathiram.setText( "அவிட்டம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 24 || natchathira5 == -24) {
                    naksathiram.setText( "சதயம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                }else if (natchathira5 == 25 || natchathira5 == -25){
                    naksathiram.setText( "பூரட்டாதி அதமம்");
                    naksathiram.setTextColor(Color.RED);
                }else if (natchathira5 == 26 || natchathira5 == -26) {
                    naksathiram.setText( "உத்திரட்டாதி உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                }else if (natchathira5 == 27 || natchathira5 == -27){
                    naksathiram.setText( "ரேவதி மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                }else if (natchathira5 == 0){
                    naksathiram.setText( "ரேவதி மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                }else {
                    naksathiram.setText( "-");
                }



            }
        });
    }

    private void l1() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float length1 = Float.parseFloat(length.getText().toString());
                Float width1 = Float.parseFloat(width.getText().toString());

                Float area_of_building = (length1 * width1);
                parapalavu.setText(area_of_building + "sq.ft");

                float kuli = (float) (area_of_building/8.03);
                int kuli1 =  Math.round(kuli);
                double kuli2 = (double) (kuli / 8);
                int kuli3 = (int) Math.round(kuli2);
                double kuli4 =(double)  kuli3 - kuli2;
                float kuli5 = (float)  kuli4 * 8;
                int kuli6 =  Math.round(kuli5);


                if (kuli6 == 1 || kuli6 == -1) {
                    manai.setText(kuli1 + " & கருட மனை");
                    manai.setTextColor(Color.GREEN);
                    karupam.setText("உத்தமம்");
                    karupam.setTextColor(Color.GREEN);
                }else if (kuli6 == 2 || kuli6 == -2){
                    manai.setText(kuli1 + " & புறா மனை");
                    karupam.setText("மத்திமம்");
                }else if (kuli6 == 3 || kuli6 == -3){
                    manai.setText(kuli1 + " & பசு மனை");
                    manai.setTextColor(Color.GREEN);
                    karupam.setText("உத்தமம்");
                    karupam.setTextColor(Color.GREEN);
                }else if (kuli6 == 4 || kuli6 == -4){
                    manai.setText(kuli1 + " & காக்கை மனை");
                    karupam.setText("தீது ");
                }else if (kuli6 == 5 || kuli6 == -5){
                    manai.setText(kuli1 + " & சிம்ம மனை");
                    manai.setTextColor(Color.GREEN);
                    karupam.setText("சுபம்.");
                    karupam.setTextColor(Color.GREEN);
                }else if (kuli6 == 6 || kuli6 == -6){
                    manai.setText(kuli1 + " & யானை மனை");
                    karupam.setText("நீச்சம்");
                }else if (kuli6 == 7 || kuli6 == -7){
                    manai.setText(kuli1 + " & நாய் மனை");
                    manai.setTextColor(Color.GREEN);
                    karupam.setText("உத்தமம்");
                }else if (kuli6 == 8 || kuli6 == -8){
                    manai.setText(kuli1 + " & கழுதை மனை");
                    karupam.setText("அதமம் ");
                } else if (kuli6 == 0) {
                    manai.setText(kuli1 + " & கழுதை மனை");
                    karupam.setText("அதமம் ");
                }else {
                    manai.setText("-");
                    karupam.setText("-");
                }



                float varavu1 = (float) ((kuli1 * 8) / 12);
                int varavu2 = Math.round(varavu1);
                float varavu3 = varavu2-varavu1;
                float varavu4 = varavu3 * 12 ;
                int varavu5 = Math.round(varavu4);
                if (varavu5 == 1 || varavu5 == -1){
                    varavu.setText( "ஏகபோகமாய்நடக்கும்");
                } else if (varavu5 == 2 || varavu5 == -2) {
                    varavu.setText("ஏகபோகமாய்நடக்கும்");
                } else if (varavu5 == 3 || varavu5 == -3) {
                    varavu.setText("கீர்த்தியுண்டாம்");
                }else if (varavu5 == 4 || varavu5 == -4) {
                    varavu.setText("கீர்த்தியுண்டாம்");
                }else if (varavu5 == 5 || varavu5 == -5) {
                    varavu.setText("தனதானியமுண்டாம்.");
                }else if (varavu5 == 6 || varavu5 == -6) {
                    varavu.setText("தனதானியமுண்டாம்.");
                }else if (varavu5 == 7 || varavu5 == -7) {
                    varavu.setText("மங்களகரமுண்டாம்.");
                }else if (varavu5 == 8 || varavu5 == -8) {
                    varavu.setText("மங்களகரமுண்டாம்.");
                }else if (varavu5 == 9 || varavu5 == -9) {
                    varavu.setText("போகபாக்கியமுண்டாம்.");
                }else if (varavu5 == 10 || varavu5 == -10) {
                    varavu.setText("காரியசித்தியுண்டாம்.");
                }else if (varavu5 == 11 || varavu5 == -11) {
                    varavu.setText("ஈஸ்வரகடாட்சமுண்டாம்.");
                }else if (varavu5 == 12 || varavu5 == -12) {
                    varavu.setText("சகலநன்மையுமுண்டாம்.");
                }else if (varavu5 == 0){
                    varavu.setText("சகலநன்மையுமுண்டாம்.");
                }else {
                    varavu.setText("-");
                }


                double sealavu1 = (double) kuli1 * 9 /10 ;
                int sealavu2 = (int) Math.round(sealavu1);
                double sealavu3 = (double) sealavu2-sealavu1;
                double sealavu4 = (double) sealavu3 * 10 ;
                int sealavu5 = (int) Math.round(sealavu4);
                if (sealavu5 == 1 || sealavu5 == -1){
                    sealavu.setText( "அவவில்லம்க்ஷிணிக்கும்");
                } else if (sealavu5 == 2 || sealavu5 == -2) {
                    sealavu.setText("அம்மனை தீயினால் சேதப்படும்");
                } else if (sealavu5 == 3 || sealavu5 == -3) {
                    sealavu.setText("அக்குடும்பம் ஷேமமாகயிருக்கும்");
                }else if (sealavu5 == 4 || sealavu5 == -4) {
                    sealavu.setText("புத்திரவிருத்தியுண்டாம்");
                }else if (sealavu5 == 5 || sealavu5 == -5) {
                    sealavu.setText("அதிகவிரையமுண்டாம்.");
                }else if (sealavu5 == 6 || sealavu5 == -6) {
                    sealavu.setText("ஆறோக்கியமுண்டாம்.");
                }else if (sealavu5 == 7 || sealavu5 == -7) {
                    sealavu.setText("அதிக தரித்திரமுண்டாம்.");
                }else if (sealavu5 == 8 || sealavu5 == -8) {
                    sealavu.setText("இலட்கமிவாச மாயிருப்பாள்.");
                }else if (sealavu5 == 9 || sealavu5 == -9) {
                    sealavu.setText("புத்திரகாசம்.");
                }else if (sealavu5 == 10 || sealavu5 == -10) {
                    sealavu.setText("உத்தமமாயிருக்குமென்பதாம்.");
                }else if (sealavu5 == 0){
                    sealavu.setText("உத்தமமாயிருக்குமென்பதாம்.");
                }else {
                    sealavu.setText("-");
                }

                if (varavu5 > sealavu5){
                    varavu.setTextColor(Color.GREEN);
                    sealavu.setTextColor(Color.GREEN);
                }else {
                    varavu.setTextColor(Color.RED);
                    sealavu.setTextColor(Color.RED);
                }


                double yoni1 = (double) kuli1*3/8;
                int yoni2 = (int) Math.round(yoni1);
                double yoni3 =yoni2 - yoni1;
                double yoni4 = yoni3*8;
                int yoni5 = (int) Math.round(yoni4);
                if (yoni5 == 1 || yoni5 == -1){
                    yoni.setText( "நிறைந்தசெல்வப் உண்டாகும்.");
                    yoni.setTextColor(Color.GREEN);
                } else if (yoni5 == 2 || yoni5 == -2) {
                    yoni.setText( "கலகமுண்டாகும்");
                    yoni.setTextColor(Color.RED);
                } else if (yoni5 == 3 || yoni5 == -3) {
                    yoni.setText( "ஜெயம்பொருந்திநடக்கும்");
                    yoni.setTextColor(Color.GREEN);
                } else if (yoni5 == 4 || yoni5 == -4) {
                    yoni.setText( "என்னாளும்பிணியாயிருக்கும் ");
                    yoni.setTextColor(Color.RED);
                } else if (yoni5 == 5 || yoni5 == -5) {
                    yoni.setText( "மேன்மையுஞ்செல்வமுமுண்டாம்");
                    yoni.setTextColor(Color.GREEN);
                } else if (yoni5 == 6 || yoni5 == -6) {
                    yoni.setText( "தனட்சயமாகும் ");
                    yoni.setTextColor(Color.RED);
                } else if (yoni5 == 7 || yoni5 == -7) {
                    yoni.setText( "அதிகலாபம் நலம்");
                    yoni.setTextColor(Color.GREEN);
                } else if (yoni5 == 8 || yoni5 == -8) {
                    yoni.setText( "செல்வம்நீங்குமென்பதாம்");
                    yoni.setTextColor(Color.RED);
                }else if (yoni5 == 0){
                    yoni.setText( "செல்வம்நீங்குமென்பதாம்");
                    yoni.setTextColor(Color.RED);
                }else {
                    yoni.setText(yoni5+ "-");
                }


                double varam1 =(double) kuli1*9/7;
                int varam2 = (int) Math.round(varam1);
                double varam3 = varam2 - varam1;
                double varam4 = varam3 *7;
                int varam5 = (int) Math.round(varam4);
                if (varam5 == 1 || varam5 == -1){
                    varam.setText( "உதவாது.");
                    varam.setTextColor(Color.RED);
                } else if (varam5 == 2 || varam5 == -2) {
                    varam.setText( "சுகங்கொடுக்கும் ");
                    varam.setTextColor(Color.GREEN);
                } else if (varam5 == 3 || varam5 == -3) {
                    varam.setText( "தீமையுண்டாம்");
                    varam.setTextColor(Color.RED);
                } else if (varam5 == 4 || varam5 == -4) {
                    varam.setText( "அம்மனைலட்சுமி விலாசமாயிருக்கும்");
                    varam.setTextColor(Color.GREEN);
                } else if (varam5 == 5 || varam5 == -5) {
                    varam.setText( "புத்திரவிருத்தியுண்டாம் ");
                    varam.setTextColor(Color.GREEN);
                } else if (varam5 == 6 || varam5 == -6) {
                    varam.setText( " அதிகாலம் உண்டாகும்");
                    varam.setTextColor(Color.GREEN);
                } else if (varam5 == 7 || varam5 == -7) {
                    varam.setText( " கலகம்உண்டாகும்");
                    varam.setTextColor(Color.RED);
                }else if (varam5 == 0) {
                    varam.setText( " கலகம்உண்டாகும்");
                    varam.setTextColor(Color.RED);
                }else {
                    varam.setText("-");
                }


                float angesam1 = (float) kuli1*4/9;
                int angesam2 = (int) Math.round(angesam1);
                float angesam3 = angesam2-angesam1;
                float angesam4 = (float) (angesam3 *9);
                int angesam5 = (int) Math.round(angesam4);
                if (angesam5 == 1 || angesam5 == -1){
                    angesam.setText( "அல்லலுண்டாம் .");
                    angesam.setTextColor(Color.RED);
                } else if (angesam5 == 2 || angesam5 == -2) {
                    angesam.setText( "மிக்கபாக்கிய போகங்களுண்டாம் ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 3 || angesam5 == -3) {
                    angesam.setText( "சீலமுண்டாம் ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 4 || angesam5 == -4) {
                    angesam.setText( "தானியவிருத்தி ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 5 || angesam5 == -5) {
                    angesam.setText( "இலாபமுண்டாம்  ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 6 || angesam5 == -6) {
                    angesam.setText( " இராஜபோகமுண்டாம் ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 7 || angesam5 == -7) {
                    angesam.setText( " கலகமும்ஜனப்பகையுமுண்டாம்.");
                    angesam.setTextColor(Color.RED);
                }else if (angesam5 == 8 || angesam5 == -8) {
                    angesam.setText( " மத்திமபலனாயிருக்கும் ");
                    angesam.setTextColor(Color.GREEN);
                } else if (angesam5 == 9 || angesam5 == -9) {
                    angesam.setText( " சகலநன்மையுமுண்டாம்");
                    angesam.setTextColor(Color.GREEN);
                }else if (angesam5 == 0) {
                    angesam.setText( " சகலநன்மையுமுண்டாம்");
                    angesam.setTextColor(Color.GREEN);
                }else {
                    angesam.setText("-");
                }


                float enam1 = kuli1*9/4;
                int enam2 = (int) Math.round(enam1);
                float enam3 = enam2-enam1;
                float enam4 = (float) (enam3 *4);
                int enam5 = (int) Math.round(enam4);
                if (enam5 == 1 || enam5 == -1){
                    enam.setText( "நல்லபலனுண்டாம் .");
                    enam.setTextColor(Color.GREEN);
                } else if (enam5 == 2 || enam5 == -2) {
                    enam.setText( "நல்லபலன் ");
                    enam.setTextColor(Color.GREEN);
                } else if (enam5 == 3 || enam5 == -3) {
                    enam.setText( "உத்தமம் ");
                    enam.setTextColor(Color.GREEN);
                } else if (enam5 == 4 || enam5 == -4) {
                    enam.setText( "பலனில்லை துயரமுண்டாம் ");
                    enam.setTextColor(Color.RED);
                }else if (enam5 == 0){
                    enam.setText( "பலனில்லை துயரமுண்டாம் ");
                    enam.setTextColor(Color.RED);
                }else {
                    enam.setText("-");
                }


                float thithi1 = kuli1*9/30;
                int thithi2 = (int) Math.round(thithi1);
                float thithi3 = thithi2-thithi1;
                float thithi4 = (float) (thithi3 *4);
                int thithi5 = (int) Math.round(thithi4);
                if (thithi5 == 1 || thithi5 == 16 ){
                    thithi.setText( "பிரதமை நலம்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 2 || thithi5 == 17 ) {
                    thithi.setText( "விதியை நலம்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 3 || thithi5 == 18 ) {
                    thithi.setText( "திரிதியை ஜயம்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 4 || thithi5 == 19 ) {
                    thithi.setText( "சதுர்த்தி அபஜயம்");
                    thithi.setTextColor(Color.GREEN);
                }else if (thithi5 == 5 || thithi5 == 20 ) {
                    thithi.setText( "பஞ்சமி புத்திரபாக்கியம்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 6 || thithi5 == 21 ) {
                    thithi.setText( "ஷஷ்டி மேற்கண்டபலன்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 7 || thithi5 == 22 ) {
                    thithi.setText( "சப்தமி நன்மை");
                    thithi.setTextColor(Color.GREEN);
                }else if (thithi5 == 8 || thithi5 == 23 ) {
                    thithi.setText( "அஷ்டமி பிணிகளுண்டாம்");
                    thithi.setTextColor(Color.RED);
                } else if (thithi5 == 9 || thithi5 == 24 ) {
                    thithi.setText( "நவமி அம்மனை ஷீணித்துபோ");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 10 || thithi5 == 25 ) {
                    thithi.setText( "தசமி மங்களகரமாயிருக்கும் ");
                    thithi.setTextColor(Color.GREEN);
                }else if (thithi5 == 11 || thithi5 == 26 ) {
                    thithi.setText( "ஏகாதசி தீமையுண்டாம் ");
                    thithi.setTextColor(Color.RED);
                } else if (thithi5 == 12 || thithi5 == 27 ) {
                    thithi.setText( " துவாதசி அன்னவஸ்திரம் குறைவில்லாதிருக்கும்");
                    thithi.setTextColor(Color.GREEN);
                } else if (thithi5 == 13 || thithi5 == 28 ) {
                    thithi.setText( " திரையோதசி செல்வம்தழைக்கும்");
                    thithi.setTextColor(Color.GREEN);
                }else if (thithi5 == 14 || thithi5 == 29 ) {
                    thithi.setText( "சதுர்த்தசி அம்மனைபாழடையும்");
                    thithi.setTextColor(Color.RED);
                } else if (thithi5 == 15 || thithi5 == 30 || thithi5 == 0) {
                    thithi.setText( "அமாவாசை பூரணபலனாகும்.");
                    thithi.setTextColor(Color.GREEN);
                }else {
                    thithi.setText( "-");
                }

                float rasi1 = kuli1*4/12;
                int rasi2 = (int) Math.round(rasi1);
                float rasi3 = rasi2-rasi1;
                float rasi4 = (float) (rasi3 *12);
                int rasi5 = (int) Math.round(rasi4);
                if (rasi5 <1  ){
                    rasi.setText( "இப்பன்னிரண்டு ராசிகளுள் பதினொன்றாவதான கும்பவிராசி ஒன்றுதான்தீமை.மற்ற பதினொருராசியும் உத்தமமென்றெண்ணப் படும் என்பதாம்.");
                } else {
                    rasi.setText( "இப்பன்னிரண்டு ராசிகளுள் பதினொன்றாவதான கும்பவிராசி ஒன்றுதான்தீமை.மற்ற பதினொருராசியும் உத்தமமென்றெண்ணப் படும் என்பதாம்.");
                }

                if (rasi5 == 11 || rasi5 == -11){
                    rasi.setTextColor(Color.RED);
                }else {
                    rasi.setTextColor(Color.GREEN);
                }


                double vayathu1 = (double) kuli1*27/100;
                vayathu.setText( vayathu1+"வந்த எனக்கல் புள்ளி வைத்து வந்தால் புள்ளிக்கு அடுத்த இரண்டு" +
                        " என்னை எடுத்துக்கொள்ளவும் புள்ளி இல்லாமல் வந்தால் நூறால் வகுக்கவும் பிறகு புள்ளிக்கு" +
                        " அடுத்த இரண்டு என்னை எடுத்துக்கொள்ளவும். ");



                double natchathira1 =(double) kuli1*8/27;
                int natchathira2 = (int) Math.round(natchathira1);
                double natchathira3 = natchathira2 - natchathira1;
                double natchathira4 = natchathira3 *27;
                int natchathira5 = (int) Math.round(natchathira4);
                if (natchathira5 == 1 || natchathira5 == -1){
                    naksathiram.setText( "அஸ்வினி உத்தமம்.");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 2 || natchathira5 == -2) {
                    naksathiram.setText( "பரணி அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 3 || natchathira5 == -3) {
                    naksathiram.setText( "கார்த்திகை அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 4 || natchathira5 == -4) {
                    naksathiram.setText( "ரோகிணி உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 5 || natchathira5 == -5) {
                    naksathiram.setText( "மிருகசீரிடம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 6 || natchathira5 == -6) {
                    naksathiram.setText( "திருவாதிரை உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 7 || natchathira5 == -7) {
                    naksathiram.setText( "புனர்பூசம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 8 || natchathira5 == -8) {
                    naksathiram.setText( "பூசம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                }else if (natchathira5 == 9 || natchathira5 == -9){
                    naksathiram.setText( "ஆயில்யம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                }else if (natchathira5 == 10 || natchathira5 == -10) {
                    naksathiram.setText( "மகம் மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 11 || natchathira5 == -11) {
                    naksathiram.setText( "பூரம் மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 12 || natchathira5 == -12) {
                    naksathiram.setText("உத்திரம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 13 || natchathira5 == -13) {
                    naksathiram.setText( "அஸ்தம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 14 || natchathira5 == -14) {
                    naksathiram.setText( "சித்திரை மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 15 || natchathira5 == -15) {
                    naksathiram.setText( "சுவாதி உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 16 || natchathira5 == -16) {
                    naksathiram.setText( "விசாகம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                }else if (natchathira5 == 17 || natchathira5 == -17){
                    naksathiram.setText( "அனுஷம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                }else if (natchathira5 == 18 || natchathira5 == -18) {
                    naksathiram.setText( "கேட்டை மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 19 || natchathira5 == -19) {
                    naksathiram.setText( "மூலம் மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 20 || natchathira5 == -20) {
                    naksathiram.setText( "பூராடம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 21 || natchathira5 == -21) {
                    naksathiram.setText( "உத்திராடம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                } else if (natchathira5 == 22 || natchathira5 == -22) {
                    naksathiram.setText( "திருவோணம் மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                } else if (natchathira5 == 23 || natchathira5 == -23) {
                    naksathiram.setText( "அவிட்டம் அதமம்");
                    naksathiram.setTextColor(Color.RED);
                } else if (natchathira5 == 24 || natchathira5 == -24) {
                    naksathiram.setText( "சதயம் உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                }else if (natchathira5 == 25 || natchathira5 == -25){
                    naksathiram.setText( "பூரட்டாதி அதமம்");
                    naksathiram.setTextColor(Color.RED);
                }else if (natchathira5 == 26 || natchathira5 == -26) {
                    naksathiram.setText( "உத்திரட்டாதி உத்தமம்");
                    naksathiram.setTextColor(Color.GREEN);
                }else if (natchathira5 == 27 || natchathira5 == -27){
                    naksathiram.setText( "ரேவதி மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                }else if (natchathira5 == 0){
                    naksathiram.setText( "ரேவதி மத்திமம்");
                    naksathiram.setTextColor(Color.YELLOW);
                }else {
                    naksathiram.setText( "-");
                }


            }
        });
    }

}