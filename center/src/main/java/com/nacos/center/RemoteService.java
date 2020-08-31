package com.nacos.center;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feign",fallback = FeignFallBack.class)
public interface RemoteService {

    @GetMapping("/feign")
    String getWorld();
}
