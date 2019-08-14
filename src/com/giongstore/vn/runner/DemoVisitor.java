package com.giongstore.vn.runner;

import com.giongstore.vn.behavior.visitor_pattern.DataExportVisitor;
import com.giongstore.vn.creation.Clothes;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.Watches;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huytt99 on 14/08/19
 */
public class DemoVisitor {
    public static void main(String[] args) {
        Watches seiko_watch = new Watches("Seiko watch", 21.56);
        Clothes gucci_cloak = new Clothes("Gucci cloak", 2990.99);

        List<Product> products = new ArrayList<>();
        products.add(seiko_watch);
        products.add(gucci_cloak);

        DataExportVisitor dataVisitor = new DataExportVisitor();

        for(Product p : products) {
            p.visit(dataVisitor);
            System.out.print("\n");
        }
    }
}
