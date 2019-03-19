/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.RoleModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author codeando
 */

public class RoleMapper implements RowMapper<RoleModel> {
   @Override
   public RoleModel mapRow(ResultSet rs, int rowNum) throws SQLException {
      RoleModel role = new RoleModel();
      
      role.setId_role(rs.getInt("id_role"));
      role.setName(rs.getString("name"));
      
      return role;
   }
}