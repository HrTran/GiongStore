package com.giongstore.vn.behavior.state_pattern;

/**
 * Created by huytt99 on 14/08/19
 */
public class ProductPost {
    private ProductState state;

    public ProductPost() {
        state = null;
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }
}
