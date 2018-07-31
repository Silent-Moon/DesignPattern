package com.anon._2observerpattern;

import java.util.Observable;

public class WeatherData extends Observable {
    private Measurements measurements;

    public WeatherData() {
        measurements = new Measurements();
    }

    /**
     * This method gets called whenever state is changed.
     */
    public void measurementsChanged() {
        setChanged();
        /* There are Push/Pull models available by resorting to Java's built-in support, we use Pull model here.
         * Pull model: observer pulls state change from observable object;
         * Push model: observable object pushes state change to observer.
         */
        notifyObservers();
    }

    public Measurements getMeasurements() {
        return measurements;
    }

    public void setMeasurements(Measurements measurements) {
        if (!this.measurements.equals(measurements)) {
            this.measurements = measurements;
            measurementsChanged();
        }
    }

    public static class Measurements {
        private float temperature;
        private float humidity;
        private float pressure;

        public Measurements() {
        }

        public Measurements(float temperature, float humidity, float pressure) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
        }

        public float getTemperature() {
            return temperature;
        }

        public void setTemperature(float temperature) {
            this.temperature = temperature;
        }

        public float getHumidity() {
            return humidity;
        }

        public void setHumidity(float humidity) {
            this.humidity = humidity;
        }

        public float getPressure() {
            return pressure;
        }

        public void setPressure(float pressure) {
            this.pressure = pressure;
        }
    }
}
