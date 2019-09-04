package com.giongstore.vn.behavior.observer_pattern;

/**
 * Created by huytt99 on 24/08/19
 */
public class Client implements Subcriber {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String promotionCodes) {
        System.out.println(this.name + ": The newest code is " + promotionCodes);
    }
}
