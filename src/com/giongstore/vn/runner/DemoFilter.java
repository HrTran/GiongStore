package com.giongstore.vn.runner;

import com.giongstore.vn.creation.FactoryProducer;
import com.giongstore.vn.creation.Fashion;
import com.giongstore.vn.creation.ItemFactory;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.structural.filter_pattern.AndCriteria;
import com.giongstore.vn.structural.filter_pattern.FashionCriteria;
import com.giongstore.vn.structural.filter_pattern.PriceCriteria;

import java.util.ArrayList;
import java.util.List;

public class DemoFilter {
    public static void main(String[] args) {
        ItemFactory factory = FactoryProducer.getFactory(false);
        Product tshirt_Owen = factory.getProduct("Clothes", "Owen T-shirt", 24.95);
        Product watch_Seiko = factory.getProduct("Watches", "Seiko watch", 16.95);

        List<Product> products = new ArrayList<>();
        products.add(tshirt_Owen);
        products.add(watch_Seiko);

        FashionCriteria fashionCriteria = new FashionCriteria();
        PriceCriteria priceCriteria = new PriceCriteria(25.0);
        AndCriteria andCriteria = new AndCriteria(fashionCriteria, priceCriteria);

        System.out.println("================================== START Filter Pattern =================================");
        System.out.print("Is clothes instanceof Fashion: ");
        System.out.println(tshirt_Owen instanceof Fashion);
        System.out.print("Is tshirt_Owen < threshold: ");
        System.out.println(tshirt_Owen.getPrice() < 25.0);

        List<Product> filteredProducts = andCriteria.filter(products);
        System.out.println("Num of product filtered: " + filteredProducts.size());

        System.out.println("Print all...");
        for (Product product : filteredProducts) {
            System.out.println(product.info());
        }

        System.out.println("==================================== END Filter Pattern =================================");
    }

}
