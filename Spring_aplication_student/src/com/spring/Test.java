package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		
		Student stu=(Student) apc.getBean("dj");
		System.out.println(stu);
		
		stu.stu_data();
	}

}
