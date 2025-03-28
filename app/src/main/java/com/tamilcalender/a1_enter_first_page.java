package com.tamilcalender;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class a1_enter_first_page extends AppCompatActivity {

    private AdView adView,adView1;

    /******************************************************************************
     oth activity
     **********************************************************************************/
    public Button B0;
    /******************************************************************************
     text daily date activity
     **********************************************************************************/
    private TextView T1,tamil_date;
    /******************************************************************************
     1st activity
     **********************************************************************************/
    private Button B1,B2,B3,B4;
    /******************************************************************************
     2nd activity
     **********************************************************************************/
    private Button B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21;
    /******************************************************************************
     3rd activity
     **********************************************************************************/
    private Button B22,B23,B24,B25,B26,B27,B28,B29;
    /******************************************************************************
     4th activity
     **********************************************************************************/
    private Button B30;
    /******************************************************************************
     5th activity
     **********************************************************************************/
    private Button B31,B32,B33,B34,B35,B36,B37;
    /******************************************************************************
     6th activity
     **********************************************************************************/
    private Button B38,B39,B40,B41,B42,B43,B44,B45,B46;
    /******************************************************************************
     7th activity
     **********************************************************************************/
    private Button B47,B48,B49,B50,B51,B52,B67;
    /******************************************************************************
     8th activity
     **********************************************************************************/
    private Button B53,B54,B55,B56,B57,B58,B59,B60,B61,B62,B63,B64,B65,B66;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_enter_first_page);

        //todo:banner ads
        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
        adView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        adView1 = findViewById(R.id.adView5);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        adView1.loadAd(adRequest1);


        /******************************************************************************
         0th activity button id allocation

                                 1st {curly brace details}

         **********************************************************************************/
        B0 =(Button) findViewById(R.id.button72);
        /******************************************************************************
         TEXT DAILY DATE activity
         **********************************************************************************/
        T1 = (TextView) findViewById(R.id.textView3);
        tamil_date = (TextView) findViewById(R.id.textView2);
        T1.setText(getToDAyDAte());
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String dateString = sdf.format(currentDate);
        // Show text based on the current date
        showTextBasedOnDate(dateString);
        /******************************************************************************
         1st activity button id allocation
         **********************************************************************************/
        B1 =(Button) findViewById(R.id.button26);
        B2 =(Button) findViewById(R.id.button27);
        B3 =(Button) findViewById(R.id.button28);
        B4 =(Button) findViewById(R.id.button29);
        /******************************************************************************
         2nd activity button id allocation
         **********************************************************************************/
        B5 =(Button) findViewById(R.id.button30);
        B6 =(Button) findViewById(R.id.button31);
        B7 =(Button) findViewById(R.id.button32);
        B8 =(Button) findViewById(R.id.button33);
        B9 =(Button) findViewById(R.id.button34);
        B10 =(Button) findViewById(R.id.button35);
        B11 =(Button) findViewById(R.id.button36);
        B12 =(Button) findViewById(R.id.button38);
        B13 =(Button) findViewById(R.id.button37);
        B14 =(Button) findViewById(R.id.button39);
        B15 =(Button) findViewById(R.id.button40);
        B16 =(Button) findViewById(R.id.button41);
        B17 =(Button) findViewById(R.id.button42);
        B18 =(Button) findViewById(R.id.button43);
        B19 =(Button) findViewById(R.id.button44);
        B20 =(Button) findViewById(R.id.button45);
        B21 =(Button) findViewById(R.id.button46);
        /******************************************************************************
         3rd activity button id allocation
         **********************************************************************************/
        B22 =(Button) findViewById(R.id.button47);
        B23 =(Button) findViewById(R.id.button48);
        B24 =(Button) findViewById(R.id.button49);
        B25 =(Button) findViewById(R.id.button50);
        B26 =(Button) findViewById(R.id.button51);
        B27 =(Button) findViewById(R.id.button52);
        B28 =(Button) findViewById(R.id.button53);
        B29 =(Button) findViewById(R.id.button54);
        /******************************************************************************
         4th activity button id allocation
         **********************************************************************************/
        B30 =(Button) findViewById(R.id.button55);
        /******************************************************************************
         5th activity button id allocation
         **********************************************************************************/
        B31 =(Button) findViewById(R.id.button56);
        B32 =(Button) findViewById(R.id.button57);
        B33 =(Button) findViewById(R.id.button58);
        B34 =(Button) findViewById(R.id.button59);
        B35 =(Button) findViewById(R.id.button60);
        B36 =(Button) findViewById(R.id.button61);
        B37 =(Button) findViewById(R.id.button62);
        /******************************************************************************
         6th activity button id allocation
         **********************************************************************************/
        /**
         B38 =(Button) findViewById(R.id.button63);
        B39 =(Button) findViewById(R.id.button64);
        B40 =(Button) findViewById(R.id.button65);
        B41 =(Button) findViewById(R.id.button66);
        B42 =(Button) findViewById(R.id.button67);
        B43 =(Button) findViewById(R.id.button68);
        B44 =(Button) findViewById(R.id.button69);
        B45 =(Button) findViewById(R.id.button70);
        B46 =(Button) findViewById(R.id.button71);**/
        /******************************************************************************
         7th activity button id allocation
         **********************************************************************************/
        B67 =(Button) findViewById(R.id.button93);
        B47 =(Button) findViewById(R.id.button74);
        B48 =(Button) findViewById(R.id.button76);
        B49 =(Button) findViewById(R.id.button77);
        B50 =(Button) findViewById(R.id.button78);
        B51 =(Button) findViewById(R.id.button79);
        B52 =(Button) findViewById(R.id.button94);
        /******************************************************************************
         8th activity button id allocation
         **********************************************************************************/
        B53 =(Button) findViewById(R.id.button75);
        B54 =(Button) findViewById(R.id.button80);
        B55 =(Button) findViewById(R.id.button81);
        B56 =(Button) findViewById(R.id.button82);
        B57 =(Button) findViewById(R.id.button83);
        B58 =(Button) findViewById(R.id.button84);
        B59 =(Button) findViewById(R.id.button85);
        B60 =(Button) findViewById(R.id.button86);
        B61 =(Button) findViewById(R.id.button87);
        B62 =(Button) findViewById(R.id.button88);
        B63 =(Button) findViewById(R.id.button89);
        B64 =(Button) findViewById(R.id.button90);
        B65 =(Button) findViewById(R.id.button91);
        B66 =(Button) findViewById(R.id.button92);


        /******************************************************************************
         8th activity all button click method
         **********************************************************************************/

        B53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B53();

            }
        });
        B54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B54();

            }
        });
        B55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B55();

            }
        });
        B56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B56();

            }
        });
        B57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B57();

            }
        });
        B58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B58();

            }
        });
        B59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B59();

            }
        });
        B60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B60();

            }
        });
        B61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B61();

            }
        });
        B62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B62();

            }
        });
        B63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B63();

            }
        });
        B64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B64();

            }
        });
        B65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B65();

            }
        });
        B66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B66();

            }
        });


        /******************************************************************************
         7th activity all button click method
         **********************************************************************************/

        B67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B67();

            }
        });
        B47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B47();

            }
        });
        B48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B48();

            }
        });
        B49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B49();

            }
        });
        B50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B50();

            }
        });
        B51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B51();

            }
        });
        B52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B52();

            }
        });
        /******************************************************************************
         5th activity all button click method
         **********************************************************************************/

        B31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    B31();

                }
            });
        B32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B32();

            }
        });
        B33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B33();

            }
        });
        B34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B34();

            }
        });
        B35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B35();

            }
        });
        B36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B36();

            }
        });
        B37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B37();

            }
        });
        /******************************************************************************
         4th activity all button click method
         **********************************************************************************/
        B30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B30();

            }
        });
        /******************************************************************************
         3rd activity all button click method
         **********************************************************************************/
        B22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B22();

            }
        });
        B23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B23();

            }
        });
        B24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B24();

            }
        });
        B25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B25();

            }
        });
        B26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B26();

            }
        });
        B27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B27();

            }
        });
        B28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B28();

            }
        });
        B29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B29();

            }
        });

        /******************************************************************************
         2nd activity all button click method
         **********************************************************************************/
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5();

            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B6();

            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B7();

            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B8();

            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B9();

            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B10();

            }
        });
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B11();

            }
        });
        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B12();

            }
        });
        B13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B13();

            }
        });
        B14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B14();

            }
        });
        B15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B15();

            }
        });
        B16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B16();

            }
        });
        B17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B17();

            }
        });
        B18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B18();

            }
        });
        B19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B19();

            }
        });
        B20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B20();

            }
        });
        B21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B21();

            }
        });
        /******************************************************************************
         1st activity all button click method
         **********************************************************************************/

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1();

            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2();

            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3();

            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4();

            }
        });
        /******************************************************************************
         0th share button method below brief explain
         **********************************************************************************/
        share();
    }

/******************************************************************************

                               2nd {curly brace details}

 **********************************************************************************/

    /******************************************************************************
     8th activity button method below brief explain redirect another activity
     **********************************************************************************/

    private void B53() {
        Intent intent = new Intent(this, length_conversion_unit.class);
        startActivity(intent);
    }
    private void B54() {
        Intent intent = new Intent(this, area_conversion_unit.class);
        startActivity(intent);
    }
    private void B55() {
        Intent intent = new Intent(this, angle_conversion_unit.class);
        startActivity(intent);
    }
    private void B56() {
        Intent intent = new Intent(this, temperature_conversion_unit.class);
        startActivity(intent);
    }
    private void B57() {
        Intent intent = new Intent(this, volume_conversion_unit.class);
        startActivity(intent);
    }
    private void B58() {
        Intent intent = new Intent(this, weight_conversion_unit.class);
        startActivity(intent);
    }
    private void B59() {
        Intent intent = new Intent(this, power_conversion_unit.class);
        startActivity(intent);
    }
    private void B60() {
        Intent intent = new Intent(this, work_conversion_unit.class);
        startActivity(intent);
    }
    private void B61() {
        Intent intent = new Intent(this, speed_conversion_unit.class);
        startActivity(intent);
    }
    private void B62() {
        Intent intent = new Intent(this, fuel_conversin_unit.class);
        startActivity(intent);
    }
    private void B63() {
        Intent intent = new Intent(this, voltage_conversion_unit.class);
        startActivity(intent);
    }
    private void B64() {
        Intent intent = new Intent(this, time_conversion_unit.class);
        startActivity(intent);
    }
    private void B65() {
        Intent intent = new Intent(this, data_conversion_unit.class);
        startActivity(intent);
    }
    private void B66() {
        Intent intent = new Intent(this, pressure_conversion_unit.class);
        startActivity(intent);
    }

    /******************************************************************************
     7th activity button method below brief explain redirect another activity
     **********************************************************************************/
    private void B67() {
        Intent intent = new Intent(this, round_pipe_weight.class);
        startActivity(intent);
    }

    private void B47() {
        Intent intent = new Intent(this, plain_round_bar_steel.class);
        startActivity(intent);
    }
    private void B48() {
        Intent intent = new Intent(this,square_rectangle_shape_pipe_weight .class);
        startActivity(intent);
    }
    private void B49() {
        Intent intent = new Intent(this, square_rectangle_shape_weight.class);
        startActivity(intent);
    }
    private void B50() {
        Intent intent = new Intent(this, hexagane_shape_weight.class);
        startActivity(intent);
    }
    private void B51() {
        Intent intent = new Intent(this, t_shape_weight.class);
        startActivity(intent);
    }
    private void B52() {
        Intent intent = new Intent(this, i_shape_weight.class);
        startActivity(intent);
    }
    /******************************************************************************
     5th activity button method below brief explain redirect another activity
     **********************************************************************************/

    private void B31() {
        Intent intent = new Intent(this, vasthu.class);
        startActivity(intent);
    }
    private void B32() {
        Intent intent = new Intent(this, vasthu_seiyum_natkkal.class);
        startActivity(intent);
    }
    private void B33() {
        Intent intent = new Intent(this, subamugurtha_thinagal.class);
        startActivity(intent);
    }
    private void B34() {
        Intent intent = new Intent(this, mukkiya_viratha_thinagal.class);
        startActivity(intent);
    }
    private void B35() {
        Intent intent = new Intent(this, ragu_kuligai_yeamagandam.class);
        startActivity(intent);
    }
    private void B36() {
        Intent intent = new Intent(this, pandigaiandarasuvidumurai.class);
        startActivity(intent);
    }
    private void B37() {
        Intent intent = new Intent(this, palli_villum_palan.class);
        startActivity(intent);
    }
    /******************************************************************************
     4th activity button method below brief explain redirect another activity
     **********************************************************************************/
    private void B30() {
        Intent intent = new Intent(this, pattachitta_aregister_webview.class);
        startActivity(intent);
    }
    /******************************************************************************
     3rd activity button method below brief explain redirect another activity
     **********************************************************************************/
    private void B22() {
        Intent intent = new Intent(this, uneven_area_shape.class);
        startActivity(intent);
    }
    private void B23() {
        Intent intent = new Intent(this, find_forth_side.class);
        startActivity(intent);
    }
    private void B24() {
        Intent intent = new Intent(this, rectangle_shape_area.class);
        startActivity(intent);
    }
    private void B25() {
        Intent intent = new Intent(this, square_shape_area.class);
        startActivity(intent);
    }
    private void B26() {
        Intent intent = new Intent(this, allipse_shape_area.class);
        startActivity(intent);
    }
    private void B27() {
        Intent intent = new Intent(this, trapezoidal_shape_area.class);
        startActivity(intent);
    }
    private void B28() {
        Intent intent = new Intent(this, circle_shape_area.class);
        startActivity(intent);
    }
    private void B29() {
        Intent intent = new Intent(this, triangle_shape_area.class);
        startActivity(intent);
    }
    /******************************************************************************
     2nd activity button method below brief explain redirect another activity
     **********************************************************************************/
    private void B5() {
        Intent intent = new Intent(this, veetumanai_kuli_kanakku.class);
        startActivity(intent);


    }
    private void B6() {
        Intent intent = new Intent(this, brick_mortar.class);
        startActivity(intent);

       /* B6.setOnClickListener(v -> showReviewFlow());*/
    }

    private void B7() {
        Intent intent = new Intent(this, Cement_plaster.class);
        startActivity(intent);
    }
    private void B8() {
        Intent intent = new Intent(this, tiles_ground.class);
        startActivity(intent);
    }
    private void B9() {
        Intent intent = new Intent(this, tiles_wall_pillars_elevation.class);
        startActivity(intent);
    }
    private void B10() {
        Intent intent = new Intent(this, paint_putty.class);
        startActivity(intent);
    }
    private void B11() {
        Intent intent = new Intent(this, window_wood_work.class);
        startActivity(intent);
    }
    private void B12() {
        Intent intent = new Intent(this, wooden_door.class);
        startActivity(intent);
    }
    private void B13() {
        Intent intent = new Intent(this, wooden_main_door_polish.class);
        startActivity(intent);
    }
    private void B14() {
        Intent intent = new Intent(this, soil_fill_quantity.class);
        startActivity(intent);
    }
    private void B15() {
        Intent intent = new Intent(this, basement_floor_concrete.class);
        startActivity(intent);
    }
    private void B16() {
        Intent intent = new Intent(this, R_R_masontry_and_course_rubble.class);
        startActivity(intent);
    }
    private void B17() {
        Intent intent = new Intent(this, Mukkal_jally_concrete_roof_beam_pillar.class);
        startActivity(intent);
    }
    private void B18() {
        Intent intent = new Intent(this, reinforcement_steel_all.class);
        startActivity(intent);
    }
    private void B19() {
        Intent intent = new Intent(this, staircase_caculate.class);
        startActivity(intent);
    }
    private void B20() {
        Intent intent = new Intent(this, watertank_quantity.class);
        startActivity(intent);
    }
    private void B21() {
        Intent intent = new Intent(this, electric_work.class);
        startActivity(intent);
    }
    /******************************************************************************
     1st activity button method below brief explain redirect another activity
     **********************************************************************************/

    private void B1() {
        Intent intent = new Intent(this, nalekatti.class);
        startActivity(intent);
    }
    private void B2() {
        Intent intent = new Intent(this, madhakatti.class);
        startActivity(intent);
    }
    private void B3() {
        Intent intent = new Intent(this, varuda_rasi_palan.class);
        startActivity(intent);
    }
    private void B4() {
        Intent intent = new Intent(this, rrrrasi.class);
        startActivity(intent);
    }





    /***********************************************************************
     date brief explain below
     ************************************************************************/
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


    /******************************************************************************
     share activity brief explain below
     **********************************************************************************/
    private void share() {
        B0.setOnClickListener(new View.OnClickListener() {
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

