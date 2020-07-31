package com.autowrite.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		  Employee emp=(Employee) apc.getBean("s");
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpmobno());
		System.out.println(emp.getBankdetails().getAccountno());
		System.out.println(emp.getBankdetails().getBankname());
		System.out.println(emp.getBankdetails().getAddr());
		  
	}

}
