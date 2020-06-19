package com.eveningbatch.iocanddidemo.impl;

import com.eveningbatch.iocanddidemo.interfaces.DemoInterface;
import org.springframework.stereotype.Component;

//@Component
public class DemoImpl implements DemoInterface {
    @Override
    public String getData() {
        return "Hello Spring";
    }
}
