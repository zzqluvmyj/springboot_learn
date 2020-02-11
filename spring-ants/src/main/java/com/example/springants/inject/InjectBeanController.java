package com.example.springants.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class InjectBeanController {

    @Resource(name="myBean1")
    //根据名称注入,如果找不到根据类型找，如果有多个相同类型会报错
    InjectBean myBean1;

    @Autowired
    //根据类型注入，如果存在多个相同类型的bean，就按属性名来找，找不到报错
    InjectBean myBean2;
    //Autowired可以用在构造函数上，推荐用在构造函数上

    @GetMapping("/inject")
    public String inject(){
        System.out.println(myBean1.getId());
        System.out.println(myBean2.getId());
        return "";
    }

}
