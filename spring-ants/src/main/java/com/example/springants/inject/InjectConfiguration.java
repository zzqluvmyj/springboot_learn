package com.example.springants.inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectConfiguration {
    @Bean
    public InjectBean myBean1(){
        return new InjectBean("1");
    }

    @Bean
    public InjectBean myBean2(){
        return new InjectBean("2");
    }
}
