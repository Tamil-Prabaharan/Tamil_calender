package com.tamilcalender;


import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.customtabs.ICustomTabsService;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class a1page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_a1page);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_Navigation);


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                if (item.getItemId() == R.id.civil_home) {
                    selectedFragment = new homeFragment();
                }/**e else if (item.getItemId() == R.id.business ) {
                    selectedFragment = new BusinessFragment();
                }**/ else if (item.getItemId() == R.id.center ) {
                    selectedFragment = new DateFragment();
                } else if (item.getItemId() == R.id.calculator) {
                    selectedFragment = new CalculationFragment();
                }/**else if (item.getItemId() == R.id.person) {
                    selectedFragment = new PersonloginFragment();
                }**/


                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, selectedFragment)
                            .commit();
                    return true;
                }

                return false;
            }
        });

    }

}