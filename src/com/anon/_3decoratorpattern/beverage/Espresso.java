package com.anon._3decoratorpattern.beverage;

import com.anon._3decoratorpattern.Beverage;

public class Espresso extends Beverage {
    private Size size;

    public Espresso(Size size) {
        this.size = size;
    }

    @Override
    public int cost() {
        return 199;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }
}
