package com.cjc.javabased_di_Constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Student s()
	{
		Student stu= new Student (102,"Sumit","8793557561");
		return stu;
	}

}
