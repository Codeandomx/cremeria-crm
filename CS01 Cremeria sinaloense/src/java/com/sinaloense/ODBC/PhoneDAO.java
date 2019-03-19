/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.ODBC;

import com.sinaloense.Models.PhoneModel;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author codeando
 */
public interface PhoneDAO {
   // Metodo para inicializar la conexion
   public void setDataSource(DataSource ds);
   
   // Insertamos datos
   public void create(PhoneModel user);
   
   // Obtenemos un usuario
   public PhoneModel getPhone(Integer id);
   
   // Obtenemos todos los usuarios
   public List<PhoneModel> listPhones();
   
   // Eliminamos un usuario
   public void delete(Integer id);
   
   // actualizamos datos
   public void update(PhoneModel user);
}