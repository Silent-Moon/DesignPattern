package com.anon._4factorypattern.v1_factorymethodpattern;

import com.anon._4factorypattern.v1_factorymethodpattern.factory.ChicagoPizzaStore;
import com.anon._4factorypattern.v1_factorymethodpattern.factory.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(Pizza.Type.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(Pizza.Type.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
