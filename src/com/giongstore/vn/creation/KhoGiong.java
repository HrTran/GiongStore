package com.giongstore.vn.creation;

import com.giongstore.vn.behavior.NullProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huytt99 on 6/1/19
 */
public class KhoGiong {
  private List<Product> listAvail = new ArrayList<>();

  private static KhoGiong ourInstance = new KhoGiong();

  public static KhoGiong getInstance() {
    return ourInstance;
  }

  private KhoGiong() {
  }

  public List<Product> listAvailableProduct() {
    return listAvail;
  }

  public void addItemToKho(Product product) {
    if(product instanceof NullProduct) {
      System.out.println(product.info());
    } else{
      listAvail.add(product);
    }
  }

  public void removeItemToKho(Product product) {
    if(product instanceof NullProduct) {
      System.out.println(product.info());
    } else{
      listAvail.remove(product);
    }

  }
}
