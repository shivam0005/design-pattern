package com.shivam.patterns.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Runnable task = () -> {

            BasicSingleton instance = BasicSingleton.getInstance();
            System.out.println("Got instance: " + instance.hashCode());
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}

/*

coz it's not thread-safe

You should see different hashcodes if both threads create different instances.

 */