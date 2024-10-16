import Interface.DisplayElement;
import Interface.Observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temparature;
    private float humidity;
//    private float pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current Conditions: " + temparature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update() {
        this.temparature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
