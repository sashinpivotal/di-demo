package com.example.didemo;

import org.springframework.stereotype.Component;

@Component
public class Company {

    private ICustomer customer;

    public Company(ICustomer customer) {
        this.customer = customer;
    }
}
