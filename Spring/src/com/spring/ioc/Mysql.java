package com.spring.ioc;

public class Mysql implements Connection {

	@Override
	public void commit() {
		System.out.println("mysql------commit");
		
	}

	@Override
	public void rollback() {
		System.out.println("mysql-------rollback");
		
	}

}
