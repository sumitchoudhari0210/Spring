package com.spring.ioc;

public class Oracle implements Connection {

	@Override
	public void commit() {
		System.out.println("Oracle------commit");
		
	}

	@Override
	public void rollback() {
		System.out.println("Oracle-------rollback");
		
	}

}
