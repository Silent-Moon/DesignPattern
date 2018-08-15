package com.anon._11compositepattern.menu;

public interface CRUDOperation<T> {
    void add(T obj);

    void remove(T obj);

    void update(T obj);

    T getChild(int i);
}
