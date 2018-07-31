package com.anon._1strategypattern.ducks;

import com.anon._1strategypattern.Duck;
import com.anon._1strategypattern.fly.FlyNoWay;
import com.anon._1strategypattern.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Looks like a rubber duck");
    }
}
