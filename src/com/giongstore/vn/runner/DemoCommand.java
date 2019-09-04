package com.giongstore.vn.runner;

import com.giongstore.vn.behavior.command_pattern.CancelOrder;
import com.giongstore.vn.behavior.command_pattern.PlaceOrder;
import com.giongstore.vn.behavior.command_pattern.SystemWorker;
import com.giongstore.vn.creation.Cart;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.ProductFactory;

/**
 * Created by huytt99 on 21/08/19
 */
public class DemoCommand {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product owenTshirt = productFactory.getProduct("Clothes", "owen T-shirt", 20.45);
        Product seikoWatch = productFactory.getProduct("Watches", "seiko watch", 29.45);

        Product aristinoTshirt = productFactory.getProduct("Clothes", "Aristino T-shirt", 20.45);
        Product omegaWatch = productFactory.getProduct("Watches", "Omega watch", 29.45);

        Cart cart1 = new Cart();
        cart1.addItem(owenTshirt);
        cart1.addItem(seikoWatch);

        Cart cart2 = new Cart();
        cart2.addItem(aristinoTshirt);
        cart2.addItem(omegaWatch);


        PlaceOrder pOrder1 = new PlaceOrder(cart1);

        PlaceOrder pOrder2 = new PlaceOrder(cart2);
        CancelOrder cOrder2 = new CancelOrder(cart2);

        SystemWorker systemWorker = new SystemWorker();
        systemWorker.addOrder(pOrder1);
        systemWorker.addOrder(pOrder2);
        systemWorker.addOrder(cOrder2);

        systemWorker.processOrder();
    }
}
