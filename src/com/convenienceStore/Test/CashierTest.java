package com.convenienceStore.Test;

import com.convenienceStore.Persons.Staffs.Cashier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashierTest {
//    Cashier cashier = new Cashier();
    private Cashier cashier;
    @Before
    public void createCashier(){
        cashier = new Cashier();
    }
    @Test
    public void testCashierId(){
        assertEquals(12, cashier.getId());
    }
    @Test
    public void testCashierName(){
        assertEquals("Ada", cashier.getName());
    }
    @Test
    public void testCashierSalary(){
        assertEquals(12, cashier.getSalary());
    }
}
