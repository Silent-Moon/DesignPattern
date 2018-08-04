package com.anon._5singletonpattern.v1;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    /**
     * Universal one for common purpose singleton implementation, if performance is not in consideration.
     * <p>
     * <code>synchronized</code> key word here ensures that no two threads can access this method at the same time. For
     * many cases, if constructing a new instance is not a time consuming job, <code>synchronized</code> does not make
     * much difference, but if it is, then this key word is required to make sure that only one instance is constructed.
     */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
