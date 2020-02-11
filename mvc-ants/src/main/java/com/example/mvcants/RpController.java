package com.example.mvcants;

import javafx.util.Pair;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RpController {
    @RequestMapping("/login")
    //localhost:8080/login?userName=zzq
    //也可以用post，表单的方式请求
    public String login(@RequestParam String userName){
        System.out.println(userName);
        return "success";
    }

    @RequestMapping("/multi")
    public String multi(@RequestParam Map<String,String> map){
        map.forEach((i,j)-> System.out.println(i));
        return "";
    }

}
