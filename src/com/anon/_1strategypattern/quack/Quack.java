package com.anon._1strategypattern.quack;

import com.anon._1strategypattern.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacks like duck");
    }
}
