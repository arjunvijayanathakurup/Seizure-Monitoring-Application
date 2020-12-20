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

public class LoginSignup extends AppCompatActivity {
    private EditText patientID, password, dateofbirth;
    private TextView signinlink;
    private ImageButton signup;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);

//      Setting the id's to different fields
        patientID = (EditText)findViewById(R.id.patientID);
        password = (EditText)findViewById(R.id.password);
        dateofbirth = (EditText)findViewById(R.id.dateofbirth);
        signinlink = (TextView) findViewById(R.id.signinlink);
        signup = (ImageButton)findViewById(R.id.signup);

//        TODO: Setup user authentication adding using patientid, password and dateofbirth

//      Signup redirection button
        signup.setOnClickListener(v -> {
            if(TextUtils.isEmpty(patientID.getText().toString()) || TextUtils.isEmpty(password.getText().toString()) || TextUtils.isEmpty(dateofbirth.getText().toString())){
                patientID.setError("Please enter Patient ID");
                password.setError("Please enter Password");
                dateofbirth.setError("Please enter Date of Birth");
            }else {
                Intent intent = new Intent(LoginSignup.this, Login.class);
                startActivity(intent);
            }
        });

        signinlink.setOnClickListener(v -> {
            intent = new Intent(LoginSignup.this, Login.class);
            startActivity(intent);
        });
    }
}