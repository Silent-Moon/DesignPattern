package com.anon._13proxypattern.rmi_example.client;

import com.anon._13proxypattern.rmi_example.Entity;
import com.anon._13proxypattern.rmi_example.service.Service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        try {
            Service service = (Service) Naming.lookup("rmi://172.20.10.2:4567/Service");
            Entity entity = service.getEntity();
            System.out.println(entity);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
