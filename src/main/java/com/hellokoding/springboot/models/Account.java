package com.hellokoding.springboot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.beans.*;

//@Configuration
//@Component
public class Account {
	
//	@Autowired
	private int balance;
	private String name;
	
	
	
	
//	public Account(String name, int balance) {
//		this.name =name;
//		this.balance=balance;
//		
//	}
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
		
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
		
	}
}
