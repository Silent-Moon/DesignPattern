package com.anon._8facadepattern;

import com.anon._8facadepattern.facade.HomeTheaterFacade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // Client side have direct access to subsystem classes
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        Tuner tuner = new Tuner();

        // And simplified interface provided by facade class
        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper);
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}
