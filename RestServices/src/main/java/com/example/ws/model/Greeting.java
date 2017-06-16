package com.example.ws.model;

import java.math.BigInteger;

public class Greeting {

	private BigInteger Id;
	
	private String message;

	public BigInteger getId() {
		return Id;
	}
	
	public Greeting(){
		
	}

	public void setId(BigInteger id) {
		Id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 
	
	
	
}
