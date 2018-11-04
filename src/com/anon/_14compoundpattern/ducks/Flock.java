package com.anon._14compoundpattern.ducks;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> ducks = new ArrayList<>();

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    public void quack() {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

    public void registerObserver(Observer observer) {
        for (Quackable duck : ducks) {
            duck.registerObserver(observer);
        }
    }

    public void notifyObservers() {
    }

    public String toString() {
        return "Flock of Ducks";
    }
}
