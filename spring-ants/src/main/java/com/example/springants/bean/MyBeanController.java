package com.example.springants.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBeanController {
    private final ApplicationContext ctx;

    @Autowired
    public MyBeanController(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @GetMapping("/print")
    public String printBeans(){
        String[] names=ctx.getBeanNamesForType(MyBean.class);
        for(String name:names){
            System.out.println(name);
        }
        return "";
    }
}
