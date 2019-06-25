package com.giongstore.vn.creation;


/**
 * Created by huytt99 on 6/1/19
 */
public class FactoryProducer {

  public static ItemFactory getFactory(Boolean isSale){
    if(isSale){
      return new SaleProductFactory();
    } else {
      return new ProductFactory();
    }
  }
}
