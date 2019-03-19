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
public class PhoneModel {
    private int _id_phone;
    private String _phone;
    private int id_type;
    private int id_user;

    public int getId_phone() {
        return _id_phone;
    }

    public void setId_phone(int _id_phone) {
        this._id_phone = _id_phone;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String _phone) {
        this._phone = _phone;
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
