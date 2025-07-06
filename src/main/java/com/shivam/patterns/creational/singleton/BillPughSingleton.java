package com.shivam.patterns.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("Instance Created");
    }

    // Inner static class responsible for holding the Singleton instance

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}


/*

Why This Works:
    JVM loads the inner class only when it’s first accessed (i.e., on getInstance() call)
    Class loading in Java is guaranteed to be thread-safe

    So:
        The instance is created only once
        It’s lazily loaded
        No need for volatile or synchronization


 */