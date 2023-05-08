package com.example.springdi.component.impl;

import com.example.springdi.component.Formatter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("FooFormatter")
public class FooFormatter implements Formatter {
    @Override
    public String format() {
        return "Foo";
    }
}
