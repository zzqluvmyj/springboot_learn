package com.example.testjersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        //构造函数，注册需要使用的内容，过滤器，拦截器，api等
        register(Demo.class);
        //注册类

        //packages("com.example.testjersey")
        //注册包
    }
}
