/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinaloense.Views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author romin
 */
@Controller
public class LoginController {
    @RequestMapping(value="login.htm", method = RequestMethod.GET)
    public ModelAndView login(){
        /**
         * Vista, atributo del modelo en la vista, new nombre_modelo()
        **/
        return new ModelAndView("login");
    }
}
