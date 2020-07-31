package com.cjc.combination_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");

		Student stu = apc.getBean("stu", Student.class);

		System.out.println(stu);
		System.out.println(stu.getAdd());
		

		Student stu1 = apc.getBean("stu", Student.class);

		System.out.println(stu1);
		System.out.println(stu1.getAdd());

		Student stu2 = apc.getBean("stu", Student.class);

		System.out.println(stu2);
		System.out.println(stu2.getAdd());
	
	}

}
