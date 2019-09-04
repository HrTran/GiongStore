package com.giongstore.vn.behavior.memento_pattern;

/**
 * Created by huytt99 on 23/08/19
 */
public interface Transaction {
    public TransactionSnapshot save();
}
