package com.example.basicobject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class TestHandler {
    @RequestMapping("/testWebObj")
    public String testWebObj(HttpServletRequest request, HttpSession session){
        request.setAttribute("name1","tom");
        session.setAttribute("name2","jerry");
        request.getServletContext().setAttribute("name3","Test");
        return "testWebObj";
    }

    @RequestMapping("/testVar")
    //http://localhost:8080/testVar?userName=zzq&passwd=123455
    public String testVar(@RequestParam String userName,@RequestParam String passwd,HttpServletRequest request){
        request.setAttribute("reqData","reqData");
        request.getSession().setAttribute("sesData","sesData");
        request.getServletContext().setAttribute("appData","AppData");
        return "testVar";
    }
}
