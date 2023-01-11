/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporaja;

import java.util.*;
import model.*;
import java.sql.*;
/**
 *
 * @author Rieza
 */
public class Application {
    Database db;
    ArrayList<Laporan> listlaporan;
    ArrayList<KontakPenting> listkontakpenting;
    User user;

    public Application() {
        db = new Database();
        this.refreshKontakPenting();
        this.refreshLaporan();
    }
    
    public void registrasi(String firstname, String lastname, String nomorhp, String email, String password) {
        db.insertQuery("INSERT INTO user VALUES(NULL,'"
                + firstname + "','"
                + lastname + "','"
                + nomorhp + "','"
                + email + "','"
                + password + "')");
    }
    
    public boolean login(String email, String password) {
        boolean attempt = false;
        this.user = db.getUserQuery(email, password);
        if (this.check()) {
            attempt = true;
        }
        return attempt;
    }
    
    public void logout() {
        this.user = null;
    }
    
    public void editUser(User user) {
        db.updateQuery("UPDATE user SET " +
                "firstname='"+ user.getFirstname() +
                "',lastname='"+ user.getLastname() +
                "',nomorhp='"+ user.getNomorhp() +
                "',email='"+ user.getEmail() +
                "',password='"+ user.getPassword() +
                "' WHERE id="+ user.getId());
        this.user = user;
    }
    
    public User getUser() {
        return this.user;
    }
    
    public boolean check() {
        return this.user != null;
    }
    
    public void refreshLaporan() {
        this.listlaporan = db.getLaporanQuery();
    }
    
    public void tambahLaporan(String judul, String alamat, String deskripsi) {
        db.insertQuery("INSERT INTO laporan VALUES(NULL,'"
                + this.getUser().getId() + "','"
                + judul + "','"
                + alamat + "','"
                + deskripsi + "'");
        this.refreshLaporan();
    }
    
    public void editLaporan(Laporan laporan) {
        db.updateQuery("UPDATE laporan SET " +
                "judul='"+laporan.getJudul() +
                "',alamat='"+laporan.getAlamat() +
                "',deskripsi='"+laporan.getDeskripsi() +
                "' WHERE id="+laporan.getId());
        this.refreshLaporan();
    }
    
    public void hapuslaporan(Laporan laporan) {
        db.updateQuery("DELETE FROM laporan WHERE id="+laporan.getId());
        this.refreshLaporan();
    }
    
    public ArrayList<Laporan> getListLaporan() {
        return this.listlaporan;
    }
    
    public void refreshKontakPenting() {
        this.listkontakpenting = db.getKontakPentingQuery();
    }
    
    public void tambahKontakPenting(String namainstansi, String nomorinstansi, String alamat, String jenisinstansi) {
        db.insertQuery("INSERT INTO kontakpenting VALUES(NULL,'"
                + namainstansi + "','"
                + nomorinstansi + "','"
                + alamat + "','"
                + jenisinstansi + "'");
        this.refreshKontakPenting();
    }
    
    public void editKontakPenting(KontakPenting kontakPenting) {
        db.updateQuery("UPDATE kontakpenting SET " +
                "namainstansi='"+kontakPenting.getNamainstansi() +
                "',nomorinstansi='"+kontakPenting.getNomorinstansi() +
                "',alamat='"+kontakPenting.getAlamat() +
                "',jenisinstansi='"+kontakPenting.getJenisinstansi() +
                "' WHERE id="+kontakPenting.getId());
        this.refreshKontakPenting();
    }
    
    public void hapusKontakPenting(KontakPenting kontakPenting) {
        db.updateQuery("DELETE FROM kontakpenting WHERE id="+kontakPenting.getId());
        this.refreshKontakPenting();
    }
    
    public ArrayList<KontakPenting> getListKontakPenting() {
        return listkontakpenting;
    }
    
}
