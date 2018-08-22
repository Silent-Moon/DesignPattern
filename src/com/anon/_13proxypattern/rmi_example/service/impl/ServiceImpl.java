package com.anon._13proxypattern.rmi_example.service.impl;

import com.anon._13proxypattern.rmi_example.Entity;
import com.anon._13proxypattern.rmi_example.service.Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ServiceImpl extends UnicastRemoteObject implements Service {
    public ServiceImpl() throws RemoteException {
    }

    @Override
    public Entity getEntity() throws RemoteException {
        // Return a pre-defined Entity instance
        Entity entity = new Entity();
        entity.setId(UUID.randomUUID().toString());
        Map<String, String> map = new HashMap<>();
        map.put("serverIP", "172.20.10.2");
        map.put("serverName", "DESKTOP-BLJLP0P");
        map.put("serverTime", new Date().toString());
        entity.setMap(map);
        return entity;
    }
}
