package com.example.springdi.component.impl;

import com.example.springdi.component.Formatter;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("BarFormatter")
@Scope("prototype")
public class BarFormatter implements Formatter {
    private int count = 0;

    @Override
    public String format() {
        return "Bar: " + count++;
    }
}
