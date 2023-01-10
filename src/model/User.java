/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.*;
import java.security.spec.*;
/**
 *
 * @author Rieza
 */
public class User {
    private int id;
    private String firstname;
    private String lastname;
    private String nomorhp;
    private String email;
    private String password;

    public User(int id, String firstname, String lastname, String nomorhp, String email, String password) {
        this.setId(id);
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setNomorhp(nomorhp);
        this.setEmail(email);
        this.setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return this.firstname + " " + this.lastname;
    }
}
