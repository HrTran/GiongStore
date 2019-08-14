package com.giongstore.vn.structure.proxy_pattern;

import com.giongstore.vn.behavior.visitor_pattern.ProductVisitor;
import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.Video;

/**
 * Created by huytt99 on 23/07/19
 */
public class OriginalProduct implements Product {
  private String name;
  private Double price;
  private Video video;

  public OriginalProduct(String name, Double price, Video video) {
    this.name = name;
    this.price = price;
    this.video = video;
    downloadVideo();
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
    return null;
  }

  @Override
  public Double getPrice() {
    return null;
  }

  @Override
  public Video getVideoDescription() {
    return this.video;
  }

  public void downloadVideo(){
    System.out.println("Downloading video...!");
    System.out.println("Complete...! " + video.getName());
  }

  @Override
  public void visit(ProductVisitor productVisitor) {

  }
}
