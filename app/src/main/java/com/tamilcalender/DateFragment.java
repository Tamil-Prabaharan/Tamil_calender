package com.tamilcalender;

import static java.util.Calendar.JANUARY;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFragment extends Fragment {
    /******************************************************************************
     text daily date activity
     **********************************************************************************/
    private String T1,tamil_date;

    private TextView tamilCalendarTextView;

    public TextView T3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_date, container, false);

        TextView T1 = view.findViewById(R.id.textView10);
        TextView tamil_date = view.findViewById(R.id.textView11);
        T1.setText(getToDAyDAte());
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String dateString = sdf.format(currentDate);
        // Show text based on the current date
        showTextBasedOnDate(dateString);

        displayTamilCalendar();

        Button B0 = view.findViewById(R.id.button);
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download this App";
                String Sub = "https://play.google.com/store/apps/details?id=com.tamilcalender&hl=en-IN";
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share using"));

            }
        });
        Button நாள்_காட்டி = view.findViewById(R.id.button4);
        நாள்_காட்டி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), nalekatti.class);
                startActivity(intent);
            }
        });
        Button மாத_காட்டி = view.findViewById(R.id.button5);
        மாத_காட்டி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), madhakatti.class);
                startActivity(intent);
            }
        });
        Button ராசி_பலன்கள் = view.findViewById(R.id.button6);
        ராசி_பலன்கள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), varuda_rasi_palan.class);
                startActivity(intent);
            }
        });
        Button பல்லி_விழும்_பலன் = view.findViewById(R.id.button7);
        பல்லி_விழும்_பலன்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), palli_villum_palan.class);
                startActivity(intent);
            }
        });
        Button காகம்_கரையும்_திசையும் = view.findViewById(R.id.button112);
        காகம்_கரையும்_திசையும்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kagam_karaiyum_palane.class);
                startActivity(intent);
            }
        });
        Button விளக்கு_பலன்கள் = view.findViewById(R.id.button130);
        பல்லி_விழும்_பலன்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), palli_villum_palan.class);
                startActivity(intent);
            }
        });
        Button தான_பலன்கள் = view.findViewById(R.id.button131);


        பல்லி_விழும்_பலன்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), palli_villum_palan.class);
                startActivity(intent);
            }
        });
        Button தும்மல்_சகுனம் = view.findViewById(R.id.button132);
        பல்லி_விழும்_பலன்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), palli_villum_palan.class);
                startActivity(intent);
            }
        });
        Button  மச்ச_சாஸ்திரம் = view.findViewById(R.id.button133);
        பல்லி_விழும்_பலன்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), palli_villum_palan.class);
                startActivity(intent);
            }
        });
        
        return view;
    }

    /***********************************************************************
     date brief explain below
     ************************************************************************/
    private String getToDAyDAte() {
        return new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
    }

    private void showTextBasedOnDate(String date) {

    }

        private void displayTamilCalendar () {
            Calendar calendar = Calendar.getInstance();


            // Calculate Tamil month based on the current month and day
            int month = calendar.get(Calendar.MONTH); // Gregorian month (0 = January, 11 = December)
            int day = calendar.get(Calendar.DAY_OF_MONTH);


            String tamilMonth;

            if ((SimpleDateFormat == Calendar.APRIL && day >= 14) || month == Calendar.MAY) {
                tamilMonth = tamilMonths[0]; // Chithirai
            } else if ((month == Calendar.MAY && day >= 15) || month == Calendar.JUNE) {
                tamilMonth = tamilMonths[1]; // Vaikasi
            } else if ((month == Calendar.JUNE && day >= 15) || month == Calendar.JULY) {
                tamilMonth = tamilMonths[2]; // Aani
            } else if ((month == Calendar.JULY && day >= 16) || month == Calendar.AUGUST) {
                tamilMonth = tamilMonths[3]; // Aadi
            } else if ((month == Calendar.AUGUST && day >= 17) || month == Calendar.SEPTEMBER) {
                tamilMonth = tamilMonths[4]; // Aavani
            } else if ((month == Calendar.SEPTEMBER && day >= 17) || month == Calendar.OCTOBER) {
                tamilMonth = tamilMonths[5]; // Purattasi
            } else if ((month == Calendar.OCTOBER && day >= 17) || month == Calendar.NOVEMBER) {
                tamilMonth = tamilMonths[6]; // Aippasi
            } else if ((month == Calendar.NOVEMBER && day >= 16) || month == Calendar.DECEMBER) {
                tamilMonth = tamilMonths[7]; // Karthigai
            } else if ((month == Calendar.DECEMBER && day >= 16) || month == JANUARY) {
                tamilMonth = tamilMonths[8]; // Margazhi
            } else if ((month == JANUARY && day >= 14) || month == Calendar.FEBRUARY) {
                tamilMonth = tamilMonths[9]; // Thai
            } else if ((month == Calendar.FEBRUARY && day >= 13) || month == Calendar.MARCH) {
                tamilMonth = tamilMonths[10]; // Maasi
            } else {
                tamilMonth = tamilMonths[11]; // Panguni
            }




            // Format the Tamil calendar date
            String formattedDate = " " + tamilMonth + " ";
            tamilCalendarTextView.setText(formattedDate);


        }
    }


