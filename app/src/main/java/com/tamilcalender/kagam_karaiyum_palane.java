package com.tamilcalender;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class kagam_karaiyum_palane extends AppCompatActivity {
    private Button share,பஞ்ச_பட்சி1,காகம்_கரையும்,சகுனப்_பலன்கள்;
    TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kagam_karaiyum_palane);


        பஞ்ச_பட்சி1=findViewById(R.id.button134);
        காகம்_கரையும்=findViewById(R.id.button135);
        சகுனப்_பலன்கள்=findViewById(R.id.button136);

        tx1 = findViewById(R.id.textView841);

        share();
        பஞ்ச_பட்சி12();

    }

    private void பஞ்ச_பட்சி12() {
        பஞ்ச_பட்சி1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("tamil");

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