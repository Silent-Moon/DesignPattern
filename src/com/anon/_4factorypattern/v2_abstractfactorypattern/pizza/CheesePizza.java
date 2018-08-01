package com.anon._4factorypattern.v2_abstractfactorypattern.pizza;

import com.anon._4factorypattern.v2_abstractfactorypattern.Pizza;
import com.anon._4factorypattern.v2_abstractfactorypattern.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory, String name) {
        this.ingredientFactory = ingredientFactory;
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();
    }
}
