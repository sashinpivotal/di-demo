package com.example.didemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("us")
public class USAddress implements IAddress{

    private String city = "boston";

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getAddressInfo() {
        return city;
    }
}
