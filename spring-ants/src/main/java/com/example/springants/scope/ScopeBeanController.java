package com.example.springants.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeBeanController {
    private final ApplicationContext ctx;

    public ScopeBeanController(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @GetMapping("/scope")
    public String scope(){
        System.out.println("刷新网页查看区别");
        System.out.println("singleton:"+ctx.getBean("scopeBean2"));
        System.out.println("prototype:"+ctx.getBean("scopeBean1"));
        return "";
    }
}
