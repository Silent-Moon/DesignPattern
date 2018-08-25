package com.anon._13proxypattern.remote_proxy_pattern.server;

import com.anon._13proxypattern.remote_proxy_pattern.service.impl.GumballMachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
    // Pre-defined instance creation and registration
    public static void main(String[] args) {
        int count = 250;
        String location = "Seattle";
        try {
            LocateRegistry.createRegistry(1234);
            GumballMachine machine1 = new GumballMachine(location, count);
            Naming.rebind("rmi://172.20.10.2:1234/machine1", machine1);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
