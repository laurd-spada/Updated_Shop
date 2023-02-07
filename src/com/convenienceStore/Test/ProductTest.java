package com.convenienceStore.Test;

import com.convenienceStore.products.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {
//    Product product = new Product();
    private Product product;
    @Before
    public void createProduct(){
        product = new Product();
    }
    @Test
    public void testProductPrice(){
        assertEquals(12, product.getPrice());
    }
    @Test
    public void testProductName(){
        assertEquals("fan", product.getName());
    }
    @Test
    public void testProductQuantity(){
        assertEquals(12, product.getQuantity());
    }
}
