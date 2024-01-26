package org.factorypattern.communication;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to factory pattern!!!!");

        NotificationFactory notificationFactory = new NotificationFactory();
        INotification notification = notificationFactory.createNotification(CommunicationMode.sms);
        notification.notifyUser();
    }
}