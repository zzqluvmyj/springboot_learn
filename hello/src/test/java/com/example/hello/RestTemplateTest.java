package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class RestTemplateTest {
    @Autowired
    private RestTemplateBuilder builder;

    public RestTemplate restTemplate(){
        return builder.rootUri("http://localhost:8080").build();
    }

    @Test
    public void testRestTemplate(){
        Person p=restTemplate().getForObject("/person/tom",Person.class);
        System.out.println(p.getName()+" "+p.getAge());
    }
}
