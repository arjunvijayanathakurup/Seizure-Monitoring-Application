package com.example.seizuremonitoringsystemepilepsy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class DashboardMain extends AppCompatActivity {
    ImageButton dashboard, addSeizure, viewMedication, viewMetrics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_main);

        dashboard = (ImageButton)findViewById(R.id.dashboard);
        addSeizure = (ImageButton)findViewById(R.id.add);
        viewMedication = (ImageButton)findViewById(R.id.viewMedication);
        viewMetrics = (ImageButton)findViewById(R.id.viewMetrics);

        addSeizure.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddSeizure.class);
            startActivity(intent);
        });

        viewMedication.setOnClickListener(v ->{
            Intent intent = new Intent(this, ViewMedication.class);
            startActivity(intent);
        });

        viewMetrics.setOnClickListener(v -> {
            Intent intent = new Intent(this, ViewMetrics.class);
            startActivity(intent);
        });


        CalendarFragment calendarFragment = new CalendarFragment();
        SeizureList seizureList = new SeizureList();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.calendarView, calendarFragment).commit();
        fragmentManager.beginTransaction().replace(R.id.seizureView, seizureList).commit();

//        Profile Picture popup
        ImageButton profileImage = (ImageButton) findViewById(R.id.profileImage);
        profileImage.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(getApplicationContext(), profileImage);
            popupMenu.inflate(R.menu.menu);
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.logout:
//                TODO: Add the logout statement here
                            Toast.makeText(getApplicationContext(), "Logout Successful", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(DashboardMain.this, LoginSignup.class);
                            startActivity(intent);
                            return true;
                        case R.id.view_medicine_log:
//                TODO: Add the view_medicine_log activity intent here
                            return true;
                        case R.id.add_patient_image:
//                TODO: Add the patient image adding activity here
                            return true;
                        default:
                            return false;
                    }
                }
            });
            popupMenu.show();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}