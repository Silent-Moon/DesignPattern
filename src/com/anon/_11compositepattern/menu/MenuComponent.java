package com.anon._11compositepattern.menu;

import java.util.Iterator;

/**
 * In Java 1.8 multi-inheritance can be implemented by interfaces
 */
public interface MenuComponent extends CRUDOperation<MenuComponent>, Describable {
    @Override
    default void add(MenuComponent obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    default void remove(MenuComponent obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    default void update(MenuComponent obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    default MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    default String getDescription() {
        throw new UnsupportedOperationException();
    }

    @Override
    default void print() {
        throw new UnsupportedOperationException();
    }

    Iterator<MenuComponent> createIterator();

    default String getName() {
        throw new UnsupportedOperationException();
    }

    default double getPrice() {
        throw new UnsupportedOperationException();
    }

    default boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
}
