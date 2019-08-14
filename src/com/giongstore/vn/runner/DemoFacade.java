package com.giongstore.vn.runner;

import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.ProductFactory;
import com.giongstore.vn.structure.facade_pattern.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by huytt99 on 15/07/2019
 */
public class DemoFacade {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product owenTshirt = productFactory.getProduct("Clothes", "owen T-shirt", 20.45);
        Product seikoWatch = productFactory.getProduct("Watches", "seiko watch", 29.45);

        List<Product> productList = new ArrayList<>();
        productList.add(owenTshirt);
        productList.add(seikoWatch);

        Bill bill = new Bill(productList);
        bill.printBill();
    }
}
