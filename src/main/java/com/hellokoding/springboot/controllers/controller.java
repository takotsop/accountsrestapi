package com.hellokoding.springboot.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.hellokoding.springboot.*;
import com.hellokoding.springboot.models.Account;
import com.hellokoding.springboot.models.Transfer;


@RestController


@RequestMapping("/account")
public class controller {
	
	@RequestMapping("/accountbalance/{accountID}")
	public Account accountBalance(@PathVariable(value="accountID",required = true) int accountID) {

		if(AccountsRestApi.acc.get(accountID) == null) {
			Account error = new Account();
			error.setName("doesn't exist");

			return error;
		}
		Account temp = AccountsRestApi.acc.get(accountID);
		//general account create
		
		return temp;
		
		
	}
	@RequestMapping(path ="/addaccount", method = RequestMethod.POST)
	public Account addAccount(@RequestBody String accountID) {
		
		Account temp = new Account();
		temp.setName(accountID);
		temp.setBalance(0);
	
		
		int nextID = AccountsRestApi.acc.size();
		AccountsRestApi.acc.put(nextID+1, temp);
		return temp;
			
	}
	
	@RequestMapping(path="/listaccounts")
	public HashMap<Integer,Account> listAccounts(){
		return (HashMap<Integer, Account>) AccountsRestApi.acc;
	}
	
	
	@RequestMapping(path="/transfermoney", method = RequestMethod.POST)
	public Transfer transfermoney(@RequestBody Transfer transfer)  {	
		
			int fromID = transfer.getFromID();
			AccountsRestApi.acc.get(fromID).setBalance(AccountsRestApi.acc.get(fromID).getBalance()- transfer.getAmount());
			int toID = transfer.getToID();
			AccountsRestApi.acc.get(toID).setBalance(AccountsRestApi.acc.get(toID).getBalance()+ transfer.getAmount());
			
			return transfer;
	

    }
}
