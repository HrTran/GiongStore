package com.giongstore.vn.runner;

import com.giongstore.vn.behavior.observer_pattern.Client;
import com.giongstore.vn.behavior.observer_pattern.PromotionCodes;
import sun.misc.Cleaner;

/**
 * Created by huytt99 on 24/08/19
 */
public class DemoObserver {
    public static void main(String[] args) {
        PromotionCodes promotionCodesSection = new PromotionCodes();
        Client client1 = new Client("Ann");
        Client client2 = new Client("Hugh");
        Client client3 = new Client("Mark");

        promotionCodesSection.subcribe(client1);
        promotionCodesSection.subcribe(client2);

        promotionCodesSection.notifySubcribers();

        promotionCodesSection.updateCode("JD3T2-QH36R-X7W2W-7R3XT-DVRPQ");

    }
}
