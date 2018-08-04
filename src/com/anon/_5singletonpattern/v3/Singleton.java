package com.anon._5singletonpattern.v3;

public class Singleton {
    /*
     * volatile key word ensures that different threads see the same value.
     * In the booking there is a volatile key word on this field, but I delete it because synchronized
     * block in getInstance() has done the prevention of creating new instance by two threads at a time.
     */
    private static Singleton singleton;

    private Singleton() {
    }

    /**
     * Most sophisticated one, which is efficient and instance is lazily created.
     * <p>
     * Note that there are double checking of null value, the first determine whether to create an instance; the second
     * ensures that only one instance is created.
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
