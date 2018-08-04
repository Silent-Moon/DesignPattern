package com.anon._5singletonpattern.v2;

public class Singleton {
    // Initialized when class is loaded, which guarantees new instance is only created once
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    /**
     * If performance matters, use this one. And this method creates instance eagerly comparing with v1.
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
