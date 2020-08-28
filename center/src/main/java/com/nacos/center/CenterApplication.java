package com.nacos.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EnableDiscoveryClient
@SpringBootApplication
public class CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class, args);
    }

    @RestController
    @CrossOrigin
    class TestController{

        @RequestMapping(value = "/test",method = RequestMethod.GET)
        public String test(){
            return "ok";
        }

        @RequestMapping(value = "/cc/test",method = RequestMethod.GET)
        public String cc(){
            return "cc----ok";
        }
    }

}
