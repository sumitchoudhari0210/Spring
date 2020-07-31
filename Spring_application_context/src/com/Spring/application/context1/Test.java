package com.Spring.application.context1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean2.xml");
		
		Hello h=(Hello) apc.getBean("con");
		System.out.println(h);
		h.hello();
		
		Hello h1=(Hello) apc.getBean("con");
		System.out.println(h1);
		h1.hello();
	}

}
