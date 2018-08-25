package com.anon._13proxypattern.remote_proxy_pattern.service;

import com.anon._13proxypattern.remote_proxy_pattern.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
