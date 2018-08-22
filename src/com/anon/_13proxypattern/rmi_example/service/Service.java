package com.anon._13proxypattern.rmi_example.service;

import com.anon._13proxypattern.rmi_example.Entity;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {
    Entity getEntity() throws RemoteException;
}
