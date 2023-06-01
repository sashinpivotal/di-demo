package com.example.didemo;

import org.springframework.stereotype.Component;

@Component
public class InternationalAddress implements IAddress {

    private String country="usa";

    @Override
    public String getAddressInfo() {
        return country;
    }
}
