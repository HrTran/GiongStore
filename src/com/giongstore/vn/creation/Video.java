package com.giongstore.vn.creation;

/**
 * Created by huytt99 on 23/07/19
 */
public class Video {
  private String link;
  private String name;

  public Video(String link, String name) {
    this.link = link;
    this.name = name;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
