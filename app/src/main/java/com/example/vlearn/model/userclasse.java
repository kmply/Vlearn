package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class userclasse implements Serializable {
    @SerializedName("id_user")
    private int id_user;
    @SerializedName("id_classe")
    private int id_classe;


    public userclasse(int id_user, int id_classe) {
        this.id_user = id_user;
        this.id_classe = id_classe;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public int getId_classe() {
        return id_classe;
    }
}
