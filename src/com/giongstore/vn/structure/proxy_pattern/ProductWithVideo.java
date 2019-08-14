package com.giongstore.vn.structure.proxy_pattern;

import com.giongstore.vn.behavior.visitor_pattern.ProductVisitor;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.Video;

/**
 * Created by huytt99 on 23/07/19
 */
public class ProductWithVideo implements Product {

  private String name;
  private Double price;
  private Video video;
  private OriginalProduct product;

  public ProductWithVideo(String name, Double price, Video video) {
    this.name = name;
    this.price = price;
    this.video = video;
  }

  @Override
  public String info() {
    return null;
  }

  @Override
  public Double wrapPrice() {
    return null;
  }

  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public Video getVideoDescription() {
    if(product == null) {
      product = new OriginalProduct(name, price, video);
    }
    return product.getVideoDescription();
  }

  public void setVideo(Video video) {
    this.video = video;
  }

  @Override
  public void visit(ProductVisitor productVisitor) {

  }
}
