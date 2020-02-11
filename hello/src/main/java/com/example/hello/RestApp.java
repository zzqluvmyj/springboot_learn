package com.example.hello;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class RestApp {
    @GetMapping(value = "/person/{name}")
    //GetMapping相当于RequestMapping(method=RequestMethod.GET)
    public Person person(@PathVariable String name){
        Person p=new Person();
        p.setName(name);
        p.setAge(33);
        return p;
    }
}
