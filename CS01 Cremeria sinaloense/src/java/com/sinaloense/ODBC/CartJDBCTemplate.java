/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.CartModel;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author codeando
 */
public class CartJDBCTemplate implements CartDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(CartModel cart) {
      String SQL = "insert into carts (id_user, fecha) values (?,?)";
      int x = jdbcTemplateObject.update( SQL, cart.getId_user(), cart.getFecha());
      System.out.println("Created Record cart");
    }
    
    @Override
    public CartModel getCart(Integer id) {
        String SQL = "select * from carts where id_cart = ?";
        CartModel cart = jdbcTemplateObject.queryForObject(SQL, 
            new Object[]{id}, new CartMapper());
      
        return cart;
    }
    
    @Override
    public List<CartModel> listCarts() {
       String SQL = "select * from carts";
       List<CartModel> carts = jdbcTemplateObject.query(SQL, new CartMapper());
       return carts;
    }
   
    @Override
    public void delete(Integer id) {
        String SQL = "delete from carts where id_cart = ?";
        int x = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record cart");
   }
    
    @Override
    public void update(CartModel cart){
        String SQL = "update carts set id_user=?,fecha=? where id_cart=?";
        jdbcTemplateObject.update(SQL, cart.getId_user(), cart.getFecha());
        System.out.println("Updated Record cart");
    }
}
