package com.shivam.patterns.creational.singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton(){
        System.out.println("Instance Created!");
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null){
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
