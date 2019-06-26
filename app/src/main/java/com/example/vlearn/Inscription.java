package com.example.vlearn;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class Inscription extends AppCompatActivity {

    private TextInputLayout nom,prenom,matricule,password,confirm_pass;
    private Spinner etablissement,classe;
    Button btnInscription;
    String notif = new String();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);

        //recuperation des ids
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        matricule = findViewById(R.id.matricule);
        etablissement = findViewById(R.id.etablissement);
        classe = findViewById(R.id.classe);
        password = findViewById(R.id.password);
        confirm_pass = findViewById(R.id.confirm_pass);
        btnInscription = findViewById(R.id.btnInscription);

        btnInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(password.equals()){

                }
            }
        });

    }

}
