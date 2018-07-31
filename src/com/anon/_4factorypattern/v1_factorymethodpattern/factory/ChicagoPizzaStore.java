package com.anon._4factorypattern.v1_factorymethodpattern.factory;

import com.anon._4factorypattern.v1_factorymethodpattern.Pizza;
import com.anon._4factorypattern.v1_factorymethodpattern.PizzaStore;
import com.anon._4factorypattern.v1_factorymethodpattern.product.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(Pizza.Type type) {
        if (type.equals(Pizza.Type.CHEESE)) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
