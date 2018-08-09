package com.anon._8facadepattern;

public class Projector {
    private DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void tvMode() {

    }

    public void wideScreenMode() {
        System.out.println("Projector switched to wide screen mode");
    }
}
