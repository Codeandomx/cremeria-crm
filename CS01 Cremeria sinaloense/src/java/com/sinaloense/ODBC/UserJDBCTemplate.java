/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.UserModel;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author codeando
 */
public class UserJDBCTemplate implements UserDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(UserModel user) {
      String SQL = "insert into users (username,name,lastname,pass,email,id-role) values (?,?,?,?,?,?)";
      int x = jdbcTemplateObject.update( SQL, user.getUsername(), user.getName(), user.getLastname(),
              user.getPass(), user.getEmail(), user.getId_role());
      System.out.println("Created Record user");
    }
    
    @Override
    public UserModel getUser(Integer id) {
        String SQL = "select * from users where id_user = ?";
        UserModel user = jdbcTemplateObject.queryForObject(SQL, 
            new Object[]{id}, new UserMapper());
      
        return user;
    }
    
    @Override
    public List<UserModel> listUsers() {
       String SQL = "select * from users";
       List<UserModel> users = jdbcTemplateObject.query(SQL, new UserMapper());
       return users;
    }
   
    @Override
    public void delete(Integer id) {
        String SQL = "delete from users where id = ?";
        int x = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record user");
   }
    
    @Override
    public void update(UserModel user){
        String SQL = "update users set username=?,name=?,lastname=?,pass=?,email=?,id_role=? where id_user=?";
        jdbcTemplateObject.update(SQL, user.getUsername(), user.getName(), user.getLastname(),
               user.getPass(), user.getEmail(), user.getId_role());
        System.out.println("Updated Record user");
    }
}
