package com.anon._14compoundpattern.ducks;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
