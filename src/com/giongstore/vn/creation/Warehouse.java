package com.giongstore.vn.creation;

import com.giongstore.vn.behavior.NullProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huytt99 on 6/1/19
 */
public class Warehouse {
  private List<Product> listAvail = new ArrayList<>();

  private static Warehouse ourInstance = new Warehouse();

  public static Warehouse getInstance() {
    return ourInstance;
  }

  private Warehouse() {
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
