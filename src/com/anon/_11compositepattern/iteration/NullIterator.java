package com.anon._11compositepattern.iteration;

import com.anon._11compositepattern.menu.MenuComponent;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
