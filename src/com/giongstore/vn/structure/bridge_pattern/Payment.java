package com.giongstore.vn.structure.bridge_pattern;

/**
 * Created by huytt99 on 21/06/19
 */
public class Payment extends PaymentMethod {

    public Payment(PaymentInterface paymentInterface) {
        super(paymentInterface);
    }

    @Override
    public void printBill() {
        paymentMethod.payment();
    }
}
