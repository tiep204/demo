package com.example.springdi.controller;

import com.example.springdi.config.AppConfig;
import com.example.springdi.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    public FooController() {
    }

    @GetMapping("format")
    public String format() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FooService messageService = context.getBean(FooService.class);
        return messageService.format();
    }
}
