package com.anon._3decoratorpattern.condiment;

import com.anon._3decoratorpattern.Beverage;
import com.anon._3decoratorpattern.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
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
