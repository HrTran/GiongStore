package com.giongstore.vn.structure.flyweight_pattern;

import com.giongstore.vn.behavior.visitor_pattern.ProductVisitor;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.Video;


/**
 * Created by huytt99 on 13/08/19
 */
public class ProductWithType implements Product  {
    private String name;
    private Double price;
    private ProductType type;

    public ProductWithType(String name, Double price, ProductType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void showInfo() {
        type.showInfo(this.name, this.price);
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public Double wrapPrice() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public Video getVideoDescription() {
        return null;
    }

    @Override
    public void visit(ProductVisitor productVisitor) {

    }
}
