package com.giongstore.vn.runner;

import com.giongstore.vn.creation.*;

import java.util.List;

/**
 * Created by huytt99 on 6/1/19
 */
public class DemoAbstractFactory {
  public static void main(String[] args) {
    Warehouse warehouse = Warehouse.getInstance();
    ItemFactory factory = FactoryProducer.getFactory(false);

    Product tshirt_Owen = factory.getProduct("Clothes", "Owen T-shirt", 24.95);
    Product watch_Seiko = factory.getProduct("SaleWatches", "Seiko watch", 16.95);
    System.out.println(tshirt_Owen.info());
    System.out.println(watch_Seiko.info());
    System.out.println(watch_Seiko.wrapPrice());

    warehouse.addItemToKho(tshirt_Owen);
    warehouse.addItemToKho(watch_Seiko);

    List<Product> listItemInWarehouse = warehouse.listAvailableProduct();
    System.out.println("The number of item in Warehouse: " + listItemInWarehouse.size());


  }
}
