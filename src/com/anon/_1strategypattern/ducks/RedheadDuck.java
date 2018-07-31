package com.anon._1strategypattern.ducks;

import com.anon._1strategypattern.Duck;
import com.anon._1strategypattern.fly.FlyWithWings;
import com.anon._1strategypattern.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Looks like a redhead");
    }
}
