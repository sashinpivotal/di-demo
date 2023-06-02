package com.example.didemo;

public class Main {
    public static void main(String[] args) {
        USAddress usAddress = new USAddress();
        USCustomer customer = new USCustomer(usAddress);
        System.out.println(customer);

        InternationalAddress internationalAddress
                = new InternationalAddress();
        USCustomer customer1 = new USCustomer(internationalAddress);
        System.out.println(customer1);
    }
}
