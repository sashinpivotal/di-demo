package com.example.didemo;

public class InternationalAddress implements IAddress {

    private String country="usa";

    @Override
    public String getAddressInfo() {
        return country;
    }
}
