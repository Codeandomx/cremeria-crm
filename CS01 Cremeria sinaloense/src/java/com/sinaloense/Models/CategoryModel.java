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
public class CategoryModel {
    private int _id_category;
    private String _name;

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
}
