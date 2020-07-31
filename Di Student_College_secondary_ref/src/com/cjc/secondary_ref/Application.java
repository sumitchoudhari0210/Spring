package com.cjc.secondary_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application {
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("NewFile.xml");
		  Student stu=(Student) apc.getBean("stu");
		
		System.out.println(stu.getName());
		System.out.println(stu.getMobno());
		System.out.println(stu.getId());
		System.out.println(stu.getCol().getCollegeid());
		System.out.println(stu.getCol().getCollegename());
		System.out.println(stu.getCol().getAddress());
		  
	}


}
