package com.cjc.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext apc = new AnnotationConfigApplicationContext(Appconfig.class);
		Student stu= apc.getBean("s", Student.class);// stu- Beans method name
		System.out.println(stu);
	}

}
