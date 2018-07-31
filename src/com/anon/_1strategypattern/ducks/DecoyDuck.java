package com.anon._1strategypattern.ducks;

import com.anon._1strategypattern.Duck;
import com.anon._1strategypattern.fly.FlyNoWay;
import com.anon._1strategypattern.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Looks like a decoy duck");
    }
}
