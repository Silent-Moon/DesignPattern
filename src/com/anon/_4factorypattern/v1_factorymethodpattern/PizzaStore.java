package com.anon._4factorypattern.v1_factorymethodpattern;

public abstract class PizzaStore {
    public Pizza orderPizza(Pizza.Type type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * Factory method, which cares about the object instantiation of concrete class of <code>Pizza</code>
     */
    public abstract Pizza createPizza(Pizza.Type type);
}
