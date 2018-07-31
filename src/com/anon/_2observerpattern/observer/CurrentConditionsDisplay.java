package com.anon._2observerpattern.observer;

import com.anon._2observerpattern.DisplayElement;
import com.anon._2observerpattern.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private WeatherData.Measurements measurements;

    public CurrentConditionsDisplay() {
    }

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + measurements.getTemperature() + "F degrees and " + measurements.getHumidity() + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.measurements = ((WeatherData) o).getMeasurements();
            display();
        }
    }
}
