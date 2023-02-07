package com.convenienceStore.products;

public class Product {
    private String name;
    private int quantity;
    private int price;

    public Product(){}
    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
