package dw.pattern.observer.test;

import dw.pattern.observer.display.imp.CurrentConditionDisplay;
import dw.pattern.observer.subject.imp.WeatherData;
/**
* a test class  q
**/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(23.23f,70f,40f);
        weatherData.setMeasurements(20.3f,60f,50f);
    }
}
