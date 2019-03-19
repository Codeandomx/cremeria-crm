/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.RoleModel;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author codeando
 */
public class RoleJDBCTemplate implements RoleDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(RoleModel role) {
      String SQL = "insert into roles (name) values (?)";
      int x = jdbcTemplateObject.update( SQL, role.getName());
      System.out.println("Created Record role");
    }
    
    @Override
    public RoleModel getRole(Integer id) {
        String SQL = "select * from roles where id_role = ?";
        RoleModel role = jdbcTemplateObject.queryForObject(SQL, 
            new Object[]{id}, new RoleMapper());
      
        return role;
    }
    
    @Override
    public List<RoleModel> listRoles() {
       String SQL = "select * from roles";
       List<RoleModel> roles = jdbcTemplateObject.query(SQL, new RoleMapper());
       return roles;
    }
   
    @Override
    public void delete(Integer id) {
        String SQL = "delete from roles where id_role = ?";
        int x = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record role");
   }
    
    @Override
    public void update(RoleModel role){
        String SQL = "update roles set name=? where id_role=?";
        jdbcTemplateObject.update(SQL, role.getName(), role.getId_role());
        System.out.println("Updated Record role");
    }
}
