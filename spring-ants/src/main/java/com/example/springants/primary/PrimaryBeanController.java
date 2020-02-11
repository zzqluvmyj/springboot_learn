package com.example.springants.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryBeanController {
    private final PrimaryBean primaryBean;

    @Autowired
    public PrimaryBeanController(PrimaryBean primaryBean) {
        this.primaryBean = primaryBean;
    }

    @GetMapping("/primary")
    public String primary(){
        System.out.println(primaryBean);
        return "";
    }
}
