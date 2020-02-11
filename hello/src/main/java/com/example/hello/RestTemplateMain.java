package com.example.hello;

import org.springframework.web.client.RestTemplate;

public class RestTemplateMain {
    public static void main(String[] args) {
        RestTemplate tpl=new RestTemplate();

        Person p=tpl.getForObject("http://localhost:8080/person/tom",Person.class);
        System.out.println(p.getName()+" "+p.getAge());
    }
}
