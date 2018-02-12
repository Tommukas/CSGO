package com.example.ugnius.csgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Kintamieji
        Button btnLogin = (Button) findViewById(R.id.loginLogin);
        Button btnRegister = (Button) findViewById(R.id.loginRegister);
        final EditText etUsername = (EditText) findViewById(R.id.loginUsername);
        final EditText etPassword = (EditText) findViewById(R.id.loginPassword);

        etUsername.setError(null);
        etPassword.setError(null);

        // Prisijungimas
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean cancel = false;
                if (!Validation.isValidCredentials(etUsername.getText().toString())) {
                    cancel = true;
                    etUsername.requestFocus();
                    etUsername.setError(getResources().getString(R.string.blogas_username));
                    //Toast.makeText(LoginActivity.this, getResources().getString(R.string.login_invalid_username),
                    //Toast.LENGTH_SHORT).show();
                } else if (!Validation.isValidCredentials(etPassword.getText().toString())) {
                    cancel = true;
                    etPassword.requestFocus();
                    etPassword.setError(getResources().getString(R.string.blogas_password));
                    // Toast.makeText(LoginActivity.this, getResources().getString(R.string.login_invalid_password),
                    // Toast.LENGTH_SHORT).show();
                }
                if (!cancel){
                    Toast.makeText(MainActivity.this,
                            "Prisijungimo vardas: " + etUsername.getText().toString() + "\n" +
                                    "Slaptažodis: " + etPassword.getText().toString(), Toast.LENGTH_SHORT).show();
                }


            }
        });

        //Registracija
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent goToSearchActivity = new Intent(MainActivity.this, RegisterActivity.class);
                    startActivity(goToSearchActivity);
            }
        });
    }
}
