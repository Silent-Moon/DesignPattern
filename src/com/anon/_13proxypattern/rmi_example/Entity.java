package com.anon._13proxypattern.rmi_example;

import java.io.Serializable;
import java.util.Map;

public class Entity implements Serializable {
    private String id;
    private Map<String, String> map;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        String idString = "Entity ID: " + id + "\n";
        StringBuilder mapString = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mapString.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return idString + mapString;
    }
}
