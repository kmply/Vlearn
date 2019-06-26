package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class typelecon implements Serializable {
    @SerializedName("id_typeLecon")
    private int id_typeLecon;
    @SerializedName("intitule")
    private String intitule;


    public typelecon(int id_typeLecon, String intitule) {
        this.id_typeLecon = id_typeLecon;
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getId_typeLecon() {
        return id_typeLecon;
    }

    public void setId_typeLecon(int id_typeLecon) {
        this.id_typeLecon = id_typeLecon;
    }

}
