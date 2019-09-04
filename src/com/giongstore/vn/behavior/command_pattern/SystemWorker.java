package com.giongstore.vn.behavior.command_pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by huytt99 on 21/08/19
 */
public class SystemWorker {

    private Queue<Order> pendingOrder;

    public SystemWorker() {
        pendingOrder = new LinkedList<>();
    }

    public void addOrder(Order order) {
        pendingOrder.add(order);
    }

    public void processOrder() {
        while (pendingOrder.size() > 0) {
            Order order = pendingOrder.poll();
            order.execute();
        }
    }

}
