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
                + email + "'"
                + password + "','");
    }
    
    public void login(String email, String password) {
        try {
            ResultSet rs = db.getQuery("SELECT FROM user WHERE email='"+email+"',password='"+password+"'");
            if (rs.next()) {
                this.user = new User(
                        rs.getInt("id"),
                        rs.getString("firstname"),
                        rs.getString("lastname"),
                        rs.getString("nomorhp"),
                        rs.getString("email"),
                        rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
    
    public void refreshLaporan() {
        this.listlaporan = new ArrayList<>();
        try {
            ResultSet rs = db.getQuery("SELECT * FROM laporan");
            while (rs.next()) {
                Laporan laporan = new Laporan(
                        rs.getInt("id"), 
                        rs.getInt("user_id"), 
                        rs.getString("judul"), 
                        rs.getString("alamat"), 
                        rs.getString("deskripsi"));
                listlaporan.add(laporan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        this.listkontakpenting = new ArrayList<>();
        try {
            ResultSet rs = db.getQuery("SELECT * FROM kontakpenting");
            while (rs.next()) {
                KontakPenting kontakPenting = new KontakPenting(
                        rs.getInt("id"), 
                        rs.getString("namainstansi"), 
                        rs.getString("nomorinstansi"), 
                        rs.getString("alamat"),
                        rs.getString("jenisinstansi"));
                listkontakpenting.add(kontakPenting);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
