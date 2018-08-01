package com.anon._4factorypattern.v2_abstractfactorypattern;

import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.cheese.Cheese;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.clam.Clam;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.dough.Dough;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.pepperoni.Pepperoni;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.sauce.Sauce;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.veggies.Veggies;

/**
 * Provide an interface for creating a family of products
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clam createClam();
}
