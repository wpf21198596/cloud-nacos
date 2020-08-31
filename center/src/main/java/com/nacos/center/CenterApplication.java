package com.nacos.center;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class, args);
    }

    @RestController
    @CrossOrigin
    class TestController{

        @Autowired
        private RemoteService remoteService;

        @RequestMapping(value = "/test",method = RequestMethod.GET)
        public String test(){
            Util util = new Util();
            util.fun();
            String res = remoteService.getWorld();
            System.out.println(res);
            return "ok";
        }

        @RequestMapping(value = "/cc/test",method = RequestMethod.GET)
        public String cc(){
            return "cc----ok";
        }
    }

}
