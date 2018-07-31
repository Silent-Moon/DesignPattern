package com.anon._2observerpattern;

import com.anon._2observerpattern.observer.CurrentConditionsDisplay;
import com.anon._2observerpattern.observer.ForecastDisplay;
import com.anon._2observerpattern.observer.StatisticsDisplay;

/**
 * This is the entry point of the whole Observer Patter Sample.
 * <p>
 * I use Java's built-in support to implement Observer Pattern, but it may be not the best practice to fit in all applications,
 * because built-in support has drawbacks.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        WeatherData.Measurements measurements = new WeatherData.Measurements(80, 65, 30.4f);
        weatherData.setMeasurements(measurements);
        measurements = new WeatherData.Measurements(79, 64, 30.4f);
        weatherData.setMeasurements(measurements);
    }
}
