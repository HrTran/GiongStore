package com.giongstore.vn.behavior.chain_of_responsibility;

/**
 * Created by huytt99 on 06/08/19
 */
public abstract class Action implements ActionAnalysis {
  boolean reCaptcha;
  protected Container container;

  @Override
  public void actionVerify() {
    if(!reCaptcha) System.out.println("Verify done!");
    else container.actionVerify();
  }

}
