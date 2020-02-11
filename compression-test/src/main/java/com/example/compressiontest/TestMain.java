package com.example.compressiontest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

public class TestMain {
    public static void main(String[] args) throws Exception {
        RestTemplate restTemplate=new RestTemplate();
        HttpHeaders requestHeaders=new HttpHeaders();
        requestHeaders.set("Accept-Encoding","gzip");//设置编码
        HttpEntity<Object> requestEntity=new HttpEntity<>(requestHeaders);
        
        //调用hello服务
        ResponseEntity<byte[]> entity=restTemplate.exchange("http://localhost:8080/hello", HttpMethod.GET,requestEntity,byte[].class);

        //读取返回内容
        GZIPInputStream inflater=new GZIPInputStream(new ByteArrayInputStream(entity.getBody()));
        String s= StreamUtils.copyToString(inflater, Charset.forName("utf-8"));

        System.out.println(s);
    }
}
