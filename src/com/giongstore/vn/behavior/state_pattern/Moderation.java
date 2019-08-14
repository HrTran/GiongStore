package com.giongstore.vn.behavior.state_pattern;

/**
 * Created by huytt99 on 14/08/19
 */
public class Moderation implements ProductState {
    @Override
    public void checkState(ProductPost post) {
        post.setState(this);
    }

    @Override
    public void verify() {
        System.out.println("Check if current queue is empty");
    }
}
