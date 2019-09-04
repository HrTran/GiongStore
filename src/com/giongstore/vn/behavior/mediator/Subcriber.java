package com.giongstore.vn.behavior.mediator;

/**
 * Created by huytt99 on 22/08/19
 */
public abstract class Subcriber {
    private NotificationCenter notificationCenter;

    public Subcriber(NotificationCenter notificationCenter) {
        this.notificationCenter = notificationCenter;
    }


    public void subcribe() {
        notificationCenter.getNotification(this, "subcribe");
    }

    public void unsubcribe() {
        notificationCenter.getNotification(this, "unsubcribe");
    }
}
