/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.PhoneModel;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author codeando
 */
public class PhoneJDBCTemplate implements PhoneDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(PhoneModel phone) {
      String SQL = "insert into phones (phone,id_type,id_user) values (?,?,?,?)";
      int x = jdbcTemplateObject.update( SQL, phone.getPhone(), phone.getId_type(), phone.getId_user());
      System.out.println("Created Record phone");
    }
    
    @Override
    public PhoneModel getPhone(Integer id) {
        String SQL = "select * from phones where id_phone = ?";
        PhoneModel phone = jdbcTemplateObject.queryForObject(SQL, 
            new Object[]{id}, new PhoneMapper());
      
        return phone;
    }
    
    @Override
    public List<PhoneModel> listPhones() {
       String SQL = "select * from phones";
       List<PhoneModel> phones = jdbcTemplateObject.query(SQL, new PhoneMapper());
       return phones;
    }
   
    @Override
    public void delete(Integer id) {
        String SQL = "delete from phones where id_phone = ?";
        int x = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record phone");
   }
    
    @Override
    public void update(PhoneModel phone){
        String SQL = "update phones set phone=?,name=?,id_type=?,id_user=? where id_phone=?";
        jdbcTemplateObject.update(SQL, phone.getPhone(), phone.getId_type(), phone.getId_user(),
                phone.getId_phone());
        System.out.println("Updated Record phone");
    }
}
