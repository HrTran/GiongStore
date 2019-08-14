package com.giongstore.vn.runner;

import com.giongstore.vn.structure.flyweight_pattern.ProductType;
import com.giongstore.vn.structure.flyweight_pattern.ProductWithType;
import com.giongstore.vn.structure.flyweight_pattern.TypeFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huytt99 on 13/08/19
 */
public class DemoFlyweight {
    public static void main(String[] args) {
        List<ProductWithType> listProduct = new ArrayList<>();
        createProduct("Seiko watch", 20.56, "Accessories", false, listProduct);
        createProduct("Pepple watch", 100.12, "Accessories", false, listProduct);
        createProduct("Omega watch", 50.56, "Accessories", false, listProduct);

        createProduct("Hermes shirt", 150.56, "Clothes", true, listProduct);
        createProduct("Gucci bell", 50.56, "Clothes", false, listProduct);
        createProduct("Dolce & Gabbana hat", 50.56, "Clothes", false, listProduct);

        showInfo(listProduct);
    }

    public static void createProduct(String productName, Double productPrice, String category, boolean isSale,
                              List<ProductWithType> listProduct) {
        ProductType type = TypeFactory.getProductType(category, isSale);
        ProductWithType product = new ProductWithType(productName, productPrice, type);
        System.out.println("Add " + productName + " with price of " + productPrice + " in category " + category + " is" + (isSale ? " in " : " not in ") + "sale");
        listProduct.add(product);
    }

    public static void showInfo(List<ProductWithType> listProduct) {
        for(ProductWithType product : listProduct) {
            product.showInfo();
        }
    }
}
