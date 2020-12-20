package com.example.seizuremonitoringsystemepilepsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private EditText patientID, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        patientID = (EditText)findViewById(R.id.patientID);
        password = (EditText)findViewById(R.id.password);

        ImageButton backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(v -> onBackPressed());

        ImageButton signIn = (ImageButton)findViewById(R.id.signin);
        signIn.setOnClickListener(v ->{
            if(TextUtils.isEmpty(patientID.getText()) || TextUtils.isEmpty(password.getText())){
                patientID.setError("Enter Patient ID");
                password.setError("Enter Password");
            }else{
//                TODO: Next Activity Intent
                Intent intent = new Intent(Login.this, DashboardMain.class);
                startActivity(intent);
            }
        });

        TextView signinLink = (TextView)findViewById(R.id.signinlink);
        signinLink.setOnClickListener(v -> {
            finish();
        });

    }
}