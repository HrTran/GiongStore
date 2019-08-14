package com.giongstore.vn.structure.flyweight_pattern;


/**
 * Created by huytt99 on 13/08/19
 */
public class ProductType {
    private String category;
    private boolean isSale;

    public ProductType(String category, boolean isSale) {
        this.category = category;
        this.isSale = isSale;
    }

    public void showInfo(String name, Double price) {
        System.out.println( "* Clothes:\n" +
                            "    |_ name: " + name + "\n"+
                            "    |_ price: " + price + "\n" +
                            "    |_ category: " + this.category + "\n" +
                            "    |_ sale?: " + this.isSale + "\n");
    }
}
