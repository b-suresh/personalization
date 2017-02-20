package com.iot.personalization;

public class Customer {
	private CustomerIdentity identity;
	private String name;
	
	public Customer(CustomerIdentity identity, String name){
		this.identity = identity;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomerIdentity getIdentity() {
		return identity;
	}
}
