package com.giongstore.vn.creation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huytt99 on 20/06/19
 */
public class FashionCache {
  private Map<Integer, Product> fashionCache = new HashMap<>();

  public Product getProduct(Integer productId) {
    return fashionCache.get(productId);
  }

  // load data from datasource such as DB, text file
  public void loadProduct() {
    Clothes owenTshirt = new Clothes("Owen T-shirt", 20.56);
    fashionCache.put(1, owenTshirt);

    Watches seikoWatch = new Watches("Seiko Watch", 16.58);
    fashionCache.put(2, seikoWatch);
  }
}
