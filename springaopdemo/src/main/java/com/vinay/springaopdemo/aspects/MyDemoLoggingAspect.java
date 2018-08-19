package com.vinay.springaopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//	this is where we will add all of our related advices for logging
	
//	let's start with an @Before advice
	@Before("execution(public void addAccount())")
//	@Before("execution(public void updateAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Execution @Before advice on updateAccount()");
	}

}
