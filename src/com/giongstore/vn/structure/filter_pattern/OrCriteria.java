package com.giongstore.vn.structure.filter_pattern;

import com.giongstore.vn.creation.Product;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> crit1_satisfied = criteria1.filter(products);
        List<Product> crit2_satisfied = criteria2.filter(products);

        for(Product product: crit1_satisfied) {
            if(!crit2_satisfied.contains(product)) crit2_satisfied.add(product);
        }

        return crit2_satisfied;
    }
}
