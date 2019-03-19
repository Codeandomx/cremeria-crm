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
public class ProductModel {
    private int _id_product;
    private int _id_category;
    private String _name;
    private String _img;
    private String _description;
    private float _price;

    public int getId_product() {
        return _id_product;
    }

    public void setId_product(int _id_product) {
        this._id_product = _id_product;
    }

    public int getId_category() {
        return _id_category;
    }

    public void setId_category(int _id_category) {
        this._id_category = _id_category;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getImg() {
        return _img;
    }

    public void setImg(String _img) {
        this._img = _img;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    public float getPrice() {
        return _price;
    }

    public void setPrice(float _price) {
        this._price = _price;
    }
}
