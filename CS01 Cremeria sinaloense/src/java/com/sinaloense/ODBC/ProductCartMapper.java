/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.ProductCartModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author codeando
 */

public class ProductCartMapper implements RowMapper<ProductCartModel> {
   @Override
   public ProductCartModel mapRow(ResultSet rs, int rowNum) throws SQLException {
      ProductCartModel productCart = new ProductCartModel();
      
      productCart.setId_productcart(rs.getInt("id_productcart"));
      productCart.setId_cart(rs.getInt("id_cart"));
      productCart.setId_product(rs.getInt("id_product"));
      productCart.setQuantity(rs.getInt("quantity"));
      
      return productCart;
   }
}