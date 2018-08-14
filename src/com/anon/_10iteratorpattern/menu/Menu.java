package com.anon._10iteratorpattern.menu;

import java.util.Iterator;

public interface Menu<T> {
    Iterator<T> createIterator();
}
