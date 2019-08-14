package com.giongstore.vn.structure.filter_pattern;

import com.giongstore.vn.creation.Product;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;


    public AndCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> crit1_Satisfied =  criteria1.filter(products);
//        List<Product> crit2_Satisfied =  criteria2.filter(crit1_Satisfied);
        return criteria2.filter(crit1_Satisfied);
    }
}
