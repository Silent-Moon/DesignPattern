package com.anon._3decoratorpattern.condiment;

import com.anon._3decoratorpattern.Beverage;
import com.anon._3decoratorpattern.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public void setSize(Size size) {
        throw new UnsupportedOperationException("Unable to set size to condiment");
    }
}
