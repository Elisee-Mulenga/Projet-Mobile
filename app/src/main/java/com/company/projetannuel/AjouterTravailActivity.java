package com.company.projetannuel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class AjouterTravailActivity extends AppCompatActivity {

    private EditText editTextDescription;
    private EditText editTextPromotion;
    private EditText editTextCategorie;
    private EditText editTextDateTravail;

    private Button boutonAjouterphoto;
    private Button boutonAjouterTravail;
    private ProgressBar progressBar;
    private TextView textViewPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_travail);
        initialiserComposant();

        boutonAjouterTravail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Description = editTextDescription.getText().toString();
                String Promotion = editTextPromotion.getText().toString();
                String Categorie = editTextCategorie.getText().toString();
                String DateTravail = editTextDateTravail.getText().toString();
                String Photo = textViewPhoto.getText().toString();

                if (Description.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "La description est vide",
                            Toast.LENGTH_LONG).show();

                }else if (Promotion.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "La promotion est vide",
                            Toast.LENGTH_LONG).show();

                }else if (Categorie.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "La categorie est vide",
                            Toast.LENGTH_LONG).show();

                }else if (DateTravail.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "La datetravail est vide",
                            Toast.LENGTH_LONG).show();

                }else if (Photo.isEmpty()){
                    Toast.makeText(AjouterTravailActivity.this, "Le nom de la photo est vide",
                            Toast.LENGTH_LONG).show();

                }else  {
                    verifiecation(Description,Promotion,Categorie,DateTravail,Photo);
                }

            }
            private void verifiecation(String Description, String Promotion, String Categorie, String DateTravail,
                                       String Photo){
                progressBar.setVisibility(View.VISIBLE);
                boutonAjouterTravail.setEnabled(false);
                finish();
            }

        });

        boutonAjouterphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void initialiserComposant(){
        editTextDescription = findViewById(R.id.edit_Description);
        editTextPromotion = findViewById(R.id.edit_Promotion);
        editTextCategorie = findViewById(R.id.edit_Categorie);
        editTextDateTravail = findViewById(R.id.edit_Date_Travail);
        boutonAjouterphoto = findViewById(R.id.edit_Ajouter_photo);
        boutonAjouterTravail = findViewById(R.id.edit_Ajouter_Modifier);
        progressBar = findViewById(R.id.progressBar);
        textViewPhoto = findViewById(R.id.edit_Photo);

    }

}