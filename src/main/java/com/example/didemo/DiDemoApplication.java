package com.example.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MyConfiguration.class)
public class DiDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext
				= SpringApplication.run(DiDemoApplication.class, args);
		IAddress bean = applicationContext.getBean(IAddress.class);
		String addressInfo = bean.getAddressInfo();
		System.out.println(addressInfo);

		Customer bean1 = applicationContext.getBean(Customer.class);
		String s = bean1.toString();
		System.out.println(s);
	}

}
