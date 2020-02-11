package com.example.webfluxtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class HelloRouter {
    @Bean
    public RouterFunction<ServerResponse> routeHello(HelloHandle helloHandle){
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),helloHandle::hello);
    }
}
