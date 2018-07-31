package com.anon._3decoratorpattern;

import com.anon._3decoratorpattern.beverage.DarkRoast;
import com.anon._3decoratorpattern.beverage.Espresso;
import com.anon._3decoratorpattern.beverage.HouseBlend;
import com.anon._3decoratorpattern.condiment.Mocha;
import com.anon._3decoratorpattern.condiment.Soy;
import com.anon._3decoratorpattern.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.Size.GRANDE);
        System.out.println(beverage.getDescription() + " $" + beverage.cost() / 100.0);

        Beverage beverage2 = new DarkRoast(Beverage.Size.TALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost() / 100.0);

        Beverage beverage3 = new HouseBlend(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost() / 100.0);
    }
}
