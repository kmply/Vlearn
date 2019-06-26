package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class lecon implements Serializable {
    @SerializedName("id_lecon")
    private int id_lecon;
    @SerializedName("intitule")
    private String intitule;
    @SerializedName("id_chapitre")
    private int id_chapitre;


    public lecon(int id_lecon, String intitule, int id_chapitre) {
        this.id_lecon = id_lecon;
        this.intitule = intitule;
        this.id_chapitre = id_chapitre;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setId_chapitre(int id_chapitre) {
        this.id_chapitre = id_chapitre;
    }

    public int getId_chapitre() {
        return id_chapitre;
    }

    public int getId_lecon() {
        return id_lecon;
    }

    public void setId_lecon(int id_lecon) {
        this.id_lecon = id_lecon;
    }

}
