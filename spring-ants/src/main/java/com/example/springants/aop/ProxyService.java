package com.example.springants.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProxyService {
    @Before("execution(* com.example.springants.aop.*ServiceImpl.*(..))")
    //在这里代理相应包，类，方法，相应的代码执行前运行
    public void before(){
        System.out.println("业务方法调用前执行");
    }

    @After("execution(* com.example.springants.aop.*ServiceImpl.*(..))")
    public void after(){
        System.out.println("业务方法调用后执行");
    }
}
