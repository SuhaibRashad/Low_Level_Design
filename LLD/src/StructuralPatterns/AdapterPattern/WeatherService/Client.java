package StructuralPatterns.AdapterPattern.WeatherService;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        run();
    }
     static void run() {

        Scanner sc = new Scanner(System.in);

        String legacyTemperature = sc.nextLine();
        String legacyCondition = sc.nextLine();

        // Using the legacy weather service with user input
        WeatherService legacyService = new LegacyWeatherService(legacyTemperature, legacyCondition);
        System.out.println("Legacy Weather Service Data:");

        // TODO: Print the weather data retrieved from the Legacy weather service.
        System.out.println(legacyService.getWeatherData());


        String temperature = sc.nextLine();
        String condition = sc.nextLine();

        // TODO: Create an adapter for the new weather service.
        NewWeatherService newWeatherService = new NewWeatherService(temperature,condition);
        WeatherService adaptedService = new NewWeatherServiceAdapter(newWeatherService);

        // WeatherService adaptedService = new NewWeatherServiceAdapter(newService);
        System.out.println("New Weather Service Data:");

        // TODO: Print the weather data retrieved from the new weather service.

        System.out.println(adaptedService.getWeatherData());

        sc.close();
    }
}
