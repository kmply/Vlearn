package com.example.vlearn.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class etablissement implements Serializable{
    @SerializedName("id_etabliss");
    private int id_etabliss;
    @SerializedName("nom");
    private String nom = new String();
    @SerializedName("bp");
    private String bp = new String();
    @SerializedName("lieu");
    private String lieu = new String();
    @SerializedName("tel");
    private String tel = new String();

    public etablissement(int id,String nom,String bp,String lieu,String tel){
        id_etabliss = id;
        this.nom = nom;
        this.bp = bp;
        this.lieu = lieu;
        this.tel = tel;
    }

    public int getId_etabliss() {
        return id_etabliss;
    }

    public void setId_etabliss(int id_etabliss) {
        this.id_etabliss = id_etabliss;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getBp(){
        return bp;
    }

    public void setBp(String bp){
        this.bp = bp;
    }

    public String getLieu(){
        return lieu;
    }

    public void setLieu(String lieu){
        this.lieu = lieu;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
