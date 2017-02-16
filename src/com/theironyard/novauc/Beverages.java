package com.theironyard.novauc;

/**
 * Created by octavio on 2/14/17.
 */
public class Beverages extends InventoryItem {

    public Beverages(String name, int quantity) {
        super(name, quantity);
        this.category = "Beverages";
    }
}
