/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rieza
 */
public class Laporan {
    private int id;
    private int user_id;
    private String judul;
    private String alamat;
    private String deskripsi;

    public Laporan(int id, int user_id, String judul, String alamat, String deskripsi) {
        this.setId(id);
        this.setUser_id(user_id);
        this.setJudul(judul);
        this.setAlamat(alamat);
        this.setDeskripsi(deskripsi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public String toString() {
        return this.judul;
    }
    
}
