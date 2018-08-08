package com.anon._6commandpattern.receiver;

public class Stereo {
    private String location;
    private int volume;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCd() {
        System.out.println("Putting CD to stereo at " + location);
    }

    public void setDvd() {
    }

    public void setRadio() {
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " stereo volume is set to " + volume);
    }
}
