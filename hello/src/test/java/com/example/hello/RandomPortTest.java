package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//对web容器的测试，启动真实的web容器（测试容器），也可使用固定的端口

public class RandomPortTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHello(){
        String result=restTemplate.getForObject("/hello",String.class);
        assertEquals("hello world",result);
    }
}
