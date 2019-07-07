package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class eleve implements Serializable {
    @SerializedName("nom")
    private String nom;
    @SerializedName("prenom")
    private String prenom;
    @SerializedName("id_etabliss")
    private int id_etabliss;
    @SerializedName("id_classe")
    private int id_classe;
    @SerializedName("id_eleve")
    private int id_eleve;
    @SerializedName("matricule")
    private String matricule;

    public eleve(String nom, String prenom, int id_etabliss, int id_classe, int id_eleve, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.id_etabliss = id_etabliss;
        this.id_classe = id_classe;
        this.id_eleve = id_eleve;
        this.matricule = matricule;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public void setId_etabliss(int id_etabliss) {
        this.id_etabliss = id_etabliss;
    }

    public int getId_etabliss() {
        return id_etabliss;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getId_eleve() {
        return id_eleve;
    }

    public void setId_eleve(int id_eleve) {
        this.id_eleve = id_eleve;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
