package com.example.mvcants;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @RequestMapping(value = "/rhello")
    public String rhello(){
        return "rest hello";
    }
}
