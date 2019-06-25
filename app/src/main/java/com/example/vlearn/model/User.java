package com.example.vlearn.model;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {


    @SerializedName("idUser")
    private int idUser;
    @SerializedName("nom")
    private String  nom;
    @SerializedName("prenom")
    private String prenom;
    @SerializedName("cni")
    private String cni;
    @SerializedName("telephone")
    private String telephone;
    @SerializedName("username")
    private String username;
    @SerializedName("motPasse")
    private String password;
    @SerializedName("idDroit")
    private int idDroit;
    @SerializedName("idMatiere")
    private int idMatiere;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int idUser, String nom, String prenom, String cni, String telephone, String username, String password, int idDroit, int idMatiere) {
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.cni = cni;
        this.telephone = telephone;
        this.username = username;
        this.password = password;
        this.idDroit = idDroit;
        this.idMatiere = idMatiere;
    }




    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdDroit() {
        return idDroit;
    }

    public void setIdDroit(int idDroit) {
        this.idDroit = idDroit;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }




}
