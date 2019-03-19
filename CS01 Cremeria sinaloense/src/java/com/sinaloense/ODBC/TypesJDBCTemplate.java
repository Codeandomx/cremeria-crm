/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.TypesModel;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author codeando
 */
public class TypesJDBCTemplate implements TypesDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(TypesModel types) {
      String SQL = "insert into types (name) values (?)";
      int x = jdbcTemplateObject.update( SQL, types.getName());
      System.out.println("Created Record types");
    }
    
    @Override
    public TypesModel getTypes(Integer id) {
        String SQL = "select * from types where id_type = ?";
        TypesModel types = jdbcTemplateObject.queryForObject(SQL, 
            new Object[]{id}, new TypesMapper());
      
        return types;
    }
    
    @Override
    public List<TypesModel> listTypes() {
       String SQL = "select * from types";
       List<TypesModel> types = jdbcTemplateObject.query(SQL, new TypesMapper());
       return types;
    }
   
    @Override
    public void delete(Integer id) {
        String SQL = "delete from types where id_types = ?";
        int x = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record types");
   }
    
    @Override
    public void update(TypesModel types){
        String SQL = "update types set name=? where id_types=?";
        jdbcTemplateObject.update(SQL, types.getName(), types.getId_type());
        System.out.println("Updated Record types");
    }
}
