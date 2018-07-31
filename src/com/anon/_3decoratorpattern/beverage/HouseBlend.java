package com.anon._3decoratorpattern.beverage;

import com.anon._3decoratorpattern.Beverage;

public class HouseBlend extends Beverage {
    private Size size;

    public HouseBlend(Size size) {
        this.size = size;
    }

    @Override
    public int cost() {
        return 89;
    }

    @Override
    public String getDescription() {
        return "House Blend";
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
