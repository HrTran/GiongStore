package com.giongstore.vn.runner;

import com.giongstore.vn.behavior.strategy_pattern.*;

/**
 * Created by huytt99 on 24/08/19
 */
public class DemoStrategy {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();

        LoginMethod loginByGoogleMail = new LoginByGoogle();
        LoginMethod loginByFbAccount = new LoginByFacebook();
        LoginMethod loginByRegisteredUser = new LoginByUsername();

        loginForm.setLoginMethod(loginByGoogleMail);
        loginForm.doLogin();

        loginForm.setLoginMethod(loginByFbAccount);
        loginForm.doLogin();

        loginForm.setLoginMethod(loginByRegisteredUser);
        loginForm.doLogin();
    }
}
