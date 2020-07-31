package com.cjc.secondary_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application {
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("NewFile.xml");
		  Student stu=(Student) apc.getBean("stu");
		
		System.out.println(stu);
		
	}


}
