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
public class KontakPenting {
    private int id;
    private String namainstansi;
    private String nomorinstansi;
    private String alamat;
    private String jenisinstansi;

    public KontakPenting(int id, String namainstansi, String nomorinstansi, String alamat, String jenisinstansi) {
        this.setId(id);
        this.setNamainstansi(namainstansi);
        this.setNomorinstansi(nomorinstansi);
        this.setAlamat(alamat);
        this.setJenisinstansi(jenisinstansi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamainstansi() {
        return namainstansi;
    }

    public void setNamainstansi(String namainstansi) {
        this.namainstansi = namainstansi;
    }

    public String getNomorinstansi() {
        return nomorinstansi;
    }

    public void setNomorinstansi(String nomorinstansi) {
        this.nomorinstansi = nomorinstansi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisinstansi() {
        return jenisinstansi;
    }

    public void setJenisinstansi(String jenisinstansi) {
        this.jenisinstansi = jenisinstansi;
    }
    
    @Override
    public String toString() {
        return this.namainstansi;
    }
}
