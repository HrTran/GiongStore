package com.giongstore.vn.behavior.memento_pattern;

import com.giongstore.vn.creation.Cart;

/**
 * Created by huytt99 on 23/08/19
 */
public class State {
    private String state;
    private Cart cart;

    public State(String state, Cart cart) {
        this.state = state;
        this.cart = cart;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
