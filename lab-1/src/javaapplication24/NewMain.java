/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.time.LocalDate;

/**
 *
 * @author Malek
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese",3, LocalDate.parse("2022-06-07"));
        ElectricProduct p5 = new ElectricProduct(4875, 30.0, 3,"Extension cord", "220v");
        Product[] products = {p4, p5};
        for (Product p : products) {
            System.out.println(p.toString());
            p.addToShoppingCart();
            System.out.println();
        }
        
        
    }

 

}
