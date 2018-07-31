package com.anon._3decoratorpattern.beverage;

import com.anon._3decoratorpattern.Beverage;

public class Decaf extends Beverage {
    private Size size;

    public Decaf(Size size) {
        this.size = size;
    }

    @Override
    public int cost() {
        return 105;
    }

    @Override
    public String getDescription() {
        return "Decaf";
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
