package com.giongstore.vn.structure.filter_pattern;

import com.giongstore.vn.creation.Fashion;
import com.giongstore.vn.creation.Product;

import java.util.ArrayList;
import java.util.List;

public class FashionCriteria implements Criteria {

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> resultFiltered = new ArrayList<>();

        for(Product product: products) {
            if (product instanceof Fashion){
                resultFiltered.add(product);
            }
        }
        return resultFiltered;
    }
}
