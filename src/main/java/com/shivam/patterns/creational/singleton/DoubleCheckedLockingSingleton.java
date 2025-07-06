package com.shivam.patterns.creational.singleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){
        System.out.println("Instance Created!");
    }

    public static DoubleCheckedLockingSingleton getInstance() {

        if (instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return instance;
    }
}
