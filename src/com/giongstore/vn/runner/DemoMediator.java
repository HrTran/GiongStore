package com.giongstore.vn.runner;

import com.giongstore.vn.behavior.mediator.Customer;
import com.giongstore.vn.behavior.mediator.Notification;
import com.giongstore.vn.behavior.mediator.Seller;

/**
 * Created by huytt99 on 22/08/19
 */
public class DemoMediator {
    public static void main(String[] args) {
        Notification notification = new Notification();
        Customer customer = new Customer(notification);
        Seller seller = new Seller(notification);

        customer.subcribe();
        customer.unsubcribe();

        seller.subcribe();
        seller.unsubcribe();
    }
}
