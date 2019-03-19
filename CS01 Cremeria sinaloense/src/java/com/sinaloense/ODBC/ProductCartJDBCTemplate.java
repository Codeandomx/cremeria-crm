/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.ProductCartModel;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author codeando
 */
public class ProductCartJDBCTemplate implements ProductCartDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(ProductCartModel productcart) {
      String SQL = "insert into productcart (id_product,quntity) values (?,?)";
      int x = jdbcTemplateObject.update( SQL, productcart.getId_product(), productcart.getQuantity());
      System.out.println("Created Record productcart");
    }
    
    @Override
    public ProductCartModel getProductCart(Integer id) {
        String SQL = "select * from productcart where id_productcart = ?";
        ProductCartModel productcart = jdbcTemplateObject.queryForObject(SQL, 
            new Object[]{id}, new ProductCartMapper());
      
        return productcart;
    }
    
    @Override
    public List<ProductCartModel> listProductCarts() {
       String SQL = "select * from productcart";
       List<ProductCartModel> productcarts = jdbcTemplateObject.query(SQL, new ProductCartMapper());
       return productcarts;
    }
   
    @Override
    public void delete(Integer id) {
        String SQL = "delete from productcart where id_productcart = ?";
        int x = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record productcart");
   }
    
    @Override
    public void update(ProductCartModel productcart){
        String SQL = "update productcart set id_product=?,quantity=? where id_productcart=?";
        jdbcTemplateObject.update(SQL, productcart.getId_product(), productcart.getQuantity());
        System.out.println("Updated Record productcart");
    }
}
