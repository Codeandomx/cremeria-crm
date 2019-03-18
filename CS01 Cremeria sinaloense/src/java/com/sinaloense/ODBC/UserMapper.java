/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.UserModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author codeando
 */

public class UserMapper implements RowMapper<UserModel> {
   @Override
   public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
      UserModel user = new UserModel();
      user.setId_user(rs.getInt("id_user"));
      user.setUsername(rs.getString("username"));
      user.setName(rs.getString("name"));
      user.setLastname(rs.getString("lastname"));
      user.setPass(rs.getString("pass"));
      user.setEmail(rs.getString("email"));
      user.setId_role(rs.getInt("id_role"));
      
      return user;
   }
}
