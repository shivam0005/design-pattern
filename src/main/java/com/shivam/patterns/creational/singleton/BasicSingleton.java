package com.shivam.patterns.creational.singleton;

/*
Basic Lazy Singleton (Not Thread Safe)

This is the simplest form: the instance
is created only when needed ("lazy"),
but it is not thread-safe.

 */


public class BasicSingleton {

    private static BasicSingleton _instance;

    private BasicSingleton(){
        System.out.println("Instance Created.");
    }

    public static BasicSingleton getInstance(){
        if(_instance == null){
            _instance = new BasicSingleton();
        }

        return _instance;
    }
}
