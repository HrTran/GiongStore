package com.giongstore.vn.structure.decorator_pattern;

import com.giongstore.vn.behavior.visitor_pattern.ProductVisitor;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.structure.bridge_pattern.PayByCreditCard;
import com.giongstore.vn.structure.bridge_pattern.PayInCash;
import com.giongstore.vn.structure.bridge_pattern.Payment;
import com.giongstore.vn.structure.bridge_pattern.PaymentMethod;

/**
 * Create by huytt99 on 02/07/2019
 */
public class PayableWatches extends PayableProduct {

    public PayableWatches(Product product, String paymentMethod) {
        super(product, paymentMethod);
    }

    @Override
    public String info() {
        payment();
        return super.info();
    }

    public void payment(){
        PaymentMethod paymentMethod;

        if(super.getPaymentMethod().equals("cash")){
            paymentMethod =  new Payment(new PayInCash());
        } else {
            paymentMethod =  new Payment(new PayByCreditCard());
        }
        paymentMethod.printBill();
    }

    @Override
    public void visit(ProductVisitor productVisitor) {

    }
}
