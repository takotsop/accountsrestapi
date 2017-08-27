package com.hellokoding.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

import java.awt.List;
import java.beans.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.hellokoding.springboot.controllers.*;
import com.hellokoding.springboot.models.*;
import com.hellokoding.springboot.*;


@SpringBootApplication


public class AccountsRestApi {
	
	public static Map<Integer, Account> acc = new HashMap<Integer, Account>();
	

//	public static Account tanner = new Account("tanner",1000);
//	public static Account hannah = new Account("hannah",500);
	
	public static void main(String[] args) {
		Account tanner1 = new Account();
		tanner1.setName("tanner");
		tanner1.setBalance(1000);
		Account hannah1 = new Account();
		hannah1.setName("hannah");
		hannah1.setBalance(500);
		acc.put(1, tanner1);
		acc.put(2, hannah1);
	
		SpringApplication.run(AccountsRestApi.class, args);
	
		
	}
}
