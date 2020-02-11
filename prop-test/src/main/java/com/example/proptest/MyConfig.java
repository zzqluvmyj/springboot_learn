package com.example.proptest;

//使spring能够读取自定义配置

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value=MyProp.class)
public class MyConfig {
}
