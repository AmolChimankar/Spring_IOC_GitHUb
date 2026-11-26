package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	 Calculator calc = context.getBean(Calculator.class);
	int add = calc.add(30,40);
	System.out.println(add);
	
	int sub = calc.sub(45, 20);
	System.out.println(sub);
}
	
}
