import java.util.Scanner;

class WeatherData {
    private double temperature;
    private double humidity;

    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String checkAlert() {
        String alert = "";

        if (temperature > 40) {
            alert += "High Temperature Alert";
        } else if (temperature < 10) {
            alert += "Low Temperature Alert";
        }

        if (humidity > 80) {
            if (!alert.isEmpty()) {45
                alert += " and ";
            }
            alert += "High Humidity Alert";
        }

        if (alert.isEmpty()) {
            alert = "Weather is Normal";
        }

        return alert;
    }

    public void displayReport() {
        System.out.println("\nWeather Report");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Alert: " + checkAlert());
    }
}

public class WeatherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter Humidity: ");
        double humidity = sc.nextDouble();

        WeatherData weather = new WeatherData(temperature, humidity);

        weather.displayReport();

        sc.close();
    }
}