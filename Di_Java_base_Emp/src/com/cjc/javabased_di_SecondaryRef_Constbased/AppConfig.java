package com.cjc.javabased_di_SecondaryRef_Constbased;

import org.springframework.context.annotation.Bean;

import com.cjc.javabased_di_SecondaryRef_Constbased.*;

public class AppConfig {
	@Bean(name = "emp")
	public Employee emp()
	    {
		Employee e1= new Employee(123,"Sumit","8793557561",bd());
		
		return e1;
		}
		
		@Bean
		public BankDetails bd()
		{
			BankDetails bd1= new BankDetails(35362802,"Bank Of Maharashtra","Nagpur");
			
			return bd1;
		}
}
