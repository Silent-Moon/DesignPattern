package com.anon._4factorypattern.v2_abstractfactorypattern;

import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.cheese.Cheese;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.clam.Clam;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.dough.Dough;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.pepperoni.Pepperoni;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.sauce.Sauce;
import com.anon._4factorypattern.v2_abstractfactorypattern.ingredient.veggies.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 20 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public enum Type {
        CHEESE, VEGGIE, CLAM, PEPPERONI
    }
}
