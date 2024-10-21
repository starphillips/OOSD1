/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

public class TestNavSys {

    public static void main(String[] args) {
        // Create a new NavSys object
        NavSys navSys = new NavSys("NS101", 10, 99.99);
        
        // Test various methods
        System.out.println("Initial item details:");
        System.out.println(navSys);

        navSys.addStock(10); // Adding 10 navigation systems
        System.out.println("\nAfter adding 10 navigation systems:");
        System.out.println(navSys);
        
        navSys.sellStock(2); // Selling 2 navigation systems
        System.out.println("\nAfter selling 2 navigation systems:");
        System.out.println(navSys);
        
        navSys.setPriceBeforeVAT(100.99); // Changing the price
        System.out.println("\nAfter setting new price:");
        System.out.println(navSys);
        
        navSys.addStock(0); // Attempting to add 0 items (insufficient ammount)
        System.out.println("\nAfter attempting to add 0 items:");
        System.out.println(navSys);
        
        
    }
}