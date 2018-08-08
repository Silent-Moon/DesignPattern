package com.anon._6commandpattern.receiver;

import static com.anon._6commandpattern.receiver.CeilingFan.Speed.*;

public class CeilingFan {
    private String location;
    private Speed speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
        System.out.println(location + " ceiling fan running in high");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(location + " ceiling fan running in medium");
    }

    public void low() {
        this.speed = LOW;
        System.out.println(location + " ceiling fan running in low");
    }

    public void off() {
        this.speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public Speed getSpeed() {
        return this.speed;
    }

    public enum Speed {
        HIGH, MEDIUM, LOW, OFF
    }
}
