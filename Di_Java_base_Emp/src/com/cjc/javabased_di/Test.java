package com.cjc.javabased_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) 
	{
		ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp= apc.getBean("e", Employee.class); 
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpmobno());
		
	}
}
