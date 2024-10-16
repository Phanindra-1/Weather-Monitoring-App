//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherdata = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherdata);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherdata);

        weatherdata.setMeasurements(80, 65, 30.4f);
    }
}