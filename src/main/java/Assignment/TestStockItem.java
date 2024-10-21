/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment;

public class TestStockItem {

    public static void main(String[] args) {
        // Create a new StockItem object
        StockItem item = new StockItem("W101", 10, 99.99);
        
        
       //Test various methods
       System.out.println("Initial item details:");
        System.out.println(item);

        item.addStock(10); // Adding 10 items
        System.out.println("\nAfter adding 10 items:");
        System.out.println(item);
        
        item.sellStock(2); // Selling 2 items
        System.out.println("\nAfter selling 2 items:");
        System.out.println(item);
        
        item.setPriceBeforeVAT(100.99); // Changing the price to 100.999
        System.out.println("\nAfter attempting to change the price:");
        System.out.println(item);
        
        item.addStock(0); // Attempting to add 0 items (insufficient ammount)
        System.out.println("\nAfter attempting to add 0 items:");
        System.out.println(item);
                
        item.sellStock(19); // Attempting to sell 19 items (more than available)
        System.out.println("\nAfter attempting to sell 19 items:");
        System.out.println(item);
        

    }
        
}


