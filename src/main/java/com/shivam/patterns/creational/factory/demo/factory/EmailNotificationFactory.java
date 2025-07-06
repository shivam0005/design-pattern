package com.shivam.patterns.creational.factory.demo.factory;

import com.shivam.patterns.creational.factory.demo.Notification;
import com.shivam.patterns.creational.factory.demo.impl.EmailNotification;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
