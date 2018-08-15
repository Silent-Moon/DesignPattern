package com.anon._11compositepattern.menu;

import com.anon._11compositepattern.iteration.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }


    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
