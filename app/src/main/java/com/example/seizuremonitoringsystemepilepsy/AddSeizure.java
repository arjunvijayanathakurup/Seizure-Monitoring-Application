package com.example.seizuremonitoringsystemepilepsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AddSeizure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_seizure);

        String[] arraySpinner = new String[]{"Low", "Mild", "Severe"};
        Spinner s = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(AddSeizure.this, DashboardMain.class);
            startActivity(intent);
        });
    }
}