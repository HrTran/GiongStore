package com.giongstore.vn.creation;

import com.giongstore.vn.behavior.NullProduct;

/**
 * Created by huytt99 on 6/1/19
 */
public class SaleProductFactory extends ItemFactory {

  @Override
  public Product getProduct(String productType, String productName, Double productPrice) {

    if(productType == null) return null;

    if(productType.equals("SaleClothes")){
      return new SaleClothes(productName, productPrice);
    }

    if(productType.equals("SaleWatches")){
      return new SaleWatches(productName, productPrice);
    }

    return new NullProduct(productName, productPrice);

  }

}
