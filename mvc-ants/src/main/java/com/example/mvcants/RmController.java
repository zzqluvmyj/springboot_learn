package com.example.mvcants;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prefix")
public class RmController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello with prefix";
    }
}
