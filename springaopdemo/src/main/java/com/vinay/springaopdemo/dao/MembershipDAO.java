package com.vinay.springaopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + " : DOING STUFF: ADDING ACCOUNT A MEMBERSHIP ACCOUNT");
	}
}