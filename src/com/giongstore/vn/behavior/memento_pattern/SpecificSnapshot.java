package com.giongstore.vn.behavior.memento_pattern;

/**
 * Created by huytt99 on 23/08/19
 */
public class SpecificSnapshot implements TransactionSnapshot {
    private SpecificTransaction transaction;
    private State state;

    public SpecificSnapshot(SpecificTransaction transaction, State state) {
        this.transaction = transaction;
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void restore(){
        transaction.setState(state);
    }

}
