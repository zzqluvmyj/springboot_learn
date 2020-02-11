package com.example.proptest;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//读取自定义的配置属性

@ConfigurationProperties(prefix = "jdbc")
@Data
public class MyProp {
    private String url;
    private String user;
    private String password;
    private Database db;
}
