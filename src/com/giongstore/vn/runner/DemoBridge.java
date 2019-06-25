package com.giongstore.vn.runner;

import com.giongstore.vn.structural.PayByCreditCard;
import com.giongstore.vn.structural.PayInCash;
import com.giongstore.vn.structural.Payment;
import com.giongstore.vn.structural.PaymentMethod;

/**
 * Created by huytt99 on 21/06/19
 */
public class DemoBridge {
    public static void main(String[] args) {
        PaymentMethod payment = new Payment(new PayInCash());
        payment.printBill();

        PaymentMethod payment2 = new Payment(new PayByCreditCard());
        payment2.printBill();
    }
}
