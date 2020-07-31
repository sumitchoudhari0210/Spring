package com.spring.ioc1;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {

		Resource r=new ClassPathResource("bean.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(r);
		
		Connection c=(Connection) beanFactory.getBean("con");
		
		c.hello();
	}

}
