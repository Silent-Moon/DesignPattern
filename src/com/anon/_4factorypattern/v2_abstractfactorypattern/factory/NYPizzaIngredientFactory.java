package com.anon._4factorypattern.v2_abstractfactorypattern.factory;

import com.anon._4factorypattern.v2_abstractfactorypattern.PizzaIngredientFactory;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.cheese.Cheese;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.cheese.ReggianoCheese;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.clam.Clam;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.clam.FreshClam;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.dough.Dough;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.dough.ThinCrustDough;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.pepperoni.Pepperoni;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.pepperoni.SlicedPepperoni;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.sauce.MarinaraSauce;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.sauce.Sauce;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
