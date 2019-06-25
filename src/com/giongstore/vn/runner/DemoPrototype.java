package com.giongstore.vn.runner;

import com.giongstore.vn.creation.FashionCache;

/**
 * Created by huytt99 on 20/06/19
 */
public class DemoPrototype {
  public static void main(String[] args) {
    FashionCache modelProduct = new FashionCache();
    modelProduct.loadProduct();
    System.out.println(modelProduct.getProduct(1).info());
    System.out.println(modelProduct.getProduct(2).info());
  }
}
