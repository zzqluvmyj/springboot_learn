package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
//对容器内bean的测试,只启动spring的容器，不启动测试容器

public class MyServiceTest {
    @Autowired
    private MyService myService;

    @Test
    public void testHello(){
        String result=myService.helloService();

        System.out.println(result);
    }
}
