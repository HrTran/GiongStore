package com.giongstore.vn.behavior.memento_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huytt99 on 23/08/19
 */
public class TransactionHistory {
    private List<SpecificSnapshot> transactions;
    private int index;

    public TransactionHistory() {
        this.transactions = new ArrayList<>();
        index = 0;
    }

    public void makeBackup(SpecificSnapshot snapshot) {
        System.out.println("Add transaction " + snapshot.getState().getState() + " to history!");
        transactions.add(snapshot);
        index++;
    }

    public void undo() {
        transactions.get(index-1).restore();
        transactions.remove(index-1);
        index--;
    }
}
