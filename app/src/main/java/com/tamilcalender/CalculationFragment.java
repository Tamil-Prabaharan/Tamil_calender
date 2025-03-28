package com.tamilcalender;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class CalculationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculation,container,false);

        Button B0=view.findViewById(R.id.button);
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

        /******************************************************************************
         1st activity button method below brief explain redirect another activity
         **********************************************************************************/

        Button சீரற்ற_நில_வடிவம் =view.findViewById(R.id.button2);
        சீரற்ற_நில_வடிவம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),uneven_area_shape.class);
                startActivity(intent);
            }
        });

        Button மூன்று_பக்க_நீளம்_தெரிந்துள்ளோம்_நான்காவது_பக்க_நீளத்தைக்_கண்டறிவோம் =view.findViewById(R.id.button3);
        மூன்று_பக்க_நீளம்_தெரிந்துள்ளோம்_நான்காவது_பக்க_நீளத்தைக்_கண்டறிவோம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),find_forth_side.class);
                startActivity(intent);
            }
        });

        Button செவ்வக_வடிவம் =view.findViewById(R.id.button64);
        செவ்வக_வடிவம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),rectangle_shape_area.class);
                startActivity(intent);
            }
        });

        Button சதுர_வடிவம் =view.findViewById(R.id.button65);
        சதுர_வடிவம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),square_shape_area.class);
                startActivity(intent);
            }
        });

        Button நீள்வட்ட_வடிவம் =view.findViewById(R.id.button66);
        நீள்வட்ட_வடிவம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),allipse_shape_area.class);
                startActivity(intent);
            }
        });

        Button ட்ராப்ஸ்வ்ய்டல்_வடிவம்  =view.findViewById(R.id.button67);
        ட்ராப்ஸ்வ்ய்டல்_வடிவம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),trapezoidal_shape_area.class);
                startActivity(intent);
            }
        });

        Button வட்ட_வடிவம்   =view.findViewById(R.id.button68);
        வட்ட_வடிவம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),circle_shape_area.class);
                startActivity(intent);
            }
        });

        Button முக்கோண_வடிவம்   =view.findViewById(R.id.button69);
        முக்கோண_வடிவம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),triangle_shape_area.class);
                startActivity(intent);
            }
        });

        /******************************************************************************
         2nd activity button method below brief explain redirect another activity
         **********************************************************************************/

        Button சுற்று_குழாய்_உலோக_கம்பி   =view.findViewById(R.id.button70);
        சுற்று_குழாய்_உலோக_கம்பி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),round_pipe_weight.class);
                startActivity(intent);
            }
        });

        Button சுற்று_உலோக_கம்பி   =view.findViewById(R.id.button71);
        சுற்று_உலோக_கம்பி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),plain_round_bar_steel.class);
                startActivity(intent);
            }
        });

        Button சதுர_உலோக_கம்பி   =view.findViewById(R.id.button102);
        சதுர_உலோக_கம்பி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),square_rectangle_shape_pipe_weight.class);
                startActivity(intent);
            }
        });

        Button சதுர_குழாய்_உலோக_கம்பி   =view.findViewById(R.id.button103);
        சதுர_குழாய்_உலோக_கம்பி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),square_rectangle_shape_weight.class);
                startActivity(intent);
            }
        });

        Button டி_வடிவம்_உலோக_கம்பி   =view.findViewById(R.id.button104);
        டி_வடிவம்_உலோக_கம்பி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),hexagane_shape_weight.class);
                startActivity(intent);
            }
        });

        Button டிவடிவம்_உலோக_கம்பி   =view.findViewById(R.id.button105);
        டி_வடிவம்_உலோக_கம்பி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),t_shape_weight.class);
                startActivity(intent);
            }
        });

        Button ஐ_வடிவம்_உலோக_கம்பி   =view.findViewById(R.id.button106);
        ஐ_வடிவம்_உலோக_கம்பி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),i_shape_weight.class);
                startActivity(intent);
            }
        });

        /******************************************************************************
         3rd activity button method below brief explain redirect another activity
         **********************************************************************************/

        Button நீளம்   =view.findViewById(R.id.button107);
        நீளம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),length_conversion_unit.class);
                startActivity(intent);
            }
        });

        Button பகுதி   =view.findViewById(R.id.button108);
        பகுதி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),area_conversion_unit.class);
                startActivity(intent);
            }
        });

        Button கோணம்   =view.findViewById(R.id.button109);
        கோணம்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),angle_conversion_unit.class);
                startActivity(intent);
            }
        });

        Button வெப்ப_நிலை   =view.findViewById(R.id.button110);
        வெப்ப_நிலை.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),temperature_conversion_unit.class);
                startActivity(intent);
            }
        });

        Button  தொகுதி   =view.findViewById(R.id.button111);
        தொகுதி.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),volume_conversion_unit.class);
                startActivity(intent);
            }
        });

        return view;
    }
}