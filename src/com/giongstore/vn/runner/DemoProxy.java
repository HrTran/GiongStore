package com.giongstore.vn.runner;

import com.giongstore.vn.creation.Product;
import com.giongstore.vn.creation.Video;
import com.giongstore.vn.structure.proxy_pattern.ProductWithVideo;

/**
 * Created by huytt99 on 23/07/19
 */
public class DemoProxy {
  public static void main(String[] args) {
    Video videoSeikoWatch = new Video("http://server:port/resources/video/seiko-watch.avi", "seiko-watch.avi");
    Product productA = new ProductWithVideo("seiko watch", 25.54, videoSeikoWatch);

    System.out.println("1st call - Video is downloaded and return: " + productA.getVideoDescription().getName());

    System.out.println("2nd call - Video won't be downloaded again: " + productA.getVideoDescription().getName());
  }
}
