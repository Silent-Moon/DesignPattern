package com.anon._8facadepattern;

public class TheaterLights {
    public void on() {
        System.out.println("Theater light is on");
    }

    public void off() {
        System.out.println("Theater light is off");
    }

    public void dim(int percent) {
        System.out.println("Theater light dimmed to " + percent);
    }
}
