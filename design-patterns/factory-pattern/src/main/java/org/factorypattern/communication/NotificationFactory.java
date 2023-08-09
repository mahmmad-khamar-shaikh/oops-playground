package org.factorypattern.communication;

public class NotificationFactory {
    public INotification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }

        return switch (channel) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("unknown channel" + channel);
        };

    }
}
