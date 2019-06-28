package com.giongstore.vn.runner;

import com.giongstore.vn.structural.adapter_pattern.ImportTool;

/**
 * Created by huytt99 on 21/06/19
 */
public class DemoAdapter {
  public static void main(String[] args) {
    ImportTool importTool = new ImportTool();
    importTool.importProduct("Owen T-shirt", "clothes", 23.56);
    importTool.importProduct("Seiko Watch", "watch", 35.56);
  }
}
