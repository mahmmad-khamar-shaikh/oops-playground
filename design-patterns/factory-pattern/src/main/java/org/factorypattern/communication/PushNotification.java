package org.factorypattern.communication;

public class PushNotification implements INotification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Push notification");
    }
}
