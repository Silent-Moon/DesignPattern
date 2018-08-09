package com.anon._8facadepattern;

public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println("Setting CD player");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Setting DVD player");
    }

    public void setStereoSound() {
        System.out.println("Amplifier is set to stereo sound");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier is set to surround sound");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Setting tuner");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier is setting volume to " + volume);
    }
}
