package com.giongstore.vn.behavior.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by huytt99 on 12/08/19
 */
public class NameRepository implements User {
  private List<User> lst_user;

  public NameRepository(List<User> lst_user) {
    this.lst_user = lst_user;
  }

  @Override
  public UserIterator getIterator() {
    return new SellerIterator();
  }

  private class SellerIterator implements UserIterator {
    int index;

    @Override
    public boolean hasNext() {
      return index < lst_user.size() - 1;
    }

    @Override
    public Object next() {
      if(this.hasNext()) return lst_user.get(index+1);
      return null;
    }
  }
}
