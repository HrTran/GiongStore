package com.giongstore.vn.behavior.strategy_pattern;

/**
 * Created by huytt99 on 24/08/19
 */
public class LoginByUsername implements LoginMethod {


    @Override
    public void login() {
        System.out.println("Login by registed user");
    }
}
