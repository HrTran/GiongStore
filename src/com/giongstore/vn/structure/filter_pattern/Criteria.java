package com.giongstore.vn.structure.filter_pattern;

import com.giongstore.vn.creation.Product;

import java.util.List;

public interface Criteria {
    public List<Product> filter(List<Product> products);
}
