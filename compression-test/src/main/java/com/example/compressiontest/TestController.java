package com.example.compressiontest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(path="/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
