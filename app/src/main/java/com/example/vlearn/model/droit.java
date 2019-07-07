package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class droit implements Serializable {
    @SerializedName("id_droit")
    private int id_droit;
    @SerializedName("intitule")
    private String intitule;

    public droit(int id_droit, String intitule) {
        this.id_droit = id_droit;
        this.intitule = intitule;
    }

    public int getId_droit() {
        return id_droit;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setId_droit(int id_droit) {
        this.id_droit = id_droit;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
