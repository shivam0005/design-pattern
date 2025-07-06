package com.shivam.patterns.creational.factory.demo;

import com.shivam.patterns.creational.factory.demo.factory.EmailNotificationFactory;
import com.shivam.patterns.creational.factory.demo.factory.NotificationFactory;
import com.shivam.patterns.creational.factory.demo.factory.SMSNotificationFactory;

public class NotificationClient {

    public static void main(String[] args) {
        sendNotification(new EmailNotificationFactory(), "Welcome to our platform!");
        sendNotification(new SMSNotificationFactory(), "Your OTP is 456789.");
    }

    private static void sendNotification(NotificationFactory factory, String message){
        Notification notifier = factory.createNotification();
        notifier.notifyUser(message);
    }
}
