package com.example.hello;

import feign.Feign;
import feign.gson.GsonDecoder;

public class FeignMain {
    public static void main(String[] args) {
        PersonClient pc= Feign.builder()
                .decoder(new GsonDecoder())
                .target(PersonClient.class,"http://localhost:8080/");
        //前面都在包装这个rest client
        //下面开始输入rest请求的内容，获得对象
        Person p=pc.getPerson("tom");
        System.out.println(p.getName()+" "+p.getAge());
    }
}
