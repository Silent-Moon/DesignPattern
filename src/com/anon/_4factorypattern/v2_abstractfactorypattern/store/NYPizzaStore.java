package com.anon._4factorypattern.v2_abstractfactorypattern.store;

import com.anon._4factorypattern.v2_abstractfactorypattern.Pizza;
import com.anon._4factorypattern.v2_abstractfactorypattern.PizzaIngredientFactory;
import com.anon._4factorypattern.v2_abstractfactorypattern.PizzaStore;
import com.anon._4factorypattern.v2_abstractfactorypattern.factory.NYPizzaIngredientFactory;
import com.anon._4factorypattern.v2_abstractfactorypattern.pizza.CheesePizza;
import com.anon._4factorypattern.v2_abstractfactorypattern.pizza.ClamPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(Pizza.Type type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory, "New York Style Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory, "New York Style Clam Pizza");
                break;
        }
        return pizza;
    }
}
