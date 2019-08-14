package com.giongstore.vn.creation;

import com.giongstore.vn.behavior.visitor_pattern.ProductVisitor;

/**
 * Created by huytt99 on 6/1/19
 */
public interface Product {

  public String info();
  public Double wrapPrice();
  public String getName();
  public Double getPrice();
  public Video getVideoDescription();
  public void visit(ProductVisitor productVisitor);

}
