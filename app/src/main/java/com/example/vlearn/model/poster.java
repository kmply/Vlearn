package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class poster implements Serializable {
    @SerializedName("id_matiere")
    private int id_matiere;
    @SerializedName("date")
    private String date;
    @SerializedName("sms")
    private String sms;
    @SerializedName("statut")
    private String statut;
    @SerializedName("id_user")
    private String id_user;
    @SerializedName("id_eleve")
    private int id_eleve;


    public poster(int id_matiere, String date, String sms, String statut, String id_user, int id_eleve) {
        this.id_matiere = id_matiere;
        this.date = date;
        this.sms = sms;
        this.statut = statut;
        this.id_user = id_user;
        this.id_eleve = id_eleve;
    }

    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }

    public int getId_matiere() {
        return id_matiere;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_user() {
        return id_user;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getStatut() {
        return statut;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setId_eleve(int id_eleve) {
        this.id_eleve = id_eleve;
    }

    public int getId_eleve() {
        return id_eleve;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }
}
