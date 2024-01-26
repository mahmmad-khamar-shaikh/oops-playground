package org.factorypattern.communication;

public class NotificationFactory {
    public INotification createNotification(CommunicationMode channel) {
        if (channel == null) {
            return null;
        }
        return switch (channel) {
            case sms -> new SmsNotification();
            case email -> new EmailNotification();
            case push -> new PushNotification();
            default -> throw new IllegalArgumentException("unknown channel" + channel);
        };

    }
}
