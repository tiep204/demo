package com.example.springdi.service;

import com.example.springdi.component.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface FooService {
    String format();
}
