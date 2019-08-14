package com.giongstore.vn.runner;

import com.giongstore.vn.behavior.state_pattern.*;

/**
 * Created by huytt99 on 14/08/19
 */
public class DemoState {
    public static void main(String[] args) {
        ProductPost newPost = new ProductPost();

        ProductState state = new Draft();
        state.checkState(newPost);
        newPost.getState().verify();

        state = new Moderation();
        state.checkState(newPost);
        newPost.getState().verify();

        state = new Published();
        state.checkState(newPost);
        newPost.getState().verify();

    }
}
