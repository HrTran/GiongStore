package com.giongstore.vn.creation;

import com.giongstore.vn.behavior.NullProduct;

/**
 * Created by huytt99 on 6/1/19
 */
public class ProductFactory extends ItemFactory {

  @Override
  public Product getProduct(String productType, String productName, Double productPrice) {

    if(productType == null) return null;

    if(productType.equals("Clothes")){
      return new Clothes(productName, productPrice);
    }

    if(productType.equals("Watches")){
      return new Watches(productName, productPrice);
    }

    return new NullProduct(productName, productPrice);
  }


}
