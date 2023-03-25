/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.time.LocalDate;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author lsls9
 */
public class ProductTest {

    @Test
    public void testSomeMethod() {
        
        FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese", (float) 10.4, LocalDate.parse("2022-06-07"));
        ElectricProduct p5 = new ElectricProduct(4875, 30.0, (float) 3.9, "Extension cord", "220v");
        assertEquals(Product.getTotalQuantity(), 2);
    }

}
