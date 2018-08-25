package com.anon._13proxypattern.remote_proxy_pattern.service.impl;

import com.anon._13proxypattern.remote_proxy_pattern.service.GumballMachineRemote;
import com.anon._13proxypattern.remote_proxy_pattern.state.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private String location;
    private int numberOfGumballs;

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State currentState;

    public GumballMachine(String location, int numberOfGumballs) throws RemoteException {
        this.location = location;
        this.numberOfGumballs = numberOfGumballs;

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (numberOfGumballs > 0) {
            this.currentState = noQuarterState;
        } else {
            this.currentState = soldOutState;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void releaseBall() {
        System.out.println("A gumball come rolling out the slot...");
        numberOfGumballs = (numberOfGumballs != 0) ? (numberOfGumballs - 1) : numberOfGumballs;
    }

    /**
     * throw clause specified by <code>GumballMachineRemote</code> is removed
     */

    @Override
    public int getCount() {
        return this.numberOfGumballs;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public State getState() {
        return this.currentState;
    }

    public void setState(State state) {
        this.currentState = state;
    }
}
