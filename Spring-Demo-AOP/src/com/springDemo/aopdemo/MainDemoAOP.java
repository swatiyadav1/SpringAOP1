package com.springDemo.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springDemo.aopdemo.dao.AccountDAO;

public class MainDemoAOP {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		theAccountDAO.addAccount();
		
		context.close();
	}

}
