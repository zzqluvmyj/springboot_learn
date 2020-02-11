package com.example.thboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThyController {
    @RequestMapping("/users")
    public String listUsers(Model model){
        model.addAttribute("users",queryUsers());
        return "user";//配置thymeleaf后，此处是模板名称
    }

    @GetMapping("/external")
    public String externalText(){
        return "external";
    }

    private List<User> queryUsers(){
        List<User> users=new ArrayList<>();
        users.add(new User(1,"userA"));
        users.add(new User(2,"userB"));
        return users;
    }
}
