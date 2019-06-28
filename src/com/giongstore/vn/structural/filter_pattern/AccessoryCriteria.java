package com.giongstore.vn.structural.filter_pattern;

import com.giongstore.vn.creation.Accesories;
import com.giongstore.vn.creation.Fashion;
import com.giongstore.vn.creation.Product;

import java.util.ArrayList;
import java.util.List;

public class AccessoryCriteria implements Criteria {
    private Criteria criteria;

    public AccessoryCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> resultFiltered = new ArrayList<>();

        for(Product product: products) {
            if (product instanceof Accesories){
                resultFiltered.add(product);
            }
        }
        return resultFiltered;
    }
}
