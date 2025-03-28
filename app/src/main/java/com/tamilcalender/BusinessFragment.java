package com.tamilcalender;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class BusinessFragment extends Fragment {
    private Button share,calculate;
    private String[] listitems,listitems1;
    private Spinner sp1,sp2;
    EditText ed1,ed2,ed3;
    TextView tx1,tx2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_business, container, false);




        return view;

}




}