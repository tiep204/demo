package com.example.springdi.service.impl;

import com.example.springdi.component.Formatter;
import com.example.springdi.service.FooService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

public class FooServiceImpl implements FooService {

    private int count = 0;

    public FooServiceImpl() {
    }

    @Override
    public String format() {
        return "Count: " + count++;
    }
}
