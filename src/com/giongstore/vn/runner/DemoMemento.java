package com.giongstore.vn.runner;

import com.giongstore.vn.behavior.memento_pattern.*;
import com.giongstore.vn.creation.Cart;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.ProductFactory;

/**
 * Created by huytt99 on 23/08/19
 */
public class DemoMemento {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product owenTshirt = productFactory.getProduct("Clothes", "owen T-shirt", 20.45);
        Product seikoWatch = productFactory.getProduct("Watches", "seiko watch", 29.45);

        Cart cart1 = new Cart();
        cart1.addItem(owenTshirt);
        cart1.addItem(seikoWatch);

        State pendingState = new State("pending", cart1); // wait for processing
        State processingState = new State("processing", cart1); // move goods to warehouse and prepare for delivery
        State deliveryState = new State("delivery", cart1); // move goods to warehouse and prepare for delivery

        SpecificTransaction transaction = new SpecificTransaction();
        SpecificSnapshot snapshot1 = new SpecificSnapshot(transaction, pendingState);
        SpecificSnapshot snapshot2 = new SpecificSnapshot(transaction, processingState);
        SpecificSnapshot snapshot3 = new SpecificSnapshot(transaction, deliveryState);

        TransactionHistory transactionHistory = new TransactionHistory();
        transactionHistory.makeBackup(snapshot1);
        transactionHistory.makeBackup(snapshot2);
        transactionHistory.makeBackup(snapshot3);

        transactionHistory.undo();
        System.out.println("Current state: " + transaction.getState().getState());
        transactionHistory.undo();
        System.out.println("Current state: " + transaction.getState().getState());
    }
}
