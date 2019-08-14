package com.giongstore.vn.behavior.chain_of_responsibility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huytt99 on 12/08/19
 */
public abstract class Container extends Action {
  List<Action> lst_action = new ArrayList<>();

  public void add(Action action) {
    lst_action.add(action);
    action.container = this;

  }
}
