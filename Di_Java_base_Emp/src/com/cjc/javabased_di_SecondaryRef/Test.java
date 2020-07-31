package com.cjc.javabased_di_SecondaryRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.javabased_di_SecondaryRef.*;;

public class Test {
	public static void main(String[] args) 
	{
		ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp=(Employee) apc.getBean("emp"); 
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpmobno());
		System.out.println(emp.getBd().getAccountno());
		System.out.println(emp.getBd().getBankname());
		System.out.println(emp.getBd().getAddress());
		
		
		
	}

}
