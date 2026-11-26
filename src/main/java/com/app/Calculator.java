package com.app;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a1, int b1)
    {
    	return a1 - b1;
    }
    
    
}
