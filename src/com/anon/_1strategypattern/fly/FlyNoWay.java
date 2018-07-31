package com.anon._1strategypattern.fly;

import com.anon._1strategypattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No way to fly!");
    }
}
