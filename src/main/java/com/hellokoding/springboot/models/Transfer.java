package com.hellokoding.springboot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.hellokoding.springboot.controllers.*;
//@Configuration
//@Component

public class Transfer {

//		@Autowired
		private int toID;
		private int fromID;
		private int amount;
//		private boolean success;
		
	// , boolean success
		
//		public Transfer(int toID, int fromID, int amount) {
//			
//			this.toID=toID;
//			this.fromID=fromID;
//			this.amount=amount;
////			this.success=success;
//		}
		
		
		public void setToID(int toID) {
			this.toID=toID;
		
		}
		
		public void setFromID(int fromID) {
			this.fromID=fromID;
		}
		
		public void setAmount(int amount) {
			this.amount=amount;
			
		}
		
//		public void setSuccess(boolean success) {
//			this.success=success;
//		}
		
		public int getToID() {
			return toID;
		}
		
		public int getFromID() {
			return fromID;
		}
		
		public int getAmount() {
			return amount;
			
		}
		
//		public boolean getSuccess() {
//			return success;
//		}
		
		
		
		



}
