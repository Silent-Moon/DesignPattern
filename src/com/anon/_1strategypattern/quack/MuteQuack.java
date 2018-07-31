package com.anon._1strategypattern.quack;

import com.anon._1strategypattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Do nothing, can't quack");
    }
}
