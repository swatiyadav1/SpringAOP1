package com.springDemo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDefaultLogAspect {
	
	@Before("execution(public void addAccount())")
	public void beforeAccountAddAdvice() {
		System.out.println("executing @before on addAccount() ");
	}

}
