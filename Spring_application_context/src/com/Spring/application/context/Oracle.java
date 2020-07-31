package com.Spring.application.context;

public class Oracle implements Connection {

	@Override
	public void commit() {
	System.out.println("commit------Oracle");
		
	}

	@Override
	public void rollback() {
		System.out.println("rollback------Oracle");
		
	}

}
