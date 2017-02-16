package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ArrayList<InventoryItem> myJunk = new ArrayList<>();
        InventoryItem kiosk = new InventoryItem();

        myJunk.add(new Beverages("Redbull", 10));
        myJunk.add(new Snacks("Doritos", 5));
        myJunk.add(new Clothing("Jeans", 20));
        myJunk.add(new Electronics("iPad", 30));
        myJunk.add(new Toiletries("Soap", 15));

        System.out.println("Welcome to 7-11\nMy name is Apu, please type an item:");


        // I understand I need a loop here to wrap it around.


        System.out.println("Type an item");
        String name = scanner.nextLine();

        System.out.println("Type a quantity");
        int quantity = scannerInt.nextInt();

        System.out.println("Type a category");
        String category = scanner.nextLine();

        myJunk.add(createItem(name, quantity, category));

        System.out.println("**** For loop for an ArrayList *****");
        for (int i = 0; i < myJunk.size(); i++) {
            System.out.println(myJunk.get(i));
        }
    }

    public static InventoryItem createItem (String name,int quantity, String category) throws Exception {

            switch (category) {

                case "Beverages":

                    return new Beverages(name, quantity);

                case "Snacks":

                    return new Snacks(name, quantity);


                case "Clothing":

                    return new Clothing(name, quantity);


                case "Electronics":

                    return new Electronics(name, quantity);


                case "Toiletries":

                    return new Toiletries(name, quantity);


                default:
                    throw new Exception("Error\nInvalid Category");

            }
        }
}

