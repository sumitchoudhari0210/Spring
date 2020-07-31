package com.cjc.combi.bank.empl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");

		Employee emp = apc.getBean("emp", Employee.class);

		System.out.println(emp);
		System.out.println(emp.getBd());
		
		Employee emp1 = apc.getBean("emp", Employee.class);

		System.out.println(emp1);
		System.out.println(emp1.getBd());
		
		Employee emp2 = apc.getBean("emp", Employee.class);

		System.out.println(emp2);
		System.out.println(emp2.getBd());
		

	}


}
