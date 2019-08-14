package com.giongstore.vn.structure.adapter_pattern;

/**
 * Created by huytt99 on 20/06/19
 */
public class ImportTool implements AlibabaProduct {
  private ProductAdapter productAdapter;

  public void importProduct(String productName, String productType, Double productPrice) {
    productAdapter = new ProductAdapter(productType, productName, productPrice);
    System.out.printf("\nImporting %s....\n", name());
    System.out.printf("Import success!\n - Item name: %s\n - Item price: %f\n - Item desc:\n\t%s\n", name(), price(), desc());
  }

  @Override
  public String name() {
    return productAdapter.name();
  }

  @Override
  public String desc() {
    return productAdapter.desc();
  }

  @Override
  public Double price() {
    return productAdapter.price();
  }
}
