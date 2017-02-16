package com.theironyard.novauc;

import java.util.ArrayList;


public class InventoryItem {

    String name;
    int quantity;
    String category;

    public InventoryItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public InventoryItem() {
    }

    @Override
    public String toString() {
        return this.name;
    }
}


