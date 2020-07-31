package com.Spring.application.context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		
		Connection c=(Connection) apc.getBean("con");
		System.out.println(c);
		
		c.commit();
		
		Connection c1=(Connection) apc.getBean("con");
		System.out.println(c1);
		c1.rollback();
		
		
	}

}
