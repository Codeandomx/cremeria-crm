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
public class ProductCartModel {
    private int _id_productcart;
    private int _id_cart;
    private int _id_product;
    private int _quantity;

    public int getId_cart() {
        return _id_cart;
    }

    public void setId_cart(int _id_cart) {
        this._id_cart = _id_cart;
    }

    public int getId_product() {
        return _id_product;
    }

    public void setId_product(int _id_product) {
        this._id_product = _id_product;
    }

    public int getQuantity() {
        return _quantity;
    }

    public void setQuantity(int _quantity) {
        this._quantity = _quantity;
    }

    public int getId_productcart() {
        return _id_productcart;
    }

    public void setId_productcart(int _id_productcart) {
        this._id_productcart = _id_productcart;
    }
}
