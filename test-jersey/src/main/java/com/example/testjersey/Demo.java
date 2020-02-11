package com.example.testjersey;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/demo")
public class Demo {
    @Path("/hello")
    @GET
    public String get(){
        return "hello";
    }
}
