package com.example.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@Import(MyConfiguration.class)
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext
				= SpringApplication.run(DiDemoApplication.class, args);

		USCustomer customer = applicationContext.getBean(USCustomer.class);
		IAddress address = customer.getAddress();
		String s = customer.toString();
		System.out.println(s);
	}

}
