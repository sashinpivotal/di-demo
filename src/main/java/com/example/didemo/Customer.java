package com.example.didemo;

public class Customer {

    private String name = "sang";
    private IAddress address;

    // - example where DI is not used
    //   - it creates tightly-coupled code
    // - can I support InternationalAddress in this Customer
    //   class without changing Customer class code? No
    // - this code violates the "Open for extension
    //   but closed for modification" design principle

    // - I want this Customer class to be able to
    //   handle any kind of Address
//    public Customer() {
//        this.USAddress = new USAddress();
//    }

    // - this is an example of dependency injection
    // - dependency is injected by other class through
    //   constructor in an abstract form
    // - Open Close principle is observed
    // - this is actually an example Strategy design pattern
    public Customer(IAddress address) {
        this.address = address;
    }

    public IAddress getAddress() {
        return address;
    }

    public void setAddress(IAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address.getAddressInfo() +
                '}';
    }
}