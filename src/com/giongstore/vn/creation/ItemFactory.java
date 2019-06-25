package com.giongstore.vn.creation;

/**
 * Created by huytt99 on 6/1/19
 */
public abstract class ItemFactory {

  public abstract Product getProduct(String productType, String productName, Double productPrice);
}
