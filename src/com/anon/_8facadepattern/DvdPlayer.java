package com.anon._8facadepattern;

public class DvdPlayer {
    private Amplifier amplifier;

    public void on() {
        System.out.println("DVD player is on");
    }

    public void off() {
        System.out.println("DVD player is off");
    }

    public void eject() {
        System.out.println("DVD ejected");
    }

    public void pause() {
        System.out.println("DVD player is paused");
    }

    public void play(String movie) {
        System.out.println("DVD player is playing " + movie);
    }

    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

    public void stop() {
        System.out.println("DVD player stopped");
    }
}
