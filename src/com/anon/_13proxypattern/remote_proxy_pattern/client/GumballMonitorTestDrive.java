package com.anon._13proxypattern.remote_proxy_pattern.client;

import com.anon._13proxypattern.remote_proxy_pattern.service.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] remoteMachineLocators = {"rmi://172.20.10.2:1234/machine1"};
        GumballMonitor[] monitors = new GumballMonitor[remoteMachineLocators.length];

        for (int i = 0; i < remoteMachineLocators.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(remoteMachineLocators[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            } catch (NotBoundException | MalformedURLException | RemoteException e) {
                e.printStackTrace();
            }
        }

        for (GumballMonitor monitor : monitors) {
            monitor.report();
        }
    }
}
