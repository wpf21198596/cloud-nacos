package com.nacos.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @GetMapping("/feign")
    public String  getWorld(){
        return "test success !!";
    }
}
