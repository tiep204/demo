package com.example.springdi.config;

import com.example.springdi.service.FooService;
import com.example.springdi.service.impl.FooServiceImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public FooService fooService() {
        return new FooServiceImpl();
    }
}
