package com.anon._9templatemethodpattern;

public abstract class CaffeineBeverageWithHook {
    protected void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected boolean customerWantsCondiments() {
        return true;
    }
}
