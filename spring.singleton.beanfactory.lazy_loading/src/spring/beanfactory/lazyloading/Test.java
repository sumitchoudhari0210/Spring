package spring.beanfactory.lazyloading;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("bean.xml");

		BeanFactory beanFactory = new XmlBeanFactory(r);

		Welcome wel = beanFactory.getBean("con", Welcome.class);

	}

}
