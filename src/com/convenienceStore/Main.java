package com.convenienceStore;

import com.convenienceStore.Persons.Staffs.Cashier;
import com.convenienceStore.Persons.Staffs.Manager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cashier newCashier = new Cashier(1,"John Obo", 15_000);
        List<Cashier> nc = new ArrayList<>();
        nc.add(newCashier);
        var mg = new Manager();
        mg.getCashiersEmployable(nc);

    }
}