package com.autowrite.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		  Employee emp=(Employee) apc.getBean("s");
		
		System.out.println(emp);
	
		  
	}

}
