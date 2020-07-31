package com.cjc.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig 
{
	@Bean(name="s")
public Student method()
{ 
		return new Student();
	
	}
}
