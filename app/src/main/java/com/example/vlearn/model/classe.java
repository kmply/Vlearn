package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class classe implements Serializable {
    @SerializedName("id_classe")
    private int id_classe;
    @SerializedName("nom")
    private String nom;
    @SerializedName("id_etabliss")
    private String id_etabliss;

    public classe(int id_classe, String nom, String id_etabliss) {
        this.id_classe = id_classe;
        this.nom = nom;
        this.id_etabliss = id_etabliss;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId_etabliss(String id_etabliss) {
        this.id_etabliss = id_etabliss;
    }

    public String getId_etabliss() {
        return id_etabliss;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

}
