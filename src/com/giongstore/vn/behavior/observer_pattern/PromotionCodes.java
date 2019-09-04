package com.giongstore.vn.behavior.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huytt99 on 24/08/19
 */
public class PromotionCodes {
    private List<Subcriber> subcribers;
    private String code;

    public PromotionCodes() {
        this.subcribers = new ArrayList<>();
        this.code = "";
    }

    public void subcribe(Subcriber subcriber) {
        subcribers.add(subcriber);
    }

    public void unsubcribe(Subcriber subcriber) {
        subcribers.remove(subcriber);
    }

    public void notifySubcribers() {
        for(Subcriber s : this.subcribers) {
            s.update(this.code);
        }
    }

    public void updateCode(String code) {
        this.code = code;
        notifySubcribers();
    }
}
