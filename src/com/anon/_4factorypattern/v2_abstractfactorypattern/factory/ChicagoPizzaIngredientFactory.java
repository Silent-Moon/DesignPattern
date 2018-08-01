package com.anon._4factorypattern.v2_abstractfactorypattern.factory;

import com.anon._4factorypattern.v2_abstractfactorypattern.PizzaIngredientFactory;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.cheese.Cheese;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.cheese.Mozzarella;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.clam.Clam;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.clam.FrozenClam;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.dough.Dough;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.dough.ThickCrustDough;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.pepperoni.Pepperoni;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.pepperoni.SlicedPepperoni;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.sauce.PlumTomatoSauce;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.sauce.Sauce;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.veggies.BlackOlives;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.veggies.Eggplant;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.veggies.Spinach;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
