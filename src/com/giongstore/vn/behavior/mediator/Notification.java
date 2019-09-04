package com.giongstore.vn.behavior.mediator;

/**
 * Created by huytt99 on 22/08/19
 */
public class Notification implements NotificationCenter {

    public Notification() {

    }


    @Override
    public void getNotification(Subcriber subcriber, String event) {
        if(event.equalsIgnoreCase("subcribe")){
            if(subcriber instanceof Customer ) {
                System.out.println("Subcribe success! You received 3 promotion codes!");
            } else {
                System.out.println("Congratulation! Now you can receive any notification from your customers!");
            }
        }

        if(event.equalsIgnoreCase("unsubcribe")){
            if(subcriber instanceof Customer ) {
                System.out.println("Don't miss out promotion codes and sale campaigns, subcribe now!");
            } else {
                System.out.println("You will not receive any updates from your customers! Subcribe now!");
            }
        }

    }
}
