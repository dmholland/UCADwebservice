package com.product.app.controller;

import com.product.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String user(Model model){
        User p=new User("id","name","password","email");
        model.addAttribute("User",p);
        return "Userview";
    }

}
