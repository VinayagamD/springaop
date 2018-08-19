package com.vinay.springaopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println(getClass()+ ": Doing My DB WORK: ADDING AN ACCOUNT");
	}

	
}
