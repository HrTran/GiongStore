package com.giongstore.vn.behavior;

import com.giongstore.vn.behavior.visitor_pattern.ProductVisitor;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.Video;

/**
 * Created by huytt99 on 6/1/19
 */
public class NullProduct implements Product {

  private String nullName;
  private Double nullPrice;

  public NullProduct(String nullName, Double nullPrice) {
    this.nullName = nullName;
    this.nullPrice = nullPrice;
  }

  @Override
  public String info() {
    return "WARNING: The " + nullName + " is not existed";
  }

  @Override
  public Double wrapPrice() {
    return 0D;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public Double getPrice() {
    return null;
  }

  @Override
  public Video getVideoDescription() {
    return null;
  }

  @Override
  public void visit(ProductVisitor productVisitor) {

  }
}
