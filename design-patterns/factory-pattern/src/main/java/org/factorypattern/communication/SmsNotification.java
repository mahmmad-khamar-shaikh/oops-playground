package org.factorypattern.communication;

public class SmsNotification implements INotification{

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
