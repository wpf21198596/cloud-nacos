package com.nacos.center;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class Config extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interCepter()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Bean
    public InterCepter interCepter(){
        return new InterCepter();
    }
}
