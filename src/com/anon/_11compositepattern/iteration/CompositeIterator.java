package com.anon._11compositepattern.iteration;

import com.anon._11compositepattern.menu.Menu;
import com.anon._11compositepattern.menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                // Current iterator exhausted, go for next iterator in the stack
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }
        return null;
    }
}
