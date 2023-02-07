package com.convenienceStore.Persons.Customers;

public class Customer {
    private String name;
    private int amount;
    public Customer(){}
    public Customer(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
