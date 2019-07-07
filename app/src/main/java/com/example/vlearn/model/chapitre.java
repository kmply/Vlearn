package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class chapitre implements Serializable {
    @SerializedName("id_chapitre")
    private int id_chapitre;
    @SerializedName("nom")
    private String nom;
    @SerializedName("id_matiere")
    private int id_matiere;
    @SerializedName("id_user")
    private int id_user;

    public chapitre(int idC,String nom,int idM,int idU){
        id_chapitre = idC;
        this.nom = nom;
        id_matiere = idM;
        id_user = idU;
    }

    public int getId_chapitre() {
        return id_chapitre;
    }

    public int getId_matiere() {
        return id_matiere;
    }

    public int getId_user() {
        return id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setId_chapitre(int id_chapitre) {
        this.id_chapitre = id_chapitre;
    }

    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}