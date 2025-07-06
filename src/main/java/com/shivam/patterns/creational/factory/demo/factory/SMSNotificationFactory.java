package com.shivam.patterns.creational.factory.demo.factory;

import com.shivam.patterns.creational.factory.demo.Notification;
import com.shivam.patterns.creational.factory.demo.impl.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
