package spring.Applicatincontext.lazyloading;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		
		apc.getBean("con",Welcome.class);
		

	}

}
