/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.Models;

import java.sql.Date;

/**
 *
 * @author codeando
 */
public class CartModel {
    private int _id_cart;
    private int _id_user;
    private Date _fecha;

    public int getId_cart() {
        return _id_cart;
    }

    public void setId_cart(int _id_cart) {
        this._id_cart = _id_cart;
    }

    public int getId_user() {
        return _id_user;
    }

    public void setId_user(int _id_user) {
        this._id_user = _id_user;
    }

    public Date getFecha() {
        return _fecha;
    }

    public void setFecha(Date _fecha) {
        this._fecha = _fecha;
    }
}
