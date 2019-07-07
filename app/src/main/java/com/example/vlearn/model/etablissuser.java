package com.example.vlearn.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class etablissuser implements Serializable {
    @SerializedName("id_etabliss")
    private int id_etabliss;
    @SerializedName("id_user")
    private int id_user;

    public etablissuser(int id_etabliss, int id_user) {
        this.id_etabliss = id_etabliss;
        this.id_user = id_user;
    }

    public int getId_etabliss() {
        return id_etabliss;
    }

    public void setId_etabliss(int id_etabliss) {
        this.id_etabliss = id_etabliss;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

}
