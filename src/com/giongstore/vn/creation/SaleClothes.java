package com.giongstore.vn.creation;

/**
 * Created by huytt99 on 6/1/19
 */
public class SaleClothes extends Fashion {
  private String saleName;
  private Double salePrice;

  public SaleClothes(String saleName, Double salePrice) {
    this.saleName = saleName;
    this.salePrice = salePrice;
  }

  @Override
  public String getName() {
    return saleName;
  }

  public void setName(String saleName) {
    this.saleName = saleName;
  }

  @Override
  public Double getPrice() {
    return salePrice;
  }

  public void setPrice(Double salePrice) {
    this.salePrice = salePrice;
  }

  @Override
  public String info() {
    return "* Clothes:\n" +
      "    |_ name: " + saleName + "\n"+
      "    |_ sale price: " + salePrice + "\n";
  }

  @Override
  public Double wrapPrice() {
    return (salePrice + 1.65);
  }
}
