package com.giongstore.vn.creation;

/**
 * Created by huytt99 on 6/1/19
 */
public class Watches extends Accesories {
  private String name;
  private Double price;

  public Watches(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String info() {
    return "* Watches: \n" +
      "    |_ name: " + name + "\n"+
      "    |_ price: " + price;
  }

  @Override
  public Double wrapPrice() {
    return (price + 2.12);
  }
}
