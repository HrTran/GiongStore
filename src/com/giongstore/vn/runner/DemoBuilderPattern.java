package com.giongstore.vn.runner;

import com.giongstore.vn.creation.Cart;
import com.giongstore.vn.creation.CartBuilder;

public class DemoBuilderPattern {
    public static void main(String[] args) {
        CartBuilder cartBuilder = new CartBuilder();
        Cart cart = cartBuilder.addList1();
        cart.showItems();
        System.out.println("Total cost: " + cart.getCost());
    }
}
