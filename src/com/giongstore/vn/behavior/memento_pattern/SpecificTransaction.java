package com.giongstore.vn.behavior.memento_pattern;

/**
 * Created by huytt99 on 23/08/19
 */
public class SpecificTransaction implements Transaction {
    private State state;


    public TransactionSnapshot save() {
        return new SpecificSnapshot(this, state);
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
