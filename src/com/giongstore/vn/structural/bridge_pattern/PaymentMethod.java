package com.giongstore.vn.structural.bridge_pattern;

/**
 * Created by huytt99 on 21/06/19
 */
public abstract class PaymentMethod {
    public PaymentInterface paymentMethod;

    public PaymentMethod(PaymentInterface paymentInterface) {
        this.paymentMethod = paymentInterface;
    }

    public abstract void printBill();
}
