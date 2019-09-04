package com.giongstore.vn.creation;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        this.items.add(product);
    }

    public Double getCost() {
        Double sum = 0D;
        for (Product item : this.items) {
            sum += item.wrapPrice();
        }
        return sum;
    }

    public void showItems(){
        for (Product item : this.items) {
            System.out.println(item.info());
        }
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public void buy() {
        if(items.size() > 0) {
            for(Product product : items) {
                System.out.println("Add " + product.getName() + " to delivery queue!");
            }
        }
    }

    public void cancel(){
        for(Product product : items) {
            System.out.println("Remove " + product.getName() + " from delivery queue!");
        }
    }
}
