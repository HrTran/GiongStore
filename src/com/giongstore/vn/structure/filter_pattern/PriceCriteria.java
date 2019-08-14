package com.giongstore.vn.structure.filter_pattern;

import com.giongstore.vn.creation.Product;

import java.util.ArrayList;
import java.util.List;

public class PriceCriteria implements Criteria {

    private double threshold;

    public PriceCriteria(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> resultFiltered = new ArrayList<>();

        for(Product product: products) {
            if (product.getPrice() < threshold){
                resultFiltered.add(product);
            }
        }
        return resultFiltered;

    }
}
