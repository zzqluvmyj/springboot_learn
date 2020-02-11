package com.example.springants.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {
    @Bean
    @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ScopeBean scopeBean1(){
        return new ScopeBean();
    }

    @Bean
    @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ScopeBean scopeBean2(){
        return new ScopeBean();
    }
}
