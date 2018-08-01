package com.anon._4factorypattern.v2_abstractfactorypattern;

import com.anon._4factorypattern.v2_abstractfactorypattern.store.ChicagoPizzaStore;
import com.anon._4factorypattern.v2_abstractfactorypattern.store.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(Pizza.Type.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(Pizza.Type.CLAM);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
