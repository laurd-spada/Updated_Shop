package com.convenienceStore.Persons.Staffs;

public class Cashier {
    private int id;
    private  String name;
    private  int salary;
    public Cashier(){}
    public Cashier(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
