/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.CartModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author codeando
 */

public class CartMapper implements RowMapper<CartModel> {
   @Override
   public CartModel mapRow(ResultSet rs, int rowNum) throws SQLException {
      CartModel cart = new CartModel();
      
      cart.setId_cart(rs.getInt("id_cart"));
      cart.setId_user(rs.getInt("id_user"));
      cart.setFecha(rs.getDate("fecha"));
      
      return cart;
   }
}