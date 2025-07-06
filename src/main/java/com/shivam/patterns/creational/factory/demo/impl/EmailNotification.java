package com.shivam.patterns.creational.factory.demo.impl;

import com.shivam.patterns.creational.factory.demo.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Email: " + message);
    }
}
