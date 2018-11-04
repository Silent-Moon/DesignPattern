package com.anon._14compoundpattern.ducks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {
    private List<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }

    public Iterator getObservers() {
        return observers.iterator();
    }
}
