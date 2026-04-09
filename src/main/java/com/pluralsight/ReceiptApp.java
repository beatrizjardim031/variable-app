package com.pluralsight;

public class ReceiptApp {
    public static void main(String[] args) {

//        1. Create variables for an item name (String) and item price (double)
//        2. Create a quantity variable (int)
//        3. Build and print: EX. "You bought 3 apples for $7.10"

        String item = "Passion Fruit";
        double price = 5.99;
        int quantity = 4;

        System.out.printf("You bought %d %s for %.2f.%n", quantity, item, price);

    }
}
