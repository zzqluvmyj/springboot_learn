package com.example.proptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication

//@ConfigurationPropertiesScan
//或者是MyConfig类里面的注解

public class PropTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropTestApplication.class, args);
    }

}
