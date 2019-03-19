/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.CategoryModel;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author codeando
 */
public class CategoryJDBCTemplate implements CategoryDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(CategoryModel category) {
      String SQL = "insert into categories (name) values (?)";
      int x = jdbcTemplateObject.update( SQL, category.getName());
      System.out.println("Created Record category");
    }
    
    @Override
    public CategoryModel getCategory(Integer id) {
        String SQL = "select * from categories where id_category = ?";
        CategoryModel category = jdbcTemplateObject.queryForObject(SQL, 
            new Object[]{id}, new CategoryMapper());
      
        return category;
    }
    
    @Override
    public List<CategoryModel> listCategories() {
       String SQL = "select * from categories";
       List<CategoryModel> categorys = jdbcTemplateObject.query(SQL, new CategoryMapper());
       return categorys;
    }
   
    @Override
    public void delete(Integer id) {
        String SQL = "delete from categories where id_category = ?";
        int x = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record category");
   }
    
    @Override
    public void update(CategoryModel category){
        String SQL = "update categories set name=? where id_category=?";
        jdbcTemplateObject.update(SQL, category.getName(), category.getId_category());
        System.out.println("Updated Record category");
    }
}
