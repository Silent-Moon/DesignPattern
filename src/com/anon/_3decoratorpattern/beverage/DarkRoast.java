package com.anon._3decoratorpattern.beverage;

import com.anon._3decoratorpattern.Beverage;

public class DarkRoast extends Beverage {
    private Size size;

    public DarkRoast(Size size) {
        this.size = size;
    }

    @Override
    public int cost() {
        return 99;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
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
