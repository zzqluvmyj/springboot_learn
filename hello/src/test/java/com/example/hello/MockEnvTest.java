package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
//对web容器的测试，不用启动真实的web容器（测试容器），

@AutoConfigureMockMvc
public class MockEnvTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testHello() throws Exception{
        ResultActions ra=mvc.perform(MockMvcRequestBuilders.get(new URI("/hello")));
        MvcResult result=ra.andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }
}
