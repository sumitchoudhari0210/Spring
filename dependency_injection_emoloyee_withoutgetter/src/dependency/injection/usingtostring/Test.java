package dependency.injection.usingtostring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean2.xml");
		
		Employee emp=apc.getBean("id",Employee.class);
		
	System.out.println(emp);
		
		
	}

}
