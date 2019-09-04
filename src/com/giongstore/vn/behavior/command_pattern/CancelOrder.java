package com.giongstore.vn.behavior.command_pattern;


import com.giongstore.vn.creation.Cart;

/**
 * Created by huytt99 on 21/08/19
 */
public class CancelOrder implements Order {
    private Cart order;

    public CancelOrder(Cart order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancel();
    }
}
