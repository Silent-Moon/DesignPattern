package com.anon._3decoratorpattern.condiment;

import com.anon._3decoratorpattern.Beverage;
import com.anon._3decoratorpattern.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        int cost = beverage.cost();
        if (getSize().equals(Size.TALL)) {
            cost += 10;
        } else if (getSize().equals(Size.GRANDE)) {
            cost += 15;
        } else if (getSize().equals(Size.VENTI)) {
            cost += 20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
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
