package com.theironyard.novauc;

/**
 * Created by octavio on 2/14/17.
 */
public class Clothing extends InventoryItem {

    public Clothing(String name, int quantity) {    //setting category field to its appropriate name
        super(name, quantity);
        this.category = "Clothing";
    }
}
