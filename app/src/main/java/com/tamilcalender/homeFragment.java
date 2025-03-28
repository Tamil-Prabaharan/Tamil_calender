package com.tamilcalender;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class homeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

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

        Button வீட்டுமனையடி_குழி_கணக்கு  = view.findViewById(R.id.button113);
        வீட்டுமனையடி_குழி_கணக்கு.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),veetumanai_kuli_kanakku.class);
                startActivity(intent);
            }
        });

        Button செங்கல்_சிமெண்ட்_மற்றும்_மணல்_கணக்கீடுகள்  = view.findViewById(R.id.button114);
        செங்கல்_சிமெண்ட்_மற்றும்_மணல்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),brick_mortar.class);
                startActivity(intent);
            }
        });

        Button சிமெண்ட்_ப்பூச்சு_கணக்கீடுகள்  = view.findViewById(R.id.button115);
        சிமெண்ட்_ப்பூச்சு_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Cement_plaster.class);
                startActivity(intent);
            }
        });

        Button தரைக்கான_டைல்ஸ்_கணக்கீடுகள்  = view.findViewById(R.id.button116);
        தரைக்கான_டைல்ஸ்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),tiles_ground.class);
                startActivity(intent);
            }
        });

        Button சுவருக்கான_டைல்ஸ்_கணக்கீடுகள்  = view.findViewById(R.id.button117);
        சுவருக்கான_டைல்ஸ்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),tiles_wall_pillars_elevation.class);
                startActivity(intent);
            }
        });

        Button பெயிண்ட்_மற்றும்_பட்டி_கணக்கீடுகள்  = view.findViewById(R.id.button118);
        பெயிண்ட்_மற்றும்_பட்டி_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),paint_putty.class);
                startActivity(intent);
            }
        });

        Button ஜன்னல்_கணக்கீடுகள்  = view.findViewById(R.id.button119);
        ஜன்னல்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),window_wood_work.class);
                startActivity(intent);
            }
        });

        Button பிராதான_நுழைவுவாயில்_மெருகூட்டல்_கணக்கீடுகள்  = view.findViewById(R.id.button120);
        பிராதான_நுழைவுவாயில்_மெருகூட்டல்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),wooden_door.class);
                startActivity(intent);
            }
        });

        Button பிரதான_கதவு_மரம்_கணக்கீடுகள்  = view.findViewById(R.id.button121);
        பிரதான_கதவு_மரம்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),wooden_main_door_polish.class);
                startActivity(intent);
            }
        });

        Button அடித்தள_மண்_நிரப்புதல்   = view.findViewById(R.id.button122);
        அடித்தள_மண்_நிரப்புதல்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),soil_fill_quantity.class);
                startActivity(intent);
            }
        });

        Button ஜல்லி_கான்கிரீட்_கணக்கீடுகள்_கரையான்_மருந்து_கணக்கீடுகள்   = view.findViewById(R.id.button123);
        ஜல்லி_கான்கிரீட்_கணக்கீடுகள்_கரையான்_மருந்து_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),basement_floor_concrete.class);
                startActivity(intent);
            }
        });

        Button கருங்கல்_கணக்கீடுகள்   = view.findViewById(R.id.button124);
        கருங்கல்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),R_R_masontry_and_course_rubble.class);
                startActivity(intent);
            }
        });

        Button கூரை_கான்கிரீட்_கணக்கீடுகள்   = view.findViewById(R.id.button125);
        கூரை_கான்கிரீட்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Mukkal_jally_concrete_roof_beam_pillar.class);
                startActivity(intent);
            }
        });

        Button கூரை_ஸ்லாப்_பீம்_பில்லர்_அடித்தளம்_கம்பி_கட்டுதல்_கணக்கீடுகள்   = view.findViewById(R.id.button126);
        கூரை_ஸ்லாப்_பீம்_பில்லர்_அடித்தளம்_கம்பி_கட்டுதல்_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),reinforcement_steel_all.class);
                startActivity(intent);
            }
        });

        Button படிக்கட்டு_கணக்கீடுகள்   = view.findViewById(R.id.button127);
        படிக்கட்டு_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),staircase_caculate.class);
                startActivity(intent);
            }
        });

        Button தண்ணீர்_தொட்டி_கணக்கீடுகள்   = view.findViewById(R.id.button128);
        தண்ணீர்_தொட்டி_கணக்கீடுகள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),watertank_quantity.class);
                startActivity(intent);
            }
        });

        Button வீட்டுக்கு_தேவை_படும்_எலக்ட்ரிக்_பொருட்கள்    = view.findViewById(R.id.button129);
        வீட்டுக்கு_தேவை_படும்_எலக்ட்ரிக்_பொருட்கள்.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),electric_work.class);
                startActivity(intent);
            }
        });

        return view;
    }
}