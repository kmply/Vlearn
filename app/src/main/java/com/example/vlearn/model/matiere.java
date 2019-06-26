package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class matiere implements Serializable {
    @SerializedName("id_matiere")
    private int id_matiere;
    @SerializedName("nom")
    private String nom;
    @SerializedName("id_user")
    private int id_user;


    public matiere(int id_matiere, String nom, int id_user) {
        this.id_matiere = id_matiere;
        this.nom = nom;
        this.id_user = id_user;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId_matiere() {
        return id_matiere;
    }

    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }

}
