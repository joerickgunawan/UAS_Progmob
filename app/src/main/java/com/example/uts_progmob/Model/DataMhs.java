package com.example.uts_progmob.Model;

import com.google.gson.annotations.SerializedName;

public class        DataMhs {
    @SerializedName("nim")
    private String nim;
    @SerializedName("nama")
    private String nama;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("email")
    private String email;
    /*public String nimNama;
    public String Alamat;
    public String email;*/

    public DataMhs(String nim, String alamat, String email, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }

    public String setNama(String nama) {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
