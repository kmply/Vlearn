package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class lecontypelecon implements Serializable {
    @SerializedName("id_lecon")
    private int id_lecon;
    @SerializedName("id_typelecon")
    private int id_typelecon;
    @SerializedName("date")
    private String date;
    @SerializedName("id_user")
    private int id_user;
    @SerializedName("lien")
    private String lien;
    @SerializedName("statut")
    private String statut;

    public lecontypelecon(int id_lecon, int id_typelecon, String date, int id_user, String lien, String statut) {
        this.id_lecon = id_lecon;
        this.id_typelecon = id_typelecon;
        this.date = date;
        this.id_user = id_user;
        this.lien = lien;
        this.statut = statut;
    }

    public void setId_lecon(int id_lecon) {
        this.id_lecon = id_lecon;
    }

    public int getId_lecon() {
        return id_lecon;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_typelecon() {
        return id_typelecon;
    }

    public void setId_typelecon(int id_typelecon) {
        this.id_typelecon = id_typelecon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
