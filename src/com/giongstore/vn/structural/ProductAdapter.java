package com.giongstore.vn.structural;

import com.giongstore.vn.creation.Clothes;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.Watches;

/**
 * Created by huytt99 on 20/06/19
 */
public class ProductAdapter implements AlibabaProduct {

  private Product product;

  public ProductAdapter(String productType, String productName, Double productPrice) {
    if(productType.equalsIgnoreCase("clothes")) {
      product = new Clothes(productName, productPrice);
    } else {
      product = new Watches(productName, productPrice);
    }
  }

  @Override
  public String name() {
    return product.getName();
  }

  @Override
  public Double price() {
    return product.getPrice();
  }

  @Override
  public String desc() {
    return product.info() + "\n\t|__ after wrap: " + product.wrapPrice();
  }
}
