/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporaja;

import java.sql.*;
import java.util.*;
import model.*;
/**
 *
 * @author Rieza
 */
public class Database {
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbtest";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public void connect() {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void disconnect() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insertQuery(String query) {
        this.connect();
        try {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.disconnect();
    }
    
    public int updateQuery(String query) {
        int update = 0;
        this.connect();
        try {
            update = stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.disconnect();
        
        return update;
    }
    
    public boolean findQuery(String query) {
        boolean found = false;
        this.connect();
        try {
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                found = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.disconnect();
        
        return found;
    }
    
    public ArrayList<KontakPenting> getKontakPentingQuery() {
        this.connect();
        ArrayList<KontakPenting> listkontak = new ArrayList<>();
        try {
            rs = stmt.executeQuery("SELECT * FROM kontakpenting");
            while (rs.next()) {
                KontakPenting kontakPenting = new KontakPenting(
                        rs.getInt("id"), 
                        rs.getString("namainstansi"), 
                        rs.getString("nomorinstansi"), 
                        rs.getString("alamat"),
                        rs.getString("jenisinstansi"));
                listkontak.add(kontakPenting);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.disconnect();
        
        return listkontak;
    }
    
    public ArrayList<Laporan> getLaporanQuery() {
        this.connect();
        ArrayList<Laporan> listlaporan = new ArrayList<>();
        try {
            rs = stmt.executeQuery("SELECT * FROM laporan");
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
        this.disconnect();
        
        return listlaporan;
    }
    
    public User getUserQuery(String email, String password) {
        this.connect();
        User user = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM user WHERE email='"+email+"' AND password='"+password+"'");
            if (rs.next()) {
                user = new User(
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
        this.disconnect();
        
        return user;
    }
}
