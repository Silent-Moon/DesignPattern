package com.anon._10iteratorpattern;

import com.anon._10iteratorpattern.menu.Menu;
import com.anon._10iteratorpattern.menu.MenuItem;

import java.util.Iterator;

public class Waitress {
    private Menu<MenuItem> pancakeHouseMenu;
    private Menu<MenuItem> dinerMenu;

    public Waitress(Menu<MenuItem> pancakeHouseMenu, Menu<MenuItem> dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator<MenuItem> itemIterator) {
        while (itemIterator.hasNext()) {
            MenuItem menuItem = itemIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
