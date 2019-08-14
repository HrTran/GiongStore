package com.giongstore.vn.structure.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private int numberOfItems;
    private List<Category> subCategories;

    public Category(String name, int numberOfItems) {
        this.name = name;
        this.numberOfItems = numberOfItems;
        this.subCategories = new ArrayList<>();
    }

    public void add(Category category) {
        this.subCategories.add(category);
    }

    public void remove(Category category) {
        this.subCategories.remove(category);
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    @Override
    public String toString() {
        return String.format("|_%s (%d)", name, numberOfItems);
    }
}
