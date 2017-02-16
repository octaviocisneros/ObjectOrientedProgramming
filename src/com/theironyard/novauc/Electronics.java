package com.theironyard.novauc;

/**
 * Created by octavio on 2/14/17.
 */
public class Electronics extends InventoryItem {

    public Electronics(String name, int quantity) {
        super(name, quantity);
        this.category = "Electronics";
    }
}
