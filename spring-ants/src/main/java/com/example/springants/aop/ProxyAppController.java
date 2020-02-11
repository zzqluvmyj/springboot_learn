package com.example.springants.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyAppController {
    private SaleServiceImpl saleService;

    @Autowired
    public ProxyAppController(SaleServiceImpl saleService) {
        this.saleService = saleService;
    }

    @GetMapping("/sale")
    public String saleService(){
        saleService.saleService();
        System.out.println("SaleService impl 的class"+saleService.getClass());
        return "";
    }
}
