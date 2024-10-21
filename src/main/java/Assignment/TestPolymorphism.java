
package Assignment;

import java.util.Scanner;

public class TestPolymorphism {

    public static void itemInstance(StockItem item) {
        Scanner input = new Scanner(System.in);

        System.out.println("Current item details:");
        System.out.println(item);

        System.out.print("Enter the number of stock units to increase: ");
        int increase = input.nextInt();
        item.addStock(increase);
        System.out.println("After increasing stock:");
        System.out.println(item);

        System.out.print("Enter the number of stock units to sell: ");
        int sell = input.nextInt();
        item.sellStock(sell);
        System.out.println("After selling stock:");
        System.out.println(item);

        System.out.print("Enter the new price: ");
        double newPrice = input.nextDouble();
        item.setPriceBeforeVAT(newPrice);
        System.out.println("After setting new price:");
        System.out.println(item);
    }

    public static void main(String[] args) {
        // Create instances of the three subclasses
        Radio radioItem = new Radio("R101", 20, 199.99, "Standard");
        AirConditioner AirConItem = new AirConditioner("C101", 30, 249.99, "Energy Saving");
        ParkingSensors senosrsItem = new ParkingSensors("PS101", 50, 189.99, "Rear sensors only");

        // Create an array containing each instance
        StockItem[] items = {radioItem, AirConItem, senosrsItem};

        // Iterate through the array and call itemInstance method for each instance
        for(int i = 0; i < items.length; i++) {
            StockItem item = items[i];
            itemInstance(item);
        }
    }
}
