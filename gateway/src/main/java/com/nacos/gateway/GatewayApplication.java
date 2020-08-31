package com.nacos.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @RestController
//    class test{
//        @RequestMapping("/aaa")
//        public String aaa(){
//            return "aaa";
//        }
//    }


//    @Data
//    class GatewayFilterDefinition{
//        //Filter Name
//        private String name;
//        //对应的路由规则
//        private Map<String, String> args = new LinkedHashMap<>();
//    }
//
//    @Data
//    class GatewayPredicateDefinition{
//        //断言对应的Name
//        private String name;
//        //配置的断言规则
//        private Map<String, String> args = new LinkedHashMap<>();
//    }
//
//    @Data
//    class GatewayRouteDefinition{
//        //路由的Id
//        private String id;
//        //路由断言集合配置
//        private List<GatewayPredicateDefinition> predicates = new ArrayList<>();
//        //路由过滤器集合配置
//        private List<GatewayFilterDefinition> filters = new ArrayList<>();
//        //路由规则转发的目标uri
//        private String uri;
//        //路由执行的顺序
//        private int order = 0;
//    }

}
