package com.giongstore.vn.structure.flyweight_pattern;


import java.util.HashMap;

/**
 * Created by huytt99 on 13/08/19
 */
public class TypeFactory {
    private static HashMap<String, ProductType> productMap = new HashMap<>();

    public static ProductType getProductType(String category, boolean isSale) {
        ProductType pType;
        pType = productMap.get(category + "_" + isSale);
        if(pType == null){
            System.out.println("Creating product type : " + category + "_" + isSale);
            pType = new ProductType(category, isSale);
            productMap.put(category + "_" + isSale, pType);
        }
        return pType;
    }

}
