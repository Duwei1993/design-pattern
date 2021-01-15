package dw.pattern.observer.subject.imp;

import dw.pattern.observer.observer.Observer;
import dw.pattern.observer.subject.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.indexOf(observer) >= 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure ){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();;
    }
}
