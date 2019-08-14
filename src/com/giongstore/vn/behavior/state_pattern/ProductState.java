package com.giongstore.vn.behavior.state_pattern;

/**
 * Created by huytt99 on 14/08/19
 */
public interface ProductState {
    void checkState(ProductPost post);
    void verify();
}
