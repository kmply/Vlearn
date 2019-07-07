package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class classematiere implements Serializable {
    @SerializedName("id_classe")
    private int id_classe;
    @SerializedName("id_matiere")
    private int id_matiere;
    @SerializedName("id_user")
    private int id_user;

    public classematiere(int id_classe, int id_matiere, int id_user) {
        this.id_classe = id_classe;
        this.id_matiere = id_matiere;
        this.id_user = id_user;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }

    public int getId_matiere() {
        return id_matiere;
    }

}
