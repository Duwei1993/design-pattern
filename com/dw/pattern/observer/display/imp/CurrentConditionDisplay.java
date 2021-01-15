package dw.pattern.observer.display.imp;

import dw.pattern.observer.display.DisplayElement;
import dw.pattern.observer.observer.Observer;
import dw.pattern.observer.subject.Subject;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: temperature  " + temperature + " humidity  " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
