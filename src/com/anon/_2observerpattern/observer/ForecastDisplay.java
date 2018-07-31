package com.anon._2observerpattern.observer;

import com.anon._2observerpattern.DisplayElement;
import com.anon._2observerpattern.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private Observable observable;
    private WeatherData.Measurements measurements;

    public ForecastDisplay() {
    }

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast display...");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.measurements = ((WeatherData) o).getMeasurements();
            display();
        }
    }
}
