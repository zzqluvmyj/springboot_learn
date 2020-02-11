package com.example.springants.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfig {

    @Bean
    @Primary
    public PrimaryBean bean1(){
        return new PrimaryBean();
    }

    @Bean
    public PrimaryBean bean2(){
        return new PrimaryBean();
    }
}
