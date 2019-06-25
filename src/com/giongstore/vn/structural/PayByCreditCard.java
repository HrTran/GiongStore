package com.giongstore.vn.structural;

/**
 * Created by huytt99 on 21/06/19
 */
public class PayByCreditCard implements PaymentInterface {
    @Override
    public void payment() {
        System.out.println("Your bill has been pay!");
    }
}
