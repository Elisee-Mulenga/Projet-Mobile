package com.company.projetannuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListeTravailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_travail);

        configurerButtonDetail();
    }

    private void configurerButtonDetail(){
        Button listeBoutton = findViewById(R.id.btn_detail_doc);
        listeBoutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(ListeTravailActivity.this, DetailTravailActivity.class);
                startActivity(listIntent);
            }
        });
    }
}