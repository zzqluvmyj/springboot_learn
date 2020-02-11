package com.example.proptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropController {
    private final ValueProp valueProp;
    private final MyProp myProp;

    @Autowired
    //构造方法依赖注入
    public PropController(ValueProp valueProp,MyProp myProp){
        this.valueProp=valueProp;
        this.myProp=myProp;
    }


    @GetMapping(value="/value")
    public ValueProp value(){
        return valueProp;
    }

    @GetMapping(value="/multivalue")
    public MyProp multivalue(){
        return myProp;
    }

}
