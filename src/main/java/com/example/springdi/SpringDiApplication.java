package com.example.springdi;

import com.example.springdi.service.FooService;
import com.example.springdi.service.impl.FooServiceImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDiApplication.class, args);
    }
}
