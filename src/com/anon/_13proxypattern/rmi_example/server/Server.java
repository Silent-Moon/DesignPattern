package com.anon._13proxypattern.rmi_example.server;

import com.anon._13proxypattern.rmi_example.service.Service;
import com.anon._13proxypattern.rmi_example.service.impl.ServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    /**
     * It is always recommended to catch exception in entry method rather than adding throw clause to method signature.
     * Due to main method is invoked by JVM, if exception is propagated up, the thread running this main method is
     * terminated as there is no exception handler.
     */
    public static void main(String[] args) {
        try {
            Service service = new ServiceImpl();
            // Assume the port number is not used by other process
            LocateRegistry.createRegistry(4567);
            // Change the IP to your real IP in LAN
            Naming.rebind("rmi://172.20.10.2:4567/Service", service);
            System.out.println("Server is running...");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
