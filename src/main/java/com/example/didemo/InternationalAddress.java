package com.example.didemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("international")
public class InternationalAddress implements IAddress {

    private String country="usa";

    @Override
    public String getAddressInfo() {
        return country;
    }
}
