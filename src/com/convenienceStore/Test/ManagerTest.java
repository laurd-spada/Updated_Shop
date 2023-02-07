package com.convenienceStore.Test;

import com.convenienceStore.Persons.Staffs.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
//    Manager manager = new Manager();
    private Manager manager;
    @Before
    public void createManager(){
        manager = new Manager();
    }
    @Test
    public void testManagerHasName(){
        assertEquals("Oboba Daniel", manager.getName());
    }
    @Test
    public void testManagerHasId(){
        assertEquals(12, manager.getId());
    }
    @Test
    public void testManagerCanHire(){
        assertEquals(true, manager.hireCashier("John Obo"));
    }
    @Test
    public void testManagerCanFire(){
        assertEquals(true, manager.fireCashier("John Obo"));
    }
}
