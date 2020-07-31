package dependency.injection.usingsettergetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		
		Employee emp=apc.getBean("con",Employee.class);
		
		System.out.println(emp.getEmpid()+" "+emp.getEmpname()+" "+emp.getMobno()+" "+emp.getEmpaddress());
		
		
	}

}
