package com.anon._4factorypattern.v2_abstractfactorypattern;

/**
 * <code>PizzaStore</code> remains the same as v1
 */
public abstract class PizzaStore {
    public Pizza orderPizza(Pizza.Type type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(Pizza.Type type);
}
