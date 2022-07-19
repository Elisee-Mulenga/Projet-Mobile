package com.company.projetannuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button boutonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edMatricule = findViewById(R.id.editMatricule);
        EditText edPassword = findViewById(R.id.editPassword);

        boutonLogin = findViewById(R.id.btnLogin);
        progressBar = findViewById(R.id.progressBar);

        boutonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String matricule = edMatricule.getText().toString();
                String password = edPassword.getText().toString();

                if (matricule.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Le matricule est vide",
                            Toast.LENGTH_LONG).show();
                    return;
                }else if (password.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Entre un mot de passe",
                            Toast.LENGTH_LONG).show();
                    return;
                }else  {
                    login(matricule,password);
                }
            }
        });
    }

    private void login(String matricule, String password){
        progressBar.setVisibility(View.VISIBLE);
        boutonLogin.setEnabled(false);

        SharedPreferences session = getSharedPreferences("MySession", 0);
        session.edit().putBoolean("session_active", true).apply();
    }
}