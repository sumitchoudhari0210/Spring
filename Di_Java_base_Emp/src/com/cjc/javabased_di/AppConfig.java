package com.cjc.javabased_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {
	@Bean(name="e")
	public Employee method()
	{ 
			Employee emp= new Employee();
			emp.setEmpid(12);
			emp.setEmpname("Sumit");
			emp.setEmpmobno("8793557561");
			return  emp;
		
		}

}
