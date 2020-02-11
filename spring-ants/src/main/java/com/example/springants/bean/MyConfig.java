package com.example.springants.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//使用configuration注解的类，本身也会作为一个bean注入容器
//使用configuration的类，相当于xml配置的文件，里面的bean相当于xml配置文件中的<bean>元素

@Configuration
public class MyConfig {

    @Bean//默认的bean名字是方法名
    public MyBean getMyBean(){
        return new MyBean();
    }

    @Bean("mybean2")//自定义bean名称
    public MyBean myBean2(){
        return new MyBean();
    }
}
