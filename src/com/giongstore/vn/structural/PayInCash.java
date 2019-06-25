package com.giongstore.vn.structural;

/**
 * Created by huytt99 on 21/06/19
 */
public class PayInCash implements PaymentInterface {
    @Override
    public void payment() {
        System.out.println("You need to pay when receive packet!");
    }
}
