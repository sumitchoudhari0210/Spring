package com.cjc.javabased_di_SecondaryRef_Constbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) 
	{
		ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp=(Employee) apc.getBean("emp"); 
		System.out.println(emp);
		
		
		
	}


}
