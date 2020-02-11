package com.example.webtest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/servlet",name="test-servlet")
public class MyServlet {
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)throws ServletException,IOException{
        System.out.println("servlet service method");
    }
}
