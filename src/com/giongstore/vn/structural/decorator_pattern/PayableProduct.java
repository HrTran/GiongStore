package com.giongstore.vn.structural.decorator_pattern;

import com.giongstore.vn.creation.Product;
import com.giongstore.vn.structural.bridge_pattern.PaymentMethod;

/**
 * Create by huytt99 on 02/07/2019
 */
public abstract class PayableProduct implements Product{
    private Product product;
    private String paymentMethod;

    public PayableProduct(Product product, String paymentMethod) {
        this.product = product;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String info() {
        return this.product.info();
    }

    @Override
    public Double wrapPrice() {
        return this.product.wrapPrice();
    }

    @Override
    public Double getPrice() {
        return this.product.getPrice();
    }

    @Override
    public String getName() {
        return this.product.getName();
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
