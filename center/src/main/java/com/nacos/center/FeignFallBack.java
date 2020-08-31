package com.nacos.center;

import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements RemoteService {

    @Override
    public String getWorld() {
        return "熔断降级";
    }
}
