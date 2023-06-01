package com.example.didemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {
    @Bean
    public Customer customer(IAddress address) {
        return new Customer(address);
    }

    @Bean
    public IAddress us_address() {
        return new USAddress();
    }


    @Bean
    @Primary
    public IAddress international_address() {
        return new InternationalAddress();
    }

}
