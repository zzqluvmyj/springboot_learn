package com.example.mvcants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(value = "/a/{greet}/{name}")
    @ResponseBody
    //PathVariable的属性值和上面的url中的{}中的变量名一样，可以省略
    public String helloName(@PathVariable("greet") String greet, @PathVariable("name") String name) {
        return greet + " " + name;
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/hello/{name}")
    @ResponseBody
    //PathVariable的属性值和上面的url中的{}中的变量名一样，可以省略
    public String helloName(@PathVariable("name") String name) {
        return "hello " + name;
    }

}
