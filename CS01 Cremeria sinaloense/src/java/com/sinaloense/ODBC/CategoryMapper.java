/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.CategoryModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author codeando
 */

public class CategoryMapper implements RowMapper<CategoryModel> {
   @Override
   public CategoryModel mapRow(ResultSet rs, int rowNum) throws SQLException {
      CategoryModel category = new CategoryModel();
      
      category.setId_category(rs.getInt("id_category"));
      category.setName(rs.getString("name"));
      
      return category;
   }
}
