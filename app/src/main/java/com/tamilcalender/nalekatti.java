package com.tamilcalender;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class nalekatti extends AppCompatActivity {
    private TextView text_view_date;
    private TextView text_view_tamil_date;
    private TextView tamil_day;
    private TextView theiperai_valarperai;
    private TextView astami_navami;
    private TextView nalla_neaream_kalai;
    private TextView nalla_neaream_malai;
    private TextView gowri_nallaneram_kalai, gowri_nallaneram_malai;
    private TextView ragu1, ragu2, kuligai1, kuligai2, yamagandam1, yamagandam2;
    private TextView measam, resabam, methunam, kadagam, simamam, kanni, thulam, viruchagam, thanusu, magaram, kumbam, menam;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalekatti);

        /** set date daily automatic **/
        text_view_date = findViewById(R.id.textView490);
        getToDAyDAte();
        text_view_date.setText(getToDAyDAte());
        /** set date daily tamil language **/
        text_view_tamil_date = findViewById(R.id.textView491);
        tamil_day = findViewById(R.id.textView489);
        theiperai_valarperai = findViewById(R.id.textView492);
        astami_navami = findViewById(R.id.textView472);
        nalla_neaream_kalai = findViewById(R.id.textView475);
        nalla_neaream_malai = findViewById(R.id.textView477);
        gowri_nallaneram_kalai = findViewById(R.id.textView480);
        gowri_nallaneram_malai = findViewById(R.id.textView482);
        ragu1 = findViewById(R.id.textView484);
        kuligai1 = findViewById(R.id.textView488);
        yamagandam1 = findViewById(R.id.textView487);
        ragu2 = findViewById(R.id.textView493);
        kuligai2 = findViewById(R.id.textView495);
        yamagandam2 = findViewById(R.id.textView494);
        measam = findViewById(R.id.textView510);
        resabam = findViewById(R.id.textView511);
        methunam = findViewById(R.id.textView512);
        kadagam = findViewById(R.id.textView513);
        simamam = findViewById(R.id.textView514);
        kanni = findViewById(R.id.textView515);
        thulam = findViewById(R.id.textView516);
        viruchagam = findViewById(R.id.textView517);
        thanusu = findViewById(R.id.textView518);
        magaram = findViewById(R.id.textView519);
        kumbam = findViewById(R.id.textView520);
        menam = findViewById(R.id.textView521);
        // Get the current date
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String dateString = sdf.format(currentDate);
        // Show text based on the current date
        showTextBasedOnDate(dateString);
        showTextBasedOnDay(dateString);
    }



    private void showTextBasedOnDay(String dateString) {
        switch (dateString) {
            /*******************************************************8. august ************************************************************************************/
            case "2024-08-01":
                text_view_tamil_date.setText("16 -  ஆடி, குரோதி");
                tamil_day.setText("வியாழன் ");
                theiperai_valarperai.setText("தேய்பிறை - பிரதோஷம்.  ");
                astami_navami.setText("துவாதசி (மா.05.17) மிருகசீருஷம் (மா.12.47  ");
                nalla_neaream_kalai.setText("10:45 -11:45 am");
                nalla_neaream_malai.setText("-");
                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("06:00 ");
                yamagandam2.setText("07:30 ");
                measam.setText("சாந்தம் ");
                resabam.setText("பதவி ");
                methunam.setText("பக்தி ");
                kadagam.setText("கவலை ");
                simamam.setText("சுபம்  ");
                kanni.setText("விருத்தி ");
                thulam.setText("பாராட்டு  ");
                viruchagam.setText("பரிசு ");
                thanusu.setText("சுகம்  ");
                magaram.setText("நன்மை  ");
                kumbam.setText("அனுகூலம்  ");
                menam.setText("வெற்றி ");
                break;
            case "2024-08-02":
                text_view_tamil_date.setText("17 - ஆடி, குரோதி");
                tamil_day.setText("வெள்ளி");
                theiperai_valarperai.setText("தேய்பிறை - மாத சிவராத்திரி. ");
                astami_navami.setText("திரயோதசி (மா. 04.48) திருவாதிரை (மா.12.59) ");
                nalla_neaream_kalai.setText("09:15 - 10:15 am");
                nalla_neaream_malai.setText("04.45 -05.45 pm ");
                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("07:30 ");
                kuligai2.setText("09:00 ");
                yamagandam1.setText("03:00 ");
                yamagandam2.setText("04:30 ");
                measam.setText("செலவு ");
                resabam.setText("ஆக்கம்  ");
                methunam.setText("அனுகூலம் ");
                kadagam.setText(" முயற்சி  ");
                simamam.setText("கவலை  ");
                kanni.setText("யோகம் ");
                thulam.setText("ஏமாற்றம் ");
                viruchagam.setText("மேன்மை  ");
                thanusu.setText("அன்பு  ");
                magaram.setText("மகிழ்ச்சி  ");
                kumbam.setText("அமைதி");
                menam.setText(" போட்டி");
                break;
            case "2024-08-03":
                text_view_tamil_date.setText("18 - ஆடி, குரோதி");
                tamil_day.setText("சனி");
                theiperai_valarperai.setText("தேய்பிறை - ஆடிப்பெருக்கு விழா. ");
                astami_navami.setText("சதுர்த்தசி (மா. 04.55) புனர்பூசம் (மா.01.42)  ");
                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");
                ragu1.setText("09:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("06:00 ");
                kuligai2.setText("07:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");
                measam.setText("புகழ் ");
                resabam.setText("தெளிவு ");
                methunam.setText("ஆக்கம் ");
                kadagam.setText("விவேகம்  ");
                simamam.setText("உயர்வு ");
                kanni.setText("போட்டி ");
                thulam.setText("தனம்  ");
                viruchagam.setText("அலைச்சல்  ");
                thanusu.setText("பகை   ");
                magaram.setText("ஓய்வு   ");
                kumbam.setText("வரவு  ");
                menam.setText("நன்மை");
                break;
            case "2024-08-04":
                text_view_tamil_date.setText("19 - ஆடி, குரோதி");
                tamil_day.setText("ஞாயிறு ");
                theiperai_valarperai.setText("தேய்பிறை-ஆடி அமாவாஸ்யை.");
                astami_navami.setText("அமாவாஸ்யை (மா. 05.32) பூசம் (மா.02.55) ");
                nalla_neaream_kalai.setText("07:45 - 08:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");
                measam.setText("போட்டி  ");
                resabam.setText("நன்மை");
                methunam.setText(" மேன்மை  ");
                kadagam.setText("பிரீதி ");
                simamam.setText("களிப்பு ");
                kanni.setText("வெற்றி ");
                thulam.setText("ஆர்வம் ");
                viruchagam.setText("பரிவு ");
                thanusu.setText("தனம் ");
                magaram.setText("அனுகூலம்  ");
                kumbam.setText("புகழ்");
                menam.setText("உயர்வு");
                break;
            case "2024-08-05":

                text_view_tamil_date.setText("20 - ஆடி, குரோதி");
                tamil_day.setText("திங்கள் ");

                theiperai_valarperai.setText("வளர்பிறை - கரிநாள். ");
                astami_navami.setText("பிரதமை (மா. 06.36) ஆயில்யம் (மா. 04.36) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("இன்பம் ");
                resabam.setText("சுகம் ");
                methunam.setText("ஆக்கம்  ");
                kadagam.setText("செலவு ");
                simamam.setText("போட்டி ");
                kanni.setText("உதவி ");
                thulam.setText("லாபம்  ");
                viruchagam.setText("நற்செயல் ");
                thanusu.setText("வெற்றி ");
                magaram.setText("அச்சம்  ");
                kumbam.setText("ஏமாற்றம் ");
                menam.setText("கவலை ");
                break;
            case "2024-08-06":
                text_view_tamil_date.setText("21 - ஆடி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை -சந்திர தரிசனம். கர்த்தர் ரூபம் மாறிய தினம்.");
                astami_navami.setText("துவிதியை (மா. 08.04) மகம் (மா. 06.41)  ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("கவலை ");
                resabam.setText("வரவு ");
                methunam.setText("தாமதம் ");
                kadagam.setText("செலவு ");
                simamam.setText("ஆதரவு ");
                kanni.setText("அசதி ");
                thulam.setText("வெற்றி ");
                viruchagam.setText("வருத்தம் ");
                thanusu.setText("நன்மை ");
                magaram.setText("அமைதி ");
                kumbam.setText("செலவு ");
                menam.setText("பயம் ");
                break;
            case "2024-08-07":
                text_view_tamil_date.setText("22 - ஆடி, குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("வளர்பிறை - ஆடிப்பூரம்.");
                astami_navami.setText("திரிதியை (மா. 09.51) பூரம் (மா. 09.03) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("07:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("ஏமாற்றம் ");
                resabam.setText("வெற்றி ");
                methunam.setText("கவலை ");
                kadagam.setText("லாபம்  ");
                simamam.setText("நட்பு ");
                kanni.setText("தடங்கல் ");
                thulam.setText("மகிழ்ச்சி ");
                viruchagam.setText("தாமதம் ");
                thanusu.setText("சுகம் ");
                magaram.setText("வரவு ");
                kumbam.setText("சிக்கல் ");
                menam.setText(" அசதி ");
                break;
            case "2024-08-08":

                text_view_tamil_date.setText("23 - ஆடி, குரோதி");
                tamil_day.setText("வியாழன் ");

                theiperai_valarperai.setText("வளர்பிறை - சதுர்த்தி விரதம்.  ");
                astami_navami.setText("சதுர்த்தி (மா. 11.47) உத்திரம் (மா. 11.35) ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("நட்பு   ");
                resabam.setText("உதவி ");
                methunam.setText(" நன்மை");
                kadagam.setText("சிரமம்  ");
                simamam.setText("நிம்மதி ");
                kanni.setText("லாபம்  ");
                thulam.setText("சுகம்  ");
                viruchagam.setText("மேன்மை ");
                thanusu.setText("வெற்றி  ");
                magaram.setText("நற்செயல் ");
                kumbam.setText("ஆக்கம் ");
                menam.setText("அன்பு");
                break;
            case "2024-08-09":

                text_view_tamil_date.setText("24 - ஆடி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText(" பஞ்சமி (கா. 01.44) ஹஸ்தம் (கா.02.09)  ");

                nalla_neaream_kalai.setText("12:15 - 1:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("பொறாமை  ");
                resabam.setText("மேன்மை ");
                methunam.setText("ஆதரவு  ");
                kadagam.setText("போட்டி ");
                simamam.setText("மகிழ்ச்சி ");
                kanni.setText("ஆதாயம்  ");
                thulam.setText("நோய்  ");
                viruchagam.setText("இன்பம் ");
                thanusu.setText("நன்மை ");
                magaram.setText("சோர்வு  ");
                kumbam.setText("விவேகம் ");
                menam.setText(" பகை ");
                break;
            case "2024-08-10":
                text_view_tamil_date.setText("25 - ஆடி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("வளர்பிறை - ஷஷ்டி விரதம். ");
                astami_navami.setText("ஷஷ்டி (கா. 03.36) சித்திரை (கா. 04.36) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("லாபம்  ");
                resabam.setText("நன்மை");
                methunam.setText("போட்டி  ");
                kadagam.setText("தனம்");
                simamam.setText("வெற்றி ");
                kanni.setText("அமைதி  ");
                thulam.setText("பயம்  ");
                viruchagam.setText("தாமதம் ");
                thanusu.setText("நலம் ");
                magaram.setText("கோபம் ");
                kumbam.setText("திறமை ");
                menam.setText(" புகழ்");
                break;
            case "2024-08-11":

                text_view_tamil_date.setText("26 - ஆடி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("ஸப்தமி (கா.05.09) சுவாதி (முழுவதும்)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("உயர்வு ");
                resabam.setText("சினம் ");
                methunam.setText("அன்பு ");
                kadagam.setText("போட்டி ");
                simamam.setText("ஜெயம் ");
                kanni.setText("நன்மை ");
                thulam.setText("பகை  ");
                viruchagam.setText("இன்பம்  ");
                thanusu.setText("திடம் ");
                magaram.setText("பெருமை   ");
                kumbam.setText("மகிழ்ச்சி ");
                menam.setText("விவேகம் ");
                break;
            case "2024-08-12":

                text_view_tamil_date.setText("27 - ஆடி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText("அஷ்டமி (முழுவதும்) சுவாதி (கா.06.39)  ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("புகழ் ");
                resabam.setText(" கீர்த்தி ");
                methunam.setText("சுபம் ");
                kadagam.setText("நட்பு ");
                simamam.setText("அன்பு ");
                kanni.setText("சாந்தி ");
                thulam.setText("வெற்றி ");
                viruchagam.setText("வரவு ");
                thanusu.setText("சுகம் ");
                magaram.setText("கோபம் ");
                kumbam.setText("பாராட்டு  ");
                menam.setText("திறமை");
                break;
            case "2024-08-13":

                text_view_tamil_date.setText("28 - ஆடி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText("அஷ்டமி (கா. 06.11) விசாகம் (கா.08.29)");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("செலவு ");
                resabam.setText("தடங்கல் ");
                methunam.setText("நட்பு  ");
                kadagam.setText("வரவு  ");
                simamam.setText("கவனம்  ");
                kanni.setText("அமைதி ");
                thulam.setText("வீம்பு ");
                viruchagam.setText("நன்மை ");
                thanusu.setText("போட்டி ");
                magaram.setText("பரிசு");
                kumbam.setText("நஷ்டம்  ");
                menam.setText("மகிழ்ச்சி ");
                break;
            case "2024-08-14":

                text_view_tamil_date.setText("29 - ஆடி, குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("நவமி (கா. 07.00) அனுஷம் (கா. 09.47)");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("5:00 - 6:00 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("சாந்தம் ");
                resabam.setText("தாமதம் ");
                methunam.setText("வெற்றி ");
                kadagam.setText("நட்பு  ");
                simamam.setText("கோபம்  ");
                kanni.setText("அச்சம் ");
                thulam.setText("பெருமை ");
                viruchagam.setText("சிரமம் ");
                thanusu.setText("சோதனை  ");
                magaram.setText("மகிழ்ச்சி ");
                kumbam.setText("அனுகூலம்");
                menam.setText(" புகழ்");
                break;
            case "2024-08-15":

                text_view_tamil_date.setText("30 - ஆடி, குரோதி");
                tamil_day.setText("வியாழன் ");

                theiperai_valarperai.setText("வளர்பிறை -இந்திய சுதந்திர தினம். அரசு விடுமுறை. தேவமதா மோட்சத்திற்கான திருநாள். ");
                astami_navami.setText("தசமி (கா. 07.04) கேட்டை (கா. 10.30) ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("அனுகூலம் ");
                resabam.setText("நன்மை  ");
                methunam.setText("பாராட்டு ");
                kadagam.setText("மகிழ்ச்சி ");
                simamam.setText("பொறுமை ");
                kanni.setText("போட்டி  ");
                thulam.setText("பெருமை ");
                viruchagam.setText("அன்பு  ");
                thanusu.setText("திறமை ");
                magaram.setText("தனம்  ");
                kumbam.setText("தாமதம் ");
                menam.setText("நற்செய்தி");
                break;
            case "2024-08-16":

                text_view_tamil_date.setText("31 - ஆடி, குரோதி");
                tamil_day.setText("வெள்ளி  ");

                theiperai_valarperai.setText("வளர்பிறை - ஸர்வ ஏகாதசி. வரலெட்சுமி விரதம்.");
                astami_navami.setText("ஏகாதசி (கா. 06.43) துவாதசி (கா.05.25) மூலம் (கா.10.46) ");

                nalla_neaream_kalai.setText("12:15 - 1:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("இன்பம்  ");
                resabam.setText("பெருமை  ");
                methunam.setText("அன்பு ");
                kadagam.setText("வெற்றி ");
                simamam.setText("போட்டி ");
                kanni.setText("அசதி  ");
                thulam.setText("சாந்தம்  ");
                viruchagam.setText("முயற்சி ");
                thanusu.setText("ஓய்வு    ");
                magaram.setText("பாராட்டு ");
                kumbam.setText("பரிவு ");
                menam.setText(" பாசம் ");
                break;
            case "2024-08-17":

                text_view_tamil_date.setText("1 - ஆவணி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("வளர்பிறை - பிரதோஷம். ");
                astami_navami.setText("திரயோதசி (கா. 04.46) பூராடம் (கா.10.35)");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("நன்மை  ");
                resabam.setText("பொறாமை  ");
                methunam.setText("இன்பம்   ");
                kadagam.setText("தனம்  ");
                simamam.setText("கோபம் ");
                kanni.setText(" நிறைவு  ");
                thulam.setText("பயம்  ");
                viruchagam.setText("மேன்மை  ");
                thanusu.setText("செலவு ");
                magaram.setText("சுகம்   ");
                kumbam.setText("வெற்றி");
                menam.setText("ஆதரவு");
                break;
            case "2024-08-18":
                text_view_tamil_date.setText("2 - ஆவணி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("வளர்பிறை - திருவோண விரதம். கரிநாள்.");
                astami_navami.setText(" சதுர்த்தசி (கா. 03.06) உத்திராடம் (கா.10.06)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("1.30 - 2.00 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("துணிவு ");
                resabam.setText(" பக்தி ");
                methunam.setText("நட்பு  ");
                kadagam.setText("நலம் ");
                simamam.setText("தனம்  ");
                kanni.setText(" இன்பம் ");
                thulam.setText(" போட்டி ");
                viruchagam.setText("பெருமை ");
                thanusu.setText(" செலவு  ");
                magaram.setText("உறுதி ");
                kumbam.setText("சுகம் ");
                menam.setText(" ஆக்கம் ");
                break;
            case "2024-08-19":
                text_view_tamil_date.setText("3 - ஆவணி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("வளர்பிறை - பௌர்ணமி. ஆவணி அவிட்டம்.");
                astami_navami.setText("பௌர்ணமி (கா.01.09) திருவோணம் (கா.09.08) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("வரவு  ");
                resabam.setText("சிக்கல் ");
                methunam.setText("நோய் ");
                kadagam.setText("எதிர்ப்பு ");
                simamam.setText("வெற்றி ");
                kanni.setText("கவலை ");
                thulam.setText("பயம் ");
                viruchagam.setText("நட்பு ");
                thanusu.setText("தடங்கல் ");
                magaram.setText("தாமதம் ");
                kumbam.setText("சுகம்  ");
                menam.setText("சுபம்");
                break;
            case "2024-08-20":
                text_view_tamil_date.setText("4 -ஆவணி, குரோதி");
                tamil_day.setText("செவ்வாய் ");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("பிரதமை (மா. 11.00) அவிட்டம் (கா.07.50) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("வெற்றி  ");
                resabam.setText("நன்மை ");
                methunam.setText("பயம் ");
                kadagam.setText("ஆக்கம் ");
                simamam.setText("சிக்கல்  ");
                kanni.setText(" அன்பு ");
                thulam.setText("லாபம்  ");
                viruchagam.setText("களிப்பு ");
                thanusu.setText("நலம்  ");
                magaram.setText("உயர்வு  ");
                kumbam.setText("சோர்வு");
                menam.setText(" பாசம் ");
                break;
            case "2024-08-21":

                text_view_tamil_date.setText("5 - ஆவணி, குரோதி");
                tamil_day.setText(" புதன்");

                theiperai_valarperai.setText("தேய்பிறை");
                astami_navami.setText("துவிதியை (மா. 08.39) சதயம் (கா. 06.23) பூரட்டாதி (கா. 04.32)");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("புகழ் ");
                resabam.setText("அன்பு    ");
                methunam.setText("தடங்கல் ");
                kadagam.setText("நலம்  ");
                simamam.setText("அமைதி ");
                kanni.setText("பெருமை ");
                thulam.setText("பொறுமை ");
                viruchagam.setText("ஜெயம் ");
                thanusu.setText("அனுகூலம் ");
                magaram.setText("மகிழ்ச்சி ");
                kumbam.setText("முயற்சி ");
                menam.setText("சுபம் ");
                break;
            case "2024-08-22":

                text_view_tamil_date.setText("6 - ஆவணி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம். மஹாசங்கடஹர சதுர்த்தி. வாஸ்து நாள். மெட்ராஸ் தினம். ");
                astami_navami.setText("திரிதியை (மா.06.14) உத்திரட்டாதி (கா.03.13)");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:00 - 1:00 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("ஜெயம் ");
                resabam.setText("நஷ்டம்  ");
                methunam.setText("ஆதரவு  ");
                kadagam.setText("அமைதி  ");
                simamam.setText("வரவு  ");
                kanni.setText("சினம்  ");
                thulam.setText("வீம்பு  ");
                viruchagam.setText("அனுகூலம் ");
                thanusu.setText("இன்பம் ");
                magaram.setText("அன்பு   ");
                kumbam.setText("மேன்மை ");
                menam.setText("வெற்றி");
                break;
            case "2024-08-23":
                text_view_tamil_date.setText("7 - ஆவணி, குரோதி");
                tamil_day.setText("வெள்ளி ");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம். ");
                astami_navami.setText("சதுர்த்தி (மா. 03.48) ரேவதி (கா.01.35) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("பொறுமை");
                resabam.setText("ஆர்வம்");
                methunam.setText("வரவு");
                kadagam.setText("போட்டி");
                simamam.setText("பக்தி");
                kanni.setText("மேன்மை");
                thulam.setText("அமைதி");
                viruchagam.setText("அனுகூலம்");
                thanusu.setText("புகழ்");
                magaram.setText("கீர்த்தி");
                kumbam.setText("உயர்வு");
                menam.setText("ஜெயம்");
                break;
            case "2024-08-24":

                text_view_tamil_date.setText("8 -ஆவணி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("பஞ்சமி (மா. 01.25) அசுபதி (கா. 12.03) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("வெற்றி ");
                resabam.setText("உயர்வு ");
                methunam.setText("பெருமை  ");
                kadagam.setText("அமைதி  ");
                simamam.setText("நன்மை ");
                kanni.setText("ஆதரவு ");
                thulam.setText("போட்டி  ");
                viruchagam.setText("அனுகூலம் ");
                thanusu.setText("அச்சம் ");
                magaram.setText(" பகை  ");
                kumbam.setText("பாசம் ");
                menam.setText(" சுகம்");
                break;
            case "2024-08-25":

                text_view_tamil_date.setText("9 -ஆவணி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை - கரிநாள்.");
                astami_navami.setText(" ஷஷ்டி (கா. 11.12) பரணி (மா. 10.43)");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText(" 3.15 - 4.15 pm ");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("உயர்வு  ");
                resabam.setText("பாராட்டு ");
                methunam.setText("நலம்  ");
                kadagam.setText("தோல்வி  ");
                simamam.setText("இரக்கம்  ");
                kanni.setText("அலைச்சல் ");
                thulam.setText("பொறுமை ");
                viruchagam.setText("சோதனை ");
                thanusu.setText("சினம் ");
                magaram.setText("நிம்மதி ");
                kumbam.setText("பகை ");
                menam.setText("வெற்றி");
                break;
            case "2024-08-26":
                text_view_tamil_date.setText("10 -ஆவணி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை - கோகுலாஷ்டமி. அரசு விடுமுறை. கார்த்திகை விரதம்.");
                astami_navami.setText("ஸப்தமி (கா. 09.12) கார்த்திகை (மா.09.40) ");

                nalla_neaream_kalai.setText("9:00 - 10:00 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("நன்மை ");
                resabam.setText("பாசம் ");
                methunam.setText("அசதி  ");
                kadagam.setText("செலவு ");
                simamam.setText("பாசம் ");
                kanni.setText("கவனம் ");
                thulam.setText("பயணம் ");
                viruchagam.setText("பெருமை ");
                thanusu.setText("சிந்தனை ");
                magaram.setText("முயற்சி ");
                kumbam.setText("ஆதரவு  ");
                menam.setText(" சுபசெலவு ");
                break;
            case "2024-08-27":

                text_view_tamil_date.setText("11 -ஆவணி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("தேய்பிறை -  பாஞ்சராத்திர ஜெயந்தி.");
                astami_navami.setText("அஷ்டமி (கா.07.30) ரோகிணி (மா.08.54)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("மேன்மை ");
                resabam.setText("உதவி ");
                methunam.setText("சோர்வு ");
                kadagam.setText("போட்டி ");
                simamam.setText("ஆதரவு ");
                kanni.setText("நட்பு ");
                thulam.setText("நன்மை ");
                viruchagam.setText("செலவு ");
                thanusu.setText("ஆதாயம் ");
                magaram.setText("கவலை ");
                kumbam.setText("வெற்றி");
                menam.setText(" சுகம் ");
                break;
            case "2024-08-28":

                text_view_tamil_date.setText("12 -ஆவணி, குரோதி");
                tamil_day.setText(" புதன்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("நவமி (கா. 06.10) தசமி (கா. 04.59) மிருகசீருஷம் (மா. 08.33)");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("அனுகூலம்  ");
                resabam.setText("மறதி ");
                methunam.setText("ஆசை  ");
                kadagam.setText("நிம்மதி ");
                simamam.setText("வெற்றி ");
                kanni.setText(" தோல்வி  ");
                thulam.setText("அமைதி  ");
                viruchagam.setText("சுகம் ");
                thanusu.setText("பயணம் ");
                magaram.setText("நலம் ");
                kumbam.setText("முயற்சி ");
                menam.setText("லாபம்");
                break;
            case "2024-08-29":

                text_view_tamil_date.setText("13 - ஆவணி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை - ஏகாதசி. ");
                astami_navami.setText("ஏகாதசி (கா. 04.38) திருவாதிரை (மா.08.38 ) ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("களிப்பு ");
                resabam.setText("வரவு ");
                methunam.setText("ஆர்வம்  ");
                kadagam.setText(" சாந்தம் ");
                simamam.setText("செலவு ");
                kanni.setText(" பாசம்  ");
                thulam.setText("உறுதி  ");
                viruchagam.setText("உதவி ");
                thanusu.setText("கீர்த்தி  ");
                magaram.setText("சலனம்  ");
                kumbam.setText(" லாபம்  ");
                menam.setText("கவனம்  ");
                break;
            case "2024-08-30":

                text_view_tamil_date.setText("14 - ஆவணி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம். ");
                astami_navami.setText("துவாதசி (கா. 04.42) புனர்பூசம் (மா.09.09)  ");

                nalla_neaream_kalai.setText("12:15 - 1:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("6:00 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("மகிழ்ச்சி  ");
                resabam.setText("பெருமை   ");
                methunam.setText("நேர்மை  ");
                kadagam.setText("ஓய்வு  ");
                simamam.setText("ஈகை  ");
                kanni.setText("சினம்  ");
                thulam.setText("தனம்  ");
                viruchagam.setText("அலைச்சல் ");
                thanusu.setText("கவனம்  ");
                magaram.setText("தோல்வி ");
                kumbam.setText("அன்பு ");
                menam.setText(" வாழ்வு ");
                break;
            case "2024-08-31":

                text_view_tamil_date.setText("15 - ஆவணி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("தேய்பிறை -  பிரதோஷம். மலேசியா சுதந்திர தினம்.");
                astami_navami.setText("திரயோதசி (கா.05.17) பூசம் (மா. 10.14)  ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("அனுகூலம்  ");
                resabam.setText("மகிழ்ச்சி ");
                methunam.setText("பொறுமை  ");
                kadagam.setText("சாதனை ");
                simamam.setText("நன்மை  ");
                kanni.setText("வரவு   ");
                thulam.setText("செலவு ");
                viruchagam.setText("முயற்சி ");
                thanusu.setText("ஓய்வு ");
                magaram.setText("சிந்தனை ");
                kumbam.setText("சாந்தம்");
                menam.setText("வளர்ச்சி");
                break;


            /*******************************************************9. september ************************************************************************************/

            case "2024-09-01":

                text_view_tamil_date.setText("16 - ஆவணி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை - மாத சிவராத்திரி.");
                astami_navami.setText("சதுர்த்தசி (முழுவதும்) ஆயில்யம் (மா. 11.49) ");

                nalla_neaream_kalai.setText("7:45 -8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:30 - 11:00 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("வெற்றி ");
                resabam.setText("போட்டி ");
                methunam.setText("அலைச்சல் ");
                kadagam.setText("ஓய்வு ");
                simamam.setText("லாபம் ");
                kanni.setText("பக்தி ");
                thulam.setText("புகழ் ");
                viruchagam.setText("ஆர்வம் ");
                thanusu.setText("ஆதரவு");
                magaram.setText("பெருமை ");
                kumbam.setText("சிந்தனை");
                menam.setText("நன்மை");
                break;
            case "2024-09-02":

                text_view_tamil_date.setText("17 - ஆவணி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை - ஸர்வ அமாவாஸ்யை. ");
                astami_navami.setText("சதுர்த்தசி (கா. 06.32) மகம் (கா. 01.50) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("04.45 -05.45 pm ");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("01:30 ");
                kuligai2.setText("03:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("மகிழ்ச்சி ");
                resabam.setText("நிறைவு  ");
                methunam.setText("பகை  ");
                kadagam.setText("மறதி ");
                simamam.setText("அச்சம் ");
                kanni.setText("நலம் ");
                thulam.setText("முயற்சி ");
                viruchagam.setText("நன்மை ");
                thanusu.setText("அனுகூலம் ");
                magaram.setText("நட்பு  ");
                kumbam.setText("போட்டி ");
                menam.setText(" பக்தி");
                break;
            case "2024-09-03":
                text_view_tamil_date.setText("18 - ஆவணி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை  ");
                astami_navami.setText("அமாவாஸ்யை (கா.07.59) பூரம்  (கா.04.13)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("03:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("01:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("பொறுமை  ");
                resabam.setText("ஆக்கம் ");
                methunam.setText("பாசம் ");
                kadagam.setText("உயர்வு ");
                simamam.setText("விவேகம் ");
                kanni.setText("அனுகூலம்  ");
                thulam.setText("தோல்வி ");
                viruchagam.setText("ஆதரவு ");
                thanusu.setText("சிரமம் ");
                magaram.setText("அசதி ");
                kumbam.setText("மேன்மை ");
                menam.setText("மகிழ்ச்சி");
                break;
            case "2024-09-04":
                text_view_tamil_date.setText("19 - ஆவணி, குரோதி");
                tamil_day.setText("புதன் ");

                theiperai_valarperai.setText("வளர்பிறை-சந்திர தரிசனம்.");
                astami_navami.setText(" பிரதமை (கா.09.49) உத்திரம் (முழுவதும்)");

                nalla_neaream_kalai.setText("09:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("இன்பம் ");
                resabam.setText("இரக்கம் ");
                methunam.setText("உயர்வு ");
                kadagam.setText("நட்பு ");
                simamam.setText("ஆதரவு ");
                kanni.setText("அலைச்சல் ");
                thulam.setText("நஷ்டம் ");
                viruchagam.setText("லாபம் ");
                thanusu.setText("நற்செயல் ");
                magaram.setText("களிப்பு ");
                kumbam.setText("சுகம் ");
                menam.setText("நலம்");
                break;
            case "2024-09-05":

                text_view_tamil_date.setText("20 - ஆவணி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம். ");
                astami_navami.setText("துவிதியை (கா. 11.48) உத்திரம் (கா.06.42)  ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("கவலை ");
                resabam.setText("பயம் ");
                methunam.setText("கவனம் ");
                kadagam.setText("நற்செயல் ");
                simamam.setText("உயர்வு  ");
                kanni.setText("அச்சம் ");
                thulam.setText("போட்டி ");
                viruchagam.setText("அனுகூலம் ");
                thanusu.setText("பக்தி ");
                magaram.setText("குழப்பம் ");
                kumbam.setText("செலவு  ");
                menam.setText("பாராட்டு");
                break;
            case "2024-09-06":
                text_view_tamil_date.setText("21 - ஆவணி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம்.");
                astami_navami.setText(" திரிதியை (மா. 01.47) ஹஸ்தம் (கா.09.18)  ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("முயற்சி ");
                resabam.setText("நன்மை ");
                methunam.setText("பக்தி ");
                kadagam.setText("நலம் ");
                simamam.setText("கோபம்  ");
                kanni.setText("சிக்கல் ");
                thulam.setText("பணிவு ");
                viruchagam.setText("நலம் ");
                thanusu.setText("நட்பு ");
                magaram.setText("கவலை ");
                kumbam.setText("தெளிவு ");
                menam.setText("உற்சாகம் ");
                break;
            case "2024-09-07":
                text_view_tamil_date.setText("22 - ஆவணி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("வளர்பிறை - ஸ்ரீவிநாயகர் சதுர்த்தி. சதுர்த்தி விரதம். அரசு விடுமுறை.");
                astami_navami.setText(" சதுர்த்தி (மா. 03.38) சித்திரை (கா. 11.44)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:30 - 5:00 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("01:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("கீர்த்தி  ");
                resabam.setText("திறமை ");
                methunam.setText("சிரமம் ");
                kadagam.setText("நஷ்டம் ");
                simamam.setText("கவலை ");
                kanni.setText("பக்தி ");
                thulam.setText("நட்பு ");
                viruchagam.setText("பாசம் ");
                thanusu.setText("வெற்றி  ");
                magaram.setText("ஓய்வு  ");
                kumbam.setText("அமைதி ");
                menam.setText(" மகிழ்ச்சி");
                break;
            case "2024-09-08":

                text_view_tamil_date.setText("23 - ஆவணி, குரோதி");
                tamil_day.setText("ஞாயிறு ");

                theiperai_valarperai.setText("வளர்பிறை -சுபமுகூர்த்தம். தேவ மாத பிறந்த நாள். ");
                astami_navami.setText("பஞ்சமி (மா.05.15 சுவாதி (மா. 01.58) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("ஜெயம் ");
                resabam.setText("அலைச்சல் ");
                methunam.setText("அசதி ");
                kadagam.setText("நன்மை ");
                simamam.setText("விவேகம் ");
                kanni.setText("அமைதி ");
                thulam.setText("செலவு ");
                viruchagam.setText("பயம் ");
                thanusu.setText("கவலை ");
                magaram.setText("வரவு  ");
                kumbam.setText("தாமதம் ");
                menam.setText("தெளிவு");
                break;
            case "2024-09-09":

                text_view_tamil_date.setText("24 - ஆவணி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("வளர்பிறை - ஷஷ்டி விரதம்.");
                astami_navami.setText(" ஷஷ்டி (மா. 06.26) விசாகம் (மா. 03.49)  ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("ஆக்கம்  ");
                resabam.setText("அமைதி ");
                methunam.setText("ஓய்வு  ");
                kadagam.setText("புகழ் ");
                simamam.setText("பிரீதி  ");
                kanni.setText("ஊக்கம் ");
                thulam.setText("தனம்");
                viruchagam.setText(" நலம் ");
                thanusu.setText("வெற்றி");
                magaram.setText(" போட்டி  ");
                kumbam.setText("தெளிவு ");
                menam.setText(" லாபம்");
                break;
            case "2024-09-10":
                text_view_tamil_date.setText("25 - ஆவணி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை  ");
                astami_navami.setText("ஸப்தமி (மா. 07.10) அனுஷம் (மா.05.13)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("உற்சாகம் ");
                resabam.setText("லாபம் ");
                methunam.setText("நட்பு ");
                kadagam.setText("உயர்வு ");
                simamam.setText("போட்டி ");
                kanni.setText("எதிர்ப்பு ");
                thulam.setText("பொறுமை  ");
                viruchagam.setText("ஏமாற்றம்  ");
                thanusu.setText("வரவு ");
                magaram.setText("ஜெயம் ");
                kumbam.setText("உழைப்பு ");
                menam.setText("விவேகம்");
                break;
            case "2024-09-11":

                text_view_tamil_date.setText("26 - ஆவணி, குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("அஷ்டமி (மா. 07.22) கேட்டை (மா.06.07) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("பாராட்டு ");
                resabam.setText("வெற்றி ");
                methunam.setText("நலம்  ");
                kadagam.setText("பரிசு ");
                simamam.setText("சாந்தம் ");
                kanni.setText("கீர்த்தி ");
                thulam.setText("உதவி ");
                viruchagam.setText("போட்டி  ");
                thanusu.setText("ஆர்வம் ");
                magaram.setText("பக்தி ");
                kumbam.setText("நன்மை ");
                menam.setText(" மேன்மை");
                break;
            case "2024-09-12":

                text_view_tamil_date.setText("27 - ஆவணி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText("நவமி (மா. 07.05) மூலம் (மா. 06.31)  ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("பாராட்டு  ");
                resabam.setText(" வெற்றி ");
                methunam.setText("நலம்  ");
                kadagam.setText("பரிசு ");
                simamam.setText("சாந்தம் ");
                kanni.setText("கீர்த்தி ");
                thulam.setText("உதவி ");
                viruchagam.setText("போட்டி ");
                thanusu.setText("ஆர்வம் ");
                magaram.setText("பக்தி  ");
                kumbam.setText("நன்மை ");
                menam.setText("மேன்மை");
                break;
            case "2024-09-13":

                text_view_tamil_date.setText("28 - ஆவணி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("வளர்பிறை - கரிநாள்.");
                astami_navami.setText("தசமி (மா. 06.18) பூராடம்  (மா. 06.27) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("வெற்றி ");
                resabam.setText("செலவு ");
                methunam.setText("தெளிவு ");
                kadagam.setText("பயம் ");
                simamam.setText("தடங்கல் ");
                kanni.setText("தோல்வி ");
                thulam.setText("சோதனை ");
                viruchagam.setText("முயற்சி  ");
                thanusu.setText("நலம் ");
                magaram.setText("நஷ்டம்  ");
                kumbam.setText("ஈகை ");
                menam.setText("நன்மை");
                break;
            case "2024-09-14":

                text_view_tamil_date.setText("29 - ஆவணி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("வளர்பிறை -  ஸர்வ ஏகாதசி. திருவோண விரதம். ");
                astami_navami.setText("ஏகாதசி (மா. 05.05) உத்திராடம் (மா. 05.57) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("மேன்மை ");
                resabam.setText("வெற்றி  ");
                methunam.setText("சுகம்  ");
                kadagam.setText("போட்டி ");
                simamam.setText("சுபம் ");
                kanni.setText("தனம் ");
                thulam.setText("வரவு ");
                viruchagam.setText("முயற்சி  ");
                thanusu.setText("உயர்வு ");
                magaram.setText("கவலை ");
                kumbam.setText("லாபம் ");
                menam.setText("ஜெயம்");
                break;
            case "2024-09-15":

                text_view_tamil_date.setText("30 - ஆவணி, குரோதி");
                tamil_day.setText("ஞாயிறு ");

                theiperai_valarperai.setText("வளர்பிறை -சுபமுகூர்த்தம். பிரதோஷம். ஓணம் பண்டிகை. ");
                astami_navami.setText("துவாதசி (மா. 03.30) திருவோணம் (மா.05.03) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("எதிர்ப்பு  ");
                resabam.setText("போட்டி ");
                methunam.setText("விவேகம் ");
                kadagam.setText("அச்சம் ");
                simamam.setText("பாசம் ");
                kanni.setText("தனம் ");
                thulam.setText("வீம்பு ");
                viruchagam.setText("பெருமை ");
                thanusu.setText("இன்பம் ");
                magaram.setText("ஆக்கம் ");
                kumbam.setText("அமைதி");
                menam.setText("நலம்");
                break;
            case "2024-09-16":

                text_view_tamil_date.setText("31 -  ஆவணி, குரோதி");
                tamil_day.setText("திங்கள் ");

                theiperai_valarperai.setText("வளர்பிறை -சுபமுகூர்த்தம். மீலாடி நபி. அரசு விடுமுறை.");
                astami_navami.setText("திரயோதசி (மா. 01.30) அவிட்டம் (மா.03.52)  ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("நன்மை  ");
                resabam.setText("திறமை ");
                methunam.setText("சோர்வு ");
                kadagam.setText("கவனம் ");
                simamam.setText("சாந்தம் ");
                kanni.setText("அமைதி ");
                thulam.setText("சுகம் ");
                viruchagam.setText("நலம் ");
                thanusu.setText("புகழ் ");
                magaram.setText("பயம்  ");
                kumbam.setText("பக்தி");
                menam.setText("பொறுமை ");
                break;
            case "2024-09-17":

                text_view_tamil_date.setText("1 - புரட்டாசி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை - பௌர்ணமி. ");
                astami_navami.setText("சதுர்த்தசி (கா. 11.21) சதயம் (மா. 02.27 )");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("போட்டி ");
                resabam.setText("நன்மை   ");
                methunam.setText("உதவி ");
                kadagam.setText("நலம் ");
                simamam.setText("ஆரோக்கியம் ");
                kanni.setText("ஊக்கம் ");
                thulam.setText("பிரீதி ");
                viruchagam.setText("சுபம்  ");
                thanusu.setText("முயற்சி");
                magaram.setText("கோபம் ");
                kumbam.setText("சுகம்");
                menam.setText("தனம்");
                break;
            case "2024-09-18":
                text_view_tamil_date.setText("2 - புரட்டாசி, குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("பௌர்ணமி (கா. 09.10) பூரட்டாதி (மா. 12.56) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("லாபம் ");
                resabam.setText(" தோல்வி ");
                methunam.setText("வெற்றி ");
                kadagam.setText("உதவி ");
                simamam.setText("போட்டி ");
                kanni.setText(" அமைதி ");
                thulam.setText(" தெளிவு  ");
                viruchagam.setText("பொறுமை ");
                thanusu.setText("தேர்ச்சி");
                magaram.setText("சிந்தனை");
                kumbam.setText("நட்பு ");
                menam.setText("நற்செயல்");
                break;
            case "2024-09-19":
                text_view_tamil_date.setText("3 - புரட்டாசி குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("பிரதமை (கா. 06.41) துவிதியை (கா.03.39) ");

                nalla_neaream_kalai.setText("10:45 -11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("பகை ");
                resabam.setText("வெற்றி ");
                methunam.setText("நன்மை ");
                kadagam.setText("போட்டி ");
                simamam.setText("மேன்மை ");
                kanni.setText("பாராட்டு ");
                thulam.setText("நோய் ");
                viruchagam.setText("உயர்வு ");
                thanusu.setText("களிப்பு");
                magaram.setText(" பாசம்  ");
                kumbam.setText("அன்பு");
                menam.setText("அமைதி");
                break;
            case "2024-09-20":
                text_view_tamil_date.setText("4 -புரட்டாசி குரோதி");
                tamil_day.setText("வெள்ளி ");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText(" திரிதியை (கா.01.58) ரேவதி (கா.09.38)  ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("போட்டி  ");
                resabam.setText("கவனம் ");
                methunam.setText("மகிழ்ச்சி ");
                kadagam.setText("நட்பு ");
                simamam.setText("சோர்வு ");
                kanni.setText("விருத்தி ");
                thulam.setText("களிப்பு ");
                viruchagam.setText("தொல்லை ");
                thanusu.setText("முயற்சி ");
                magaram.setText("பயம்  ");
                kumbam.setText("பரிசு");
                menam.setText(" விவேகம்");
                break;
            case "2024-09-21":

                text_view_tamil_date.setText("5 - புரட்டாசி குரோதி");
                tamil_day.setText(" சனி");

                theiperai_valarperai.setText("தேய்பிறை - மஹாபரணி. சங்கடஹர சதுர்த்தி.");
                astami_navami.setText("சதுர்த்தி (மா. 11.42) அசுபதி (கா. 08.03) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3:15 - 4:15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("பொறுமை ");
                resabam.setText("தனம்  ");
                methunam.setText("சினம்");
                kadagam.setText("உற்சாகம் ");
                simamam.setText("பாராட்டு ");
                kanni.setText("நன்மை ");
                thulam.setText("இரக்கம்  ");
                viruchagam.setText("ஊக்கம்  ");
                thanusu.setText("மகிழ்ச்சி  ");
                magaram.setText("உழைப்பு   ");
                kumbam.setText("உற்சாகம் ");
                menam.setText("அமைதி");
                break;
            case "2024-09-22":

                text_view_tamil_date.setText("6 - புரட்டாசி குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை - கார்த்திகை விரதம். ");
                astami_navami.setText(" பஞ்சமி (மா. 09.49) பரணி (கா. 06.42) கார்த்திகை (கா.04.48) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("ஊக்கம்  ");
                resabam.setText("திடம்  ");
                methunam.setText("பகை ");
                kadagam.setText("ஜெயம் ");
                simamam.setText("வரவு  ");
                kanni.setText("மறதி  ");
                thulam.setText("விவேகம்  ");
                viruchagam.setText("வீம்பு ");
                thanusu.setText("சுபம்");
                magaram.setText(" ஆதரவு  ");
                kumbam.setText("சினம்");
                menam.setText("பாசம்");
                break;
            case "2024-09-23":
                text_view_tamil_date.setText("7 - புரட்டாசி குரோதி");
                tamil_day.setText("திங்கள் ");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("ஷஷ்டி (மா.08.09) ரோகிணி (கா.04.40) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("லாபம் ");
                resabam.setText("நன்மை ");
                methunam.setText("போட்டி ");
                kadagam.setText("தனம் ");
                simamam.setText("வெற்றி ");
                kanni.setText("அமைதி ");
                thulam.setText("பயம் ");
                viruchagam.setText("தாமதம் ");
                thanusu.setText("நலம் ");
                magaram.setText("கோபம்");
                kumbam.setText("திறமை");
                menam.setText("புகழ்");
                break;
            case "2024-09-24":

                text_view_tamil_date.setText("8 -புரட்டாசி குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("ஸப்தமி (மா.06.49) மிருகசீருஷம் (கா.04.12)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("உயர்வு ");
                resabam.setText("சினம்  ");
                methunam.setText("அன்பு  ");
                kadagam.setText("போட்டி  ");
                simamam.setText("ஜெயம் ");
                kanni.setText("நன்மை ");
                thulam.setText("பகை  ");
                viruchagam.setText("இன்பம் ");
                thanusu.setText("தீரம் ");
                magaram.setText("பெருமை ");
                kumbam.setText("மகிழ்ச்சி ");
                menam.setText("எதிர்ப்பு ");
                break;
            case "2024-09-25":

                text_view_tamil_date.setText("9 -புரட்டாசி குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText(" அஷ்டமி (மா. 05.55) திருவாதிரை (கா.04.11) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("நலம் ");
                resabam.setText("லாபம் ");
                methunam.setText("பொறுமை  ");
                kadagam.setText("போட்டி ");
                simamam.setText("நட்பு  ");
                kanni.setText("ஆதரவு   ");
                thulam.setText("சலனம் ");
                viruchagam.setText("கவனம் ");
                thanusu.setText("உதவி ");
                magaram.setText("தேர்ச்சி ");
                kumbam.setText("புகழ் ");
                menam.setText(" நற்செயல் ");
                break;
            case "2024-09-26":
                text_view_tamil_date.setText("10 -புரட்டாசி குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("நவமி (மா. 05.30) புனர்பூசம் (கா.04.32)  ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 -1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("நன்மை  ");
                resabam.setText("செலவு ");
                methunam.setText("லாபம் ");
                kadagam.setText("போட்டி ");
                simamam.setText("விவேகம் ");
                kanni.setText("தடங்கல் ");
                thulam.setText("அமைதி ");
                viruchagam.setText("பொறுமை ");
                thanusu.setText("அன்பு ");
                magaram.setText("மகிழ்ச்சி  ");
                kumbam.setText("வெற்றி ");
                menam.setText(" இன்பம் ");
                break;
            case "2024-09-27":

                text_view_tamil_date.setText("11 -புரட்டாசி குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("தசமி (மா. 05.34) பூசம் (கா. 05.29)  ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("12:00 - 1:00 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("நிம்மதி ");
                resabam.setText("எதிர்ப்பு ");
                methunam.setText("வரவு ");
                kadagam.setText("ஏமாற்றம்  ");
                simamam.setText("புகழ் ");
                kanni.setText("ஊக்கம் ");
                thulam.setText("உதவி  ");
                viruchagam.setText("மறதி ");
                thanusu.setText("பெருமை ");
                magaram.setText("ஆக்கம் ");
                kumbam.setText("அசதி ");
                menam.setText("போட்டி");
                break;
            case "2024-09-28":

                text_view_tamil_date.setText("12 -புரட்டாசி குரோதி");
                tamil_day.setText(" சனி");

                theiperai_valarperai.setText("தேய்பிறை - ஸர்வ ஏகாதசி. ");
                astami_navami.setText("ஏகாதசி (மா.06.09) ஆயில்யம் (முழுவதும்) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("பக்தி ");
                resabam.setText("பரிசு ");
                methunam.setText("பயம் ");
                kadagam.setText("பகை ");
                simamam.setText("பரிவு ");
                kanni.setText("பாராட்டு ");
                thulam.setText("பிரீதி ");
                viruchagam.setText("ஓய்வு ");
                thanusu.setText("வரவு ");
                magaram.setText("தடங்கல்  ");
                kumbam.setText("வெற்றி ");
                menam.setText("இன்சொல்");
                break;
            case "2024-09-29":

                text_view_tamil_date.setText("13 - புரட்டாசி குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("துவாதசி (மா. 07.15) ஆயில்யம் (கா.07.09)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 -11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("நலம் ");
                resabam.setText("நன்மை  ");
                methunam.setText("நற்செயல் ");
                kadagam.setText("தடங்கல் ");
                simamam.setText("ஆர்வம் ");
                kanni.setText("சாந்தம் ");
                thulam.setText("செலவு ");
                viruchagam.setText("குழப்பம் ");
                thanusu.setText("வெற்றி ");
                magaram.setText("துன்பம் ");
                kumbam.setText("விவேகம் ");
                menam.setText("இரக்கம்");
                break;
            case "2024-09-30":

                text_view_tamil_date.setText("14 - புரட்டாசி குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை - பிரதோஷம். மாத சிவராத்திரி. ");
                astami_navami.setText(" திரயோதசி (மா. 08.45) மகம் (கா.09.01) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("பரிசு ");
                resabam.setText("தனம் ");
                methunam.setText("தேர்ச்சி   ");
                kadagam.setText("செலவு ");
                simamam.setText("ஓய்வு ");
                kanni.setText("சினம் ");
                thulam.setText("நன்மை  ");
                viruchagam.setText("மறதி ");
                thanusu.setText("ஆதரவு ");
                magaram.setText("பக்தி  ");
                kumbam.setText("சலனம் ");
                menam.setText(" உயர்வு ");
                break;

            /*******************************************************10.october ************************************************************************************/

            case "2024-10-01":

                text_view_tamil_date.setText("15 - புரட்டாசி குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("சதுர்த்தசி (மா. 10.34) பூரம் (கா. 11.15) ");

                nalla_neaream_kalai.setText("7:45 -8:45 am");
                nalla_neaream_malai.setText("4.45 - 4.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("பகை ");
                resabam.setText("வரவு  ");
                methunam.setText("பயம் ");
                kadagam.setText("நன்மை  ");
                simamam.setText("ஆதாயம்  ");
                kanni.setText("சிந்தனை ");
                thulam.setText("தாமதம் ");
                viruchagam.setText("சுகம் ");
                thanusu.setText("லாபம் ");
                magaram.setText("அச்சம் ");
                kumbam.setText("ஆர்வம் ");
                menam.setText("வாழ்வு");
                break;
            case "2024-10-02":

                text_view_tamil_date.setText("17 - ஆவணி, குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("தேய்பிறை - ஸர்வ மஹாளய அமாவாஸ்யை. கரிநாள். காந்தி ஜெயந்தி. அரசு விடுமுறை.  ");
                astami_navami.setText("அமாவாஸ்யை (கா. 12.34) உத்திரம் (மா. 01.44) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("04.45 -05.45 pm ");

                gowri_nallaneram_kalai.setText("10:45 - 10:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("தாமதம்  ");
                resabam.setText("லாபம் ");
                methunam.setText("ஆதரவு ");
                kadagam.setText("சிந்தனை ");
                simamam.setText("தனம் ");
                kanni.setText("வெற்றி  ");
                thulam.setText("நன்மை ");
                viruchagam.setText("பொறுமை ");
                thanusu.setText("நஷ்டம்  ");
                magaram.setText("பயம் ");
                kumbam.setText("பக்தி ");
                menam.setText("இன்பம் ");
                break;
            case "2024-10-03":
                text_view_tamil_date.setText("18 - ஆவணி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("வளர்பிறை -  நவராத்திரி ஆரம்பம். ");
                astami_navami.setText("பிரதமை (கா. 02.38) ஹஸ்தம் (மா.04.19)  ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("01:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("வெற்றி ");
                resabam.setText("கோபம் ");
                methunam.setText("குழப்பம் ");
                kadagam.setText("விருத்தி ");
                simamam.setText("அசதி ");
                kanni.setText("பாராட்டு ");
                thulam.setText("நலம் ");
                viruchagam.setText("வாழ்வு ");
                thanusu.setText("சிரத்தை ");
                magaram.setText("பணிவு ");
                kumbam.setText("ஆர்வம் ");
                menam.setText("சுகம்");
                break;
            case "2024-10-04":
                text_view_tamil_date.setText("19 - ஆவணி, குரோதி");
                tamil_day.setText("வெள்ளி ");

                theiperai_valarperai.setText("வளர்பிறை-சந்திர தரிசனம்.");
                astami_navami.setText("துவிதியை (கா.04.33) சித்திரை (மா. 06.48) ");

                nalla_neaream_kalai.setText("09:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("தனம்  ");
                resabam.setText("நட்பு ");
                methunam.setText("சுபம் ");
                kadagam.setText("பயம் ");
                simamam.setText("பரிசு ");
                kanni.setText("வெற்றி ");
                thulam.setText("ஏமாற்றம் ");
                viruchagam.setText("ஓய்வு ");
                thanusu.setText("நலம் ");
                magaram.setText("அமைதி ");
                kumbam.setText("சலனம் ");
                menam.setText("ஆக்கம்");
                break;
            case "2024-10-05":

                text_view_tamil_date.setText("20 - ஆவணி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("வளர்பிறை  ");
                astami_navami.setText("திரிதியை (முழுவதும்) சுவாதி (மா. 09.06) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 -5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("சுகம்");
                resabam.setText(" புகழ்  ");
                methunam.setText("பாராட்டு ");
                kadagam.setText("ஆதாயம் ");
                simamam.setText("தாமதம் ");
                kanni.setText("விருப்பம் ");
                thulam.setText("விவேகம் ");
                viruchagam.setText("தோல்வி ");
                thanusu.setText("அலைச்சல் ");
                magaram.setText("வெற்றி  ");
                kumbam.setText("நன்மை ");
                menam.setText("பக்தி");
                break;
            case "2024-10-06":
                text_view_tamil_date.setText("21 - ஆவணி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("வளர்பிறை - சதுர்த்தி விரதம்.");
                astami_navami.setText(" திரிதியை (கா. 06.04) விசாகம் (மா. 11.03)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("செலவு ");
                resabam.setText("குழப்பம் ");
                methunam.setText("ஆரோக்கியம் ");
                kadagam.setText("வெற்றி ");
                simamam.setText("சுகம் ");
                kanni.setText("நட்பு ");
                thulam.setText("அமைதி ");
                viruchagam.setText("கவனம்  ");
                thanusu.setText("முயற்சி ");
                magaram.setText("ஆர்வம் ");
                kumbam.setText("பயம் ");
                menam.setText("அனுகூலம்");
                break;
            case "2024-10-07":
                text_view_tamil_date.setText("22 - ஆவணி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("சதுர்த்தி (கா.07.22) அனுஷம் (கா.12.34) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("நன்மை ");
                resabam.setText("பக்தி ");
                methunam.setText("வெற்றி ");
                kadagam.setText("சுகம்  ");
                simamam.setText("பயம் ");
                kanni.setText("நஷ்டம் ");
                thulam.setText("பாராட்டு ");
                viruchagam.setText("குழப்பம்  ");
                thanusu.setText("ஆரோக்கியம்  ");
                magaram.setText("ஆர்வம் ");
                kumbam.setText("விவேகம் ");
                menam.setText("மேன்மை");
                break;
            case "2024-10-08":

                text_view_tamil_date.setText("23 - ஆவணி, குரோதி");
                tamil_day.setText("செவ்வாய் ");

                theiperai_valarperai.setText("வளர்பிறை -ஷஷ்டி விரதம். ");
                astami_navami.setText("பஞ்சமி (கா.08.06) கேட்டை (கா.01.35) ");

                nalla_neaream_kalai.setText("8:00 - 9:00 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("சாந்தம்  ");
                resabam.setText("ஜெயம்");
                methunam.setText(" விருத்தி ");
                kadagam.setText("லாபம்  ");
                simamam.setText("உயர்வு ");
                kanni.setText("முயற்சி ");
                thulam.setText(" யோகம்  ");
                viruchagam.setText("பரிவு  ");
                thanusu.setText("பயணம் ");
                magaram.setText("நன்மை");
                kumbam.setText("நட்பு ");
                menam.setText("வெற்றி ");
                break;
            case "2024-10-09":

                text_view_tamil_date.setText("24 - ஆவணி, குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText(" ஷஷ்டி (கா.08.20 மூலம் (கா. 02.06) ");

                nalla_neaream_kalai.setText("11:30 - 12:00 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("பயணம் ");
                resabam.setText("செலவு ");
                methunam.setText("அமைதி ");
                kadagam.setText("சிந்தனை ");
                simamam.setText("பாராட்டு ");
                kanni.setText("நன்மை ");
                thulam.setText("சோதனை ");
                viruchagam.setText("ஆக்கம் ");
                thanusu.setText("சாதனை ");
                magaram.setText("பேராசை ");
                kumbam.setText("நஷ்டம் ");
                menam.setText("சாந்தம்");
                break;
            case "2024-10-10":
                text_view_tamil_date.setText("25 - ஆவணி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("வளர்பிறை  ");
                astami_navami.setText("ஸப்தமி (கா.08.06) பூராடம்  (கா. 02.09) ");

                nalla_neaream_kalai.setText("10:30 - 11:00 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("1:00 - 1:30 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("விருப்பம் ");
                resabam.setText("ஜெயம் ");
                methunam.setText("நிம்மதி ");
                kadagam.setText("சாந்தம் ");
                simamam.setText("அமைதி ");
                kanni.setText("பாசம்  ");
                thulam.setText("அன்பு  ");
                viruchagam.setText("முயற்சி ");
                thanusu.setText("பாராட்டு ");
                magaram.setText("ஆர்வம்  ");
                kumbam.setText("உதவி ");
                menam.setText("பக்தி");
                break;
            case "2024-10-11":

                text_view_tamil_date.setText("26 - ஆவணி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("வளர்பிறை -  மஹாநவமி. சரஸ்வதி பூஜை. ஆயுத பூஜை. அரசு விடுமுறை. ");
                astami_navami.setText("அஷ்டமி (கா. 07.22) உத்திராடம் (கா.01.42 ) ");

                nalla_neaream_kalai.setText("12:15 - 1:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("பெருமை ");
                resabam.setText("அமைதி ");
                methunam.setText("ஜெயம் ");
                kadagam.setText("சினம் ");
                simamam.setText("போட்டி ");
                kanni.setText("தெளிவு ");
                thulam.setText("இன்பம் ");
                viruchagam.setText("சாதனை ");
                thanusu.setText("விவேகம் ");
                magaram.setText("மேன்மை ");
                kumbam.setText("மகிழ்ச்சி ");
                menam.setText("சாந்தம்");
                break;
            case "2024-10-12":

                text_view_tamil_date.setText("27 - ஆவணி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("வளர்பிறை - திருவோண விரதம். விஜயதசமி. அரசு விடுமுறை.");
                astami_navami.setText("நவமி (கா. 06.08) தசமி (கா. 04.36) திருவோணம் (கா.12.54) ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("பாராட்டு ");
                resabam.setText("பரிவு ");
                methunam.setText("நன்மை ");
                kadagam.setText("பகை ");
                simamam.setText("யோகம் ");
                kanni.setText("வரவு ");
                thulam.setText("நலம் ");
                viruchagam.setText("மேன்மை ");
                thanusu.setText("சிந்தனை ");
                magaram.setText("கவனம்  ");
                kumbam.setText("பெருமை");
                menam.setText("பயணம்");
                break;
            case "2024-10-13":

                text_view_tamil_date.setText("28 - ஆவணி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("வளர்பிறை - ஸர்வ ஏகாதசி. ");
                astami_navami.setText("ஏகாதசி (கா. 02.44) அவிட்டம் (மா. 11.48)");

                nalla_neaream_kalai.setText("8:00 - 9:00 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("காரியசித்தி ");
                resabam.setText("நற்சொல் ");
                methunam.setText("சினம் ");
                kadagam.setText("கவனம் ");
                simamam.setText("பாசம் ");
                kanni.setText("நம்பிக்கை ");
                thulam.setText("நலம் ");
                viruchagam.setText("நிம்மதி ");
                thanusu.setText("வரவு  ");
                magaram.setText("லாபம் ");
                kumbam.setText("பக்தி");
                menam.setText(" மறதி");
                break;
            case "2024-10-14":

                text_view_tamil_date.setText("29 - ஆவணி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("வளர்பிறை  ");
                astami_navami.setText(" துவாதசி (கா. 12.37) சதயம் (மா. 10.26)");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("ஆர்வம் ");
                resabam.setText("உதவி ");
                methunam.setText("அலைச்சல்    ");
                kadagam.setText("ஆக்கம்  ");
                simamam.setText("குழப்பம்  ");
                kanni.setText("ஜெயம்  ");
                thulam.setText("பாசம் ");
                viruchagam.setText("புகழ்  ");
                thanusu.setText("நம்பிக்கை ");
                magaram.setText("பரிவு  ");
                kumbam.setText("வெற்றி");
                menam.setText("சினம்");
                break;
            case "2024-10-15":

                text_view_tamil_date.setText("30 - ஆவணி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை - பிரதோஷம். கரிநாள்.  ");
                astami_navami.setText("திரயோதசி (மா. 10.20) பூரட்டாதி (மா. 08.52)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("தொல்லை ");
                resabam.setText("சிக்கல் ");
                methunam.setText("பக்தி ");
                kadagam.setText("லாபம் ");
                simamam.setText("நிம்மதி ");
                kanni.setText("பரிவு ");
                thulam.setText("ஆக்கம் ");
                viruchagam.setText("இன்பம் ");
                thanusu.setText("நற்செயல் ");
                magaram.setText("நஷ்டம்");
                kumbam.setText("உற்சாகம்");
                menam.setText("உதவி");
                break;
            case "2024-10-16":

                text_view_tamil_date.setText("31 -  ஆவணி, குரோதி");
                tamil_day.setText("புதன் ");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("சதுர்த்தசி (மா. 07.55) உத்திரட்டாதி (மா.07.13) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("நன்மை ");
                resabam.setText("பாசம் ");
                methunam.setText("தாமதம் ");
                kadagam.setText("நட்பு ");
                simamam.setText("சாதனை ");
                kanni.setText("உயர்வு ");
                thulam.setText("நஷ்டம் ");
                viruchagam.setText("அமைதி ");
                thanusu.setText("ஆர்வம் ");
                magaram.setText("நலம் ");
                kumbam.setText("வெற்றி ");
                menam.setText("கோபம்");
                break;
            case "2024-10-17":

                text_view_tamil_date.setText("1 - புரட்டாசி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("வளர்பிறை - பௌர்ணமி. ");
                astami_navami.setText("பௌர்ணமி (மா. 05.25) ரேவதி (மா. 05.36)");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("வரவு ");
                resabam.setText("ஆக்கம்  ");
                methunam.setText("நன்மை ");
                kadagam.setText("உதவி ");
                simamam.setText("சுகம் ");
                kanni.setText("வாழ்வு ");
                thulam.setText("கவனம்  ");
                viruchagam.setText("நலம் ");
                thanusu.setText("பயம் ");
                magaram.setText("புகழ் ");
                kumbam.setText("லாபம்");
                menam.setText("ஜெயம்");
                break;
            case "2024-10-18":
                text_view_tamil_date.setText("1 - ஐப்பசி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("பிரதமை (மா. 03.16) அசுபதி (மா.04.01)  ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("2:00 - 3:00 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("பெருமை ");
                resabam.setText("இன்பம் ");
                methunam.setText("உற்சாகம்  ");
                kadagam.setText("நலம் ");
                simamam.setText("அமைதி ");
                kanni.setText("புகழ் ");
                thulam.setText("பாசம் ");
                viruchagam.setText("சுபம் ");
                thanusu.setText("போட்டி ");
                magaram.setText("சாந்தம்  ");
                kumbam.setText("விவேகம் ");
                menam.setText("மேன்மை");
                break;
            case "2024-10-19":
                text_view_tamil_date.setText("2 - ஐப்பசி குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("தேய்பிறை - கார்த்திகை விரதம்.");
                astami_navami.setText("துவிதியை (மா. 01.07) பரணி (மா. 02.35) ");

                nalla_neaream_kalai.setText("7:45 -8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("இன்சொல் ");
                resabam.setText("பரிவு ");
                methunam.setText("முயற்சி ");
                kadagam.setText("தெளிவு ");
                simamam.setText("அனுகூலம் ");
                kanni.setText("புகழ் ");
                thulam.setText("உதவி ");
                viruchagam.setText("மகிழ்ச்சி ");
                thanusu.setText("கோபம் ");
                magaram.setText("பெருமை  ");
                kumbam.setText(" சுகம்");
                menam.setText("வெற்றி");
                break;
            case "2024-10-20":
                text_view_tamil_date.setText("3 -ஐப்பசி குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை -  சங்கடஹர சதுர்த்தி. ");
                astami_navami.setText("திரிதியை (கா. 11.09) கார்த்திகை (மா. 01.23) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm ");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("ஜெயம் ");
                resabam.setText("வரவு ");
                methunam.setText("சோர்வு  ");
                kadagam.setText("பயம் ");
                simamam.setText("உழைப்பு ");
                kanni.setText("களிப்பு ");
                thulam.setText("நன்மை ");
                viruchagam.setText("சாதனை ");
                thanusu.setText("லாபம் ");
                magaram.setText("அச்சம் ");
                kumbam.setText("ஆர்வம்");
                menam.setText("யோகம் ");
                break;
            case "2024-10-21":

                text_view_tamil_date.setText("4 - ஐப்பசி குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம்.");
                astami_navami.setText("சதுர்த்தி (கா. 09.31) ரோகிணி (மா. 01.16)");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("பணிவு ");
                resabam.setText("போட்டி ");
                methunam.setText("மேன்மை ");
                kadagam.setText("முயற்சி ");
                simamam.setText("பரிசு ");
                kanni.setText("பக்தி ");
                thulam.setText("செலவு ");
                viruchagam.setText("நட்பு ");
                thanusu.setText("பாராட்டு ");
                magaram.setText("குழப்பம் ");
                kumbam.setText("அனுகூலம் ");
                menam.setText("பேராசை");
                break;
            case "2024-10-22":

                text_view_tamil_date.setText("5 - ஐப்பசி குரோதி");
                tamil_day.setText("செவ்வாய் ");

                theiperai_valarperai.setText("தேய்பிறை - கரிநாள். ");
                astami_navami.setText(" பஞ்சமி (கா. 08.12) மிருகசீருஷம் (கா. 11.55)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("நேர்மை  ");
                resabam.setText("வெற்றி  ");
                methunam.setText("ஆதரவு  ");
                kadagam.setText("ஆதாயம்  ");
                simamam.setText("தேர்ச்சி  ");
                kanni.setText("நட்பு ");
                thulam.setText("பொறுமை ");
                viruchagam.setText("சிந்தனை  ");
                thanusu.setText("நன்மை ");
                magaram.setText("விருத்தி  ");
                kumbam.setText("களிப்பு");
                menam.setText("மேன்மை");
                break;
            case "2024-10-23":
                text_view_tamil_date.setText("6 - ஐப்பசி குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("ஷஷ்டி (கா.07.21) திருவாதிரை (கா.11.48)");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("ஓய்வு ");
                resabam.setText("சாந்தம் ");
                methunam.setText("உழைப்பு ");
                kadagam.setText("உற்சாகம் ");
                simamam.setText("எதிர்ப்பு ");
                kanni.setText("லாபம் ");
                thulam.setText("ஜெயம் ");
                viruchagam.setText("செலவு ");
                thanusu.setText("தனம் ");
                magaram.setText("பரிவு ");
                kumbam.setText("சுகம் ");
                menam.setText("அனுகூலம்");
                break;
            case "2024-10-24":

                text_view_tamil_date.setText("7 -ஐப்பசி குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("ஸப்தமி (கா. 06.59) புனர்பூசம் (மா.12.10)  ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("ஆர்வம் ");
                resabam.setText("அசதி   ");
                methunam.setText("பாராட்டு  ");
                kadagam.setText("நட்பு   ");
                simamam.setText("வெற்றி  ");
                kanni.setText("நிம்மதி  ");
                thulam.setText("சோதனை   ");
                viruchagam.setText("ஆக்கம் ");
                thanusu.setText("நலம் ");
                magaram.setText("சிந்தனை ");
                kumbam.setText("பரிசு ");
                menam.setText("அச்சம் ");
                break;
            case "2024-10-25":

                text_view_tamil_date.setText("8 -ஐப்பசி குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText(" அஷ்டமி (கா. 07.06) பூசம் (மா.01.00) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("தடங்கல்  ");
                resabam.setText("நஷ்டம்  ");
                methunam.setText("வெற்றி   ");
                kadagam.setText("ஆர்வம்  ");
                simamam.setText("புகழ்  ");
                kanni.setText("சுபம் ");
                thulam.setText("தோல்வி ");
                viruchagam.setText("பயம் ");
                thanusu.setText("லாபம் ");
                magaram.setText("களிப்பு  ");
                kumbam.setText("வரவு ");
                menam.setText(" காரியசித்தி ");
                break;
            case "2024-10-26":
                text_view_tamil_date.setText("9 -ஐப்பசி குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("நவமி (கா. 07.44) ஆயில்யம் (மா.02.22)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 -11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("புகழ்  ");
                resabam.setText("இன்பம்  ");
                methunam.setText("உதவி  ");
                kadagam.setText("பொறுமை  ");
                simamam.setText("பாராட்டு ");
                kanni.setText("ஏமாற்றம் ");
                thulam.setText("வெற்றி  ");
                viruchagam.setText("சோதனை  ");
                thanusu.setText("அலைச்சல்  ");
                magaram.setText("மேன்மை ");
                kumbam.setText("சுபம் ");
                menam.setText("நன்மை ");
                break;
            case "2024-10-27":

                text_view_tamil_date.setText("10 -ஐப்பசி குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("தசமி (கா. 08.54) மகம் (மா. 04.10)");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3:15 - 4:15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("நிறைவு  ");
                resabam.setText("மேன்மை  ");
                methunam.setText("ஆதாயம்  ");
                kadagam.setText("அசதி  ");
                simamam.setText("நற்செயல்  ");
                kanni.setText("உயர்வு ");
                thulam.setText("வரவு ");
                viruchagam.setText("ஆக்கம் ");
                thanusu.setText("அனுகூலம் ");
                magaram.setText("நட்பு ");
                kumbam.setText("நஷ்டம் ");
                menam.setText("ஜெயம் ");
                break;
            case "2024-10-28":

                text_view_tamil_date.setText("11 -ஐப்பசி குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை - ஸர்வ ஏகாதசி. வாஸ்து நாள். ");
                astami_navami.setText("ஏகாதசி (கா. 10.27) பூரம் (மா. 06.22) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("09:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("நிறைவு ");
                resabam.setText("மேன்மை  ");
                methunam.setText("அமைதி  ");
                kadagam.setText("அசதி  ");
                simamam.setText("நற்செயல் ");
                kanni.setText("உயர்வு  ");
                thulam.setText("வரவு  ");
                viruchagam.setText("ஆக்கம் ");
                thanusu.setText("அனுகூலம் ");
                magaram.setText("நட்பு");
                kumbam.setText("நஷ்டம் ");
                menam.setText("ஜெயம் ");
                break;
            case "2024-10-29":

                text_view_tamil_date.setText("12 - ஐப்பசி குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("தேய்பிறை - பிரதோஷம். ");
                astami_navami.setText("துவாதசி (மா. 12.20) உத்திரம் (மா.08.48) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 -11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("மறதி  ");
                resabam.setText("ஓய்வு ");
                methunam.setText("பாராட்டு  ");
                kadagam.setText("சோதனை  ");
                simamam.setText("சாந்தம்  ");
                kanni.setText("குழப்பம் ");
                thulam.setText("ஊக்கம் ");
                viruchagam.setText("ஜெயம்   ");
                thanusu.setText("நலம்  ");
                magaram.setText("பொறுமை ");
                kumbam.setText("பயணம்  ");
                menam.setText("நன்மை");
                break;
            case "2024-10-30":

                text_view_tamil_date.setText("13 - ஐப்பசி குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("தேய்பிறை - மாதசிவராத்திரி. பசும்பொன் முத்துராமலிங்க தேவர் ஜெயந்தி.");
                astami_navami.setText(" திரயோதசி (மா. 02.21) ஹஸ்தம் (மா. 11.22)  ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("லாபம் ");
                resabam.setText("பிரீதி ");
                methunam.setText("நலம்  ");
                kadagam.setText("வெற்றி  ");
                simamam.setText("உயர்வு  ");
                kanni.setText("ஆர்வம்  ");
                thulam.setText("களிப்பு  ");
                viruchagam.setText("சிக்கல்  ");
                thanusu.setText("பகை  ");
                magaram.setText("சிந்தனை  ");
                kumbam.setText("மேன்மை  ");
                menam.setText(" ஓய்வு  ");
                break;
            case "2024-10-31":

                text_view_tamil_date.setText("14 - ஐப்பசி குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை - தீபாவளிப் பண்டிகை. அரசு விடுமுறை. சுபமுகூர்த்தம். ");
                astami_navami.setText("சதுர்த்தசி (மா. 04.28) சித்திரை (கா.01.55) ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("பாராட்டு ");
                resabam.setText("பொறுமை  ");
                methunam.setText("போட்டி  ");
                kadagam.setText("வெற்றி ");
                simamam.setText("நற்செயல் ");
                kanni.setText("சுகம் ");
                thulam.setText("நலம் ");
                viruchagam.setText("முயற்சி");
                thanusu.setText("பேராசை ");
                magaram.setText("புகழ் ");
                kumbam.setText("உயர்வு ");
                menam.setText(" ஆதரவு");
                break;

            /*******************************************************11.november ************************************************************************************/

            case "2024-11-01":

                text_view_tamil_date.setText("15 - ஐப்பசி குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("தேய்பிறை -ஸர்வ அமாவாஸ்யை.  ");
                astami_navami.setText("அமாவாஸ்யை (மா. 06.25) சுவாதி (கா. 04.18) ");

                nalla_neaream_kalai.setText("9:45 -10:30 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("போட்டி ");
                resabam.setText("செலவு ");
                methunam.setText("சிக்கல் ");
                kadagam.setText("லாபம்  ");
                simamam.setText("முயற்சி ");
                kanni.setText("விவேகம் ");
                thulam.setText("வரவு ");
                viruchagam.setText("சிந்தனை  ");
                thanusu.setText("கோபம்  ");
                magaram.setText("வெற்றி  ");
                kumbam.setText("எதிர்ப்பு");
                menam.setText("நற்செயல்");
                break;
            case "2024-11-02":

                text_view_tamil_date.setText("16 - ஐப்பசி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("வளர்பிறை - கந்த ஷஷ்டி விழா தொடக்கம்.");
                astami_navami.setText("பிரதமை (மா08.06) விசாகம் (முழுவதும்)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("04.45 -05.45 pm ");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("வரவு ");
                resabam.setText("முயற்சி ");
                methunam.setText("நன்மை ");
                kadagam.setText("பக்தி  ");
                simamam.setText("மேன்மை  ");
                kanni.setText("பாராட்டு  ");
                thulam.setText("நலம் ");
                viruchagam.setText("சிக்கல்  ");
                thanusu.setText("சினம்  ");
                magaram.setText("செலவு ");
                kumbam.setText("பாசம் ");
                menam.setText("பணிவு ");
                break;
            case "2024-11-03":
                text_view_tamil_date.setText("17 - ஐப்பசி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("வளர்பிறை - சந்திர தரிசனம். ");
                astami_navami.setText("துவிதியை (மா. 09.30) விசாகம் (கா.06.14)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("04:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("கவனம் ");
                resabam.setText("நட்பு ");
                methunam.setText("நற்செயல்  ");
                kadagam.setText("போட்டி   ");
                simamam.setText("பக்தி ");
                kanni.setText("இரக்கம் ");
                thulam.setText("வரவு ");
                viruchagam.setText("சுபம் ");
                thanusu.setText("உற்சாகம் ");
                magaram.setText("உழைப்பு  ");
                kumbam.setText("மறதி");
                menam.setText("சினம்");
                break;
            case "2024-11-04":
                text_view_tamil_date.setText("18 - ஐப்பசி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText("திரிதியை (மா. 10.11) அனுஷம் (கா.07.57)  ");

                nalla_neaream_kalai.setText("06:15 - 7:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("ஆர்வம்  ");
                resabam.setText("பணிவு  ");
                methunam.setText("பாசம்  ");
                kadagam.setText("செலவு ");
                simamam.setText("அனுகூலம்  ");
                kanni.setText("நலம்  ");
                thulam.setText("பெருமை ");
                viruchagam.setText("வரவு ");
                thanusu.setText("சினம் ");
                magaram.setText("சிந்தனை ");
                kumbam.setText("சாந்தம்");
                menam.setText("அமைதி");
                break;
            case "2024-11-05":

                text_view_tamil_date.setText("19 - ஐப்பசி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை - சதுர்த்தி விரதம். கரிநாள். ");
                astami_navami.setText("சதுர்த்தி (மா. 10.29) கேட்டை (கா.09.06) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.30 -5.00 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("வெற்றி ");
                resabam.setText("செலவு ");
                methunam.setText("தெளிவு ");
                kadagam.setText("பயம் ");
                simamam.setText("தடங்கல் ");
                kanni.setText("மேன்மை ");
                thulam.setText("சோதனை ");
                viruchagam.setText("முயற்சி ");
                thanusu.setText("நலம் ");
                magaram.setText("சிரமம்");
                kumbam.setText("ஈகை");
                menam.setText("உழைப்பு");
                break;
            case "2024-11-06":
                text_view_tamil_date.setText("20 - ஐப்பசி, குரோதி");
                tamil_day.setText("புதன் ");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("பஞ்சமி (மா. 10.15) மூலம் (கா.09.46) ");

                nalla_neaream_kalai.setText("9:45 - 10:30 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("சுகம்  ");
                resabam.setText("பக்தி  ");
                methunam.setText("ஓய்வு  ");
                kadagam.setText("பரிவு ");
                simamam.setText("பாசம்   ");
                kanni.setText("நட்பு ");
                thulam.setText("நன்மை  ");
                viruchagam.setText("செலவு  ");
                thanusu.setText("ஆதரவு   ");
                magaram.setText("வெற்றி   ");
                kumbam.setText("போட்டி  ");
                menam.setText("பொறாமை");
                break;
            case "2024-11-07":
                text_view_tamil_date.setText("21 - ஐப்பசி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("வளர்பிறை -ஷஷ்டி விரதம். சகல சுப்ரமணிய ஸ்தலங்களில் கந்த ஷஷ்டி சூரசம்ஹார விழா. சுபமுகூர்த்தம் ");
                astami_navami.setText("ஷஷ்டி (மா. 09.32) பூராடம் (கா. 09.55)  ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("துணிவு ");
                resabam.setText("செலவு  ");
                methunam.setText("இன்பம் ");
                kadagam.setText("லாபம்   ");
                simamam.setText("யோகம்   ");
                kanni.setText("துன்பம்  ");
                thulam.setText("உற்சாகம்  ");
                viruchagam.setText("பொறுமை   ");
                thanusu.setText("பயணம்   ");
                magaram.setText("சாந்தம்  ");
                kumbam.setText("வெற்றி  ");
                menam.setText("உயர்வு ");
                break;
            case "2024-11-08":

                text_view_tamil_date.setText("22 - ஐப்பசி, குரோதி");
                tamil_day.setText("வெள்ளி ");

                theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம். திருவோண விரதம். ");
                astami_navami.setText("ஸப்தமி (மா.08.22) உத்திராடம் (கா. 09.37)  ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:00 - 1:00 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("செலவு   ");
                resabam.setText("துணிவு ");
                methunam.setText(" முயற்சி  ");
                kadagam.setText("பயணம்  ");
                simamam.setText("வெற்றி  ");
                kanni.setText("லாபம்  ");
                thulam.setText(" கவனம்   ");
                viruchagam.setText("கீர்த்தி  ");
                thanusu.setText("பயம்  ");
                magaram.setText("பொறுமை ");
                kumbam.setText("ஆக்கம் ");
                menam.setText("நிம்மதி ");
                break;
            case "2024-11-09":

                text_view_tamil_date.setText("23 - ஐப்பசி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("அஷ்டமி (மா.06.50) திருவோணம் (கா.08.55)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("உதவி ");
                resabam.setText("வரவு  ");
                methunam.setText("பயம்  ");
                kadagam.setText("நன்மை  ");
                simamam.setText("தாமதம்  ");
                kanni.setText("உயர்வு  ");
                thulam.setText("இன்பம்  ");
                viruchagam.setText("பரிசு  ");
                thanusu.setText("பெருமை  ");
                magaram.setText("ஆதாயம்    ");
                kumbam.setText("புகழ் ");
                menam.setText("முயற்சி");
                break;
            case "2024-11-10":
                text_view_tamil_date.setText("24 - ஐப்பசி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("வளர்பிறை -  ராஜராஜ சோழன் சதய விழா.  ");
                astami_navami.setText("நவமி (மா.04.59) அவிட்டம் (கா.07.53) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("வெற்றி ");
                resabam.setText("எதிர்ப்பு ");
                methunam.setText("அசதி ");
                kadagam.setText("சிக்கல் ");
                simamam.setText("வரவு ");
                kanni.setText("சுகம்  ");
                thulam.setText("தாமதம்  ");
                viruchagam.setText("மகிழ்ச்சி ");
                thanusu.setText("தடங்கல் ");
                magaram.setText("நட்பு  ");
                kumbam.setText("பயம் ");
                menam.setText("கவலை");
                break;
            case "2024-11-11":

                text_view_tamil_date.setText("25 - ஐப்பசி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("தசமி (மா. 03.03) சதயம் (கா. 06.33) பூரட்டாதி (கா.04.46) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("உயர்வு");
                resabam.setText("அசதி ");
                methunam.setText("லாபம் ");
                kadagam.setText("செலவு ");
                simamam.setText("சுகம் ");
                kanni.setText("கவலை ");
                thulam.setText("மேன்மை ");
                viruchagam.setText("ஜெயம் ");
                thanusu.setText("நட்பு ");
                magaram.setText("பொறுமை ");
                kumbam.setText("கவனம் ");
                menam.setText("தனம்");
                break;
            case "2024-11-12":

                text_view_tamil_date.setText("26 - ஐப்பசி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை - ஸர்வ ஏகாதசி. ");
                astami_navami.setText("ஏகாதசி  (மா. 12.42) உத்திரட்டாதி  (கா.03.30) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("ஆதாயம்");
                resabam.setText("சுகம் ");
                methunam.setText("அசதி ");
                kadagam.setText("கவலை ");
                simamam.setText("தாமதம் ");
                kanni.setText("லாபம் ");
                thulam.setText("புகழ் ");
                viruchagam.setText("ஆக்கம் ");
                thanusu.setText("நன்மை ");
                magaram.setText("செலவு  ");
                kumbam.setText("சிந்தனை");
                menam.setText("பரிசு");
                break;
            case "2024-11-13":

                text_view_tamil_date.setText("27 - ஐப்பசி, குரோதி");
                tamil_day.setText("புதன் ");

                theiperai_valarperai.setText("வளர்பிறை - பிரதோஷம். ");
                astami_navami.setText("துவாதசி (கா. 10.21) ரேவதி (கா.01.51)");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("வரவு");
                resabam.setText("தாமதம் ");
                methunam.setText("செலவு ");
                kadagam.setText("ஆதரவு ");
                simamam.setText("அசதி ");
                kanni.setText("வெற்றி ");
                thulam.setText("வருத்தம் ");
                viruchagam.setText("நன்மை ");
                thanusu.setText("ஆர்வம்  ");
                magaram.setText("போட்டி ");
                kumbam.setText("அமைதி");
                menam.setText("உயர்வு");
                break;
            case "2024-11-14":

                text_view_tamil_date.setText("28 - ஐப்பசி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("வளர்பிறை  ");
                astami_navami.setText(" திரயோதசி (கா. 08.07) சதுர்த்தசி (கா. 03.52) அசுபதி (கா.12.12)");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("மகிழ்ச்சி");
                resabam.setText("எதிர்ப்பு ");
                methunam.setText("வெற்றி ");
                kadagam.setText("தடங்கல்  ");
                simamam.setText("நட்பு  ");
                kanni.setText("தோல்வி  ");
                thulam.setText("லாபம் ");
                viruchagam.setText("ஊக்கம்  ");
                thanusu.setText("சுகம் ");
                magaram.setText("அசதி  ");
                kumbam.setText("புகழ்");
                menam.setText("ஆக்கம்");
                break;
            case "2024-11-15":

                text_view_tamil_date.setText("29 - ஐப்பசி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("வளர்பிறை - பௌர்ணமி.  ");
                astami_navami.setText("பௌர்ணமி (கா. 03.42) பரணி (மா. 10.45) ");

                nalla_neaream_kalai.setText("12:15 - 1:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("ஆதரவு");
                resabam.setText("சிக்கல் ");
                methunam.setText("சிரமம் ");
                kadagam.setText("அசதி ");
                simamam.setText("லாபம் ");
                kanni.setText("செலவு ");
                thulam.setText("சுகம் ");
                viruchagam.setText("கவலை ");
                thanusu.setText("வெற்றி ");
                magaram.setText("நன்மை");
                kumbam.setText("பயம்");
                menam.setText("வருத்தம்");
                break;
            case "2024-11-16":

                text_view_tamil_date.setText("1 -  கார்த்திகை, குரோதி");
                tamil_day.setText("சனி ");

                theiperai_valarperai.setText("தேய்பிறை - கார்த்திகை விரதம். கரிநாள். ");
                astami_navami.setText("பிரதமை (கா.01.38) கார்த்திகை (மா.09.30)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("முயற்சி");
                resabam.setText("ஓய்வு ");
                methunam.setText("மேன்மை ");
                kadagam.setText("அசதி ");
                simamam.setText("யோகம் ");
                kanni.setText("புகழ் ");
                thulam.setText("நட்பு ");
                viruchagam.setText("போட்டி ");
                thanusu.setText("நஷ்டம் ");
                magaram.setText("வரவு ");
                kumbam.setText("வெற்றி ");
                menam.setText("தனம்");
                break;
            case "2024-11-17":

                text_view_tamil_date.setText("2 - கார்த்திகை, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம். ");
                astami_navami.setText("துவிதியை (கா.12.04) ரோகிணி (மா.08.33) ");

                nalla_neaream_kalai.setText("7.45 -8.45 am");
                nalla_neaream_malai.setText("3.15 -4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("வெற்றி");
                resabam.setText("அமைதி  ");
                methunam.setText("போட்டி ");
                kadagam.setText("களிப்பு ");
                simamam.setText("மறதி ");
                kanni.setText("ஈகை ");
                thulam.setText("தடங்கல்  ");
                viruchagam.setText("பொறுமை ");
                thanusu.setText("ஆதாயம் ");
                magaram.setText("தாமதம் ");
                kumbam.setText("எதிர்ப்பு");
                menam.setText("மகிழ்ச்சி");
                break;
            case "2024-11-18":
                text_view_tamil_date.setText("3 - கார்த்திகை, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை - கரிநாள். ");
                astami_navami.setText("திரிதியை (மா. 10.49) மிருகசீருஷம் (மா. 07.56) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("நன்மை");
                resabam.setText("பயம் ");
                methunam.setText("வெற்றி  ");
                kadagam.setText("கவலை ");
                simamam.setText("வரவு ");
                kanni.setText("துன்பம் ");
                thulam.setText("உறுதி ");
                viruchagam.setText("வீம்பு ");
                thanusu.setText("பெருமை ");
                magaram.setText("செலவு  ");
                kumbam.setText("ஆசை ");
                menam.setText("ஆக்கம்");
                break;
            case "2024-11-19":
                text_view_tamil_date.setText("4 - கார்த்திகை குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("தேய்பிறை - சங்கடஹர சதுர்த்தி.");
                astami_navami.setText("சதுர்த்தி (மா. 10.00) திருவாதிரை (மா.07.15)");

                nalla_neaream_kalai.setText("7:45 -8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("சுகம்");
                resabam.setText("ஆதாயம் ");
                methunam.setText("நன்மை ");
                kadagam.setText("செலவு ");
                simamam.setText("தடங்கல் ");
                kanni.setText("வெற்றி ");
                thulam.setText("ஆதாயம் ");
                viruchagam.setText("புகழ் ");
                thanusu.setText("தோல்வி ");
                magaram.setText("அமைதி  ");
                kumbam.setText(" நலம்");
                menam.setText("உற்சாகம்");
                break;
            case "2024-11-20":
                text_view_tamil_date.setText("5 -கார்த்திகை குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம். ");
                astami_navami.setText("பஞ்சமி (மா.09.41) புனர்பூசம் (மா. 07.54)  ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("ஆர்வம்");
                resabam.setText("நட்பு ");
                methunam.setText("கீர்த்தி  ");
                kadagam.setText("மறதி ");
                simamam.setText("தடங்கல் ");
                kanni.setText("திடம் ");
                thulam.setText("அமைதி ");
                viruchagam.setText("ஜெயம் ");
                thanusu.setText("அன்பு ");
                magaram.setText("பெருமை ");
                kumbam.setText("சிக்கல்");
                menam.setText("உதவி ");
                break;
            case "2024-11-21":

                text_view_tamil_date.setText("6 - கார்த்திகை குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம்.");
                astami_navami.setText("ஷஷ்டி (மா. 09.51) பூசம் (மா. 08.38)");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("வெற்றி");
                resabam.setText("துன்பம் ");
                methunam.setText("தாமதம் ");
                kadagam.setText("நன்மை ");
                simamam.setText("வரவு ");
                kanni.setText("பயம் ");
                thulam.setText("சுபம் ");
                viruchagam.setText("அச்சம் ");
                thanusu.setText("இரக்கம் ");
                magaram.setText("நட்பு ");
                kumbam.setText("ஆதரவு ");
                menam.setText("லாபம்");
                break;
            case "2024-11-22":

                text_view_tamil_date.setText("7 - கார்த்திகை குரோதி");
                tamil_day.setText("வெள்ளி ");

                theiperai_valarperai.setText("தேய்பிறை  ");
                astami_navami.setText(" ஸப்தமி (மா. 10.30) ஆயில்யம் (மா.09.51)  ");

                nalla_neaream_kalai.setText("9:00 - 10:00 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("உழைப்பு ");
                resabam.setText("மேன்மை  ");
                methunam.setText("நட்பு  ");
                kadagam.setText("புகழ்  ");
                simamam.setText("நன்மை  ");
                kanni.setText("தெளிவு ");
                thulam.setText("நலம் ");
                viruchagam.setText("பரிசு  ");
                thanusu.setText("லாபம் ");
                magaram.setText("போட்டி  ");
                kumbam.setText("ஓய்வு");
                menam.setText("ஆதரவு");
                break;
            case "2024-11-23":
                text_view_tamil_date.setText("8 - கார்த்திகை குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("தேய்பிறை - வாஸ்து நாள்.");
                astami_navami.setText("அஷ்டமி (மா. 11.45) மகம் (மா. 11.34) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("வெற்றி");
                resabam.setText("நலம் ");
                methunam.setText("நன்மை ");
                kadagam.setText("பணிவு ");
                simamam.setText("மறதி ");
                kanni.setText("நிம்மதி ");
                thulam.setText("வரவு ");
                viruchagam.setText("பெருமை ");
                thanusu.setText("சோதனை ");
                magaram.setText("புகழ் ");
                kumbam.setText("நற்செயல் ");
                menam.setText("கவனம்");
                break;
            case "2024-11-24":

                text_view_tamil_date.setText("9 -கார்த்திகை குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("நவமி (கா. 01.21) பூரம் (கா.01.37) ");

                nalla_neaream_kalai.setText("6:00 - 7:00 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("பொறாமை");
                resabam.setText("பயம்   ");
                methunam.setText("ஆதரவு  ");
                kadagam.setText("எதிர்ப்பு   ");
                simamam.setText("தடங்கல்  ");
                kanni.setText("ஆதாயம்  ");
                thulam.setText("சாதனை   ");
                viruchagam.setText("பக்தி ");
                thanusu.setText("பணிவு ");
                magaram.setText("லாபம் ");
                kumbam.setText("மறதி ");
                menam.setText("நன்மை ");
                break;
            case "2024-11-25":

                text_view_tamil_date.setText("10 -கார்த்திகை குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை - கரிநாள்.");
                astami_navami.setText(" தசமி (கா. 03.17) உத்திரம் (கா.04.01)");

                nalla_neaream_kalai.setText("6:00 - 7:00 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("மேன்மை ");
                resabam.setText("நேர்மை  ");
                methunam.setText("சிந்தனை   ");
                kadagam.setText("அனுகூலம்  ");
                simamam.setText("உழைப்பு  ");
                kanni.setText("சோதனை ");
                thulam.setText("வெற்றி ");
                viruchagam.setText("போட்டி ");
                thanusu.setText("உறுதி ");
                magaram.setText("ஓய்வு  ");
                kumbam.setText("கவனம் ");
                menam.setText(" நட்பு ");
                break;
            case "2024-11-26":
                text_view_tamil_date.setText("11 -கார்த்திகை குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("தேய்பிறை - ஏகாதசி. ");
                astami_navami.setText("ஏகாதசி 57.49 (கா. 05.23) ஹஸ்தம் 60.00 (முழுவதும்)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4.45 - 5.45 pm");

                gowri_nallaneram_kalai.setText("10:45 -11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("சுகம்");
                resabam.setText("நட்பு  ");
                methunam.setText("வரவு  ");
                kadagam.setText("பக்தி  ");
                simamam.setText("வெற்றி ");
                kanni.setText("பரிசு ");
                thulam.setText("பயம்  ");
                viruchagam.setText("பாராட்டு  ");
                thanusu.setText("பொறாமை  ");
                magaram.setText("ஆதரவு ");
                kumbam.setText("புகழ் ");
                menam.setText("போட்டி ");
                break;
            case "2024-11-27":

                text_view_tamil_date.setText("12 -கார்த்திகை குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம்.");
                astami_navami.setText("துவாதசி (முழுவதும்) ஹஸ்தம் (கா. 06.35) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("தனம்");
                resabam.setText("நலம்  ");
                methunam.setText("ஊக்கம்  ");
                kadagam.setText("புகழ் ");
                simamam.setText("லாபம்  ");
                kanni.setText("பெருமை ");
                thulam.setText("கவனம் ");
                viruchagam.setText("மகிழ்ச்சி ");
                thanusu.setText("கீர்த்தி ");
                magaram.setText("மறதி ");
                kumbam.setText("இன்பம் ");
                menam.setText("இரக்கம் ");
                break;
            case "2024-11-28":

                text_view_tamil_date.setText("13 -கார்த்திகை குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம். பிரதோஷம். ");
                astami_navami.setText("துவாதசி (கா. 07.27) சித்திரை (கா. 09.07)");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("03:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("மகிழ்ச்சி");
                resabam.setText("லாபம்  ");
                methunam.setText("முயற்சி  ");
                kadagam.setText("உயர்வு  ");
                simamam.setText("நன்மை ");
                kanni.setText("வரவு  ");
                thulam.setText("வெற்றி  ");
                viruchagam.setText("சுகம் ");
                thanusu.setText("பயணம் ");
                magaram.setText("பெருமை");
                kumbam.setText("நற்செய்தி ");
                menam.setText("பாராட்டு ");
                break;
            case "2024-11-29":

                text_view_tamil_date.setText("14 - கார்த்திகை குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("தேய்பிறை - சுபமுகூர்த்தம். மாத சிவராத்திரி.  ");
                astami_navami.setText("திரயோதசி (கா.09.23) சுவாதி (கா. 11.32) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4.30 - 5.00 pm");

                gowri_nallaneram_kalai.setText("12:15 -1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("தனம்");
                resabam.setText("சுகம் ");
                methunam.setText("நற்செயல்  ");
                kadagam.setText("நன்மை  ");
                simamam.setText("செலவு  ");
                kanni.setText("மேன்மை ");
                thulam.setText("சாதனை ");
                viruchagam.setText("ஆதாயம்   ");
                thanusu.setText("சாந்தம்  ");
                magaram.setText("புகழ் ");
                kumbam.setText("பக்தி  ");
                menam.setText("உற்சாகம்");
                break;
            case "2024-11-30":

                text_view_tamil_date.setText("15 - கார்த்திகை குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("தேய்பிறை - ஸர்வ அமாவாஸ்யை.");
                astami_navami.setText("சதுர்த்தசி (கா.11.03) விசாகம் (மா.01.39) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3.15 - 4.15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("அமைதி");
                resabam.setText("நட்பு ");
                methunam.setText("புகழ்  ");
                kadagam.setText("சாந்தம்  ");
                simamam.setText("கவனம்  ");
                kanni.setText("பயம்  ");
                thulam.setText("உதவி  ");
                viruchagam.setText("லாபம்  ");
                thanusu.setText("வெற்றி");
                magaram.setText("யோகம்  ");
                kumbam.setText("செலவு  ");
                menam.setText("போட்டி  ");
                break;

            /*******************************************************12.december ************************************************************************************/
            case "2024-12-01":
                text_view_tamil_date.setText("16 - கார்த்திகை குரோதி");
                tamil_day.setText("ஞாயிறு");
                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("அமாவாஸ்யை (மா.12.19) அனுஷம் (மா.03.23) ");
                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3:15 - 4:15 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");
                measam.setText("அமைதி");
                resabam.setText("சிரமம் ");
                methunam.setText("பாசம்  ");
                kadagam.setText("நற்செயல்  ");
                simamam.setText("பாராட்டு");
                kanni.setText("வெற்றி");
                thulam.setText("கவனம் ");
                viruchagam.setText("ஆர்வம்");
                thanusu.setText("சுகம் ");
                magaram.setText("நலம் ");
                kumbam.setText("பயணம் ");
                menam.setText("கீர்த்தி ");
                break;
            case "2024-12-02":
                text_view_tamil_date.setText("17 - கார்த்திகை குரோதி");
                tamil_day.setText("திங்கள்");
                theiperai_valarperai.setText("வளர்பிறை -  சந்திர தரிசனம். கரிநாள்.");
                astami_navami.setText("பிரதமை (மா. 01.06) கேட்டை (மா. 04.38) ");
                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");
                measam.setText("நிம்மதி");
                resabam.setText("நட்பு  ");
                methunam.setText("சுகம்    ");
                kadagam.setText("ஆதாயம் ");
                simamam.setText("தாமதம் ");
                kanni.setText(" விருப்பம் ");
                thulam.setText("தடங்கல் ");
                viruchagam.setText("தேர்ச்சி  ");
                thanusu.setText("வெற்றி  ");
                magaram.setText("நன்மை  ");
                kumbam.setText("புகழ் ");
                menam.setText("பக்தி ");
                break;
            case "2024-12-03":
                text_view_tamil_date.setText("18 - கார்த்திகை குரோதி");
                tamil_day.setText("செவ்வாய்");
                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("துவிதியை (மா. 01.21) மூலம் (மா.05.23) ");
                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("5:00 - 6:00 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");
                measam.setText("ஓய்வு");
                resabam.setText("குழப்பம் ");
                methunam.setText("நலம் ");
                kadagam.setText("வெற்றி ");
                simamam.setText("சுகம் ");
                kanni.setText(" நட்பு ");
                thulam.setText("அமைதி ");
                viruchagam.setText("கவனம்  ");
                thanusu.setText("முயற்சி  ");
                magaram.setText("ஆர்வம்  ");
                kumbam.setText("பயம் ");
                menam.setText("எதிர்ப்பு  ");
                break;
            case "2024-12-04":
                text_view_tamil_date.setText("19 - கார்த்திகை குரோதி");
                tamil_day.setText("புதன்");
                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText("திரிதியை (மா. 01.08) பூராடம் (மா.05.40) ");
                nalla_neaream_kalai.setText("9:15 - 11:30 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");
                measam.setText("நன்மை");
                resabam.setText("பக்தி ");
                methunam.setText("வெற்றி  ");
                kadagam.setText("சுகம் ");
                simamam.setText("பயம்  ");
                kanni.setText("பாராட்டு  ");
                thulam.setText("குழப்பம்  ");
                viruchagam.setText("பயணம்  ");
                thanusu.setText("அமைதி  ");
                magaram.setText("விவேகம்  ");
                kumbam.setText("அன்பு ");
                menam.setText("சிரமம் ");
                break;
            case "2024-12-05":
                text_view_tamil_date.setText("20 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("வியாழன்");
                theiperai_valarperai.setText("வளர்பிறை-சுபமுகூர்த்தம். சதுர்த்தி விரதம். திருவோண விரதம்.  ");
                astami_navami.setText("சதுர்த்தி (மா. 12.24) உத்திராடம் (மா. 05.27)  ");
                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");
                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");
                measam.setText("நிறைவு");
                resabam.setText("பயம்  ");
                methunam.setText("முயற்சி  ");
                kadagam.setText("பாசம்  ");
                simamam.setText("ஓய்வு  ");
                kanni.setText(" வெற்றி ");
                thulam.setText("நன்மை  ");
                viruchagam.setText("சிந்தனை  ");
                thanusu.setText("செலவு ");
                magaram.setText("அமைதி  ");
                kumbam.setText("வரவு  ");
                menam.setText("சாதனை ");
                break;
            case "2024-12-06":
                text_view_tamil_date.setText("21 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("வெள்ளி");
                theiperai_valarperai.setText("வளர்பிறை-ஷஷ்டி விரதம்.  ");
                astami_navami.setText("பஞ்சமி (கா. 11.14) திருவோணம் (மா.04.50) ");
                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");
                measam.setText("செலவு");
                resabam.setText("பாராட்டு ");
                methunam.setText("வரவு ");
                kadagam.setText("கவலை ");
                simamam.setText("மேன்மை ");
                kanni.setText("தாமதம்  ");
                thulam.setText("நோய்  ");
                viruchagam.setText("ஆதரவு  ");
                thanusu.setText("வெற்றி");
                magaram.setText(" பக்தி ");
                kumbam.setText("நன்மை");
                menam.setText("அமைதி");
                break;
            case "2024-12-07":
                text_view_tamil_date.setText("22 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("சனி");
                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText(" ஷஷ்டி (கா.09.42) அவிட்டம் (மா.03.52)  ");
                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");
                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");
                measam.setText("மகிழ்ச்சி");
                resabam.setText("தாமதம் ");
                methunam.setText("சுகம் ");
                kadagam.setText("வரவு ");
                simamam.setText("சிக்கல் ");
                kanni.setText(" முயற்சி  ");
                thulam.setText("எதிர்ப்பு  ");
                viruchagam.setText("வெற்றி  ");
                thanusu.setText("ஆதரவு  ");
                magaram.setText("பயம்   ");
                kumbam.setText("நட்பு ");
                menam.setText(" தடங்கல்");
                break;
            case "2024-12-08":
                text_view_tamil_date.setText("23 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("ஞாயிறு");
                theiperai_valarperai.setText("வளர்பிறை - தேவமாதா கருவுற்ற திருநாள். ");
                astami_navami.setText("ஸப்தமி (கா.07.52) அஷ்டமி (கா.04.16) சதயம் (மா. 02.37) ");
                nalla_neaream_kalai.setText("7:45 - 7:45 am");
                nalla_neaream_malai.setText("3:15 - 4:15 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");
                measam.setText("உற்சாகம்");
                resabam.setText(" விவேகம்  ");
                methunam.setText("நன்மை  ");
                kadagam.setText("ஆதரவு  ");
                simamam.setText("போட்டி  ");
                kanni.setText(" பணிவு ");
                thulam.setText("நற்சொல் ");
                viruchagam.setText("கவலை ");
                thanusu.setText(" மேன்மை ");
                magaram.setText(" சுகம்  ");
                kumbam.setText("வரவு  ");
                menam.setText("எதிர்ப்பு   ");
                break;
            case "2024-12-09":
                text_view_tamil_date.setText("24 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("திங்கள்");
                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText("நவமி (கா. 03.32) பூரட்டாதி (மா. 01.09)");
                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");
                measam.setText("விருத்தி");
                resabam.setText("தனம் ");
                methunam.setText("மேன்மை  ");
                kadagam.setText("நலம்  ");
                simamam.setText("ஓய்வு ");
                kanni.setText("நன்மை ");
                thulam.setText("இன்பம்  ");
                viruchagam.setText("மறதி  ");
                thanusu.setText("நிம்மதி  ");
                magaram.setText("ஜெயம்  ");
                kumbam.setText("அமைதி   ");
                menam.setText("முயற்சி ");
                break;
            case "2024-12-10":
                text_view_tamil_date.setText("25 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("செவ்வாய்");
                theiperai_valarperai.setText("வளர்பிறை");
                astami_navami.setText(" தசமி (கா. 01.13) உத்திரட்டாதி (கா.11.34)  ");
                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");
                measam.setText("ஆதாயம்");
                resabam.setText(" ஜெயம் ");
                methunam.setText(" நன்மை ");
                kadagam.setText(" நிம்மதி  ");
                simamam.setText(" உதவி ");
                kanni.setText("  அமைதி ");
                thulam.setText(" புகழ் ");
                viruchagam.setText(" சுகம் ");
                thanusu.setText(" லாபம்");
                magaram.setText(" வெற்றி ");
                kumbam.setText(" வரவு  ");
                menam.setText(" களிப்பு ");
                break;
            case "2024-12-11":
                text_view_tamil_date.setText("26 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("புதன்");
                theiperai_valarperai.setText("வளர்பிறை-  ஸர்வ ஏகாதசி. ");
                astami_navami.setText(" ஏகாதசி (மா. 10.54)ரேவதி (கா. 09.57) ");
                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("11:15 - 12:00 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");
                measam.setText("ஊக்கம்");
                resabam.setText(" அமைதி ");
                methunam.setText(" ஓய்வு ");
                kadagam.setText("பக்தி ");
                simamam.setText(" தனம் ");
                kanni.setText(" போட்டி ");
                thulam.setText(" அசதி");
                viruchagam.setText("சினம்  ");
                thanusu.setText("நற்செயல் ");
                magaram.setText(" பணிவு ");
                kumbam.setText(" ஆர்வம் ");
                menam.setText(" சாதனை  ");
                break;
            case "2024-12-12":
                text_view_tamil_date.setText("27 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("வியாழன்");
                theiperai_valarperai.setText("வளர்பிறை-பரணி தீபம்.  ");
                astami_navami.setText("துவாதசி (மா. 08.37) அசுபதி (கா.08.19) ");
                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");
                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");
                measam.setText("முயற்சி");
                resabam.setText("இன்பம் ");
                methunam.setText(" புகழ்  ");
                kadagam.setText("செலவு ");
                simamam.setText("சுகம்  ");
                kanni.setText("வெற்றி ");
                thulam.setText("உறுதி  ");
                viruchagam.setText("சுபம்  ");
                thanusu.setText("தனம்  ");
                magaram.setText("பக்தி  ");
                kumbam.setText("தாமதம்  ");
                menam.setText(" அன்பு ");
                break;
            case "2024-12-13":
                text_view_tamil_date.setText("28 - கார்த்திகை, சோபகிருதம்");
                tamil_day.setText("வெள்ளி");
                theiperai_valarperai.setText("வளர்பிறை - பிரதோஷம். திருக்கார்த்திகை. திருவண்ணாமலை ஸ்ரீஅருணாச்சலநாயகர் ஜோதி ஸ்வரூபமாய் மகாதீப ஜோதி தரிசனம். மலைதீபம். ");
                astami_navami.setText(" திரயோதசி (மா. 06.35) பரணி (கா. 06.50) கார்த்திகை (கா. 04.56) ");
                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");
                measam.setText("அன்பு");
                resabam.setText("செலவு  ");
                methunam.setText("நன்மை  ");
                kadagam.setText("ஈகை  ");
                simamam.setText("முயற்சி  ");
                kanni.setText(" உதவி  ");
                thulam.setText("சுகம்  ");
                viruchagam.setText("பரிவு   ");
                thanusu.setText("பெருமை  ");
                magaram.setText("சிக்கல்  ");
                kumbam.setText("சினம்  ");
                menam.setText("தனம் ");
                break;
            case "2024-12-14":

                text_view_tamil_date.setText("29 - கார்த்திகை, குரோதி");
                tamil_day.setText("சனி");
                theiperai_valarperai.setText("வளர்பிறை ");
                astami_navami.setText("சதுர்த்தசி (மா.04.16) ரோகிணி (கா.04.26)  ");
                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");
                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");
                measam.setText("சிக்கல்");
                resabam.setText("பக்தி ");
                methunam.setText("எதிர்ப்பு  ");
                kadagam.setText("வெற்றி  ");
                simamam.setText("விருப்பம் ");
                kanni.setText(" ஜெயம் ");
                thulam.setText("நட்பு ");
                viruchagam.setText("தெளிவு ");
                thanusu.setText("மகிழ்ச்சி");
                magaram.setText("தாமதம்  ");
                kumbam.setText("சுகம்  ");
                menam.setText("வரவு  ");
                break;
            case "2024-12-15":
                text_view_tamil_date.setText("30 - கார்த்திகை, குரோதி");
                tamil_day.setText("ஞாயிறு");
                theiperai_valarperai.setText("பௌர்ணமி. பாஞ்சராத்திர தீபம். ");
                astami_navami.setText("பௌர்ணமி (மா. 03.13) மிருகசீருஷம் (கா. 03.37) ");
                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3:15 - 4:15 pm");
                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");
                measam.setText("அச்சம்");
                resabam.setText("சோர்வு ");
                methunam.setText("பயம் ");
                kadagam.setText("பக்தி  ");
                simamam.setText("களிப்பு  ");
                kanni.setText(" சுகம்   ");
                thulam.setText("கவலை  ");
                viruchagam.setText("வெற்றி  ");
                thanusu.setText("நன்மை  ");
                magaram.setText("சாதனை   ");
                kumbam.setText("லாபம்  ");
                menam.setText("ஜெயம் ");
                break;
            case "2024-12-16":
                text_view_tamil_date.setText("1 - மார்கழி, குரோதி");
                tamil_day.setText("திங்கள்");
                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("பிரதமை (மா.01.54) திருவாதிரை (கா.03.17)  ");
                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");
                measam.setText("நலம்");
                resabam.setText("பயம் ");
                methunam.setText("ஆசை  ");
                kadagam.setText("வாழ்வு  ");
                simamam.setText("பரிசு  ");
                kanni.setText(" செலவு  ");
                thulam.setText("நன்மை  ");
                viruchagam.setText("ஆர்வம் ");
                thanusu.setText("தெளிவு  ");
                magaram.setText("உறுதி  ");
                kumbam.setText("முயற்சி ");
                menam.setText("பரிவு ");
                break;
            case "2024-12-17":
                text_view_tamil_date.setText("2 - மார்கழி, குரோதி");
                tamil_day.setText("செவ்வாய்");
                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("துவிதியை (மா. 01.11) புனர்பூசம் (கா.03.31) ");
                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");
                measam.setText("நட்பு");
                resabam.setText("பணிவு ");
                methunam.setText("விவேகம்  ");
                kadagam.setText("பரிசு  ");
                simamam.setText("செலவு ");
                kanni.setText(" மேன்மை   ");
                thulam.setText("ஆர்வம் ");
                viruchagam.setText("முயற்சி  ");
                thanusu.setText("உதவி   ");
                magaram.setText("பக்தி  ");
                kumbam.setText("தடை  ");
                menam.setText("போட்டி ");
                break;
            case "2024-12-18":
                text_view_tamil_date.setText("3 - மார்கழி, குரோதி");
                tamil_day.setText("புதன்");
                theiperai_valarperai.setText("தேய்பிறை - சங்கடஹர சதுர்த்தி.  ");
                astami_navami.setText("திரிதியை (மா. 12.54) பூசம் (கா. 04.09)  ");
                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");
                gowri_nallaneram_kalai.setText("10:15 - 11:00 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");
                measam.setText("யோகம்");
                resabam.setText("பெருமை ");
                methunam.setText("மேன்மை ");
                kadagam.setText("சோதனை ");
                simamam.setText("சிரமம் ");
                kanni.setText("  நிம்மதி ");
                thulam.setText(" அமைதி");
                viruchagam.setText(" கவனம்");
                thanusu.setText(" கீர்த்தி  ");
                magaram.setText("பக்தி  ");
                kumbam.setText("வெற்றி  ");
                menam.setText("நன்மை  ");
                break;
            case "2024-12-19":
                text_view_tamil_date.setText("4 - மார்கழி, குரோதி");
                tamil_day.setText("வியாழன்");
                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("சதுர்த்தி (மா. 01.10) ஆயில்யம் (கா.05.07)");
                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");
                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");
                measam.setText("செலவு");
                resabam.setText("ஆதாயம் ");
                methunam.setText("வரவு ");
                kadagam.setText("தடங்கல்  ");
                simamam.setText("நன்மை  ");
                kanni.setText("சுகம்  ");
                thulam.setText("பெருமை  ");
                viruchagam.setText("நலம்  ");
                thanusu.setText("கீர்த்தி  ");
                magaram.setText("உழைப்பு  ");
                kumbam.setText("உதவி   ");
                menam.setText("அலைச்சல்  ");
                break;
            case "2024-12-20":
                text_view_tamil_date.setText("5 - மார்கழி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("பஞ்சமி (மா. 01.55) மகம் (முழுவதும்) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("நன்மை");
                resabam.setText("தாமதம்  ");
                methunam.setText("நிம்மதி  ");
                kadagam.setText("குழப்பம்  ");
                simamam.setText("வரவு  ");
                kanni.setText(" பக்தி  ");
                thulam.setText("பேராசை  ");
                viruchagam.setText("அமைதி  ");
                thanusu.setText("வெற்றி  ");
                magaram.setText("நலம்  ");
                kumbam.setText("ஆர்வம்  ");
                menam.setText("பொறாமை  ");
                break;
            case "2024-12-21":

                text_view_tamil_date.setText("6 - மார்கழி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("தேய்பிறை- கரிநாள். ");
                astami_navami.setText(" ஷஷ்டி (மா. 03.10) மகம் (கா.06.53)  ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("5:15 - 6:00 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("சாந்தம்");
                resabam.setText("வெற்றி ");
                methunam.setText("விருத்தி  ");
                kadagam.setText("லாபம்  ");
                simamam.setText("உயர்வு  ");
                kanni.setText(" முயற்சி  ");
                thulam.setText("யோகம்   ");
                viruchagam.setText("பரிவு   ");
                thanusu.setText("கீர்த்தி  ");
                magaram.setText("நன்மை  ");
                kumbam.setText("நட்பு  ");
                menam.setText("மேன்மை  ");
                break;
            case "2024-12-22":

                text_view_tamil_date.setText("7 - மார்கழி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை ");
                astami_navami.setText("ஸப்தமி (மா. 04.50) பூரம் (கா. 08.56) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3:00 - 4:00 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("பயணம்");
                resabam.setText("செலவு ");
                methunam.setText("அமைதி ");
                kadagam.setText(" சிந்தனை");
                simamam.setText("பாராட்டு ");
                kanni.setText(" நன்மை");
                thulam.setText("சோதனை ");
                viruchagam.setText("ஆக்கம்");
                thanusu.setText("சாதனை");
                magaram.setText("பேராசை");
                kumbam.setText("சிரமம் ");
                menam.setText("சாந்தம் ");
                break;
            case "2024-12-23":
                text_view_tamil_date.setText("8 - மார்கழி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை");
                astami_navami.setText("அஷ்டமி (மா. 06.48) உத்திரம் (கா. 11.17) ");

                nalla_neaream_kalai.setText("6:15 - 7:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("நலம்             ");
                resabam.setText("பிரீதி ");
                methunam.setText("நட்பு  ");
                kadagam.setText("வெற்றி ");
                simamam.setText("அன்பு  ");
                kanni.setText(" சுகம்  ");
                thulam.setText("பொறுமை  ");
                viruchagam.setText("ஆதரவு  ");
                thanusu.setText("லாபம்  ");
                magaram.setText("உயர்வு   ");
                kumbam.setText("அமைதி   ");
                menam.setText("புகழ் ");
                break;
            case "2024-12-24":

                text_view_tamil_date.setText("9 - மார்கழி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("தேய்பிறை -  கரிநாள். கிறிஸ்துமஸ் ஈவ்.");
                astami_navami.setText("நவமி (மா. 08.54) ஹஸ்தம் (மா. 01.49)");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("ஆதாயம்");
                resabam.setText("சுகம் ");
                methunam.setText("நிம்மதி  ");
                kadagam.setText("வரவு  ");
                simamam.setText("செலவு  ");
                kanni.setText(" தாமதம்  ");
                thulam.setText("தடங்கல்  ");
                viruchagam.setText("களிப்பு   ");
                thanusu.setText("வெற்றி  ");
                magaram.setText("கவலை  ");
                kumbam.setText("பயணம்  ");
                menam.setText("சாந்தம்  ");
                break;
            case "2024-12-25":

                text_view_tamil_date.setText("10 - மார்கழி, குரோதி");
                tamil_day.setText("புதன்");

                theiperai_valarperai.setText("தேய்பிறை - கிறிஸ்துமஸ் பண்டிகை. அரசு விடுமுறை. ");
                astami_navami.setText("தசமி (மா. 11.02) சித்திரை (மா. 04.22) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("12:00 ");
                ragu2.setText("1:30 ");
                kuligai1.setText("10:30 ");
                kuligai2.setText("12:00 ");
                yamagandam1.setText("7:30 ");
                yamagandam2.setText("9:00 ");

                measam.setText("வெற்றி");
                resabam.setText("பாசம் ");
                methunam.setText("சுபம்  ");
                kadagam.setText("உயர்வு  ");
                simamam.setText("நட்பு ");
                kanni.setText(" அமைதி ");
                thulam.setText("புகழ்  ");
                viruchagam.setText("ஆதரவு  ");
                thanusu.setText("மேன்மை  ");
                magaram.setText("நிம்மதி ");
                kumbam.setText("செலவு ");
                menam.setText(" போட்டி  ");
                break;
            case "2024-12-26":
                text_view_tamil_date.setText("11 - மார்கழி, குரோதி");
                tamil_day.setText("வியாழன்");

                theiperai_valarperai.setText("தேய்பிறை-ஸர்வ ஏகாதசி. கரிநாள். ");
                astami_navami.setText("ஏகாதசி (கா. 01.00) சுவாதி (மா. 06.51) ");

                nalla_neaream_kalai.setText("10:45 - 11:45 am");
                nalla_neaream_malai.setText("-");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("1:30 ");
                ragu2.setText("3:00 ");
                kuligai1.setText("9:00 ");
                kuligai2.setText("10:30 ");
                yamagandam1.setText("6:00 ");
                yamagandam2.setText("7:30 ");

                measam.setText("சுகம்");
                resabam.setText("நட்பு  ");
                methunam.setText("பயம்  ");
                kadagam.setText("ஆதரவு ");
                simamam.setText("உயர்வு  ");
                kanni.setText(" போட்டி  ");
                thulam.setText("வெற்றி   ");
                viruchagam.setText("புகழ் ");
                thanusu.setText("செலவு   ");
                magaram.setText("அமைதி   ");
                kumbam.setText("சினம்  ");
                menam.setText("நிறைவு ");
                break;
            case "2024-12-27":

                text_view_tamil_date.setText("12 - மார்கழி, குரோதி");
                tamil_day.setText("வெள்ளி");

                theiperai_valarperai.setText("தேய்பிறை");
                astami_navami.setText(" துவாதசி (கா.02.41) விசாகம்  (மா. 09.04 ) ");

                nalla_neaream_kalai.setText("9:15 - 10:15 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                ragu1.setText("10:30 ");
                ragu2.setText("12:00 ");
                kuligai1.setText("7:30 ");
                kuligai2.setText("9:00 ");
                yamagandam1.setText("3:00 ");
                yamagandam2.setText("4:30 ");

                measam.setText("நிம்மதி");
                resabam.setText("அமைதி ");
                methunam.setText("நிம்மதி  ");
                kadagam.setText("வெற்றி   ");
                simamam.setText("உயர்வு  ");
                kanni.setText(" கவலை  ");
                thulam.setText("ஆதரவு  ");
                viruchagam.setText("அன்பு  ");
                thanusu.setText("கோபம் ");
                magaram.setText("புகழ்  ");
                kumbam.setText("போட்டி  ");
                menam.setText("பயணம் ");
                break;
            case "2024-12-28":

                text_view_tamil_date.setText("13 - மார்கழி, குரோதி");
                tamil_day.setText("சனி");

                theiperai_valarperai.setText("தேய்பிறை-பிரதோஷம். ");
                astami_navami.setText("திரயோதசி (கா.03.54) அனுஷம் (மா.10.54) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                ragu1.setText("9:00 ");
                ragu2.setText("10:30 ");
                kuligai1.setText("6:00 ");
                kuligai2.setText("7:30 ");
                yamagandam1.setText("1:30 ");
                yamagandam2.setText("3:00 ");

                measam.setText("மேன்மை");
                resabam.setText("வெற்றி  ");
                methunam.setText("நட்பு  ");
                kadagam.setText("போட்டி ");
                simamam.setText("சுகம்  ");
                kanni.setText(" தனம்  ");
                thulam.setText("வரவு  ");
                viruchagam.setText("முயற்சி  ");
                thanusu.setText("உயர்வு  ");
                magaram.setText("கவலை  ");
                kumbam.setText("லாபம்  ");
                menam.setText("ஜெயம்  ");
                break;
            case "2024-12-29":

                text_view_tamil_date.setText("14 - மார்கழி, குரோதி");
                tamil_day.setText("ஞாயிறு");

                theiperai_valarperai.setText("தேய்பிறை - மாத சிவராத்திரி. கெர்போட்ட ஆரம்பம். ");
                astami_navami.setText("சதுர்த்தசி (கா.04.43) கேட்டை (கா. 12.18) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("3:15 - 4:15 pm");

                gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                ragu1.setText("4:30 ");
                ragu2.setText("6:00 ");
                kuligai1.setText("3:00 ");
                kuligai2.setText("4:30 ");
                yamagandam1.setText("12:00 ");
                yamagandam2.setText("1:30 ");

                measam.setText("எதிர்ப்பு");
                resabam.setText("போட்டி ");
                methunam.setText(" விவேகம்   ");
                kadagam.setText("அச்சம்  ");
                simamam.setText("துன்பம்  ");
                kanni.setText(" தனம்  ");
                thulam.setText("வீம்பு  ");
                viruchagam.setText("பெருமை   ");
                thanusu.setText("இன்பம்  ");
                magaram.setText("ஆசை ");
                kumbam.setText("அமைதி  ");
                menam.setText("தனம்  ");
                break;
            case "2024-12-30":

                text_view_tamil_date.setText("15 - மார்கழி, குரோதி");
                tamil_day.setText("திங்கள்");

                theiperai_valarperai.setText("தேய்பிறை -  ஸர்வ அமாவாஸ்யை. அனுமந்த் ஜெயந்தி.");
                astami_navami.setText("அமாவாஸ்யை (கா.05.03) மூலம் (கா.01.12) ");

                nalla_neaream_kalai.setText("6:00 - 7:00 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("7:30 ");
                ragu2.setText("9:00 ");
                kuligai1.setText("1:30 ");
                kuligai2.setText("3:00 ");
                yamagandam1.setText("10:30 ");
                yamagandam2.setText("12:00 ");

                measam.setText("நன்மை");
                resabam.setText("சிரத்தை ");
                methunam.setText("சோர்வு  ");
                kadagam.setText("கவனம் ");
                simamam.setText("சாந்தம்  ");
                kanni.setText(" அமைதி  ");
                thulam.setText("சுகம்  ");
                viruchagam.setText("நலம்   ");
                thanusu.setText("புகழ்  ");
                magaram.setText("பயம்  ");
                kumbam.setText("பக்தி  ");
                menam.setText("பொறுமை  ");
                break;
            case "2024-12-31":

                text_view_tamil_date.setText("16 - மார்கழி, குரோதி");
                tamil_day.setText("செவ்வாய்");

                theiperai_valarperai.setText("வளர்பிறை -  நியூ இயர்ஸ் ஈவ்.");
                astami_navami.setText("பிரதமை (கா. 04.48) பூராடம் (கா. 01.38) ");

                nalla_neaream_kalai.setText("7:45 - 8:45 am");
                nalla_neaream_malai.setText("4:45 - 5:45 pm");

                gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                ragu1.setText("3:00 ");
                ragu2.setText("4:30 ");
                kuligai1.setText("12:00 ");
                kuligai2.setText("1:30 ");
                yamagandam1.setText("9:00 ");
                yamagandam2.setText("10:30 ");

                measam.setText("திறமை");
                resabam.setText("இன்பம் ");
                methunam.setText("புகழ்  ");
                kadagam.setText("அன்பு ");
                simamam.setText("செலவு  ");
                kanni.setText(" உறுதி  ");
                thulam.setText("வாழ்வு  ");
                viruchagam.setText("உயர்வு   ");
                thanusu.setText("ஊக்கம்  ");
                magaram.setText("மறதி  ");
                kumbam.setText("போட்டி  ");
                menam.setText("தாமதம்  ");
                break;

        }

    }

    private String getToDAyDAte() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return dateFormat.format(new Date());
    }
    private String showTextBasedOnDate(String date) {
            switch (date) {
                /**************************************************************3.march *********************************************************/
                case "2024-03-16":
                    text_view_tamil_date.setText("பங்குனி 3, சோபகிருதம்");
                    tamil_day.setText("சனி");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("அஷ்டமி 52.17 (கா.03.17) மிருகசீருஷம் (மா.09.53)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10.30-11.30 am");
                    gowri_nallaneram_malai.setText("9.30-10.30 pm");
                    ragu1.setText("9:30");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");
                    measam.setText("பகை ");
                    resabam.setText("நிறைவு ");
                    methunam.setText("துன்பம் ");
                    kadagam.setText("பணிவு ");
                    simamam.setText("பக்தி ");
                    kanni.setText("ஓய்வு ");
                    thulam.setText("நன்மை ");
                    viruchagam.setText("தெளிவு ");
                    thanusu.setText("பகை ");
                    magaram.setText("உதவி ");
                    kumbam.setText("பரிவு ");
                    menam.setText("புகழ்");
                    break;
                case "2024-03-17":
                    text_view_tamil_date.setText("பங்குனி 4, சோபகிருதம்");
                    tamil_day.setText("ஞாயிறு");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("அஷ்டமி (கா.03.17) மிருகசீருஷம் (மா.09.53)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                    ragu1.setText("4:30 ");
                    ragu2.setText("6:30 ");
                    kuligai1.setText("3:30 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");
                    measam.setText("வெற்றி ");
                    resabam.setText("முயற்சி  ");
                    methunam.setText("பெருமை  ");
                    kadagam.setText("நலம்   ");
                    simamam.setText("மேன்மை  ");
                    kanni.setText("புகழ்  ");
                    thulam.setText("தேர்வு  ");
                    viruchagam.setText("பயம் ");
                    thanusu.setText("வரவு  ");
                    magaram.setText("பாராட்டு  ");
                    kumbam.setText("ஓய்வு  ");
                    menam.setText("சிரமம்");
                    break;
                case "2024-03-18":
                    text_view_tamil_date.setText("பங்குனி 5, சோபகிருதம்");
                    tamil_day.setText("திங்கள்");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("நவமி (கா. 03.33) திருவாதிரை (மா.10.38)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");
                    measam.setText("கவனம்  ");
                    resabam.setText(" ஆர்வம்  ");
                    methunam.setText("மேன்மை ");
                    kadagam.setText("நன்மை  ");
                    simamam.setText("பரிசு  ");
                    kanni.setText("லாபம்  ");
                    thulam.setText("செலவு  ");
                    viruchagam.setText("வரவு  ");
                    thanusu.setText("புகழ்  ");
                    magaram.setText("களிப்பு  ");
                    kumbam.setText("அமைதி  ");
                    menam.setText("ஜெயம்");
                    break;
                case "2024-03-19":
                    text_view_tamil_date.setText("பங்குனி 6, சோபகிருதம்");
                    tamil_day.setText("செவ்வாய்");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("தசமி (கா.04.20) புனர்பூசம் (மா. 11.55)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:00 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");
                    measam.setText("பெருமை  ");
                    resabam.setText("ஆக்கம்  ");
                    methunam.setText("நட்பு ");
                    kadagam.setText("நிறைவு  ");
                    simamam.setText("அமைதி  ");
                    kanni.setText("லாபம் ");
                    thulam.setText(" புகழ்  ");
                    viruchagam.setText("நலம் ");
                    thanusu.setText("விருத்தி  ");
                    magaram.setText("சுகம்  ");
                    kumbam.setText("உதவி ");
                    menam.setText("நன்மை");
                    break;
                case "2024-03-20":
                    text_view_tamil_date.setText("பங்குனி 7, சோபகிருதம்");
                    tamil_day.setText("புதன்");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("ஏகாதசி (கா. 05.26) பூசம் (கா. 01.39)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");
                    measam.setText("ஆர்வம்  ");
                    resabam.setText("நட்பு");
                    methunam.setText("வெற்றி ");
                    kadagam.setText("கவனம்  ");
                    simamam.setText("நலம்  ");
                    kanni.setText("ஜெயம்  ");
                    thulam.setText("பரிவு");
                    viruchagam.setText(" தோல்வி ");
                    thanusu.setText(" உதவி ");
                    magaram.setText(" சுகம்");
                    kumbam.setText(" சிக்கல்  ");
                    menam.setText("மறதி");
                    break;
                case "2024-03-21":
                    text_view_tamil_date.setText("பங்குனி 8, சோபகிருதம்");
                    tamil_day.setText("வியாழன்");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("துவாதசி  (முழுவதும்) ஆயில்யம்  (கா. 03.46)");
                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText("-");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");
                    measam.setText("நலம் ");
                    resabam.setText("புகழ்  ");
                    methunam.setText("உதவி ");
                    kadagam.setText("ஜெயம் ");
                    simamam.setText("ஆர்வம்  ");
                    kanni.setText("சினம்  ");
                    thulam.setText("நட்பு  ");
                    viruchagam.setText("தோல்வி  ");
                    thanusu.setText("வெற்றி  ");
                    magaram.setText("தனம்  ");
                    kumbam.setText("நன்மை ");
                    menam.setText("கவனம்");
                    break;
                case "2024-03-22":
                    text_view_tamil_date.setText("பங்குனி 9, சோபகிருதம்");
                    tamil_day.setText("வெள்ளி");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("துவாதசி (கா. 07.16) மகம்  (கா. 06.08)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("2:00 - 3:00 pm");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:30 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");
                    measam.setText("வெற்றி ");
                    resabam.setText("நட்பு ");
                    methunam.setText("பணிவு ");
                    kadagam.setText("பெருமை  ");
                    simamam.setText("சாந்தம் ");
                    kanni.setText("இன்பம்  ");
                    thulam.setText("உதவி  ");
                    viruchagam.setText(" தெளிவு  ");
                    thanusu.setText("அமைதி  ");
                    magaram.setText("பகை  ");
                    kumbam.setText("அசதி  ");
                    menam.setText("பயம்");
                    break;
                case "2024-03-23":
                    text_view_tamil_date.setText("பங்குனி 10, சோபகிருதம்");
                    tamil_day.setText("சனி");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("திரயோதசி (கா.09.12) பூரம்  (முழுவதும்)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("5:00 - 6:00 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");
                    ragu1.setText("9:30 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");
                    measam.setText("ஆசை ");
                    resabam.setText("உயர்வு  ");
                    methunam.setText("நஷ்டம்  ");
                    kadagam.setText("ஜெயம்  ");
                    simamam.setText("மறதி  ");
                    kanni.setText("அச்சம் ");
                    thulam.setText("பக்தி ");
                    viruchagam.setText("சுகம்  ");
                    thanusu.setText("நன்மை  ");
                    magaram.setText("வெற்றி  ");
                    kumbam.setText("சாந்தம் ");
                    menam.setText("லாபம்");
                    break;
                case "2024-03-24":
                    text_view_tamil_date.setText("பங்குனி 11, சோபகிருதம்");
                    tamil_day.setText("ஞாயிறு");
                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("சதுர்த்தசி (கா. 11.16) பூரம்  (கா. 08.46)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:00 - 4:00 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");
                    measam.setText("லாபம் ");
                    resabam.setText("பயம்  ");
                    methunam.setText("நலம்  ");
                    kadagam.setText("ஆக்கம்  ");
                    simamam.setText("இன்பம்  ");
                    kanni.setText("நன்மை  ");
                    thulam.setText("பகை  ");
                    viruchagam.setText("வரவு  ");
                    thanusu.setText("புகழ்  ");
                    magaram.setText("பரிசு  ");
                    kumbam.setText("பரிவு ");
                    menam.setText("இன்பம் ");
                    break;
                case "2024-03-25":
                    text_view_tamil_date.setText("பங்குனி 12, சோபகிருதம்");
                    tamil_day.setText("திங்கள்");
                    theiperai_valarperai.setText("பௌர்ணமி - தேய்பிறை");
                    astami_navami.setText("பௌர்ணமி (மா.01.16) உத்திரம் (கா.11.19)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");
                    measam.setText("தெளிவு  ");
                    resabam.setText("நலம்  ");
                    methunam.setText("களிப்பு  ");
                    kadagam.setText("நிறைவு");
                    simamam.setText(" சினம்  ");
                    kanni.setText("வரவு  ");
                    thulam.setText("அசதி  ");
                    viruchagam.setText("லாபம்  ");
                    thanusu.setText("பரிசு  ");
                    magaram.setText("பக்தி ");
                    kumbam.setText("பாசம் ");
                    menam.setText("மறதி");
                    break;
                case "2024-03-26":
                    text_view_tamil_date.setText("பங்குனி 13, சோபகிருதம்");
                    tamil_day.setText("செவ்வாய்");
                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("பிரதமை (மா. 03.06) ஹஸ்தம் (மா.01.42)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");
                    measam.setText("நன்மை  ");
                    resabam.setText("பகை ");
                    methunam.setText("செலவு ");
                    kadagam.setText("மறதி");
                    simamam.setText(" லாபம்  ");
                    kanni.setText("புகழ் ");
                    thulam.setText(" சினம் ");
                    viruchagam.setText(" வரவு ");
                    thanusu.setText("போட்டி  ");
                    magaram.setText("கவனம் ");
                    kumbam.setText("ஆர்வம்  ");
                    menam.setText("வெற்றி ");
                    break;
                case "2024-03-27":
                    text_view_tamil_date.setText("பங்குனி 14, சோபகிருதம்");
                    tamil_day.setText("புதன்");
                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("துவிதியை (மா. 04.38) சித்திரை (மா.03.47)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");
                    measam.setText("பயம் ");
                    resabam.setText("வெற்றி  ");
                    methunam.setText("கவலை ");
                    kadagam.setText("லாபம் ");
                    simamam.setText("செலவு  ");
                    kanni.setText("ஈகை  ");
                    thulam.setText("ஆதரவு");
                    viruchagam.setText(" சுபம்");
                    thanusu.setText(" தோல்வி ");
                    magaram.setText(" நலம்  ");
                    kumbam.setText("சுகம் ");
                    menam.setText("புகழ்");
                    break;
                case "2024-03-28":
                    text_view_tamil_date.setText("பங்குனி 15, சோபகிருதம்");
                    tamil_day.setText("வியாழன்");
                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("திரிதியை (மா. 05.44) சுவாதி (மா.05.28)");
                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText("-");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");
                    measam.setText("உயர்வு ");
                    resabam.setText("போட்டி ");
                    methunam.setText(" அமைதி ");
                    kadagam.setText("உதவி ");
                    simamam.setText("ஜெயம்  ");
                    kanni.setText("சினம் ");
                    thulam.setText("ஆர்வம் ");
                    viruchagam.setText("புகழ் ");
                    thanusu.setText("பக்தி  ");
                    magaram.setText("கவனம் ");
                    kumbam.setText("இன்பம்  ");
                    menam.setText("தனம்");
                    break;
                case "2024-03-29":
                    text_view_tamil_date.setText("பங்குனி 16, சோபகிருதம்");
                    tamil_day.setText("வெள்ளி");
                    theiperai_valarperai.setText("தேய்பிறை-புனித வெள்ளி. அரசு விடுமுறை");
                    astami_navami.setText("சதுர்த்தி (மா. 06.21) விசாகம் (மா.06.41)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("10:30 ");
                    ragu2.setText("12:30 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");
                    measam.setText("சுகம் ");
                    resabam.setText(" நன்மை");
                    methunam.setText(" முயற்சி  ");
                    kadagam.setText("பொறுமை  ");
                    simamam.setText("பணிவு  ");
                    kanni.setText("ஆர்வம்   ");
                    thulam.setText("அமைதி ");
                    viruchagam.setText("உயர்வு  ");
                    thanusu.setText("தெளிவு ");
                    magaram.setText(" நலம் ");
                    kumbam.setText("பரிவு  ");
                    menam.setText("களிப்பு");
                    break;
                case "2024-03-30":
                    text_view_tamil_date.setText("பங்குனி 17, சோபகிருதம்");
                    tamil_day.setText("சனி");
                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("பஞ்சமி (மா. 06.27) அனுஷம் (மா.07.24)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");
                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");
                    measam.setText("அமைதி ");
                    resabam.setText("சிரமம்   ");
                    methunam.setText("அசதி");
                    kadagam.setText(" களிப்பு  ");
                    simamam.setText("நஷ்டம்  ");
                    kanni.setText("சோர்வு  ");
                    thulam.setText("வரவு ");
                    viruchagam.setText("ஊக்கம்  ");
                    thanusu.setText("துன்பம்  ");
                    magaram.setText("கோபம்  ");
                    kumbam.setText("நன்மை ");
                    menam.setText("பக்தி");
                    break;
                case "2024-03-31":
                    text_view_tamil_date.setText("பங்குனி 18, சோபகிருதம்");
                    tamil_day.setText("ஞாயிறு");
                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("ஷஷ்டி (மா. 06.02) கேட்டை (மா. 07.37)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");
                    measam.setText("இன்பம்  ");
                    resabam.setText("சாந்தம் ");
                    methunam.setText("தடை  ");
                    kadagam.setText("துன்பம்  ");
                    simamam.setText("வரவு  ");
                    kanni.setText("உயர்வு  ");
                    thulam.setText("அமைதி  ");
                    viruchagam.setText("ஆக்கம் ");
                    thanusu.setText("கோபம்  ");
                    magaram.setText("முயற்சி  ");
                    kumbam.setText("புகழ் ");
                    menam.setText("நன்மை ");
                    break;
                /*******************************************************4. apiral ************************************************************************************/

                case "2024-04-01":
                    text_view_tamil_date.setText("19 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("திங்கள்");
                    theiperai_valarperai.setText("தேய்பிறை - கரிநாள் ");
                    astami_navami.setText("ஸப்தமி (மா. 05.08) மூலம் (மா.07.22)");
                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:00 pm");
                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");
                    measam.setText("அன்பு  ");
                    resabam.setText("லாபம் ");
                    methunam.setText("பிரீதி  ");
                    kadagam.setText("சுகம்  ");
                    simamam.setText("ஜெயம்");
                    kanni.setText("பக்தி");
                    thulam.setText("நன்மை ");
                    viruchagam.setText("பகை");
                    thanusu.setText("வரவு ");
                    magaram.setText("ஆசை ");
                    kumbam.setText("நலம் ");
                    menam.setText("நற்செய்தி ");
                    break;
                case "2024-04-02":
                    text_view_tamil_date.setText("20 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("செவ்வாய்");
                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("அஷ்டமி  (மா. 03.49) பூராடம்  (மா.06.42)");
                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");
                    measam.setText("மகிழ்ச்சி ");
                    resabam.setText("திறமை  ");
                    methunam.setText("லாபம்    ");
                    kadagam.setText("உதவி ");
                    simamam.setText("உயர்வு ");
                    kanni.setText(" பிரீதி ");
                    thulam.setText("வரவு ");
                    viruchagam.setText("உழைப்பு  ");
                    thanusu.setText("அன்பு  ");
                    magaram.setText("ஆசை  ");
                    kumbam.setText("நேசம் ");
                    menam.setText("பொறுமை ");
                    break;
                case "2024-04-03":
                    text_view_tamil_date.setText("21 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("புதன்");
                    theiperai_valarperai.setText("தேய்பிறை-திருவோண விரதம் ");
                    astami_navami.setText("நவமி  (மா. 02.09) உத்திராடம்  (மா. 05.43)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");
                    measam.setText("புகழ் ");
                    resabam.setText("பக்தி ");
                    methunam.setText("பகை ");
                    kadagam.setText("பிரீதி ");
                    simamam.setText("சுகம் ");
                    kanni.setText(" முயற்சி ");
                    thulam.setText("வரவு ");
                    viruchagam.setText("உயர்வு  ");
                    thanusu.setText("நட்பு  ");
                    magaram.setText("லாபம்  ");
                    kumbam.setText("நலம் ");
                    menam.setText("அன்பு  ");
                    break;
                case "2024-04-04":
                    text_view_tamil_date.setText("22 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("வியாழன்");
                    theiperai_valarperai.setText("தேய்பிறை-சுபமுகூர்த்தம் ");
                    astami_navami.setText("தசமி  (மா.12.12) திருவோணம் (மா.04.26) ");
                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" - ");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");
                    measam.setText("அலைச்சல்  ");
                    resabam.setText("நட்பு ");
                    methunam.setText("சுகம்  ");
                    kadagam.setText("உயர்வு ");
                    simamam.setText("அமைதி  ");
                    kanni.setText("நலம்  ");
                    thulam.setText("திடம்  ");
                    viruchagam.setText("பிரீதி  ");
                    thanusu.setText("ஆசை  ");
                    magaram.setText("பகை  ");
                    kumbam.setText("வரவு ");
                    menam.setText("லாபம் ");
                    break;
                case "2024-04-05":
                    text_view_tamil_date.setText("23 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("வெள்ளி");
                    theiperai_valarperai.setText("தேய்பிறை-சுபமுகூர்த்தம். ஸர்வ ஏகாதசி ");
                    astami_navami.setText("ஏகாதசி (கா. 09.59) அவிட்டம் (மா. 02.57) ");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");
                    measam.setText("சுகம்  ");
                    resabam.setText("லாபம்  ");
                    methunam.setText("நட்பு  ");
                    kadagam.setText("பிரீதி  ");
                    simamam.setText("அன்பு  ");
                    kanni.setText(" ஆசை ");
                    thulam.setText("திடம்  ");
                    viruchagam.setText("புகழ்  ");
                    thanusu.setText("நலம் ");
                    magaram.setText("அமைதி  ");
                    kumbam.setText("உயர்வு  ");
                    menam.setText("நற்செயல் ");
                    break;
                case "2024-04-06":
                    text_view_tamil_date.setText("24 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("சனி");
                    theiperai_valarperai.setText("தேய்பிறை-சனிப்பிரதோஷம். ");
                    astami_navami.setText("துவாதசி (கா. 07.41) திரயோதசி (கா.03.47)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");
                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");
                    measam.setText("வரவு  ");
                    resabam.setText("ஆசை ");
                    methunam.setText("நலம் ");
                    kadagam.setText("நட்பு ");
                    simamam.setText("அமைதி ");
                    kanni.setText("புகழ்  ");
                    thulam.setText("அன்பு  ");
                    viruchagam.setText("லாபம்  ");
                    thanusu.setText("உயர்வு");
                    magaram.setText(" ஆதரவு ");
                    kumbam.setText("சுகம்");
                    menam.setText("பிரீதி");
                    break;
                case "2024-04-07":
                    text_view_tamil_date.setText("25 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("ஞாயிறு");
                    theiperai_valarperai.setText("தேய்பிறை-மாத சிவராத்திரி ");
                    astami_navami.setText("சதுர்த்தசி (கா. 02.54) பூரட்டாதி (கா. 11.43) ");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");
                    measam.setText("வெற்றி  ");
                    resabam.setText("நட்பு ");
                    methunam.setText("உயர்வு ");
                    kadagam.setText("சுகம் ");
                    simamam.setText("ஆதரவு ");
                    kanni.setText(" புகழ்  ");
                    thulam.setText("லாபம்  ");
                    viruchagam.setText("அன்பு  ");
                    thanusu.setText("அமைதி  ");
                    magaram.setText("நலம்   ");
                    kumbam.setText("ஆசை ");
                    menam.setText(" கீர்த்தி");
                    break;
                case "2024-04-08":
                    text_view_tamil_date.setText("26 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("திங்கள்");
                    theiperai_valarperai.setText("ஸர்வ அமாவாஸ்யை ");
                    astami_navami.setText("அமாவாஸ்யை (கா. 12.36) உத்திரட்டாதி (கா.10.06) ");
                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");
                    measam.setText("நலம் ");
                    resabam.setText(" பிரீதி  ");
                    methunam.setText("நட்பு  ");
                    kadagam.setText("வெற்றி  ");
                    simamam.setText("அன்பு  ");
                    kanni.setText(" சுகம் ");
                    thulam.setText("பெருமை ");
                    viruchagam.setText("ஆதரவு ");
                    thanusu.setText(" லாபம் ");
                    magaram.setText(" உயர்வு  ");
                    kumbam.setText("அமைதி  ");
                    menam.setText("புகழ்   ");
                    break;
                case "2024-04-09":
                    text_view_tamil_date.setText("27 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("செவ்வாய்");
                    theiperai_valarperai.setText("வளர்பிறை-தெலுங்கு வருடப் பிறப்பு. யுகாதிப் பண்டிகை. அரசு விடுமுறை.  ");
                    astami_navami.setText("பிரதமை (மா.10.27) ரேவதி (கா.08.33)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");
                    measam.setText("ஆதாயம்  ");
                    resabam.setText("சுகம் ");
                    methunam.setText("சுபம்  ");
                    kadagam.setText("வரவு  ");
                    simamam.setText("செலவு ");
                    kanni.setText("தாமதம் ");
                    thulam.setText("தடங்கல்  ");
                    viruchagam.setText("களிப்பு  ");
                    thanusu.setText("வெற்றி  ");
                    magaram.setText("கவலை  ");
                    kumbam.setText("பரிவு   ");
                    menam.setText("சாந்தி ");
                    break;
                case "2024-04-10":
                    text_view_tamil_date.setText("28 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("புதன்");
                    theiperai_valarperai.setText("வளர்பிறை-சந்திர தரிசனம்.  ");
                    astami_navami.setText(" துவிதியை (மா. 08.34) அசுபதி (கா. 07.16) ");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("3:00 - 4:00 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");
                    measam.setText("ஜெயம் ");
                    resabam.setText(" பிரீதி ");
                    methunam.setText(" சுகம் ");
                    kadagam.setText(" உயர்வு  ");
                    simamam.setText(" நட்பு ");
                    kanni.setText("  அமைதி ");
                    thulam.setText(" புகழ் ");
                    viruchagam.setText(" ஆதரவு ");
                    thanusu.setText(" வெற்றி");
                    magaram.setText(" சுபம் ");
                    kumbam.setText(" செலவு  ");
                    menam.setText(" போட்டி ");
                    break;
                case "2024-04-11":
                    text_view_tamil_date.setText("29 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("வியாழன்");
                    theiperai_valarperai.setText("வளர்பிறை- ரம்ஜான் பண்டிகை. அரசு விடுமுறை.");
                    astami_navami.setText("திரிதியை (மா. 07.00) பரணி (கா. 06.16) கார்த்திகை (கா.05.16) ");
                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" -  pm");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");
                    measam.setText("சுகம் ");
                    resabam.setText(" நட்பு ");
                    methunam.setText(" பயம் ");
                    kadagam.setText("ஆதரவு ");
                    simamam.setText(" உயர்வு ");
                    kanni.setText(" போட்டி ");
                    thulam.setText(" வெற்றி");
                    viruchagam.setText("புகழ்  ");
                    thanusu.setText("செலவு ");
                    magaram.setText(" அமைதி ");
                    kumbam.setText(" கோபம் ");
                    menam.setText(" சுகம்  ");
                    break;
                case "2024-04-12":
                    text_view_tamil_date.setText("30 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("வெள்ளி");
                    theiperai_valarperai.setText("வளர்பிறை-சதுர்த்தி விரதம். மதுரை ஸ்ரீமீனாட்சி சொக்கநாதர் சித்திரைப் பெருவிழா தொடக்கம். ");
                    astami_navami.setText("சதுர்த்தி  (மா. 05.47) ரோகிணி  (கா. 05.05)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");
                    measam.setText("சுபம்  ");
                    resabam.setText("அமைதி ");
                    methunam.setText(" பாராட்டு  ");
                    kadagam.setText("வெற்றி ");
                    simamam.setText("உயர்வு  ");
                    kanni.setText("கவலை ");
                    thulam.setText("ஆதரவு  ");
                    viruchagam.setText("அன்பு  ");
                    thanusu.setText("கோபம்  ");
                    magaram.setText("புகழ்  ");
                    kumbam.setText("போட்டி  ");
                    menam.setText(" நிறைவு ");
                    break;
                case "2024-04-13":
                    text_view_tamil_date.setText("31 - பங்குனி, சோபகிருதம்");
                    tamil_day.setText("சனி");
                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("பஞ்சமி (மா. 05.00) மிருகசீருஷம் (கா. 05.17)");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");
                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");
                    measam.setText("செலவு ");
                    resabam.setText("சுபம்  ");
                    methunam.setText("நட்பு  ");
                    kadagam.setText("புகழ்  ");
                    simamam.setText("அமைதி  ");
                    kanni.setText(" பிரீதி  ");
                    thulam.setText("நன்மை  ");
                    viruchagam.setText("வாழ்வு   ");
                    thanusu.setText("அன்பு  ");
                    magaram.setText("உயர்வு  ");
                    kumbam.setText("கவலை  ");
                    menam.setText("தடை ");
                    break;
                case "2024-04-14":

                    text_view_tamil_date.setText("1 - சித்திரை, குரோதி");
                    tamil_day.setText("ஞாயிறு");
                    theiperai_valarperai.setText("வளர்பிறை-தமிழ் வருடப் பிறப்பு. அம்பேத்கர் பிறந்தநாள். அரசு விடுமுறை. ");
                    astami_navami.setText("ஷஷ்டி  (மா. 04.47) திருவாதிரை  (கா. 05.55) ");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:45 - 4:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");
                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");
                    measam.setText("தோல்வி  ");
                    resabam.setText("பரிசு ");
                    methunam.setText("லாபம்  ");
                    kadagam.setText("செலவு  ");
                    simamam.setText("சுகம் ");
                    kanni.setText(" கவலை ");
                    thulam.setText("வெற்றி ");
                    viruchagam.setText("நன்மை ");
                    thanusu.setText("பயம்  ");
                    magaram.setText("துன்பம்  ");
                    kumbam.setText("சிக்கல்  ");
                    menam.setText("ஆதரவு  ");
                    break;
                case "2024-04-15":
                    text_view_tamil_date.setText("2 - சித்திரை, குரோதி");
                    tamil_day.setText("திங்கள்");
                    theiperai_valarperai.setText("வளர்பிறை-சுபமுகூர்த்தம் ");
                    astami_navami.setText("ஸப்தமி  (மா.05.01) புனர்பூசம் 60.00 (முழுவதும்)");
                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");
                    measam.setText("வரவு ");
                    resabam.setText("வெற்றி ");
                    methunam.setText("பயம் ");
                    kadagam.setText("உயர்வு  ");
                    simamam.setText("நன்மை  ");
                    kanni.setText(" கவலை   ");
                    thulam.setText("ஆதரவு  ");
                    viruchagam.setText("அமைதி  ");
                    thanusu.setText("துன்பம்  ");
                    magaram.setText("பரிவு   ");
                    kumbam.setText("செலவு  ");
                    menam.setText("தாமதம் ");
                    break;
                case "2024-04-16":
                    text_view_tamil_date.setText("3 - சித்திரை, குரோதி");
                    tamil_day.setText("செவ்வாய்");
                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("அஷ்டமி (மா.05.46) புனர்பூசம் (கா.07.13) ");
                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("5:15 - 6:00 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");
                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");
                    measam.setText("எதிர்ப்பு ");
                    resabam.setText("களிப்பு ");
                    methunam.setText("நோய்  ");
                    kadagam.setText("திடம்  ");
                    simamam.setText("நட்பு  ");
                    kanni.setText(" சிக்கல்  ");
                    thulam.setText("பயம்  ");
                    viruchagam.setText("வெற்றி ");
                    thanusu.setText("வரவு  ");
                    magaram.setText("கவலை  ");
                    kumbam.setText("தாமதம் ");
                    menam.setText("சுகம் ");
                    break;
                case "2024-04-17":
                    text_view_tamil_date.setText("4 - சித்திரை, குரோதி");
                    tamil_day.setText("புதன்");
                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("நவமி  (மா. 06.59) பூசம்  (கா.08.51)");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");
                    measam.setText("நட்பு ");
                    resabam.setText("ஆதரவு ");
                    methunam.setText("செலவு  ");
                    kadagam.setText("கோபம்  ");
                    simamam.setText("அமைதி ");
                    kanni.setText(" வெற்றி   ");
                    thulam.setText("போட்டி ");
                    viruchagam.setText("நன்மை  ");
                    thanusu.setText("புகழ்   ");
                    magaram.setText("சுபம்  ");
                    kumbam.setText("பயம்  ");
                    menam.setText("நிறைவு ");
                    break;
                case "2024-04-18":
                    text_view_tamil_date.setText("5 - சித்திரை, குரோதி");
                    tamil_day.setText("வியாழன்");
                    theiperai_valarperai.setText("வளர்பிறை  ");
                    astami_navami.setText("தசமி (மா. 08.35) ஆயில்யம் (கா. 10.55) ");
                    nalla_neaream_kalai.setText("10:30 - 10:30 am");
                    nalla_neaream_malai.setText(" -  pm");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");
                    measam.setText("பெருமை  ");
                    resabam.setText("போட்டி ");
                    methunam.setText("செலவு ");
                    kadagam.setText("நன்மை ");
                    simamam.setText("சுகம் ");
                    kanni.setText("  நிறைவு ");
                    thulam.setText(" வெற்றி");
                    viruchagam.setText(" ஆதரவு");
                    thanusu.setText(" புகழ்  ");
                    magaram.setText("அமைதி  ");
                    kumbam.setText("பயம்  ");
                    menam.setText("கோபம்  ");
                    break;
                case "2024-04-19":
                    text_view_tamil_date.setText("6 - சித்திரை, குரோதி");
                    tamil_day.setText("வெள்ளி");
                    theiperai_valarperai.setText("வளர்பிறை-கரிநாள் ");
                    astami_navami.setText("ஏகாதசி  (மா. 10.28) மகம்  (மா.01.18) ");
                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");
                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");
                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");
                    measam.setText("புகழ் ");
                    resabam.setText("சுகம் ");
                    methunam.setText("பயம் ");
                    kadagam.setText("நன்மை  ");
                    simamam.setText("ஆதரவு  ");
                    kanni.setText("செலவு  ");
                    thulam.setText("கோபம்  ");
                    viruchagam.setText("பெருமை  ");
                    thanusu.setText("வெற்றி  ");
                    magaram.setText("போட்டி  ");
                    kumbam.setText("நிறைவு   ");
                    menam.setText("நற்செய்தி  ");
                    break;
                case "2024-04-20":
                    text_view_tamil_date.setText("7 -சித்திரை, குரோதி");
                    tamil_day.setText("சனி");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("துவாதசி  (கா. 12.30) பூரம்  (மா. 03.50) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("இன்பம் ");
                    resabam.setText("நிறைவு  ");
                    methunam.setText("தனம்  ");
                    kadagam.setText("பயம்  ");
                    simamam.setText("கோபம்  ");
                    kanni.setText(" போட்டி  ");
                    thulam.setText("பெருமை  ");
                    viruchagam.setText("செலவு  ");
                    thanusu.setText("சுபம்  ");
                    magaram.setText("நன்மை  ");
                    kumbam.setText("வெற்றி  ");
                    menam.setText("ஆதரவு  ");
                    break;
                case "2024-04-21":

                    text_view_tamil_date.setText("8 - சித்திரை, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("வளர்பிறை- பிரதோஷம். மகாவீர் ஜெயந்தி. அரசு விடுமுறை ");
                    astami_navami.setText(" திரயோதசி (கா.02.29) உத்திரம் (மா.06.23) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 4:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("உறுதி  ");
                    resabam.setText("நன்மை ");
                    methunam.setText("நிறைவு  ");
                    kadagam.setText("தனம்  ");
                    simamam.setText("கோபம்  ");
                    kanni.setText(" பயம்  ");
                    thulam.setText("இன்பம்   ");
                    viruchagam.setText("போட்டி   ");
                    thanusu.setText("பெருமை  ");
                    magaram.setText("செலவு  ");
                    kumbam.setText("சுபம்  ");
                    menam.setText("வெற்றி  ");
                    break;
                case "2024-04-22":

                    text_view_tamil_date.setText("9 - சித்திரை, குரோதி");
                    tamil_day.setText("திங்கள்");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("சதுர்த்தசி  (கா. 04.20) ஹஸ்தம்  (மா.08.50)");

                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("சினம்  ");
                    resabam.setText("திரமை ");
                    methunam.setText("உறுதி ");
                    kadagam.setText(" கோபம்");
                    simamam.setText("தனம் ");
                    kanni.setText(" பயம்");
                    thulam.setText("இன்பம் ");
                    viruchagam.setText("போட்டி");
                    thanusu.setText("பெருமை");
                    magaram.setText("தாமதம்");
                    kumbam.setText("நற்சொல் ");
                    menam.setText("வீம்பு ");
                    break;
                case "2024-04-23":
                    text_view_tamil_date.setText("10 - சித்திரை, குரோதி");
                    tamil_day.setText("செவ்வாய்");

                    theiperai_valarperai.setText("பௌர்ணமி");
                    astami_navami.setText("பௌர்ணமி (கா. 05.54) சித்திரை (மா. 11.00)");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:30 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("லாபம்  ");
                    resabam.setText("பயம் ");
                    methunam.setText("பரிவு  ");
                    kadagam.setText("சுபம் ");
                    simamam.setText("நன்மை  ");
                    kanni.setText(" கவலை  ");
                    thulam.setText("செலவு  ");
                    viruchagam.setText("அன்பு  ");
                    thanusu.setText("தாமதம்  ");
                    magaram.setText("வரவு   ");
                    kumbam.setText("சுகம்   ");
                    menam.setText("போட்டி ");
                    break;
                case "2024-04-24":

                    text_view_tamil_date.setText("11 -சித்திரை, குரோதி");
                    tamil_day.setText("புதன்");

                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("பிரதமை  (முழுவதும்) சுவாதி  (கா. 12.48)");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("வெற்றி ");
                    resabam.setText("ஆதரவு ");
                    methunam.setText("சாந்தம்  ");
                    kadagam.setText("நட்பு  ");
                    simamam.setText("நன்மை  ");
                    kanni.setText(" போட்டி  ");
                    thulam.setText("முயற்சி  ");
                    viruchagam.setText("கவலை   ");
                    thanusu.setText("பயம்  ");
                    magaram.setText("மகிழ்ச்சி  ");
                    kumbam.setText("பொறுமை  ");
                    menam.setText("பெருமை  ");
                    break;
                case "2024-04-25":

                    text_view_tamil_date.setText("12 -சித்திரை, குரோதி");
                    tamil_day.setText("வியாழன்");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("பிரதமை (கா.06.51) விசாகம் (கா.02.09)");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" - pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("அமைதி  ");
                    resabam.setText("புகழ் ");
                    methunam.setText("சுகம்  ");
                    kadagam.setText("நலம்  ");
                    simamam.setText("கவலை ");
                    kanni.setText(" தனம் ");
                    thulam.setText("சுபம்  ");
                    viruchagam.setText("ஆதரவு  ");
                    thanusu.setText("பாசம்  ");
                    magaram.setText("சினம் ");
                    kumbam.setText("வெற்றி ");
                    menam.setText(" போட்டி  ");
                    break;
                case "2024-04-26":
                    text_view_tamil_date.setText("13 -சித்திரை, குரோதி");
                    tamil_day.setText("வெள்ளி");

                    theiperai_valarperai.setText("தேய்பிறை-சுபமுகூர்த்தம் ");
                    astami_navami.setText("துவிதியை (கா.07.26) அனுஷம் (கா.03.01)");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("பெருமை  ");
                    resabam.setText("மேன்மை  ");
                    methunam.setText("கவலை  ");
                    kadagam.setText("அசதி ");
                    simamam.setText("வரவு  ");
                    kanni.setText(" களிப்பு  ");
                    thulam.setText("அச்சம்   ");
                    viruchagam.setText("செலவு ");
                    thanusu.setText("ஜெயம்   ");
                    magaram.setText("லாபம்   ");
                    kumbam.setText("பகை  ");
                    menam.setText("வெற்றி ");
                    break;
                case "2024-04-27":

                    text_view_tamil_date.setText("14 -சித்திரை, குரோதி");
                    tamil_day.setText("சனி");

                    theiperai_valarperai.setText("தேய்பிறை-சங்கடஹர சதுர்த்தி");
                    astami_navami.setText(" திரிதியை  (கா.07.33) கேட்டை (கா.03.21) ");

                    nalla_neaream_kalai.setText("7:30 - 8:00 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("அமைதி  ");
                    resabam.setText("செலவு ");
                    methunam.setText("நன்மை  ");
                    kadagam.setText("ஆதரவு   ");
                    simamam.setText("முயற்சி  ");
                    kanni.setText(" சுபம்  ");
                    thulam.setText("ஜெயம்  ");
                    viruchagam.setText("உயர்வு  ");
                    thanusu.setText("மறதி ");
                    magaram.setText("உதவி  ");
                    kumbam.setText("பகை  ");
                    menam.setText("பிரீதி ");
                    break;
                case "2024-04-28":

                    text_view_tamil_date.setText("15 -சித்திரை, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("தேய்பிறை-கரிநாள் ");
                    astami_navami.setText("சதுர்த்தி (கா.07.06) மூலம் (கா.03.12)");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("பொறுமை ");
                    resabam.setText("ஆர்வம்  ");
                    methunam.setText("வரவு  ");
                    kadagam.setText("போட்டி ");
                    simamam.setText("பக்தி  ");
                    kanni.setText(" மேன்மை  ");
                    thulam.setText("அமைதி  ");
                    viruchagam.setText("அனுகூலம்  ");
                    thanusu.setText("புகழ்  ");
                    magaram.setText("கீர்த்தி  ");
                    kumbam.setText("உயர்வு  ");
                    menam.setText("ஜெயம்  ");
                    break;
                case "2024-04-29":

                    text_view_tamil_date.setText("16 - சித்திரை, குரோதி");
                    tamil_day.setText("திங்கள்");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("பஞ்சமி  (கா.06.08) ஷஷ்டி  (கா. 04.46)");

                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("வெற்றி ");
                    resabam.setText("உயர்வு ");
                    methunam.setText(" பெருமை   ");
                    kadagam.setText("அமைதி  ");
                    simamam.setText("நன்மை  ");
                    kanni.setText(" ஆதரவு  ");
                    thulam.setText("போட்டி  ");
                    viruchagam.setText("நிறைவு   ");
                    thanusu.setText("அச்சம்  ");
                    magaram.setText("பகை ");
                    kumbam.setText("பாசம்  ");
                    menam.setText("சுகம்  ");
                    break;
                case "2024-04-30":

                    text_view_tamil_date.setText("17 - சித்திரை, குரோதி");
                    tamil_day.setText("செவ்வாய்");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("ஸப்தமி (கா.03.10) உத்திராடம் (கா.01.42)");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("உயர்வு  ");
                    resabam.setText("துயரம் ");
                    methunam.setText("நலம்  ");
                    kadagam.setText("தேர்ச்சி ");
                    simamam.setText("இரக்கம்  ");
                    kanni.setText(" பொறுமை  ");
                    thulam.setText("அலைச்சல்  ");
                    viruchagam.setText("சோதனை   ");
                    thanusu.setText("சினம்  ");
                    magaram.setText("நிம்மதி  ");
                    kumbam.setText("பகை  ");
                    menam.setText("வெற்றி  ");
                    break;

                /*******************************************************5. may ************************************************************************************/

                case "2024-05-01":

                    text_view_tamil_date.setText("18 - சித்திரை, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("தேய்பிறை -  தொழிலாளர் தினம் ");
                    astami_navami.setText("அஷ்டமி (கா.01.09) திருவோணம் (கா. 12.28) ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("மகிழ்ச்சி ");
                    resabam.setText("விருத்தி  ");
                    methunam.setText("செலவு  ");
                    kadagam.setText("ஏமாற்றம்  ");
                    simamam.setText("வரவு ");
                    kanni.setText("சிக்கல் ");
                    thulam.setText("வெற்றி ");
                    viruchagam.setText("தேர்ச்சி  ");
                    thanusu.setText("நன்மை ");
                    magaram.setText("கவலை ");
                    kumbam.setText("எதிர்ப்பு ");
                    menam.setText("ஆர்வம் ");
                    break;
                case "2024-05-02":

                    text_view_tamil_date.setText("19 - சித்திரை, குரோதி");
                    tamil_day.setText("வியாழன்");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("நவமி (மா. 10.57) அவிட்டம் (மா. 11.03) ");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("பொறுமை  ");
                    resabam.setText("அனுகூலம்  ");
                    methunam.setText("பாசம் ");
                    kadagam.setText("உயர்வு  ");
                    simamam.setText("போட்டி ");
                    kanni.setText("நன்மை  ");
                    thulam.setText("முயற்சி ");
                    viruchagam.setText("சுகம் ");
                    thanusu.setText("ஆசை  ");
                    magaram.setText("வரவு  ");
                    kumbam.setText("அமைதி  ");
                    menam.setText("வெற்றி");
                    break;
                case "2024-05-03":
                    text_view_tamil_date.setText("20 - சித்திரை, குரோதி");
                    tamil_day.setText("வெள்ளி");

                    theiperai_valarperai.setText("தேய்பிறை-சுபமுகூர்த்தம்");
                    astami_navami.setText("தசமி (மா. 08.36) சதயம்  (மா. 09.26) ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("லாபம்  ");
                    resabam.setText("ஆசை ");
                    methunam.setText("நன்மை ");
                    kadagam.setText("நட்பு ");
                    simamam.setText("ஆக்கம் ");
                    kanni.setText("இன்பம்");
                    thulam.setText(" சுகம்  ");
                    viruchagam.setText("தடங்கல் ");
                    thanusu.setText("அமைதி ");
                    magaram.setText("போட்டி ");
                    kumbam.setText("முயற்சி ");
                    menam.setText("பொறுமை");
                    break;
                case "2024-05-04":
                    text_view_tamil_date.setText("21 - சித்திரை, குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("தேய்பிறை-அக்னி நட்சத்திரம் துவக்கம்.");
                    astami_navami.setText("ஏகாதசி (மா. 06.10) பூரட்டாதி (மா. 07.49)  ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4.30 - 5.30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("முயற்சி ");
                    resabam.setText("சினம் ");
                    methunam.setText("வரவு  ");
                    kadagam.setText("அனுகூலம்  ");
                    simamam.setText("விவேகம்  ");
                    kanni.setText("புகழ்  ");
                    thulam.setText("இன்பம்  ");
                    viruchagam.setText("சாந்தம்  ");
                    thanusu.setText("ஆதரவு  ");
                    magaram.setText("உயர்வு  ");
                    kumbam.setText("அமைதி  ");
                    menam.setText("நன்மை  ");
                    break;
                case "2024-05-05":

                    text_view_tamil_date.setText("22 - சித்திரை, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("தேய்பிறை-பிரதோஷம்.சுபமுகூர்த்தம். ");
                    astami_navami.setText("துவாதசி (மா. 03.43) உத்திரட்டாதி (மா.06.08) ");

                    nalla_neaream_kalai.setText("8:00 - 9:00 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("செலவு ");
                    resabam.setText("ஆர்வம்  ");
                    methunam.setText("பக்தி  ");
                    kadagam.setText("பேராசை ");
                    simamam.setText("லாபம் ");
                    kanni.setText(" தடங்கல் ");
                    thulam.setText("ஆதாயம் ");
                    viruchagam.setText("செலவு  ");
                    thanusu.setText("ஜெயம்  ");
                    magaram.setText("பயம்  ");
                    kumbam.setText("வெற்றி  ");
                    menam.setText("அனுகூலம்  ");
                    break;
                case "2024-05-06":
                    text_view_tamil_date.setText("23 - சித்திரை, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("தேய்பிறை-சுபமுகூர்த்தம். மாத சிவராத்திரி. ");
                    astami_navami.setText("திரயோதசி (மா. 01.25) ரேவதி (மா.04.39) ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("சுபம் ");
                    resabam.setText("இன்பம் ");
                    methunam.setText("முயற்சி  ");
                    kadagam.setText("சாந்தம் ");
                    simamam.setText("நலம் ");
                    kanni.setText("வெற்றி ");
                    thulam.setText("நட்பு ");
                    viruchagam.setText("உயர்வு  ");
                    thanusu.setText("புகழ்  ");
                    magaram.setText(" போட்டி ");
                    kumbam.setText("பெருமை ");
                    menam.setText("ஊக்கம்");
                    break;
                case "2024-05-07":
                    text_view_tamil_date.setText("24 - சித்திரை, குரோதி");
                    tamil_day.setText("செவ்வாய்");

                    theiperai_valarperai.setText("தேய்பிறை-ஸர்வ அமாவாஸ்யை ");
                    astami_navami.setText("சதுர்த்தசி (கா. 11.17) அசுபதி (மா. 03.19) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("தெளிவு ");
                    resabam.setText("நன்மை  ");
                    methunam.setText("பிரீதி   ");
                    kadagam.setText("புகழ் ");
                    simamam.setText("பயம் ");
                    kanni.setText("ஆர்வம் ");
                    thulam.setText("அமைதி ");
                    viruchagam.setText("இன்பம்   ");
                    thanusu.setText("ஆக்கம்  ");
                    magaram.setText("உற்சாகம்   ");
                    kumbam.setText("வரவு  ");
                    menam.setText("பொறுமை");
                    break;
                case "2024-05-08":

                    text_view_tamil_date.setText("25 - சித்திரை, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("வளர்பிறை  ");
                    astami_navami.setText("அமாவாஸ்யை (கா.09.19) பரணி (மா. 02.11)  ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("நற்செயல் ");
                    resabam.setText("சினம் ");
                    methunam.setText("புகழ்  ");
                    kadagam.setText("ஆர்வம் ");
                    simamam.setText("எதிர்ப்பு ");
                    kanni.setText(" அசதி ");
                    thulam.setText("சுகம்  ");
                    viruchagam.setText("செலவு  ");
                    thanusu.setText(" கவலை ");
                    magaram.setText(" வெற்றி ");
                    kumbam.setText("தனம் ");
                    menam.setText("அனுகூலம்  ");
                    break;
                case "2024-05-09":

                    text_view_tamil_date.setText("26 - சித்திரை, குரோதி");
                    tamil_day.setText("வியாழன்");

                    theiperai_valarperai.setText("வளர்பிறை-சந்திர தரிசனம்.  ");
                    astami_navami.setText("பிரதமை (கா. 07.43) கார்த்திகை (மா. 01.26) ");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("சுகம்  ");
                    resabam.setText("உயர்வு ");
                    methunam.setText("பரிசு ");
                    kadagam.setText("அமைதி ");
                    simamam.setText("போட்டி ");
                    kanni.setText("இரக்கம் ");
                    thulam.setText("வெற்றி ");
                    viruchagam.setText("முயற்சி ");
                    thanusu.setText("பாசம் ");
                    magaram.setText("ஊக்கம் ");
                    kumbam.setText("தோல்வி ");
                    menam.setText("நன்மை");
                    break;
                case "2024-05-10":
                    text_view_tamil_date.setText("27 - சித்திரை, குரோதி");
                    tamil_day.setText("வெள்ளி");

                    theiperai_valarperai.setText("வளர்பிறை-அட்சய திரிதியை.  ");
                    astami_navami.setText(" துவிதியை (கா.06.32) திரிதியை (கா.04.56)  ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("லாபம் ");
                    resabam.setText(" பொறுமை ");
                    methunam.setText("உதவி  ");
                    kadagam.setText("நற்செயல்  ");
                    simamam.setText("ஆக்கம் ");
                    kanni.setText("பாசம் ");
                    thulam.setText("இன்பம் ");
                    viruchagam.setText("வரவு ");
                    thanusu.setText("போட்டி ");
                    magaram.setText("அமைதி ");
                    kumbam.setText("அனுகூலம் ");
                    menam.setText(" சுகம்");
                    break;
                case "2024-05-11":

                    text_view_tamil_date.setText("28 - சித்திரை, குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("வளர்பிறை- சதுர்த்தி விரதம்.");
                    astami_navami.setText("சதுர்த்தி (கா.05.17) மிருகசீருஷம் (மா. 01.08) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4.30 - 5.30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("நன்மை ");
                    resabam.setText("செலவு ");
                    methunam.setText("சினம் ");
                    kadagam.setText("அனுகூலம்  ");
                    simamam.setText("ஆதரவு ");
                    kanni.setText("சுபம் ");
                    thulam.setText("அச்சம் ");
                    viruchagam.setText("பாசம் ");
                    thanusu.setText("வெற்றி ");
                    magaram.setText("தனம் ");
                    kumbam.setText("நற்செயல் ");
                    menam.setText("உதவி");
                    break;
                case "2024-05-12":

                    text_view_tamil_date.setText("29 - சித்திரை, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("வளர்பிறை-ஸ்ரீமத்சங்கரஜெயந்தி.");
                    astami_navami.setText("பஞ்சமி (கா.05.28) திருவாதிரை (மா. 01.40) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("மகிழ்ச்சி  ");
                    resabam.setText("ஆசை ");
                    methunam.setText("பொறுமை  ");
                    kadagam.setText("அச்சம் ");
                    simamam.setText("வெற்றி ");
                    kanni.setText("இரக்கம் ");
                    thulam.setText("சுகம்  ");
                    viruchagam.setText("நற்செயல்  ");
                    thanusu.setText("போட்டி  ");
                    magaram.setText("பெருமை  ");
                    kumbam.setText("அமைதி  ");
                    menam.setText(" நன்மை ");
                    break;
                case "2024-05-13":

                    text_view_tamil_date.setText("30 - சித்திரை, குரோதி");
                    tamil_day.setText("திங்கள்");

                    theiperai_valarperai.setText("வளர்பிறை-சுபமுகூர்த்தம். ஷஷ்டி விரதம்.");
                    astami_navami.setText("ஷஷ்டி (முழுவதும்) புனர்பூசம் (மா. 02.44 )");

                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("அமைதி ");
                    resabam.setText("இன்பம் ");
                    methunam.setText("புகழ் ");
                    kadagam.setText("வெற்றி ");
                    simamam.setText("அனுகூலம் ");
                    kanni.setText("உதவி ");
                    thulam.setText("போட்டி ");
                    viruchagam.setText("செலவு ");
                    thanusu.setText("ஆசை ");
                    magaram.setText("உயர்வு ");
                    kumbam.setText("நன்மை ");
                    menam.setText("சுபம்");
                    break;
                case "2024-05-14":

                    text_view_tamil_date.setText("1 - வைகாசி, குரோதி");
                    tamil_day.setText("செவ்வாய்");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("ஷஷ்டி  (கா.06.21 பூசம்  (மா. 04.15) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("நன்மை ");
                    resabam.setText("பக்தி ");
                    methunam.setText("ஓய்வு ");
                    kadagam.setText("பரிசு ");
                    simamam.setText("வெற்றி ");
                    kanni.setText("சிரமம் ");
                    thulam.setText("இன்பம் ");
                    viruchagam.setText("நிறைவு ");
                    thanusu.setText("ஆர்வம் ");
                    magaram.setText("பேராசை ");
                    kumbam.setText("நஷ்டம் ");
                    menam.setText("மகிழ்ச்சி");
                    break;
                case "2024-05-15":

                    text_view_tamil_date.setText("2 - வைகாசி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("ஸப்தமி  (கா.07.40) ஆயில்யம்  (மா.06.12)");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("அமைதி ");
                    resabam.setText("நஷ்டம் ");
                    methunam.setText("பாசம் ");
                    kadagam.setText("நற்செயல் ");
                    simamam.setText("பாராட்டு ");
                    kanni.setText("சிந்தனை ");
                    thulam.setText("சலனம் ");
                    viruchagam.setText("ஆர்வம் ");
                    thanusu.setText("சுகம் ");
                    magaram.setText("நலம் ");
                    kumbam.setText("பிரயாசை ");
                    menam.setText("கீர்த்தி");
                    break;
                case "2024-05-16":

                    text_view_tamil_date.setText("3 - வைகாசி, குரோதி");
                    tamil_day.setText("வியாழன்");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("அஷ்டமி (கா. 09.06) மகம் (மா.08.33) ");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("சுபம் ");
                    resabam.setText("நட்பு");
                    methunam.setText(" சுகம் ");
                    kadagam.setText("ஆதாயம் ");
                    simamam.setText("தாமதம் ");
                    kanni.setText(" விருப்பம்  ");
                    thulam.setText("தடை ");
                    viruchagam.setText("தேர்ச்சி ");
                    thanusu.setText("அலைச்சல் ");
                    magaram.setText("வெற்றி ");
                    kumbam.setText("நன்மை ");
                    menam.setText("பக்தி");
                    break;
                case "2024-05-17":

                    text_view_tamil_date.setText("4 - வைகாசி, குரோதி");
                    tamil_day.setText("வெள்ளி");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("நவமி (கா. 10.55) பூரம் (மா. 11.03)");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("ஓய்வு ");
                    resabam.setText("குழப்பம் ");
                    methunam.setText("ஆரோக்கியம் ");
                    kadagam.setText("வெற்றி ");
                    simamam.setText("சுகம் ");
                    kanni.setText("நட்பு ");
                    thulam.setText("அமைதி ");
                    viruchagam.setText("சலனம் ");
                    thanusu.setText("முயற்சி ");
                    magaram.setText("ஆர்வம் ");
                    kumbam.setText("பயம்  ");
                    menam.setText("பகை");
                    break;
                case "2024-05-18":
                    text_view_tamil_date.setText("5 - வைகாசி, குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("வளர்பிறை  ");
                    astami_navami.setText(" தசமி (மா. 12.53) உத்திரம் (கா.01.39) ");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" 4.30 - 5.30  pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("நன்மை");
                    resabam.setText(" பக்தி  ");
                    methunam.setText("வெற்றி   ");
                    kadagam.setText("சுகம்  ");
                    simamam.setText("பயம்");
                    kanni.setText(" நஷ்டம் ");
                    thulam.setText(" பாராட்டு ");
                    viruchagam.setText(" குழப்பம் ");
                    thanusu.setText(" பிரமை ");
                    magaram.setText("அமைதி  ");
                    kumbam.setText("விவேகம்   ");
                    menam.setText("அன்பு ");
                    break;
                case "2024-05-19":
                    text_view_tamil_date.setText("6 - வைகாசி, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("வளர்பிறை-சுபமுகூர்த்தம். ஸர்வ ஏகாதசி.");
                    astami_navami.setText("ஏகாதசி (மா. 02.53) ஹஸ்தம் (கா. 04.09)  ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("நிறைவு ");
                    resabam.setText("ஆர்வம் ");
                    methunam.setText("முயற்சி ");
                    kadagam.setText("பரிவு ");
                    simamam.setText("ஓய்வு ");
                    kanni.setText("வெற்றி   ");
                    thulam.setText("நன்மை ");
                    viruchagam.setText("சிந்தனை");
                    thanusu.setText(" செலவு   ");
                    magaram.setText("அமைதி  ");
                    kumbam.setText("வரவு   ");
                    menam.setText("சாதனை  ");
                    break;
                case "2024-05-20":
                    text_view_tamil_date.setText("7 -வைகாசி, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("வளர்பிறை -  பிரதோஷம் ");
                    astami_navami.setText("துவாதசி  (மா. 04.40) சித்திரை (முழுவதும்) ");

                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("யோகம்");
                    resabam.setText("பெருமை ");
                    methunam.setText("மேன்மை ");
                    kadagam.setText("சோதனை ");
                    simamam.setText("கஷ்டம்");
                    kanni.setText(" தொல்லை ");
                    thulam.setText("அமைதி");
                    viruchagam.setText("கவனம் ");
                    thanusu.setText("நிம்மதி");
                    magaram.setText("பக்தி");
                    kumbam.setText("வெற்றி");
                    menam.setText("நன்மை ");
                    break;
                case "2024-05-21":

                    text_view_tamil_date.setText("8 - வைகாசி, குரோதி");
                    tamil_day.setText("செவ்வாய்");

                    theiperai_valarperai.setText("வளர்பிறை- கரிநாள்");
                    astami_navami.setText("திரயோதசி  (மா. 06.08) சித்திரை  (கா.06.23)  ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("செலவு  ");
                    resabam.setText("ஆதாயம்   ");
                    methunam.setText("வரவு  ");
                    kadagam.setText("தடங்கல்  ");
                    simamam.setText("நன்மை ");
                    kanni.setText(" சுகம்   ");
                    thulam.setText("பெருமை   ");
                    viruchagam.setText("நலம்   ");
                    thanusu.setText("கீர்த்தி  ");
                    magaram.setText("உழைப்பு  ");
                    kumbam.setText("உதவி   ");
                    menam.setText("அலைச்சல் ");
                    break;
                case "2024-05-22":

                    text_view_tamil_date.setText("9 - வைகாசி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("வளர்பிறை - வைகாசி விசாகம் ");
                    astami_navami.setText("சதுர்த்தசி  (மா. 07.13) சுவாதி (கா.08.17)");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("தாமதம்    ");
                    resabam.setText("சுபம் ");
                    methunam.setText("குழப்பம் ");
                    kadagam.setText(" ஓய்வு");
                    simamam.setText("பக்தி ");
                    kanni.setText("பேராசை  ");
                    thulam.setText("நிம்மதி ");
                    viruchagam.setText("வெற்றி  ");
                    thanusu.setText("நலம் ");
                    magaram.setText("ஆர்வம் ");
                    kumbam.setText("நன்மை ");
                    menam.setText("பொறுமை");
                    break;
                case "2024-05-23":
                    text_view_tamil_date.setText("10 - வைகாசி, குரோதி");
                    tamil_day.setText("வியாழன்");

                    theiperai_valarperai.setText("பௌர்ணமி - புத்த பூர்ணிமா");
                    astami_navami.setText("பௌர்ணமி  (மா. 07.48) விசாகம்  (கா.09.43)");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("12:00 - 1:00 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("சாந்தம் ");
                    resabam.setText("ஜெயம்  ");
                    methunam.setText("விருத்தி ");
                    kadagam.setText("லாபம் ");
                    simamam.setText("உயர்வு ");
                    kanni.setText(" முயற்சி ");
                    thulam.setText("யோகம்  ");
                    viruchagam.setText("பரிவு  ");
                    thanusu.setText("பிரீதி    ");
                    magaram.setText("நன்மை    ");
                    kumbam.setText("நட்பு    ");
                    menam.setText("வெற்றி ");
                    break;
                case "2024-05-24":

                    text_view_tamil_date.setText("11 -வைகாசி, குரோதி");
                    tamil_day.setText("வெள்ளி");

                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("பிரதமை  (மா. 07.50) அனுஷம் (கா.10.39)");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("2:00 - 3:00 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("போட்டி ");
                    resabam.setText("செலவு  ");
                    methunam.setText("அமைதி  ");
                    kadagam.setText("சிந்தனை ");
                    simamam.setText("பாராட்டு  ");
                    kanni.setText(" நன்மை ");
                    thulam.setText("சோதனை ");
                    viruchagam.setText("ஆக்கம்  ");
                    thanusu.setText("சாதனை  ");
                    magaram.setText("பேராசை ");
                    kumbam.setText("நஷ்டம் ");
                    menam.setText("சாந்தம் ");
                    break;
                case "2024-05-25":

                    text_view_tamil_date.setText("12 -வைகாசி, குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("துவிதியை  (மா.07.24) கேட்டை (கா. 11.06)");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText(" 4.30- 5.30pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("விருப்பம்  ");
                    resabam.setText("ஜெயம்  ");
                    methunam.setText("நிறைவு  ");
                    kadagam.setText("சாந்தம்  ");
                    simamam.setText("நற்செய்தி ");
                    kanni.setText("அமைதி ");
                    thulam.setText("பரிசு ");
                    viruchagam.setText("முயற்சி ");
                    thanusu.setText("பாராட்டு  ");
                    magaram.setText("ஆர்வம் ");
                    kumbam.setText("உதவி  ");
                    menam.setText(" பக்தி ");
                    break;
                case "2024-05-26":
                    text_view_tamil_date.setText("13 -வைகாசி, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("தேய்பிறை-சுபமுகூர்த்தம். சங்கடஹர சதுர்த்தி.திருத்துவ ஞாயிறு.  ");
                    astami_navami.setText("திரிதியை  (மா.06.28) மூலம்  (கா.11.04)");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("பகை ");
                    resabam.setText("மறதி ");
                    methunam.setText("சினம் ");
                    kadagam.setText("போட்டி  ");
                    simamam.setText("பெருமை  ");
                    kanni.setText(" அமைதி ");
                    thulam.setText("ஜெயம்  ");
                    viruchagam.setText("செலவு ");
                    thanusu.setText("தெளிவு ");
                    magaram.setText("இன்பம் ");
                    kumbam.setText("முயற்சி ");
                    menam.setText("நற்செயல் ");
                    break;
                case "2024-05-27":

                    text_view_tamil_date.setText("14 -வைகாசி, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText(" சதுர்த்தி  (மா. 05.08) பூராடம்  (கா. 10.36) ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("பாராட்டு  ");
                    resabam.setText("பரிவு ");
                    methunam.setText("நன்மை ");
                    kadagam.setText("யோகம் ");
                    simamam.setText("வரவு");
                    kanni.setText(" நலம் ");
                    thulam.setText("மேன்மை  ");
                    viruchagam.setText("சிந்தனை ");
                    thanusu.setText("கவனம்  ");
                    magaram.setText("பெருமை  ");
                    kumbam.setText("திறமை   ");
                    menam.setText(" பகை ");
                    break;
                case "2024-05-28":

                    text_view_tamil_date.setText("15 -வைகாசி, குரோதி");
                    tamil_day.setText("செவ்வாய்");

                    theiperai_valarperai.setText("தேய்பிறை-அக்னி நட்சத்திரம் முடிவு. திருவோண விரதம். ");
                    astami_navami.setText("பஞ்சமி (மா. 03.26) உத்திராடம் (கா.09.46) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("ஆக்கம்  ");
                    resabam.setText("ஆரோக்கியம் ");
                    methunam.setText("ஜெயம் ");
                    kadagam.setText("பாசம்   ");
                    simamam.setText("உதவி  ");
                    kanni.setText(" போட்டி   ");
                    thulam.setText("சினம்  ");
                    viruchagam.setText("மறதி  ");
                    thanusu.setText("ஆர்வம் ");
                    magaram.setText("ஓய்வு  ");
                    kumbam.setText("பக்தி ");
                    menam.setText("பாராட்டு ");
                    break;
                case "2024-05-29":

                    text_view_tamil_date.setText("16 - வைகாசி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("ஷஷ்டி (மா. 01.26) திருவோணம் (கா.08.36)");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("குழப்பம் ");
                    resabam.setText("இரக்கம் ");
                    methunam.setText(" சோர்வு ");
                    kadagam.setText(" கவலை   ");
                    simamam.setText("இன்பம்  ");
                    kanni.setText(" துயரம்  ");
                    thulam.setText("வேதனை  ");
                    viruchagam.setText("ஆதாயம்  ");
                    thanusu.setText("அனுகூலம்  ");
                    magaram.setText("சினம் ");
                    kumbam.setText("நன்மை  ");
                    menam.setText("சுகம்  ");
                    break;
                case "2024-05-30":

                    text_view_tamil_date.setText("17 - வைகாசி, குரோதி");
                    tamil_day.setText("வியாழன்");

                    theiperai_valarperai.setText("தேய்பிறை - கரிநாள். ");
                    astami_navami.setText("ஸப்தமி  (கா.11.22) அவிட்டம்  (கா.07.11) சதயம்  (கா 04.22) ");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText("-");

                    gowri_nallaneram_kalai.setText("12:00 - 1:00 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("முயற்சி ");
                    resabam.setText("சாந்தம்  ");
                    methunam.setText("பெருமை  ");
                    kadagam.setText("மேன்மை ");
                    simamam.setText("நிறைவு  ");
                    kanni.setText(" யோகம்  ");
                    thulam.setText("உதவி  ");
                    viruchagam.setText("உழைப்பு  ");
                    thanusu.setText("இரக்கம்  ");
                    magaram.setText("நட்பு   ");
                    kumbam.setText("சினம்  ");
                    menam.setText("தொல்லை  ");
                    break;
                case "2024-05-31":

                    text_view_tamil_date.setText("18 - வைகாசி, குரோதி");
                    tamil_day.setText("வெள்ளி");

                    theiperai_valarperai.setText("தேய்பிறை - கரிநாள்.");
                    astami_navami.setText("அஷ்டமி  (கா 08.52) பூரட்டாதி  (கா. 04.03) ");

                    nalla_neaream_kalai.setText("9:00 - 10:00 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("அமைதி  ");
                    resabam.setText("ஆர்வம்");
                    methunam.setText(" சுகம்  ");
                    kadagam.setText("சினம்  ");
                    simamam.setText("முயற்சி  ");
                    kanni.setText(" பரிவு  ");
                    thulam.setText("பாராட்டு  ");
                    viruchagam.setText("சிக்கல்  ");
                    thanusu.setText(" வாழ்வு  ");
                    magaram.setText("பொறுமை   ");
                    kumbam.setText("அசதி  ");
                    menam.setText("புகழ்   ");
                    break;


                /*******************************************************6. june ************************************************************************************/

                case "2024-06-01":

                    text_view_tamil_date.setText("19 - வைகாசி, குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("வளர்பிறை  ");
                    astami_navami.setText("அஷ்டமி (கா. 12.46) பூரம் (கா.06.23) ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("முயற்சி ");
                    resabam.setText("இன்பம் ");
                    methunam.setText("புகழ்  ");
                    kadagam.setText("செலவு  ");
                    simamam.setText("சுகம் ");
                    kanni.setText("வெற்றி  ");
                    thulam.setText(" உறுதி ");
                    viruchagam.setText("ஈகை  ");
                    thanusu.setText("தனம்  ");
                    magaram.setText(" பகை ");
                    kumbam.setText("சாந்தம் ");
                    menam.setText("அன்பு");
                    break;
                case "2024-06-02":

                    text_view_tamil_date.setText("20 - வைகாசி, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("தேய்பிறை -  ஸர்வ ஏகாதசி. சுபமுகூர்த்தம். ");
                    astami_navami.setText("ஏகாதசி (கா. 01.41) ரேவதி (கா. 12.52) ");

                    nalla_neaream_kalai.setText("07:30 - 08:30 am");
                    nalla_neaream_malai.setText("03.30 -04.30 pm ");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("பெருமை ");
                    resabam.setText("ஊக்கம் ");
                    methunam.setText("ஆர்வம்");
                    kadagam.setText(" பயம் ");
                    simamam.setText("பரிவு  ");
                    kanni.setText("பாசம் ");
                    thulam.setText("உதவி ");
                    viruchagam.setText("செலவு ");
                    thanusu.setText("வரவு  ");
                    magaram.setText("உறுதி ");
                    kumbam.setText("வெற்றி ");
                    menam.setText("பக்தி ");
                    break;
                case "2024-06-03":
                    text_view_tamil_date.setText("21 - வைகாசி, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("தேய்பிறை-வாஸ்து நாள்.");
                    astami_navami.setText("துவாதசி (மா. 11.31) அசுபதி (மா. 11.29) ");

                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("முயற்சி ");
                    resabam.setText("ஆக்கம் ");
                    methunam.setText("தனம்  ");
                    kadagam.setText("பக்தி ");
                    simamam.setText("நிறைவு ");
                    kanni.setText("உதவி ");
                    thulam.setText("நம்பிக்கை ");
                    viruchagam.setText("பாராட்டு  ");
                    thanusu.setText("தடங்கல்  ");
                    magaram.setText("சாதனை ");
                    kumbam.setText("ஆதாயம் ");
                    menam.setText("சுகம்");
                    break;
                case "2024-06-04":
                    text_view_tamil_date.setText("22 - வைகாசி, குரோதி");
                    tamil_day.setText("செவ்வாய்");

                    theiperai_valarperai.setText("தேய்பிறை-பிரதோஷம். மாத சிவராத்திரி. ");
                    astami_navami.setText("திரயோதசி (மா. 09.34) பரணி (மா.10.18)  ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4.30 - 5.30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("குழப்பம் ");
                    resabam.setText("தனம் ");
                    methunam.setText("கீர்த்தி ");
                    kadagam.setText("சாந்தம்  ");
                    simamam.setText("பக்தி   ");
                    kanni.setText("திடம் ");
                    thulam.setText("அலைச்சல்  ");
                    viruchagam.setText("போட்டி  ");
                    thanusu.setText("பொறுமை  ");
                    magaram.setText("தடை  ");
                    kumbam.setText("பாராட்டு  ");
                    menam.setText("வரவு  ");
                    break;
                case "2024-06-05":

                    text_view_tamil_date.setText("23 - வைகாசி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("தேய்பிறை - கார்த்திகை விரதம். ");
                    astami_navami.setText("சதுர்த்தசி (மா. 07.55) கார்த்திகை (மா.09.28) ");

                    nalla_neaream_kalai.setText("11:30 - 12:00 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("சோர்வு ");
                    resabam.setText("பகை  ");
                    methunam.setText("நன்மை ");
                    kadagam.setText("பெருமை ");
                    simamam.setText("நட்பு ");
                    kanni.setText("லாபம் ");
                    thulam.setText("புகழ்  ");
                    viruchagam.setText("தெளிவு  ");
                    thanusu.setText("ஈகை ");
                    magaram.setText("முயற்சி ");
                    kumbam.setText("உயர்வு  ");
                    menam.setText("வெற்றி  ");
                    break;
                case "2024-06-06":
                    text_view_tamil_date.setText("24 - வைகாசி, குரோதி");
                    tamil_day.setText("வியாழன்");

                    theiperai_valarperai.setText("தேய்பிறை - ஸர்வ அமாவாஸ்யை.");
                    astami_navami.setText("அமாவாஸ்யை (மா. 06.40) ரோகிணி (மா.09.00) ");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText("-");

                    gowri_nallaneram_kalai.setText("11:30 - 12:00 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("திடம் ");
                    resabam.setText("நிறைவு ");
                    methunam.setText("ஆர்வம் ");
                    kadagam.setText("ஆக்கம் ");
                    simamam.setText("சோர்வு ");
                    kanni.setText("பயம் ");
                    thulam.setText("தடை ");
                    viruchagam.setText("இன்பம் ");
                    thanusu.setText("வாழ்வு");
                    magaram.setText(" சினம் ");
                    kumbam.setText("பரிவு ");
                    menam.setText("பக்தி");
                    break;
                case "2024-06-07":
                    text_view_tamil_date.setText("25 - வைகாசி, குரோதி");
                    tamil_day.setText("வெள்ளி");

                    theiperai_valarperai.setText("தேய்பிறை -  சந்திர தரிசனம்.");
                    astami_navami.setText(" பிரதமை (மா 05.30) மிருகசீருஷம் (மா. 08.35)  ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("உறுதி ");
                    resabam.setText("அலைச்சல் ");
                    methunam.setText("சோர்வு ");
                    kadagam.setText("துன்பம் ");
                    simamam.setText("களிப்பு ");
                    kanni.setText("தனம் ");
                    thulam.setText("பரிவு ");
                    viruchagam.setText("உதவி ");
                    thanusu.setText("சினம்  ");
                    magaram.setText("பகை  ");
                    kumbam.setText("ஆர்வம் ");
                    menam.setText("தோல்வி ");
                    break;
                case "2024-06-08":

                    text_view_tamil_date.setText("26 - வைகாசி, குரோதி");
                    tamil_day.setText("சனி  ");

                    theiperai_valarperai.setText("வளர்பிறை  ");
                    astami_navami.setText("துவிதியை (மா. 05.26) திருவாதிரை (மா.09.21) ");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("ஆர்வம் ");
                    resabam.setText("தோல்வி ");
                    methunam.setText("பயம் ");
                    kadagam.setText("பெருமை  ");
                    simamam.setText("அச்சம் ");
                    kanni.setText("உதவி ");
                    thulam.setText("சினம் ");
                    viruchagam.setText("யோகம்  ");
                    thanusu.setText("சோதனை ");
                    magaram.setText("ஆக்கம் ");
                    kumbam.setText("பரிவு ");
                    menam.setText("நன்மை ");
                    break;
                case "2024-06-09":

                    text_view_tamil_date.setText("27 - வைகாசி, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம்.");
                    astami_navami.setText("திரிதியை (மா. 05.37) புனர்பூசம் (மா. 10.19) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3.30 - 4.30 pm");

                    gowri_nallaneram_kalai.setText("11:30 - 12:00 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("மகிழ்ச்சி ");
                    resabam.setText("போட்டி ");
                    methunam.setText("தனம் ");
                    kadagam.setText("லாபம் ");
                    simamam.setText("மேன்மை ");
                    kanni.setText("நிறைவு ");
                    thulam.setText(" கோபம்  ");
                    viruchagam.setText("பயம் ");
                    thanusu.setText("பெருமை  ");
                    magaram.setText("இன்பம் ");
                    kumbam.setText("உயர்வு ");
                    menam.setText("நஷ்டம் ");
                    break;
                case "2024-06-10":
                    text_view_tamil_date.setText("28 - வைகாசி, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம். சதுர்த்தி விரதம். ");
                    astami_navami.setText(" சதுர்த்தி (மா. 06.17) பூசம் (மா. 11.37)  ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("மறதி ");
                    resabam.setText(" ஓய்வு ");
                    methunam.setText("ஆசை ");
                    kadagam.setText("ஜெயம்  ");
                    simamam.setText("கோபம் ");
                    kanni.setText("கீர்த்தி ");
                    thulam.setText("தடங்கல் ");
                    viruchagam.setText("பகை ");
                    thanusu.setText("வரவு  ");
                    magaram.setText("அன்பு  ");
                    kumbam.setText("லாபம் ");
                    menam.setText("திறமை");
                    break;
                case "2024-06-11":

                    text_view_tamil_date.setText("29 - வைகாசி, குரோதி");
                    tamil_day.setText("செவ்வாய் ");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("பஞ்சமி (மா. 07.26) ஆயில்யம் (கா.01.38) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4.30 - 5.30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("நிறைவு ");
                    resabam.setText("அன்பு ");
                    methunam.setText("பரிவு ");
                    kadagam.setText("லாபம்");
                    simamam.setText("நலம் ");
                    kanni.setText("ஜெயம் ");
                    thulam.setText("மறதி  ");
                    viruchagam.setText("பகை  ");
                    thanusu.setText("சாந்தம் ");
                    magaram.setText("ஆசை ");
                    kumbam.setText("வரவு ");
                    menam.setText("தொல்லை");
                    break;
                case "2024-06-12":

                    text_view_tamil_date.setText("30 - வைகாசி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம். ஷஷ்டி விரதம்.");
                    astami_navami.setText("ஷஷ்டி (மா. 08.56) மகம் (கா.03.51)  ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("நஷ்டம் ");
                    resabam.setText("சிக்கல் ");
                    methunam.setText("நன்மை ");
                    kadagam.setText("சுகம் ");
                    simamam.setText("தோல்வி ");
                    kanni.setText("துன்பம் ");
                    thulam.setText("வெற்றி ");
                    viruchagam.setText("செலவு ");
                    thanusu.setText("ஆதரவு ");
                    magaram.setText("பயம் ");
                    kumbam.setText("கவலை ");
                    menam.setText("லாபம் ");
                    break;
                case "2024-06-13":

                    text_view_tamil_date.setText("31 - வைகாசி, குரோதி");
                    tamil_day.setText("வியாழன் ");

                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("சப்தமி (மா. 10.44) பூரம் (முழுவதும்)");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("11:30 - 12:00 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("பாராட்டு ");
                    resabam.setText("போட்டி  ");
                    methunam.setText("நற்சொல்  ");
                    kadagam.setText("பேராசை  ");
                    simamam.setText("பெருமை  ");
                    kanni.setText("நற்செயல் ");
                    thulam.setText("இன்பம் ");
                    viruchagam.setText("பரிசு ");
                    thanusu.setText("பரிவு ");
                    magaram.setText("துன்பம்  ");
                    kumbam.setText("குழப்பம் ");
                    menam.setText("செலவு");
                    break;
                case "2024-06-14":

                    text_view_tamil_date.setText("32 - வைகாசி, குரோதி");
                    tamil_day.setText("வெள்ளி ");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("அஷ்டமி (கா. 12.46) பூரம் (கா.06.23) ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("நிறைவு ");
                    resabam.setText("ஓய்வு  ");
                    methunam.setText("அனுகூலம் ");
                    kadagam.setText("அலைச்சல் ");
                    simamam.setText("வரவு ");
                    kanni.setText("வெற்றி ");
                    thulam.setText("நன்மை ");
                    viruchagam.setText("பகை ");
                    thanusu.setText("ஜெயம் ");
                    magaram.setText("மறதி  ");
                    kumbam.setText("தோல்வி  ");
                    menam.setText("அசதி");
                    break;
                case "2024-06-15":

                    text_view_tamil_date.setText("1 - ஆனி , குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("வளர்பிறை -  கரிநாள்.");
                    astami_navami.setText("நவமி (கா.02.41) உத்திரம் (கா.08.56) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("ஊக்கம்  ");
                    resabam.setText("அமைதி   ");
                    methunam.setText("ஈகை ");
                    kadagam.setText("ஓய்வு ");
                    simamam.setText("மறதி  ");
                    kanni.setText("திடம்  ");
                    thulam.setText("பகை ");
                    viruchagam.setText("சஞ்சலம் ");
                    thanusu.setText("தடை ");
                    magaram.setText("வரவு ");
                    kumbam.setText("ஜெயம் ");
                    menam.setText("ஆசை");
                    break;
                case "2024-06-16":

                    text_view_tamil_date.setText("2 - ஆனி , குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம். அரபா மெக்காவுக்கு ஹஜ்யாத்திரை செய்த நாள்");
                    astami_navami.setText("தசமி (கா.04.28) ஹஸ்தம் (கா. 11.29) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3.30 - 4.30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("தடங்கல் ");
                    resabam.setText("சுகம் ");
                    methunam.setText("பிரீதி ");
                    kadagam.setText("ஆதரவு ");
                    simamam.setText("களிப்பு ");
                    kanni.setText("தனம் ");
                    thulam.setText("வரவு ");
                    viruchagam.setText("தாமதம்  ");
                    thanusu.setText("நட்பு  ");
                    magaram.setText("செலவு  ");
                    kumbam.setText("சிக்கல்  ");
                    menam.setText("இன்பம்");
                    break;
                case "2024-06-17":

                    text_view_tamil_date.setText("3 - ஆனி , குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம். ஏகாதசி. பக்ரீத் பண்டிகை. அரசு விடுமுறை. ");
                    astami_navami.setText("ஏகாதசி (முழுவதும்) சித்திரை (மா. 01.48)");

                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("தனம்");
                    resabam.setText("வரவு ");
                    methunam.setText("சினம்  ");
                    kadagam.setText("அசதி  ");
                    simamam.setText("ஆக்கம்");
                    kanni.setText("சாதனை ");
                    thulam.setText("நிம்மதி ");
                    viruchagam.setText("நற்செயல் ");
                    thanusu.setText("சோர்வு  ");
                    magaram.setText("பரிவு");
                    kumbam.setText("சாந்தம்  ");
                    menam.setText("நிறைவு");
                    break;
                case "2024-06-18":
                    text_view_tamil_date.setText("4 - ஆனி , குரோதி");
                    tamil_day.setText("செவ்வாய் ");

                    theiperai_valarperai.setText("வளர்பிறை - ஸர்வ ஏகாதசி ");
                    astami_navami.setText(" ஏகாதசி (கா 05.56) சுவாதி (மா. 03.47) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText(" 4.30 - 5.30  pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("கவனம் ");
                    resabam.setText(" கஷ்டம் ");
                    methunam.setText("சுகம் ");
                    kadagam.setText("பரிவு");
                    simamam.setText("கவலை ");
                    kanni.setText(" தாமதம்");
                    thulam.setText(" லாபம் ");
                    viruchagam.setText("அலைச்சல் ");
                    thanusu.setText(" விவேகம் ");
                    magaram.setText("வரவு  ");
                    kumbam.setText("முயற்சி");
                    menam.setText("நன்மை ");
                    break;
                case "2024-06-19":
                    text_view_tamil_date.setText("5 - ஆனி , குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("வளர்பிறை - பிரதோஷம்.");
                    astami_navami.setText("துவாதசி (கா. 06.58) விசாகம் (மா. 05.20) ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("பக்தி   ");
                    resabam.setText("பாசம் ");
                    methunam.setText("நன்மை ");
                    kadagam.setText("நேர்மை ");
                    simamam.setText(" மேன்மை ");
                    kanni.setText("எதிர்ப்பு  ");
                    thulam.setText("அலைச்சல்  ");
                    viruchagam.setText("மகிழ்ச்சி ");
                    thanusu.setText("யோகம்  ");
                    magaram.setText("வாழ்வு  ");
                    kumbam.setText("முயற்சி  ");
                    menam.setText("பாசம்  ");
                    break;
                case "2024-06-20":
                    text_view_tamil_date.setText("6 -ஆனி , குரோதி");
                    tamil_day.setText("வியாழன் ");

                    theiperai_valarperai.setText("வளர்பிறை -  கரிநாள். ");
                    astami_navami.setText("திரயோதசி (கா. 07.40) அனுஷம் (மா.06.25 ) ");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("நற்செயல் ");
                    resabam.setText("லாபம்  ");
                    methunam.setText("வெற்றி  ");
                    kadagam.setText("திறமை  ");
                    simamam.setText("சலனம் ");
                    kanni.setText(" தேர்ச்சி  ");
                    thulam.setText("இன்பம் ");
                    viruchagam.setText("பொறுமை ");
                    thanusu.setText("மறதி ");
                    magaram.setText("களிப்பு ");
                    kumbam.setText("கீர்த்தி ");
                    menam.setText("முயற்சி ");
                    break;
                case "2024-06-21":

                    text_view_tamil_date.setText("7 - ஆனி , குரோதி");
                    tamil_day.setText("வெள்ளி ");

                    theiperai_valarperai.setText("வளர்பிறை- பௌர்ணமி.");
                    astami_navami.setText("சதுர்த்தசி (கா.07.44) கேட்டை (மா.06.58)  ");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("12:30 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("வெற்றி  ");
                    resabam.setText("தனம் ");
                    methunam.setText("வரவு  ");
                    kadagam.setText("செலவு ");
                    simamam.setText("பக்தி  ");
                    kanni.setText("சோர்வு ");
                    thulam.setText("சாதனை   ");
                    viruchagam.setText("புகழ்  ");
                    thanusu.setText("சிந்தனை   ");
                    magaram.setText("பிரமை   ");
                    kumbam.setText("திறமை    ");
                    menam.setText("அசதி ");
                    break;
                case "2024-06-22":

                    text_view_tamil_date.setText("8 - ஆனி , குரோதி");
                    tamil_day.setText("சனி");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("பௌர்ணமி (கா.07.19) மூலம் (மா.07.03)");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText("3:30 - 4:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("களிப்பு  ");
                    resabam.setText("கீர்த்தி ");
                    methunam.setText("ஜெயம்  ");
                    kadagam.setText("பரிவு  ");
                    simamam.setText("பாசம் ");
                    kanni.setText("பகை  ");
                    thulam.setText("பரிசு  ");
                    viruchagam.setText("பாராட்டு  ");
                    thanusu.setText("குழப்பம் ");
                    magaram.setText("மேன்மை ");
                    kumbam.setText("நிம்மதி ");
                    menam.setText("நஷ்டம் ");
                    break;
                case "2024-06-23":
                    text_view_tamil_date.setText("9 - ஆனி , குரோதி");
                    tamil_day.setText(" ஞாயிறு");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("பிரதமை (கா.06.19) துவிதியை (கா.04.46)");

                    nalla_neaream_kalai.setText("10:30 - 11:30 am");
                    nalla_neaream_malai.setText("3.30 - 4.30 pm ");

                    gowri_nallaneram_kalai.setText("1:30 - 2:30 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("இன்பம்  ");
                    resabam.setText("ஜெயம்  ");
                    methunam.setText("வரவு ");
                    kadagam.setText("உயர்வு  ");
                    simamam.setText("வெற்றி ");
                    kanni.setText("துன்பம்  ");
                    thulam.setText("பகை ");
                    viruchagam.setText("தாமதம் ");
                    thanusu.setText("ஆதாயம் ");
                    magaram.setText("ஆதரவு ");
                    kumbam.setText("முயற்சி ");
                    menam.setText("சுகம் ");
                    break;
                case "2024-06-24":

                    text_view_tamil_date.setText("10 - ஆனி, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("தேய்பிறை - திருவோண விரதம்.");
                    astami_navami.setText("திரிதியை (கா. 03.25) உத்திராடம் (மா. 05.56) ");

                    nalla_neaream_kalai.setText("6:30 - 7:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("9:30 - 10:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("ஜெயம் ");
                    resabam.setText("நலம் ");
                    methunam.setText("பயம் ");
                    kadagam.setText("பரிவு ");
                    simamam.setText("ஆசை ");
                    kanni.setText("வாழ்வு ");
                    thulam.setText("பரிசு");
                    viruchagam.setText(" செலவு ");
                    thanusu.setText("தனம்   ");
                    magaram.setText("ஆர்வம் ");
                    kumbam.setText("தெளிவு ");
                    menam.setText("உறுதி");
                    break;
                case "2024-06-25":

                    text_view_tamil_date.setText("11 - ஆனி , குரோதி");
                    tamil_day.setText("செவ்வாய் ");

                    theiperai_valarperai.setText("தேய்பிறை - சங்கடஹர சதுர்த்தி. ");
                    astami_navami.setText("சதுர்த்தி (கா.01.25) திருவோணம் (மா. 04.52) ");

                    nalla_neaream_kalai.setText("7:30 - 8:30 am");
                    nalla_neaream_malai.setText(" 4.30- 5.30pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("நலம்  ");
                    resabam.setText("பாராட்டு ");
                    methunam.setText("ஆசை ");
                    kadagam.setText("பரிசு ");
                    simamam.setText("செலவு ");
                    kanni.setText("மேன்மை ");
                    thulam.setText("ஆர்வம்  ");
                    viruchagam.setText("உதவி ");
                    thanusu.setText("முயற்சி  ");
                    magaram.setText("உறுதி ");
                    kumbam.setText("பக்தி   ");
                    menam.setText("தடங்கல்");
                    break;
                case "2024-06-26":
                    text_view_tamil_date.setText("12 - ஆனி , குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("பஞ்சமி  (மா. 11.11) அவிட்டம் (மா.03.30)");

                    nalla_neaream_kalai.setText("9:30 - 10:30 am");
                    nalla_neaream_malai.setText("4:30 - 5:30 pm");

                    gowri_nallaneram_kalai.setText("10:30 - 11:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("ஆதாயம் ");
                    resabam.setText("நன்மை  ");
                    methunam.setText("தெளிவு  ");
                    kadagam.setText("உறுதி ");
                    simamam.setText("பெருமை ");
                    kanni.setText(" நஷ்டம்  ");
                    thulam.setText("உதவி  ");
                    viruchagam.setText("செலவு   ");
                    thanusu.setText("ஆசை  ");
                    magaram.setText("ஆர்வம் ");
                    kumbam.setText("பரிவு ");
                    menam.setText("பயம் ");
                    break;
                case "2024-06-27":

                    text_view_tamil_date.setText("13 -ஆனி, குரோதி");
                    tamil_day.setText("வியாழன் ");

                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("ஷஷ்டி (மா. 08.50) சதயம் (மா.02.00)  ");

                    nalla_neaream_kalai.setText("10:45 - 10:30 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("நம்பிக்கை  ");
                    resabam.setText("பாராட்டு  ");
                    methunam.setText("உதவி  ");
                    kadagam.setText("சிரமம் ");
                    simamam.setText("ஊக்கம் ");
                    kanni.setText("தனம் ");
                    thulam.setText("பரிவு ");
                    viruchagam.setText("நிறைவு  ");
                    thanusu.setText("ஓய்வு ");
                    magaram.setText("பரிசு ");
                    kumbam.setText("நேர்மை ");
                    menam.setText("பாசம் ");
                    break;
                case "2024-06-28":

                    text_view_tamil_date.setText("14 - ஆனி, குரோதி");
                    tamil_day.setText("வெள்ளி ");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("ஸப்தமி (மா. 06.24) பூராட்டாதி (மா. 12.24) ");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("போட்டி  ");
                    resabam.setText("பெருமை ");
                    methunam.setText("மகிழ்ச்சி   ");
                    kadagam.setText("உற்சாகம்  ");
                    simamam.setText("ஜெயம்  ");
                    kanni.setText(" உயர்வு ");
                    thulam.setText(" நேசம் ");
                    viruchagam.setText("பாசம்  ");
                    thanusu.setText("அனுகூலம்  ");
                    magaram.setText("சோர்வு  ");
                    kumbam.setText("பக்தி   ");
                    menam.setText("சினம்");
                    break;
                case "2024-06-29":

                    text_view_tamil_date.setText("15 - ஆனி , குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("அஷ்டமி (மா. 03.58) உத்திரட்டாதி (கா.10.46) ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("நன்மை  ");
                    resabam.setText("ஊக்கம்  ");
                    methunam.setText("ஆர்வம்");
                    kadagam.setText(" பயம் ");
                    simamam.setText(" பரிவு ");
                    kanni.setText(" தடை  ");
                    thulam.setText("தோல்வி ");
                    viruchagam.setText("செலவு  ");
                    thanusu.setText("பக்தி  ");
                    magaram.setText("உயர்வு ");
                    kumbam.setText(" முயற்சி ");
                    menam.setText("பாராட்டு ");
                    break;
                case "2024-06-30":

                    text_view_tamil_date.setText("16 - ஆனி , குரோதி");
                    tamil_day.setText("ஞாயிறு ");

                    theiperai_valarperai.setText("தேய்பிறை  ");
                    astami_navami.setText("நவமி  (மா. 01.35) ரேவதி  (கா. 09.10) ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("3.15 - 4.15 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("சுகம்  ");
                    resabam.setText("லாபம்  ");
                    methunam.setText("சுபம்  ");
                    kadagam.setText("ஜெயம் ");
                    simamam.setText("தாமதம் ");
                    kanni.setText("நற்செயல் ");
                    thulam.setText("பக்தி ");
                    viruchagam.setText("மேன்மை ");
                    thanusu.setText("கவலை ");
                    magaram.setText("அமைதி ");
                    kumbam.setText("பரிசு ");
                    menam.setText("ஆதரவு ");
                    break;


                /*******************************************************7. july ************************************************************************************/

                case "2024-07-01":

                    text_view_tamil_date.setText("17 -  ஆனி , குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("தேய்பிறை  ");
                    astami_navami.setText("தசமி (கா. 11.25) அசுபதி (கா.07.45) ");

                    nalla_neaream_kalai.setText("6:15 - 7:15 am");
                    nalla_neaream_malai.setText("3:15 - 4:15 pm");

                    gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("நற்செயல் ");
                    resabam.setText("பக்தி ");
                    methunam.setText("ஓய்வு ");
                    kadagam.setText("ஆர்வம் ");
                    simamam.setText("நிம்மதி  ");
                    kanni.setText("பாராட்டு ");
                    thulam.setText("வெற்றி   ");
                    viruchagam.setText("நலம் ");
                    thanusu.setText("நன்மை ");
                    magaram.setText("பகை  ");
                    kumbam.setText("லாபம் ");
                    menam.setText("வரவு ");
                    break;
                case "2024-07-02":

                    text_view_tamil_date.setText("18 - ஆனி, குரோதி");
                    tamil_day.setText("செவ்வாய் ");

                    theiperai_valarperai.setText("தேய்பிறை - சர்வ ஏகாதசி.கார்த்திகை விரதம். தேவமாதா காட்சியருளிய தினம்.  ");
                    astami_navami.setText("ஏகாதசி (கா. 09.24) பரணி (கா. 06.33) கார்த்திகை (கா. 04.51) ");

                    nalla_neaream_kalai.setText("07:45 - 08:45 am");
                    nalla_neaream_malai.setText("04.45 -05.45 pm ");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("வெற்றி ");
                    resabam.setText("பகை ");
                    methunam.setText("ஈகை  ");
                    kadagam.setText(" சிரத்தை ");
                    simamam.setText("கவனம் ");
                    kanni.setText("தெளிவு ");
                    thulam.setText("எதிர்ப்பு  ");
                    viruchagam.setText("அமைதி ");
                    thanusu.setText("அன்பு ");
                    magaram.setText("மறதி ");
                    kumbam.setText("பொறுமை ");
                    menam.setText("நன்மை ");
                    break;
                case "2024-07-03":
                    text_view_tamil_date.setText("19 - ஆனி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("தேய்பிறை-சுபமுகூர்த்தம். பிரதோஷம். ");
                    astami_navami.setText("துவாதசி (கா. 07.45) ரோகிணி (கா. 04.52)  ");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("லாபம் ");
                    resabam.setText("உதவி ");
                    methunam.setText("நட்பு ");
                    kadagam.setText("பகை ");
                    simamam.setText("ஆர்வம் ");
                    kanni.setText("ஜெயம் ");
                    thulam.setText("புகழ் ");
                    viruchagam.setText("பயம்  ");
                    thanusu.setText("அமைதி   ");
                    magaram.setText("யோகம்   ");
                    kumbam.setText("போட்டி  ");
                    menam.setText("கவனம்");
                    break;
                case "2024-07-04":
                    text_view_tamil_date.setText("20 - ஆனி, குரோதி");
                    tamil_day.setText("வியாழன் ");

                    theiperai_valarperai.setText("தேய்பிறை-மாத சிவராத்திரி.  ");
                    astami_navami.setText("திரயோதசி (கா.06.27) சதுர்த்தசி (கா.04.55) மிருகசீருஷம் (கா. 04.35) ");

                    nalla_neaream_kalai.setText("10:45 - 11:45 am");
                    nalla_neaream_malai.setText("-");

                    gowri_nallaneram_kalai.setText("12:15 - 1:30 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("நன்மை  ");
                    resabam.setText("சாந்தம் ");
                    methunam.setText("உயர்வு ");
                    kadagam.setText("நற்செயல்  ");
                    simamam.setText("இன்பம் ");
                    kanni.setText("உழைப்பு ");
                    thulam.setText("சாதனை ");
                    viruchagam.setText("முயற்சி ");
                    thanusu.setText("சுகம் ");
                    magaram.setText("சுபம்  ");
                    kumbam.setText("விருத்தி ");
                    menam.setText("உற்சாகம்");
                    break;
                case "2024-07-05":

                    text_view_tamil_date.setText("21 - ஆனி, குரோதி");
                    tamil_day.setText("வெள்ளி ");

                    theiperai_valarperai.setText("தேய்பிறை - ஸர்வ அமாவாஸ்யை. ");
                    astami_navami.setText("அமாவாஸ்யை (கா.05.00) திருவாதிரை (கா.04.53)  ");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("12:00 - 1:00 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("கவனம் ");
                    resabam.setText("ஆர்வம் ");
                    methunam.setText("நன்மை  ");
                    kadagam.setText("வெற்றி ");
                    simamam.setText("முயற்சி ");
                    kanni.setText("ஜெயம் ");
                    thulam.setText("பரிவு  ");
                    viruchagam.setText("உயர்வு ");
                    thanusu.setText("ஆக்கம்  ");
                    magaram.setText("யோகம் ");
                    kumbam.setText("பக்தி  ");
                    menam.setText("மகிழ்ச்சி ");
                    break;
                case "2024-07-06":
                    text_view_tamil_date.setText("22 - ஆனி, குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("பிரதமை (கா.05.06) புனர்பூசம் (கா. 05.52) ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("3.15 - 4.15 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("வரவு  ");
                    resabam.setText("ஆக்கம் ");
                    methunam.setText("திறமை ");
                    kadagam.setText("உதவி ");
                    simamam.setText("சுபம்  ");
                    kanni.setText("வாழ்வு ");
                    thulam.setText("கவனம் ");
                    viruchagam.setText("நலம்  ");
                    thanusu.setText("பயம் ");
                    magaram.setText(" லாபம் ");
                    kumbam.setText("ஜெயம் ");
                    menam.setText("புகழ் ");
                    break;
                case "2024-07-07":
                    text_view_tamil_date.setText("23 - ஆனி, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("வளர்பிறை - அமிர்தலெக்ஷ்மி விரதம்.");
                    astami_navami.setText("துவிதியை (கா.05.44) பூசம் (முழுவதும்) ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("1:45 - 2:45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("பெருமை ");
                    resabam.setText("இன்பம் ");
                    methunam.setText("உற்சாகம் ");
                    kadagam.setText("நலம் ");
                    simamam.setText("அமைதி ");
                    kanni.setText("புகழ்   ");
                    thulam.setText("பாசம் ");
                    viruchagam.setText("சுபம் ");
                    thanusu.setText("போட்டி ");
                    magaram.setText("சாந்தம் ");
                    kumbam.setText("சிக்கல் ");
                    menam.setText("அன்பு ");
                    break;
                case "2024-07-08":

                    text_view_tamil_date.setText("24 - ஆனி, குரோதி");
                    tamil_day.setText("திங்கள்  ");

                    theiperai_valarperai.setText("வளர்பிறை - ஹிஜிரி வருடப் பிறப்பு.  ");
                    astami_navami.setText("திரிதியை (முழுவதும்) பூசம் (கா.07.22) ");

                    nalla_neaream_kalai.setText("6:15 - 7:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("கீர்த்தி ");
                    resabam.setText("உழைப்பு ");
                    methunam.setText("மேன்மை ");
                    kadagam.setText("சாதனை ");
                    simamam.setText("நட்பு  ");
                    kanni.setText("அனுகூலம்  ");
                    thulam.setText("நேர்மை ");
                    viruchagam.setText("சிந்தனை  ");
                    thanusu.setText("பாராட்டு ");
                    magaram.setText("புகழ்  ");
                    kumbam.setText("ஜெயம் ");
                    menam.setText("சாந்தம்");
                    break;
                case "2024-07-09":

                    text_view_tamil_date.setText("25 - ஆனி, குரோதி");
                    tamil_day.setText("செவ்வாய் ");

                    theiperai_valarperai.setText("வளர்பிறை - சதுர்த்தி விரதம்.");
                    astami_navami.setText("திரிதியை (கா. 06.59) ஆயில்யம் (கா. 09.09) ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("4.45 - 5.45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("சுகம் ");
                    resabam.setText("வரவு  ");
                    methunam.setText("நன்மை ");
                    kadagam.setText("சிரமம் ");
                    simamam.setText("பிரீதி ");
                    kanni.setText("பக்தி ");
                    thulam.setText("தெளிவு  ");
                    viruchagam.setText("பாராட்டு ");
                    thanusu.setText("வெற்றி ");
                    magaram.setText("நலம் ");
                    kumbam.setText("விருத்தி ");
                    menam.setText("பரிசு ");
                    break;
                case "2024-07-10":
                    text_view_tamil_date.setText("26 - ஆனி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம். ");
                    astami_navami.setText("சதுர்த்தி (கா. 08.31) மகம் (கா. 11.20) ");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("லாபம் ");
                    resabam.setText("செலவு ");
                    methunam.setText("நற்சொல் ");
                    kadagam.setText("பாராட்டு ");
                    simamam.setText("வெற்றி ");
                    kanni.setText("நலம் ");
                    thulam.setText("பயம்  ");
                    viruchagam.setText("அச்சம் ");
                    thanusu.setText("மறதி ");
                    magaram.setText("பணிவு ");
                    kumbam.setText("அசதி  ");
                    menam.setText("கவனம் ");
                    break;
                case "2024-07-11":

                    text_view_tamil_date.setText("27 - ஆனி, குரோதி");
                    tamil_day.setText("வியாழன் ");

                    theiperai_valarperai.setText("வளர்பிறை - ஆனி உத்திர அபிஷேகம்.");
                    astami_navami.setText("பஞ்சமி (கா.10.19) பூரம் (மா. 01.46) ");

                    nalla_neaream_kalai.setText("10:45 - 11:45 am");
                    nalla_neaream_malai.setText("-");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("ஆக்கம் ");
                    resabam.setText("அச்சம் ");
                    methunam.setText("ஓய்வு ");
                    kadagam.setText("புகழ் ");
                    simamam.setText("பிரீதி ");
                    kanni.setText("ஊக்கம் ");
                    thulam.setText("தனம் ");
                    viruchagam.setText("நலம் ");
                    thanusu.setText("வெற்றி ");
                    magaram.setText("போட்டி ");
                    kumbam.setText("தெளிவு ");
                    menam.setText("லாபம்");
                    break;
                case "2024-07-12":

                    text_view_tamil_date.setText("28 - ஆனி, குரோதி");
                    tamil_day.setText("வெள்ளி ");

                    theiperai_valarperai.setText("வளர்பிறை - சுபமுகூர்த்தம். ஷஷ்டி விரதம். ஆனி உத்திர தரிசனம்.");
                    astami_navami.setText("ஷஷ்டி (மா. 12.15) உத்திரம் (மா. 04.20) ");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("உயர்வு");
                    resabam.setText(" நட்பு ");
                    methunam.setText("வெற்றி ");
                    kadagam.setText("பயம் ");
                    simamam.setText("பகை ");
                    kanni.setText("அமைதி ");
                    thulam.setText("தெளிவு ");
                    viruchagam.setText("ஆதரவு ");
                    thanusu.setText("உறுதி  ");
                    magaram.setText("பெருமை ");
                    kumbam.setText("பொறுமை ");
                    menam.setText("ஓய்வு");
                    break;
                case "2024-07-13":

                    text_view_tamil_date.setText("29 - ஆனி, குரோதி");
                    tamil_day.setText("சனி ");

                    theiperai_valarperai.setText("வளர்பிறை");
                    astami_navami.setText("சப்தமி (மா. 02.13) ஹஸ்தம் (மா.06.53)");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("4.45 - 5.45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("நலம் ");
                    resabam.setText("லாபம்  ");
                    methunam.setText("பொறுமை  ");
                    kadagam.setText("போட்டி ");
                    simamam.setText("நட்பு ");
                    kanni.setText("ஆதரவு ");
                    thulam.setText("சாந்தம்   ");
                    viruchagam.setText("கவனம் ");
                    thanusu.setText("உதவி   ");
                    magaram.setText("தேர்ச்சி ");
                    kumbam.setText("புகழ் ");
                    menam.setText(" நற்செயல்");
                    break;
                case "2024-07-14":

                    text_view_tamil_date.setText("30 - ஆனி, குரோதி");
                    tamil_day.setText("ஞாயிறு");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("அஷ்டமி (மா. 04.02) சித்திரை (மா. 09.16)");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("3:15 - 4:15 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("நன்மை  ");
                    resabam.setText("செலவு  ");
                    methunam.setText("லாபம்  ");
                    kadagam.setText("போட்டி ");
                    simamam.setText("விவேகம் ");
                    kanni.setText("தடங்கல் ");
                    thulam.setText("அமைதி   ");
                    viruchagam.setText("பொறுமை ");
                    thanusu.setText("அன்பு  ");
                    magaram.setText("மகிழ்ச்சி ");
                    kumbam.setText("வெற்றி ");
                    menam.setText(" இன்பம் ");
                    break;
                case "2024-07-15":

                    text_view_tamil_date.setText("31 - ஆனி, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("நவமி (மா. 05.32) சுவாதி (மா. 11.21) ");

                    nalla_neaream_kalai.setText("6:15 - 7:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("நிம்மதி  ");
                    resabam.setText("எதிர்ப்பு  ");
                    methunam.setText("உயர்வு  ");
                    kadagam.setText("ஏமாற்றம் ");
                    simamam.setText("புகழ் ");
                    kanni.setText("ஊக்கம் ");
                    thulam.setText("உதவி  ");
                    viruchagam.setText("மறதி  ");
                    thanusu.setText("அசதி ");
                    magaram.setText("பெருமை ");
                    kumbam.setText("ஆக்கம் ");
                    menam.setText("போட்டி");
                    break;
                case "2024-07-16":

                    text_view_tamil_date.setText("32 - ஆனி, குரோதி");
                    tamil_day.setText("செவ்வாய் ");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("தசமி (மா. 06.38) விசாகம் (கா.01.00)  ");

                    nalla_neaream_kalai.setText("10:45 - 11:45 am");
                    nalla_neaream_malai.setText("4.45 - 5.45 pm");

                    gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("பக்தி  ");
                    resabam.setText("பாசம் ");
                    methunam.setText("பயம் ");
                    kadagam.setText("பகை ");
                    simamam.setText("விவேகம் ");
                    kanni.setText("பாராட்டு ");
                    thulam.setText("பிரீதி ");
                    viruchagam.setText("உயர்வு  ");
                    thanusu.setText("வரவு ");
                    magaram.setText("தடங்கல் ");
                    kumbam.setText("வெற்றி ");
                    menam.setText("இன்சொல்");
                    break;
                case "2024-07-17":

                    text_view_tamil_date.setText("1 - ஆடி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("வளர்பிறை - ஸர்வ ஏகாதசி. மொஹரம் பண்டிகை. அரசு விடுமுறை. ");
                    astami_navami.setText("ஏகாதசி (மா. 07.16) அனுஷம் (கா.02.14)");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("நலம் ");
                    resabam.setText("நன்மை ");
                    methunam.setText("நற்செயல்   ");
                    kadagam.setText("தடங்கல் ");
                    simamam.setText("ஆர்வம்");
                    kanni.setText(" சாந்தம்  ");
                    thulam.setText("செலவு  ");
                    viruchagam.setText("குழப்பம்  ");
                    thanusu.setText("வெற்றி   ");
                    magaram.setText("விவேகம் ");
                    kumbam.setText("இரக்கம் ");
                    menam.setText("இன்பம்");
                    break;
                case "2024-07-18":
                    text_view_tamil_date.setText("2 - ஆடி, குரோதி");
                    tamil_day.setText("வியாழன் ");

                    theiperai_valarperai.setText("வளர்பிறை - கரிநாள். தமிழ்நாடு தினம்.");
                    astami_navami.setText(" துவாதசி (மா. 07.23) கேட்டை (கா. 02.54)  ");

                    nalla_neaream_kalai.setText("10:45 - 11:45 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("நன்மை ");
                    resabam.setText(" ஓய்வு  ");
                    methunam.setText("சாந்தம்  ");
                    kadagam.setText("பாராட்டு ");
                    simamam.setText("நலம் ");
                    kanni.setText(" இன்பம் ");
                    thulam.setText(" அசதி ");
                    viruchagam.setText("பக்தி ");
                    thanusu.setText(" லாபம் ");
                    magaram.setText("ஆக்கம் ");
                    kumbam.setText("தனம்");
                    menam.setText(" உற்சாகம் ");
                    break;
                case "2024-07-19":
                    text_view_tamil_date.setText("3 - ஆடி, குரோதி");
                    tamil_day.setText("வெள்ளி ");

                    theiperai_valarperai.setText("வளர்பிறை - பிரதோஷம்.");
                    astami_navami.setText("திரயோதசி (மா. 07.01) மூலம் (கா.03.05) ");

                    nalla_neaream_kalai.setText("9:00 - 10:00 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:30 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("அச்சம்  ");
                    resabam.setText("சுகம் ");
                    methunam.setText("ஆக்கம்  ");
                    kadagam.setText("கவனம் ");
                    simamam.setText("ஆர்வம் ");
                    kanni.setText("சிரமம் ");
                    thulam.setText("ஊக்கம் ");
                    viruchagam.setText("நலம் ");
                    thanusu.setText("சுபம் ");
                    magaram.setText("இரக்கம்  ");
                    kumbam.setText("ஜெயம்  ");
                    menam.setText("புகழ் ");
                    break;
                case "2024-07-20":
                    text_view_tamil_date.setText("4 -ஆடி, குரோதி");
                    tamil_day.setText("சனி");

                    theiperai_valarperai.setText("வளர்பிறை ");
                    astami_navami.setText("சதுர்த்தசி (மா. 06.09) பூராடம் (கா. 02.49) ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("உயர்வு ");
                    resabam.setText("பாசம் ");
                    methunam.setText("மேன்மை  ");
                    kadagam.setText("பக்தி  ");
                    simamam.setText("சோதனை  ");
                    kanni.setText(" அன்பு ");
                    thulam.setText("ஆர்வம்  ");
                    viruchagam.setText("ஆக்கம்  ");
                    thanusu.setText("விவேகம்  ");
                    magaram.setText("பொறுமை ");
                    kumbam.setText("தடங்கல் ");
                    menam.setText(" சாந்தம் ");
                    break;
                case "2024-07-21":

                    text_view_tamil_date.setText("5 - ஆடி, குரோதி");
                    tamil_day.setText(" ஞாயிறு");

                    theiperai_valarperai.setText("வளர்பிறை- பௌர்ணமி.");
                    astami_navami.setText("பௌர்ணமி (மா. 04.51) உத்திராடம் (கா. 02.07) ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("3:15 - 4:15 pm");

                    gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("லாபம் ");
                    resabam.setText("நலம் ");
                    methunam.setText("களிப்பு ");
                    kadagam.setText("செலவு ");
                    simamam.setText("பரிசு ");
                    kanni.setText("அமைதி ");
                    thulam.setText("பகை ");
                    viruchagam.setText("கவலை  ");
                    thanusu.setText("அச்சம் ");
                    magaram.setText("உதவி ");
                    kumbam.setText("ஆதரவு ");
                    menam.setText("பயம் ");
                    break;
                case "2024-07-22":

                    text_view_tamil_date.setText("6 - ஆடி, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("தேய்பிறை - திருவோண விரதம்.");
                    astami_navami.setText("பிரதமை (மா. 03.11) திருவோணம் (மா. 01.05) ");

                    nalla_neaream_kalai.setText("6:00 - 7:00 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("அனுகூலம் ");
                    resabam.setText("வெற்றி ");
                    methunam.setText("பகை  ");
                    kadagam.setText("புகழ் ");
                    simamam.setText("மகிழ்ச்சி   ");
                    kanni.setText("பாராட்டு  ");
                    thulam.setText("மேன்மை  ");
                    viruchagam.setText("ஆர்வம்  ");
                    thanusu.setText("இன்பம் ");
                    magaram.setText("தேர்ச்சி ");
                    kumbam.setText("நன்மை ");
                    menam.setText("முயற்சி ");
                    break;
                case "2024-07-23":
                    text_view_tamil_date.setText("7 - ஆடி, குரோதி");
                    tamil_day.setText("செவ்வாய் ");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("துவிதியை (மா. 01.13) அவிட்டம் (மா. 11.47)");

                    nalla_neaream_kalai.setText("10:45 - 11:45 am");
                    nalla_neaream_malai.setText("4.45 - 5.45 pm ");

                    gowri_nallaneram_kalai.setText("1:45 - 2:45 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("போட்டி ");
                    resabam.setText("முயற்சி   ");
                    methunam.setText("தடங்கல்  ");
                    kadagam.setText("அன்பு  ");
                    simamam.setText("உயர்வு ");
                    kanni.setText("சாந்தம் ");
                    thulam.setText("வரவு ");
                    viruchagam.setText("கடன்தீரல் ");
                    thanusu.setText("மேன்மை ");
                    magaram.setText("அசதி ");
                    kumbam.setText("புகழ்");
                    menam.setText(" ஆதரவு");
                    break;
                case "2024-07-24":

                    text_view_tamil_date.setText("8 -ஆடி, குரோதி");
                    tamil_day.setText("புதன் ");

                    theiperai_valarperai.setText("தேய்பிறை - சங்கடஹர சதுர்த்தி.");
                    astami_navami.setText("திரிதியை (கா. 11.01) சதயம் (மா. 10.17)");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("ஜெயம் ");
                    resabam.setText("கவலை  ");
                    methunam.setText("பக்தி ");
                    kadagam.setText("பரிசு ");
                    simamam.setText("நன்மை ");
                    kanni.setText("வெற்றி ");
                    thulam.setText("உதவி ");
                    viruchagam.setText("சிக்கல் ");
                    thanusu.setText("நோய்");
                    magaram.setText(" லாபம் ");
                    kumbam.setText("திறமை ");
                    menam.setText(" சாதனை");
                    break;
                case "2024-07-25":

                    text_view_tamil_date.setText("9 -ஆடி, குரோதி");
                    tamil_day.setText("வியாழன் ");

                    theiperai_valarperai.setText("தேய்பிறை");
                    astami_navami.setText("சதுர்த்தி (கா.08.40) பூரட்டாதி (மா.08.41) ");

                    nalla_neaream_kalai.setText("10:45 - 11:45 am");
                    nalla_neaream_malai.setText(" - ");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("1:30 ");
                    ragu2.setText("3:00 ");
                    kuligai1.setText("9:00 ");
                    kuligai2.setText("10:30 ");
                    yamagandam1.setText("6:00 ");
                    yamagandam2.setText("7:30 ");

                    measam.setText("களிப்பு ");
                    resabam.setText("ஆக்கம் ");
                    methunam.setText("கீர்த்தி  ");
                    kadagam.setText("சிரமம் ");
                    simamam.setText("அசதி  ");
                    kanni.setText("பிரீதி ");
                    thulam.setText("முயற்சி ");
                    viruchagam.setText("ஓய்வு ");
                    thanusu.setText("பிரயாணம் ");
                    magaram.setText("திறமை ");
                    kumbam.setText("நன்மை ");
                    menam.setText("அனுகூலம்");
                    break;
                case "2024-07-26":
                    text_view_tamil_date.setText("10 -ஆடி, குரோதி");
                    tamil_day.setText("வெள்ளி ");

                    theiperai_valarperai.setText("தேய்பிறை - கரிநாள்.");
                    astami_navami.setText("பஞ்சமி (கா.06.10) ஷஷ்டி (கா.03.28) உத்திரட்டாதி (மா. 07.00) ");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("10:30 ");
                    ragu2.setText("12:00 ");
                    kuligai1.setText("7:00 ");
                    kuligai2.setText("9:00 ");
                    yamagandam1.setText("3:00 ");
                    yamagandam2.setText("4:30 ");

                    measam.setText("சோர்வு ");
                    resabam.setText("செலவு ");
                    methunam.setText("சாதனை  ");
                    kadagam.setText("அமைதி ");
                    simamam.setText("நட்பு ");
                    kanni.setText("மகிழ்ச்சி ");
                    thulam.setText("வரவு ");
                    viruchagam.setText("தடங்கல் ");
                    thanusu.setText("நலம்  ");
                    magaram.setText("களிப்பு ");
                    kumbam.setText("சுகம்  ");
                    menam.setText("மேன்மை ");
                    break;
                case "2024-07-27":

                    text_view_tamil_date.setText("11 -ஆடி, குரோதி");
                    tamil_day.setText("சனி");

                    theiperai_valarperai.setText("தேய்பிறை - வாஸ்து நாள்.");
                    astami_navami.setText("ஸப்தமி (கா. 01.25) ரேவதி (மா.05.27) ");

                    nalla_neaream_kalai.setText("10:45 - 11:45 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("12:15 - 1:15 am");
                    gowri_nallaneram_malai.setText("9:30 - 10:30 pm");

                    ragu1.setText("9:00 ");
                    ragu2.setText("10:30 ");
                    kuligai1.setText("6:00 ");
                    kuligai2.setText("7:30 ");
                    yamagandam1.setText("1:30 ");
                    yamagandam2.setText("3:00 ");

                    measam.setText("ஆதாயம் ");
                    resabam.setText("ஆதரவு  ");
                    methunam.setText("தோல்வி  ");
                    kadagam.setText("போட்டி   ");
                    simamam.setText("லாபம்  ");
                    kanni.setText("பெருமை ");
                    thulam.setText("பயம் ");
                    viruchagam.setText("நற்சொல் ");
                    thanusu.setText("மகிழ்ச்சி ");
                    magaram.setText("கீர்த்தி  ");
                    kumbam.setText("சோதனை");
                    menam.setText("வாழ்வு");
                    break;
                case "2024-07-28":

                    text_view_tamil_date.setText("12 -ஆடி, குரோதி");
                    tamil_day.setText(" ஞாயிறு ");

                    theiperai_valarperai.setText("தேய்பிறை ");
                    astami_navami.setText("அஷ்டமி (மா. 11.11) அசுபதி (மா.03.58) ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("3:15 - 4:15 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("1:30 - 2:30 pm");

                    ragu1.setText("4:30 ");
                    ragu2.setText("6:00 ");
                    kuligai1.setText("3:00 ");
                    kuligai2.setText("4:30 ");
                    yamagandam1.setText("12:00 ");
                    yamagandam2.setText("1:30 ");

                    measam.setText("ஜெயம் ");
                    resabam.setText("மறதி ");
                    methunam.setText("சுகம் ");
                    kadagam.setText("உயர்வு ");
                    simamam.setText("நட்பு ");
                    kanni.setText(" அமைதி  ");
                    thulam.setText(" புகழ்  ");
                    viruchagam.setText("ஆதரவு   ");
                    thanusu.setText("பெருமை  ");
                    magaram.setText("சுபம்  ");
                    kumbam.setText("செலவு  ");
                    menam.setText("போட்டி");
                    break;
                case "2024-07-29":

                    text_view_tamil_date.setText("13 - ஆடி, குரோதி");
                    tamil_day.setText("திங்கள் ");

                    theiperai_valarperai.setText("தேய்பிறை - கார்த்திகை விரதம்.");
                    astami_navami.setText("நவமி (மா. 09.11) பரணி (மா. 02.40) ");

                    nalla_neaream_kalai.setText("6:15 - 7:15 am");
                    nalla_neaream_malai.setText("4:45 - 5:45 pm");

                    gowri_nallaneram_kalai.setText("9:15 - 10:15 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("7:30 ");
                    ragu2.setText("9:00 ");
                    kuligai1.setText("1:30 ");
                    kuligai2.setText("3:00 ");
                    yamagandam1.setText("10:30 ");
                    yamagandam2.setText("12:00 ");

                    measam.setText("பாராட்டு ");
                    resabam.setText("நன்மை ");
                    methunam.setText("அமைதி ");
                    kadagam.setText(" செலவு ");
                    simamam.setText(" பயம் ");
                    kanni.setText(" கவலை  ");
                    thulam.setText("வரவு  ");
                    viruchagam.setText("தாமதம் ");
                    thanusu.setText("ஜெயம்  ");
                    magaram.setText("ஆதரவு ");
                    kumbam.setText(" வெற்றி  ");
                    menam.setText("ஆக்கம்  ");
                    break;
                case "2024-07-30":

                    text_view_tamil_date.setText("14 - ஆடி, குரோதி");
                    tamil_day.setText("செவ்வாய்");

                    theiperai_valarperai.setText("தேய்பிறை  ");
                    astami_navami.setText("தசமி (மா. 07.30) கார்த்திகை (மா. 01.40)  ");

                    nalla_neaream_kalai.setText("7:45 - 8:45 am");
                    nalla_neaream_malai.setText("4.45 - 5.45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("7:30 - 8:30 pm");

                    ragu1.setText("3:00 ");
                    ragu2.setText("4:30 ");
                    kuligai1.setText("12:00 ");
                    kuligai2.setText("1:30 ");
                    yamagandam1.setText("9:00 ");
                    yamagandam2.setText("10:30 ");

                    measam.setText("நன்மை ");
                    resabam.setText("ஆதாயம்  ");
                    methunam.setText("போட்டி  ");
                    kadagam.setText("புகழ்  ");
                    simamam.setText("லாபம் ");
                    kanni.setText("தாமதம் ");
                    thulam.setText("முயற்சி ");
                    viruchagam.setText("வெற்றி  ");
                    thanusu.setText("ஆதரவு  ");
                    magaram.setText("பரிசு  ");
                    kumbam.setText("நிம்மதி ");
                    menam.setText(" உயர்வு  ");
                    break;
                case "2024-07-31":

                    text_view_tamil_date.setText("15 - ஆடி, குரோதி");
                    tamil_day.setText("புதன்");

                    theiperai_valarperai.setText("தேய்பிறை -  ஸர்வ ஏகாதசி.");
                    astami_navami.setText("ஏகாதசி (மா. 06.10) ரோகிணி (மா. 01.01)  ");

                    nalla_neaream_kalai.setText("9:15 - 10:15 am");
                    nalla_neaream_malai.setText("4.45 - 5.45 pm");

                    gowri_nallaneram_kalai.setText("10:45 - 11:45 am");
                    gowri_nallaneram_malai.setText("6:30 - 7:30 pm");

                    ragu1.setText("12:00 ");
                    ragu2.setText("1:30 ");
                    kuligai1.setText("10:30 ");
                    kuligai2.setText("12:00 ");
                    yamagandam1.setText("7:30 ");
                    yamagandam2.setText("9:00 ");

                    measam.setText("பொறுமை ");
                    resabam.setText("ஆக்கம்  ");
                    methunam.setText("ஆதாயம்  ");
                    kadagam.setText("நலம் ");
                    simamam.setText("பக்தி  ");
                    kanni.setText("தாமதம்   ");
                    thulam.setText("போட்டி  ");
                    viruchagam.setText("வாழ்வு ");
                    thanusu.setText("மகிழ்ச்சி ");
                    magaram.setText("வெற்றி ");
                    kumbam.setText("பயம்");
                    menam.setText(" ஏமாற்றம்");
                    break;

                // Add more cases for other dates as needed
                default:
                    text_view_tamil_date.setText(".");
            }
        return date;
    }

}