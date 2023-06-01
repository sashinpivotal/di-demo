package com.example.didemo;

public class Main {
    public static void main(String[] args) {
        USAddress usAddress = new USAddress();
        Customer customer = new Customer(usAddress);
        System.out.println(customer);

        InternationalAddress internationalAddress
                = new InternationalAddress();
        Customer customer1 = new Customer(internationalAddress);
        System.out.println(customer1);
    }
}
