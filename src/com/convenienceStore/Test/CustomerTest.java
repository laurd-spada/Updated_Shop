package com.convenienceStore.Test;

import com.convenienceStore.Persons.Customers.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
//    Customer customer = new Customer();
    private Customer customer;
    @Before
    public void createCustomer(){
        customer = new Customer();
    }
    @Test
    public void testCustomersName(){
        assertEquals("jerry", customer.getName());
    }
    @Test
    public void testCustomersAmount(){
        assertEquals(124, customer.getAmount());
    }
}
