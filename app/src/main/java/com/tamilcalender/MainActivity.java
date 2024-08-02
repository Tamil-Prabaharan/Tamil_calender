package com.tamilcalender;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    /******************************************************************************
                                       1st activity
     **********************************************************************************/
    private Button pallivilumpalan;
    private Button subamugurtathinagal;
    private Button manaiyadisasthiram;
    private Button ragukuligaiyeamagandam;
    private Button vasthuseiyumnatkkal;
    private Button mukkiyavirathathinagal;
    private Button pandigaiandarasuvidumurai;
    private TextView nalekatti;
    private TextView madhakatti;
    private TextView text_view_date;

    private TextView tamil_date;
    private TextView varuda_rasi_palan;
    private TextView thirukural,compass;

    private CardView veetumaniyadi_kuli_kanakku1,vasthu_seerukuripu,poojaiporutkkal,edcr,compass1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        /***************************************************************************
                                          2nd activity
         *******************************************************************************/
         pallivilumpalan = (Button) findViewById(R.id.button);
        subamugurtathinagal = (Button) findViewById(R.id.button2);
        manaiyadisasthiram = (Button) findViewById(R.id.button7);
        ragukuligaiyeamagandam = (Button) findViewById(R.id.button3);
        vasthuseiyumnatkkal = (Button) findViewById(R.id.button6);
        mukkiyavirathathinagal = (Button) findViewById(R.id.button5);
        pandigaiandarasuvidumurai = (Button) findViewById(R.id.button4);
        nalekatti = (TextView) findViewById(R.id.textView7);
        madhakatti = (TextView) findViewById(R.id.textView9);
        text_view_date = (TextView) findViewById(R.id.textView3);
        tamil_date = (TextView) findViewById(R.id.textView2);
        varuda_rasi_palan = (TextView) findViewById(R.id.textView10);
        thirukural = (TextView) findViewById(R.id.textView11);
        compass = (TextView) findViewById(R.id.textView720);

        veetumaniyadi_kuli_kanakku1 = (CardView) findViewById(R.id.veetumani_kuli_kanakku);
        poojaiporutkkal = (CardView) findViewById(R.id.poojai_porutkkal);
        vasthu_seerukuripu = (CardView) findViewById(R.id.vasthu_seerukuripu_veetumanai);
        edcr = (CardView) findViewById(R.id.Edcr_plan);
        compass1 = (CardView) findViewById(R.id.compass);

        text_view_date.setText(getToDAyDAte());
        /***************************************************************************
                                        3rd activity
         *******************************************************************************/


        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String dateString = sdf.format(currentDate);
        // Show text based on the current date
        showTextBasedOnDate(dateString);

        compass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity17();
            }
        });

        edcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity16();
            }
        });

        poojaiporutkkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity15();
            }
        });

        vasthu_seerukuripu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity14();
            }
        });

        veetumaniyadi_kuli_kanakku1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity13();
            }
        });

        thirukural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity12();
            }
        });

        madhakatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity10();
            }
        });

        nalekatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity9();
            }
        });

        pandigaiandarasuvidumurai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity8();
            }
        });

        mukkiyavirathathinagal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity7();
            }
        });

        vasthuseiyumnatkkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity6();
            }
        });

        ragukuligaiyeamagandam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity5();
            }
        });

        manaiyadisasthiram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity4();
            }
        });
        subamugurtathinagal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity3();
            }
        });

        pallivilumpalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        activity2();
            }
        });
        varuda_rasi_palan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity11();
            }
        });


    }




    /**************************************************
                             * 4th activity
     ******************************************************/




    private void activity2() {
        Intent intent = new Intent(this, palli_villum_palan.class);
        startActivity(intent);

    }
    private void activity3() {
        Intent intent = new Intent(this, subamugurtha_thinagal.class);
        startActivity(intent);
    }

    private void activity4() {
        Intent intent = new Intent(this, vasthu.class);
        startActivity(intent);
    }

    private void activity5() {
        Intent intent = new Intent(this, ragu_kuligai_yeamagandam.class);
        startActivity(intent);
    }

    private void activity6() {
        Intent intent = new Intent(this, vasthu_seiyum_natkkal.class);
        startActivity(intent);
    }

    private void activity7() {
        Intent intent = new Intent(this, mukkiya_viratha_thinagal.class);
        startActivity(intent);
    }

    private void activity8() {
        Intent intent = new Intent(this, pandigaiandarasuvidumurai.class);
        startActivity(intent);
    }

    private void activity9() {
        Intent intent = new Intent(this, nalekatti.class);
        startActivity(intent);
    }

    private void activity10() {
        Intent intent = new Intent(this, madhakatti.class);
        startActivity(intent);
    }
    private void activity11() {
        Intent intent = new Intent(this, varuda_rasi_palan.class);
        startActivity(intent);
    }
    private void activity12() {
        Intent intent = new Intent(this, rrrrasi.class);
        startActivity(intent);

    }

    private void activity13() {
        Intent intent = new Intent(this,veetumanai_kuli_kanakku.class);
        startActivity(intent);

    }

    private void activity14() {
        Intent intent = new Intent(this,vasthuserukuripu.class);
        startActivity(intent);

    }

    private void activity15() {
        Intent intent = new Intent(this,poojaporurtkal.class);
        startActivity(intent);

    }

    private void activity16() {
        Intent intent = new Intent(this,edcr.class);
        startActivity(intent);

    }

    private void activity17() {
        Intent intent = new Intent(this,compass.class);
        startActivity(intent);

    }



    private String getToDAyDAte(){
        return new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
    }

    private void showTextBasedOnDate(String date) {
        switch (date) {
            /*******************************************************3. march ************************************************************************************/
            case "2024-03-16":
                tamil_date.setText("3 - பங்குனி - சனி");
                break;
            case "2024-03-17":
                tamil_date.setText("4 - பங்குனி ஞாயிறு");
                break;
            case "2024-03-18":
                tamil_date.setText("5 - பங்குனி  திங்கள்");
                break;
            case "2024-03-19":
                tamil_date.setText("6 - பங்குனி  செவ்வாய்");
                break;
            case "2024-03-20":
                tamil_date.setText("7 - பங்குனி  புதன்");
                break;
            case "2024-03-21":
                tamil_date.setText("8 - பங்குனி  வியாழன்");
                break;
            case "2024-03-22":
                tamil_date.setText("9 - பங்குனி  வெள்ளி");
                break;
            case "2024-03-23":
                tamil_date.setText("10 - பங்குனி சனி");
                break;
            case "2024-03-24":
                tamil_date.setText("11 - பங்குனி ஞாயிறு");
                break;
            case "2024-03-25":
                tamil_date.setText("12 - பங்குனி திங்கள்");
                break;
            case "2024-03-26":
                tamil_date.setText("13 - பங்குனி செவ்வாய்");
                break;
            case "2024-03-27":
                tamil_date.setText("14 - பங்குனி புதன்");
                break;
            case "2024-03-28":
                tamil_date.setText("15 - பங்குனி வியாழன்");
                break;
            case "2024-03-29":
                tamil_date.setText("16 - பங்குனி வெள்ளி");
                break;
            case "2024-03-30":
                tamil_date.setText("17 - பங்குனி சனி");
                break;
            case "2024-03-31":
                tamil_date.setText("18 - பங்குனி ஞாயிறு");
                break;

                /*******************************************************4. apiral ************************************************************************************/

            case "2024-04-01":
                tamil_date.setText("19 - பங்குனி - திங்கள்");
                break;
            case "2024-04-02":
                tamil_date.setText("20 - பங்குனி செவ்வாய்");
                break;
            case "2024-04-03":
                tamil_date.setText("21 - பங்குனி  புதன்");
                break;
            case "2024-04-04":
                tamil_date.setText("22 - பங்குனி  வியாழன்");
                break;
            case "2024-04-05":
                tamil_date.setText("23 - பங்குனி  வெள்ளி");
                break;
            case "2024-04-06":
                tamil_date.setText("24 - பங்குனி  சனி");
                break;
            case "2024-04-07":
                tamil_date.setText("25 - பங்குனி  ஞாயிறு");
                break;
            case "2024-04-08":
                tamil_date.setText("26 - பங்குனி திங்கள்");
                break;
            case "2024-04-09":
                tamil_date.setText("27 - பங்குனி செவ்வாய்");
                break;
            case "2024-04-10":
                tamil_date.setText("28 - பங்குனி புதன்");
                break;
            case "2024-04-11":
                tamil_date.setText("29 - பங்குனி வியாழன்");
                break;
            case "2024-04-12":
                tamil_date.setText("30 - பங்குனி வெள்ளி");
                break;
            case "2024-04-13":
                tamil_date.setText("31 - பங்குனி சனி");
                break;
            case "2024-04-14":
                tamil_date.setText("1 - சித்திரை ஞாயிறு");
                break;
            case "2024-04-15":
                tamil_date.setText("2 - சித்திரை திங்கள்");
                break;
            case "2024-04-16":
                tamil_date.setText("3 - சித்திரை செவ்வாய்");
                break;
            case "2024-04-17":
                tamil_date.setText("4 - சித்திரை புதன்");
                break;
            case "2024-04-18":
                tamil_date.setText("5 - சித்திரை வியாழன்");
                break;
            case "2024-04-19":
                tamil_date.setText("6 - சித்திரை வெள்ளி");
                break;
            case "2024-04-20":
                tamil_date.setText("7 - சித்திரை சனி");
                break;
            case "2024-04-21":
                tamil_date.setText("8 - சித்திரை ஞாயிறு");
                break;
            case "2024-04-22":
                tamil_date.setText("9 - சித்திரை திங்கள்");
                break;
            case "2024-04-23":
                tamil_date.setText("10 - சித்திரை செவ்வாய்");
                break;
            case "2024-04-24":
                tamil_date.setText("11 - சித்திரை புதன்");
                break;
            case "2024-04-25":
                tamil_date.setText("12 - சித்திரை வியாழன்");
                break;
            case "2024-04-26":
                tamil_date.setText("13 - சித்திரை வெள்ளி");
                break;
            case "2024-04-27":
                tamil_date.setText("14 - சித்திரை சனி");
                break;
            case "2024-04-28":
                tamil_date.setText("15 - சித்திரை ஞாயிறு");
                break;
            case "2024-04-29":
                tamil_date.setText("16 - சித்திரை திங்கள்");
                break;
            case "2024-04-30":
                tamil_date.setText("17 - சித்திரை செவ்வாய்");
                break;

            /*******************************************************5. may ************************************************************************************/

            case "2024-05-01":
                tamil_date.setText("18 - சித்திரை - புதன்");
                break;
            case "2024-05-02":
                tamil_date.setText("19 - சித்திரை வியாழன்");
                break;
            case "2024-05-03":
                tamil_date.setText("20 - சித்திரை  வெள்ளி");
                break;
            case "2024-05-04":
                tamil_date.setText("21 - சித்திரை  சனி");
                break;
            case "2024-05-05":
                tamil_date.setText("22 - சித்திரை  ஞாயிறு");
                break;
            case "2024-05-06":
                tamil_date.setText("23 - சித்திரை  திங்கள்");
                break;
            case "2024-05-07":
                tamil_date.setText("24 - சித்திரை  செவ்வாய்");
                break;
            case "2024-05-08":
                tamil_date.setText("25 - சித்திரை புதன்");
                break;
            case "2024-05-09":
                tamil_date.setText("26 - சித்திரை வியாழன்");
                break;
            case "2024-05-10":
                tamil_date.setText("27 - சித்திரை வெள்ளி");
                break;
            case "2024-05-11":
                tamil_date.setText("28 - சித்திரை  சனி");
                break;
            case "2024-05-12":
                tamil_date.setText("29 - சித்திரை ஞாயிறு");
                break;
            case "2024-05-13":
                tamil_date.setText("30 - சித்திரை திங்கள்");
                break;
            case "2024-05-14":
                tamil_date.setText("1 - வைகாசி செவ்வாய்");
                break;
            case "2024-05-15":
                tamil_date.setText("2 - வைகாசி புதன்");
                break;
            case "2024-05-16":
                tamil_date.setText("3 - வைகாசி வியாழன்");
                break;
            case "2024-05-17":
                tamil_date.setText("4 - வைகாசி வெள்ளி");
                break;
            case "2024-05-18":
                tamil_date.setText("5 - வைகாசி சனி");
                break;
            case "2024-05-19":
                tamil_date.setText("6 - வைகாசி ஞாயிறு");
                break;
            case "2024-05-20":
                tamil_date.setText("7 - வைகாசி திங்கள்");
                break;
            case "2024-05-21":
                tamil_date.setText("8 - வைகாசி செவ்வாய்");
                break;
            case "2024-05-22":
                tamil_date.setText("9 - வைகாசி புதன்");
                break;
            case "2024-05-23":
                tamil_date.setText("10 - வைகாசி வியாழன்");
                break;
            case "2024-05-24":
                tamil_date.setText("11 - வைகாசி வெள்ளி");
                break;
            case "2024-05-25":
                tamil_date.setText("12 - வைகாசி சனி");
                break;
            case "2024-05-26":
                tamil_date.setText("13 - வைகாசி ஞாயிறு");
                break;
            case "2024-05-27":
                tamil_date.setText("14 - வைகாசி திங்கள்");
                break;
            case "2024-05-28":
                tamil_date.setText("15 - வைகாசி செவ்வாய்");
                break;
            case "2024-05-29":
                tamil_date.setText("16 - வைகாசி புதன்");
                break;
            case "2024-05-30":
                tamil_date.setText("17 - வைகாசி வியாழன்");
                break;
            case "2024-05-31":
                tamil_date.setText("18 - வைகாசி வெள்ளி");
                break;

            /*******************************************************6. june ************************************************************************************/

            case "2024-06-01":
                tamil_date.setText("19 - வைகாசி சனி");
                break;
            case "2024-06-02":
                tamil_date.setText("20 - வைகாசி ஞாயிறு");
                break;
            case "2024-06-03":
                tamil_date.setText("21 - வைகாசி திங்கள்");
                break;
            case "2024-06-04":
                tamil_date.setText("22 - வைகாசி செவ்வாய்");
                break;
            case "2024-06-05":
                tamil_date.setText("23 - வைகாசி புதன்");
                break;
            case "2024-06-06":
                tamil_date.setText("24 - வைகாசி வியாழன்");
                break;
            case "2024-06-07":
                tamil_date.setText("25 - வைகாசி வெள்ளி");
                break;
            case "2024-06-08":
                tamil_date.setText("26 - வைகாசி சனி");
                break;
            case "2024-06-09":
                tamil_date.setText("27 - வைகாசி ஞாயிறு");
                break;
            case "2024-06-10":
                tamil_date.setText("28 - வைகாசி திங்கள்");
                break;
            case "2024-06-11":
                tamil_date.setText("29 - வைகாசி செவ்வாய்");
                break;
            case "2024-06-12":
                tamil_date.setText("30 - வைகாசி புதன்");
                break;
            case "2024-06-13":
                tamil_date.setText("31 - வைகாசி வியாழன்");
                break;
            case "2024-06-14":
                tamil_date.setText("32 - வைகாசி வெள்ளி");
                break;
            case "2024-06-15":
                tamil_date.setText("1 - ஆனி சனி");
                break;
            case "2024-06-16":
                tamil_date.setText("2 - ஆனி ஞாயிறு");
                break;
            case "2024-06-17":
                tamil_date.setText("3 - ஆனி திங்கள்");
                break;
            case "2024-06-18":
                tamil_date.setText("4 - ஆனி செவ்வாய்");
                break;
            case "2024-06-19":
                tamil_date.setText("5 - ஆனி புதன்");
                break;
            case "2024-06-20":
                tamil_date.setText("6 - ஆனி வியாழன்");
                break;
            case "2024-06-21":
                tamil_date.setText("7 - ஆனி வெள்ளி");
                break;
            case "2024-06-22":
                tamil_date.setText("8 - ஆனி சனி");
                break;
            case "2024-06-23":
                tamil_date.setText("9 - ஆனி ஞாயிறு");
                break;
            case "2024-06-24":
                tamil_date.setText("10 - ஆனி திங்கள்");
                break;
            case "2024-06-25":
                tamil_date.setText("11 - ஆனி செவ்வாய்");
                break;
            case "2024-06-26":
                tamil_date.setText("12 - ஆனி புதன்");
                break;
            case "2024-06-27":
                tamil_date.setText("13 - ஆனி வியாழன்");
                break;
            case "2024-06-28":
                tamil_date.setText("14 - ஆனி வெள்ளி");
                break;
            case "2024-06-29":
                tamil_date.setText("15 - ஆனி சனி");
                break;
            case "2024-06-30":
                tamil_date.setText("16 - ஆனி ஞாயிறு");
                break;

            /*******************************************************7. july ************************************************************************************/

            case "2024-07-01":
                tamil_date.setText("17 - ஆனி திங்கள்");
                break;
            case "2024-07-02":
                tamil_date.setText("18 - ஆனி செவ்வாய்");
                break;
            case "2024-07-03":
                tamil_date.setText("19 - ஆனி புதன்");
                break;
            case "2024-07-04":
                tamil_date.setText("20 - ஆனி வியாழன்");
                break;
            case "2024-07-05":
                tamil_date.setText("21 - ஆனி வெள்ளி");
                break;
            case "2024-07-06":
                tamil_date.setText("22 - ஆனி சனி");
                break;
            case "2024-07-07":
                tamil_date.setText("23 - ஆனி ஞாயிறு");
                break;
            case "2024-07-08":
                tamil_date.setText("24 - ஆனி திங்கள்");
                break;
            case "2024-07-09":
                tamil_date.setText("25 - ஆனி செவ்வாய்");
                break;
            case "2024-07-10":
                tamil_date.setText("26 - ஆனி புதன்");
                break;
            case "2024-07-11":
                tamil_date.setText("27 - ஆனி வியாழன்");
                break;
            case "2024-07-12":
                tamil_date.setText("28 - ஆனி வெள்ளி");
                break;
            case "2024-07-13":
                tamil_date.setText("29 - ஆனி சனி");
                break;
            case "2024-07-14":
                tamil_date.setText("30 - ஆனி ஞாயிறு");
                break;
            case "2024-07-15":
                tamil_date.setText("31 - ஆனி திங்கள்");
                break;
            case "2024-07-16":
                tamil_date.setText("32 - ஆனி செவ்வாய்");
                break;
            case "2024-07-17":
                tamil_date.setText("1 - ஆடி புதன்");
                break;
            case "2024-07-18":
                tamil_date.setText("2 - ஆடி வியாழன்");
                break;
            case "2024-07-19":
                tamil_date.setText("3 - ஆடி வெள்ளி");
                break;
            case "2024-07-20":
                tamil_date.setText("4 - ஆடி சனி");
                break;
            case "2024-07-21":
                tamil_date.setText("5 - ஆடி ஞாயிறு");
                break;
            case "2024-07-22":
                tamil_date.setText("6 - ஆடி திங்கள்");
                break;
            case "2024-07-23":
                tamil_date.setText("7 - ஆடி செவ்வாய்");
                break;
            case "2024-07-24":
                tamil_date.setText("8 - ஆடி புதன்");
                break;
            case "2024-07-25":
                tamil_date.setText("9 - ஆடி வியாழன்");
                break;
            case "2024-07-26":
                tamil_date.setText("10 - ஆடி வெள்ளி");
                break;
            case "2024-07-27":
                tamil_date.setText("11 - ஆடி சனி");
                break;
            case "2024-07-28":
                tamil_date.setText("12 - ஆடி ஞாயிறு");
                break;
            case "2024-07-29":
                tamil_date.setText("13 - ஆடி திங்கள்");
                break;
            case "2024-07-30":
                tamil_date.setText("14 - ஆடி செவ்வாய்");
                break;
            case "2024-07-31":
                tamil_date.setText("15 - ஆடி புதன்");
                break;

            /*******************************************************8. august ************************************************************************************/

            case "2024-08-01":
                tamil_date.setText("16 - ஆடி வியாழன்");
                break;
            case "2024-08-02":
                tamil_date.setText("17 - ஆடி வெள்ளி");
                break;
            case "2024-08-03":
                tamil_date.setText("18 - ஆடி சனி");
                break;
            case "2024-08-04":
                tamil_date.setText("19 - ஆடி ஞாயிறு");
                break;
            case "2024-08-05":
                tamil_date.setText("20 - ஆடி திங்கள்");
                break;
            case "2024-08-06":
                tamil_date.setText("21 - ஆடி செவ்வாய்");
                break;
            case "2024-08-07":
                tamil_date.setText("22 - ஆடி புதன்");
                break;
            case "2024-08-08":
                tamil_date.setText("23 - ஆடி வியாழன்");
                break;
            case "2024-08-09":
                tamil_date.setText("24 - ஆடி வெள்ளி");
                break;
            case "2024-08-10":
                tamil_date.setText("25 - ஆடி சனி");
                break;
            case "2024-08-11":
                tamil_date.setText("26 - ஆடி ஞாயிறு");
                break;
            case "2024-08-12":
                tamil_date.setText("27 - ஆடி திங்கள்");
                break;
            case "2024-08-13":
                tamil_date.setText("28 - ஆடி செவ்வாய்");
                break;
            case "2024-08-14":
                tamil_date.setText("29 - ஆடி புதன்");
                break;
            case "2024-08-15":
                tamil_date.setText("30 - ஆடி வியாழன்");
                break;
            case "2024-08-16":
                tamil_date.setText("31 - ஆடி வெள்ளி");
                break;
            case "2024-08-17":
                tamil_date.setText("1 - ஆவணி  சனி");
                break;
            case "2024-08-18":
                tamil_date.setText("2 - ஆவணி  ஞாயிறு");
                break;
            case "2024-08-19":
                tamil_date.setText("3 - ஆவணி  திங்கள்");
                break;
            case "2024-08-20":
                tamil_date.setText("4 - ஆவணி  செவ்வாய்");
                break;
            case "2024-08-21":
                tamil_date.setText("5 - ஆவணி  புதன்");
                break;
            case "2024-08-22":
                tamil_date.setText("6 - ஆவணி  வியாழன்");
                break;
            case "2024-08-23":
                tamil_date.setText("7 - ஆவணி  வெள்ளி");
                break;
            case "2024-08-24":
                tamil_date.setText("8 - ஆவணி  சனி");
                break;
            case "2024-08-25":
                tamil_date.setText("9 - ஆவணி  ஞாயிறு");
                break;
            case "2024-08-26":
                tamil_date.setText("10 - ஆவணி  திங்கள்");
                break;
            case "2024-08-27":
                tamil_date.setText("11 - ஆவணி  செவ்வாய்");
                break;
            case "2024-08-28":
                tamil_date.setText("12 - ஆவணி  புதன்");
                break;
            case "2024-08-29":
                tamil_date.setText("13 - ஆவணி  வியாழன்");
                break;
            case "2024-08-30":
                tamil_date.setText("14 - ஆவணி  வெள்ளி");
                break;
            case "2024-08-31":
                tamil_date.setText("15 - ஆவணி  சனி");
                break;
            /*******************************************************9. august ************************************************************************************/

            case "2024-09-01":
                tamil_date.setText("16 - ஆவணி  ஞாயிறு");
                break;
            case "2024-09-02":
                tamil_date.setText("17 - ஆவணி  திங்கள்");
                break;
            case "2024-09-03":
                tamil_date.setText("18 - ஆவணி  செவ்வாய்");
                break;
            case "2024-09-04":
                tamil_date.setText("19 - ஆவணி  புதன்");
                break;
            case "2024-09-05":
                tamil_date.setText("20 - ஆவணி  வியாழன்");
                break;
            case "2024-09-06":
                tamil_date.setText("21 - ஆவணி  வெள்ளி");
                break;
            case "2024-09-07":
                tamil_date.setText("22 - ஆவணி  சனி");
                break;
            case "2024-09-08":
                tamil_date.setText("23 - ஆவணி  ஞாயிறு");
                break;
            case "2024-09-09":
                tamil_date.setText("24 - ஆவணி  திங்கள்");
                break;
            case "2024-09-10":
                tamil_date.setText("25 - ஆவணி  செவ்வாய்");
                break;
            case "2024-09-11":
                tamil_date.setText("26 - ஆவணி  புதன்");
                break;
            case "2024-09-12":
                tamil_date.setText("27 - ஆவணி  வியாழன்");
                break;
            case "2024-09-13":
                tamil_date.setText("28 - ஆவணி  வெள்ளி");
                break;
            case "2024-09-14":
                tamil_date.setText("29 - ஆவணி  சனி");
                break;
            case "2024-09-15":
                tamil_date.setText("30 - ஆவணி  ஞாயிறு");
                break;
            case "2024-09-16":
                tamil_date.setText("31 -ஆவணி  திங்கள்");
                break;
            case "2024-09-17":
                tamil_date.setText("1 - புரட்டாசி  செவ்வாய்");
                break;
            case "2024-09-18":
                tamil_date.setText("2 - புரட்டாசி புதன்");
                break;
            case "2024-09-19":
                tamil_date.setText("3 - புரட்டாசி  வியாழன்");
                break;
            case "2024-09-20":
                tamil_date.setText("4 - புரட்டாசி  வெள்ளி");
                break;
            case "2024-09-21":
                tamil_date.setText("5 - புரட்டாசி  சனி");
                break;
            case "2024-09-22":
                tamil_date.setText("6 - புரட்டாசி  ஞாயிறு");
                break;
            case "2024-09-23":
                tamil_date.setText("7 - புரட்டாசி  திங்கள்");
                break;
            case "2024-09-24":
                tamil_date.setText("8 - புரட்டாசி  செவ்வாய்");
                break;
            case "2024-09-25":
                tamil_date.setText("9 - புரட்டாசி புதன்");
                break;
            case "2024-09-26":
                tamil_date.setText("10 - புரட்டாசி  வியாழன்");
                break;
            case "2024-09-27":
                tamil_date.setText("11 - புரட்டாசி  வெள்ளி");
                break;
            case "2024-09-28":
                tamil_date.setText("12 - புரட்டாசி  சனி");
                break;
            case "2024-09-29":
                tamil_date.setText("13 - புரட்டாசி  ஞாயிறு");
                break;
            case "2024-09-30":
                tamil_date.setText("14 - புரட்டாசி  திங்கள்");
                break;

            /*******************************************************10. octobar ************************************************************************************/

            case "2024-10-01":
                tamil_date.setText("15 - புரட்டாசி  செவ்வாய்");
                break;
            case "2024-10-02":
                tamil_date.setText("16 - புரட்டாசி புதன்");
                break;
            case "2024-10-03":
                tamil_date.setText("17 - புரட்டாசி  வியாழன்");
                break;
            case "2024-10-04":
                tamil_date.setText("18 - புரட்டாசி  வெள்ளி");
                break;
            case "2024-10-05":
                tamil_date.setText("19 - புரட்டாசி  சனி");
                break;
            case "2024-10-06":
                tamil_date.setText("20 - புரட்டாசி  ஞாயிறு");
                break;
            case "2024-10-07":
                tamil_date.setText("21 - புரட்டாசி  திங்கள்");
                break;
            case "2024-10-08":
                tamil_date.setText("22 - புரட்டாசி  செவ்வாய்");
                break;
            case "2024-10-09":
                tamil_date.setText("23 - புரட்டாசி புதன்");
                break;
            case "2024-10-10":
                tamil_date.setText("24 - புரட்டாசி  வியாழன்");
                break;
            case "2024-10-11":
                tamil_date.setText("25 - புரட்டாசி  வெள்ளி");
                break;
            case "2024-10-12":
                tamil_date.setText("26 - புரட்டாசி  சனி");
                break;
            case "2024-10-13":
                tamil_date.setText("27 - புரட்டாசி  ஞாயிறு");
                break;
            case "2024-10-14":
                tamil_date.setText("28 - புரட்டாசி  திங்கள்");
                break;
            case "2024-10-15":
                tamil_date.setText("29 - புரட்டாசி  செவ்வாய்");
                break;
            case "2024-10-16":
                tamil_date.setText("30 - புரட்டாசி புதன்");
                break;
            case "2024-10-17":
                tamil_date.setText("31 - புரட்டாசி  வியாழன்");
                break;
            case "2024-10-18":
                tamil_date.setText("1 - ஐப்பசி   வெள்ளி");
                break;
            case "2024-10-19":
                tamil_date.setText("2 - ஐப்பசி   சனி");
                break;
            case "2024-10-20":
                tamil_date.setText("3 - ஐப்பசி   ஞாயிறு");
                break;
            case "2024-10-21":
                tamil_date.setText("4 - ஐப்பசி   திங்கள்");
                break;
            case "2024-10-22":
                tamil_date.setText("5 - ஐப்பசி   செவ்வாய்");
                break;
            case "2024-10-23":
                tamil_date.setText("6 - ஐப்பசி  புதன்");
                break;
            case "2024-10-24":
                tamil_date.setText("7 - ஐப்பசி   வியாழன்");
                break;
            case "2024-10-25":
                tamil_date.setText("8 - ஐப்பசி   வெள்ளி");
                break;
            case "2024-10-26":
                tamil_date.setText("9 - ஐப்பசி   சனி");
                break;
            case "2024-10-27":
                tamil_date.setText("10 - ஐப்பசி   ஞாயிறு");
                break;
            case "2024-10-28":
                tamil_date.setText("11 - ஐப்பசி   திங்கள்");
                break;
            case "2024-10-29":
                tamil_date.setText("12 - ஐப்பசி   செவ்வாய்");
                break;
            case "2024-10-30":
                tamil_date.setText("13 - ஐப்பசி  புதன்");
                break;
            case "2024-10-31":
                tamil_date.setText("14 - ஐப்பசி  வியாழன்");
                break;
            /*******************************************************11. november ************************************************************************************/

            case "2024-11-01":
                tamil_date.setText("15 - ஐப்பசி வெள்ளி");
                break;
            case "2024-11-02":
                tamil_date.setText("16 - ஐப்பசி  சனி");
                break;
            case "2024-11-03":
                tamil_date.setText("17 - ஐப்பசி  ஞாயிறு");
                break;
            case "2024-11-04":
                tamil_date.setText("18 - ஐப்பசி  திங்கள்");
                break;
            case "2024-11-05":
                tamil_date.setText("19 - ஐப்பசி  செவ்வாய்");
                break;
            case "2024-11-06":
                tamil_date.setText("20 - ஐப்பசி   புதன்");
                break;
            case "2024-11-07":
                tamil_date.setText("21 - ஐப்பசி  வியாழன்");
                break;
            case "2024-11-08":
                tamil_date.setText("22 - ஐப்பசி   வெள்ளி");
                break;
            case "2024-11-09":
                tamil_date.setText("23 - ஐப்பசி    சனி");
                break;
            case "2024-11-10":
                tamil_date.setText("24 - ஐப்பசி  ஞாயிறு");
                break;
            case "2024-11-11":
                tamil_date.setText("25 - ஐப்பசி  திங்கள்");
                break;
            case "2024-11-12":
                tamil_date.setText("26 -ஐப்பசி  செவ்வாய்");
                break;
            case "2024-11-13":
                tamil_date.setText("27 - ஐப்பசி   புதன்");
                break;
            case "2024-11-14":
                tamil_date.setText("28 - ஐப்பசி    வியாழன்");
                break;
            case "2024-11-15":
                tamil_date.setText("29 - ஐப்பசி   வெள்ளி");
                break;
            case "2024-11-16":
                tamil_date.setText("1 - கார்த்திகை   சனி");
                break;
            case "2024-11-17":
                tamil_date.setText("2 - கார்த்திகை    ஞாயிறு");
                break;
            case "2024-11-18":
                tamil_date.setText("3 - கார்த்திகை   திங்கள்");
                break;
            case "2024-11-19":
                tamil_date.setText("4 - கார்த்திகை    செவ்வாய்");
                break;
            case "2024-11-20":
                tamil_date.setText("5 - கார்த்திகை   புதன்");
                break;
            case "2024-11-21":
                tamil_date.setText("6 - கார்த்திகை  வியாழன்");
                break;
            case "2024-11-22":
                tamil_date.setText("7 - கார்த்திகை  வெள்ளி");
                break;
            case "2024-11-23":
                tamil_date.setText("8 - கார்த்திகை  சனி");
                break;
            case "2024-11-24":
                tamil_date.setText("9 - கார்த்திகை  ஞாயிறு");
                break;
            case "2024-11-25":
                tamil_date.setText("10 - கார்த்திகை  திங்கள்");
                break;
            case "2024-11-26":
                tamil_date.setText("11 - கார்த்திகை  செவ்வாய்");
                break;
            case "2024-11-27":
                tamil_date.setText("12 - கார்த்திகை  புதன்");
                break;
            case "2024-11-28":
                tamil_date.setText("13 - கார்த்திகை  வியாழன்");
                break;
            case "2024-11-29":
                tamil_date.setText("14 - கார்த்திகை  வெள்ளி");
                break;
            case "2024-11-30":
                tamil_date.setText("15 - கார்த்திகை  சனி");
                break;
            /*******************************************************11. november ************************************************************************************/

            case "2024-12-01":
                tamil_date.setText("16 - கார்த்திகை    ஞாயிறு");
                break;
            case "2024-12-02":
                tamil_date.setText("17 - கார்த்திகை   திங்கள்");
                break;
            case "2024-12-03":
                tamil_date.setText("18 - கார்த்திகை    செவ்வாய்");
                break;
            case "2024-12-04":
                tamil_date.setText("19 - கார்த்திகை   புதன்");
                break;
            case "2024-12-05":
                tamil_date.setText("20 - கார்த்திகை    வியாழன்");
                break;
            case "2024-12-06":
                tamil_date.setText("21 - கார்த்திகை   வெள்ளி");
                break;
            case "2024-12-07":
                tamil_date.setText("22 - கார்த்திகை    சனி");
                break;
            case "2024-12-08":
                tamil_date.setText("23 - கார்த்திகை    ஞாயிறு");
                break;
            case "2024-12-09":
                tamil_date.setText("24 - கார்த்திகை   திங்கள்");
                break;
            case "2024-12-10":
                tamil_date.setText("25 - கார்த்திகை    செவ்வாய்");
                break;
            case "2024-12-11":
                tamil_date.setText("26 - கார்த்திகை   புதன்");
                break;
            case "2024-12-12":
                tamil_date.setText("27 -ஐப்பசி  வியாழன்");
                break;
            case "2024-12-13":
                tamil_date.setText("28 - கார்த்திகை    வெள்ளி");
                break;
            case "2024-12-14":
                tamil_date.setText("29 - கார்த்திகை   சனி");
                break;
            case "2024-12-15":
                tamil_date.setText("30 - கார்த்திகை    ஞாயிறு");
                break;
            case "2024-12-16":
                tamil_date.setText("1 - மார்கழி     திங்கள்");
                break;
            case "2024-12-17":
                tamil_date.setText("2 - மார்கழி    செவ்வாய்");
                break;
            case "2024-12-18":
                tamil_date.setText("3 - மார்கழி    புதன்");
                break;
            case "2024-12-19":
                tamil_date.setText("4 - மார்கழி    வியாழன்");
                break;
            case "2024-12-20":
                tamil_date.setText("5 - மார்கழி   வெள்ளி");
                break;
            case "2024-12-21":
                tamil_date.setText("6 - மார்கழி  சனி");
                break;
            case "2024-12-22":
                tamil_date.setText("7 - மார்கழி  ஞாயிறு");
                break;
            case "2024-12-23":
                tamil_date.setText("8 - மார்கழி  திங்கள்");
                break;
            case "2024-12-24":
                tamil_date.setText("9 - மார்கழி  செவ்வாய்");
                break;
            case "2024-12-25":
                tamil_date.setText("10 - மார்கழி  புதன்");
                break;
            case "2024-12-26":
                tamil_date.setText("11 - மார்கழி  வியாழன்");
                break;
            case "2024-12-27":
                tamil_date.setText("12 - மார்கழி  வெள்ளி");
                break;
            case "2024-12-28":
                tamil_date.setText("13 - மார்கழி  சனி");
                break;
            case "2024-12-29":
                tamil_date.setText("14 - மார்கழி  ஞாயிறு");
                break;
            case "2024-12-30":
                tamil_date.setText("15 - மார்கழி  திங்கள்");
                break;
            case "2024-12-31":
                tamil_date.setText("16 - மார்கழி   செவ்வாய்");
                break;


            // Add more cases for other dates as needed
            default:
                tamil_date.setText("No special event today.");
        }
    }
}