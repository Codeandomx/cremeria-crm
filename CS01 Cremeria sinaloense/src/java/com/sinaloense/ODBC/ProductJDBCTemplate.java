/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.ProductModel;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author codeando
 */
public class ProductJDBCTemplate implements ProductDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(ProductModel product) {
      String SQL = "insert into products (id_category,name,img,description,price) values (?,?,?,?,?)";
      int x = jdbcTemplateObject.update( SQL, product.getId_category(), product.getName(), product.getImg(),
              product.getDescription(), product.getPrice());
      System.out.println("Created Record product");
    }
    
    @Override
    public ProductModel getProduct(Integer id) {
        String SQL = "select * from products where id_product = ?";
        ProductModel product = jdbcTemplateObject.queryForObject(SQL, 
            new Object[]{id}, new ProductMapper());
      
        return product;
    }
    
    @Override
    public List<ProductModel> listProducts() {
       String SQL = "select * from products";
       List<ProductModel> products = jdbcTemplateObject.query(SQL, new ProductMapper());
       return products;
    }
   
    @Override
    public void delete(Integer id) {
        String SQL = "delete from products where id_product = ?";
        int x = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record product");
   }
    
    @Override
    public void update(ProductModel product){
        String SQL = "update products set id_category=?,name=?,img=?,description=?,price=? where id_product=?";
        jdbcTemplateObject.update(SQL, product.getId_category(), product.getName(), product.getImg(),
                product.getDescription(), product.getPrice(), product.getId_product());
        System.out.println("Updated Record product");
    }
}
