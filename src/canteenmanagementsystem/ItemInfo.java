/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canteenmanagementsystem;

import java.util.*;

/**
 *
 * @author Ragul S
 */
public class ItemInfo {
    String name;
    double price;
    int available_quantity;
     public static ArrayList<ItemInfo> item_array  = new ArrayList<>();

    public ItemInfo(String name, double price, int available_quantity) {
        //item_array.add(new ItemInfo());
        this.name = name;
        this.price = price;
        this.available_quantity = available_quantity;
    }

    private ItemInfo() {
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }
    
}
