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
}
