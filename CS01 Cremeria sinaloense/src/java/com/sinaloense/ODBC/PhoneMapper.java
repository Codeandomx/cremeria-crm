/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.PhoneModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author codeando
 */

public class PhoneMapper implements RowMapper<PhoneModel> {
   @Override
   public PhoneModel mapRow(ResultSet rs, int rowNum) throws SQLException {
      PhoneModel phone = new PhoneModel();
      
      phone.setId_phone(rs.getInt("id_phone"));
      phone.setPhone(rs.getString("phone"));
      phone.setId_type(rs.getInt("id_type"));
      phone.setId_user(rs.getInt("id_user"));
      
      return phone;
   }
}