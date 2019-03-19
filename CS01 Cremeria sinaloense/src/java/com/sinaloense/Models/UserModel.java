/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.Models;

/**
 *
 * @author codeando
 */
public class UserModel {
    private int id_user;
    private String _username;
    private String _name;
    private String _lastname;
    private String _pass;
    private String email;
    private int id_role;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String _lastname) {
        this._lastname = _lastname;
    }

    public String getPass() {
        return _pass;
    }

    public void setPass(String _pass) {
        this._pass = _pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String _username) {
        this._username = _username;
    }
}
