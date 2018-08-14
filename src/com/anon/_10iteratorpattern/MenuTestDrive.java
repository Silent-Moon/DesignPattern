package com.anon._10iteratorpattern;

import com.anon._10iteratorpattern.menu.DinerMenu;
import com.anon._10iteratorpattern.menu.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
