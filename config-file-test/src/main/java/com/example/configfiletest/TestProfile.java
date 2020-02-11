package com.example.configfiletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProfile {

    @Autowired
    private Environment env;
    //配置文件内容会进入Environment中

    @GetMapping("/tp")
    public String getProp(){
        System.out.println(env.getProperty("jdbc.driver"));
        return "";
    }
}
