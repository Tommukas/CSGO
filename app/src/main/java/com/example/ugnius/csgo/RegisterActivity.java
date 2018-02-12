package com.example.ugnius.csgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Kintamieji
        Button btnLogin = (Button) findViewById(R.id.loginLogin);
        Button btnRegister = (Button) findViewById(R.id.loginRegister);
        final EditText etUsername = (EditText) findViewById(R.id.loginUsername);
        final EditText etPassword = (EditText) findViewById(R.id.loginPassword);
    }
}
