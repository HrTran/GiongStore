package com.giongstore.vn.behavior.strategy_pattern;

/**
 * Created by huytt99 on 24/08/19
 */
public class LoginForm {
    public LoginMethod loginMethod;

    public void setLoginMethod(LoginMethod loginMethod) {
        this.loginMethod = loginMethod;
    }

    public void doLogin() {
        this.loginMethod.login();
    }
}
