package com.company.projetannuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //creation d'une session
        SharedPreferences session= getSharedPreferences("MySession", 0);

        // recuperation des elements de la session
        boolean sessionActive = session.getBoolean("session_active",false);
        int userId = session.getInt("session_id",-1);
        if (!sessionActive){
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }
        /**
        //changer les valeurs de la session
        session.edit().putInt("session_id", 123);
        session.edit().putBoolean("session_active", true);

        //valider la modification avec la methode commit()
        session.edit().commit();

        session.getBoolean("session_active", false);

        //Autre maniere d'utiliser la methode commit()
        session.edit()
                .putInt("session_id", 123)
                .putBoolean("session_active",true)
                // ajouter les données
                .apply();
         */
    }
}