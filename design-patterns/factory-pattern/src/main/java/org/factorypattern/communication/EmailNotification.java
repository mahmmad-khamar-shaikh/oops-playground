package org.factorypattern.communication;

public class EmailNotification implements INotification{
    @Override
    public void notifyUser() {
        System.out.println("Sending email notification");

    }
}
