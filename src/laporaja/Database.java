/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporaja;

import java.sql.*;
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
    
    public ResultSet getQuery(String query) {
        this.connect();
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.disconnect();
        
        return rs;
    }
}
