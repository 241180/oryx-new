package com.oryx.controller.web;

import com.oryx.model.bu.sale.Product;
import com.oryx.model.system.ose.Codification;
import com.oryx.model.system.ose.User;
import com.oryx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    /*@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
    public ModelAndView doGet() {
        return new ModelAndView("login");
    }*/

    @RequestMapping(value = "/connect", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> connect(@RequestParam(name = "login") String login, @RequestParam(name = "password") String password) {
        User user = userService.findByEmail(login);
        if(user != null){
            if(user.getPassword()!=null && user.getPassword().equals(password)){
                return new ResponseEntity<User>(user, HttpStatus.OK);
            }
        }

        return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
    }
}
