/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.ProductModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author codeando
 */

public class ProductMapper implements RowMapper<ProductModel> {
   @Override
   public ProductModel mapRow(ResultSet rs, int rowNum) throws SQLException {
      ProductModel product = new ProductModel();
      
      product.setId_product(rs.getInt("id_product"));
      product.setId_category(rs.getInt("id_category"));
      product.setName(rs.getString("name"));
      product.setImg(rs.getString("img"));
      product.setDescription(rs.getString("description"));
      product.setPrice(rs.getFloat("price"));
      
      return product;
   }
}