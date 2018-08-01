package com.anon._4factorypattern.v2_abstractfactorypattern.store;

import com.anon._4factorypattern.v2_abstractfactorypattern.Pizza;
import com.anon._4factorypattern.v2_abstractfactorypattern.PizzaIngredientFactory;
import com.anon._4factorypattern.v2_abstractfactorypattern.PizzaStore;
import com.anon._4factorypattern.v2_abstractfactorypattern.factory.ChicagoPizzaIngredientFactory;
import com.anon._4factorypattern.v2_abstractfactorypattern.pizza.CheesePizza;
import com.anon._4factorypattern.v2_abstractfactorypattern.pizza.ClamPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(Pizza.Type type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory, "Chicago Style Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory, "Chicago Style Clam Pizza");
                break;
        }
        return pizza;
    }
}
