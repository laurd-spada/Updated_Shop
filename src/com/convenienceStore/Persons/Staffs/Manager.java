package com.convenienceStore.Persons.Staffs;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private int id;
    private String name;
    private  List<Cashier> employableCashier = new ArrayList<>();
    private  List<Cashier> employedCashier = new ArrayList<>();

    public Manager(){}
    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void getCashiersEmployable(List<Cashier> cashier){
        this.employableCashier = cashier;
    }
    public boolean hireCashier(String selected){
        for (Cashier a : employableCashier){
            if (a.getName().equals(selected)){
                employedCashier.add(a);
            }
        }
        return true;
    }
    public boolean fireCashier(String selected){
        for (Cashier a : employedCashier){
            if (a.getName().equals(selected)){
                employedCashier.remove(a);
            }
        }
        if(employedCashier.size() == 0){
            return true;
        }
        return false;
    }
    public void check(){
        for(Cashier staff: employedCashier){
            System.out.println(staff.getName());
        }
    }
}
