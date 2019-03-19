/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.TypesModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author codeando
 */

public class TypesMapper implements RowMapper<TypesModel> {
   @Override
   public TypesModel mapRow(ResultSet rs, int rowNum) throws SQLException {
      TypesModel type = new TypesModel();
      
      type.setId_type(rs.getInt("id_type"));
      type.setName(rs.getString("name"));
      
      return type;
   }
}