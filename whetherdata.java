
class WeatherData {
    private double temperature;
    private double humidity;

    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void checkAlert() {
        if (temperature > 40) {
            System.out.println("High Temperature Alert");
        } else if (temperature < 10) {
            System.out.println("Low Temperature Alert");
        } else if (humidity > 80) {
            System.out.println("High Humidity Alert");
        } else {
            System.out.println("Weather is Normal");
        }
    }

    public static void main(String[] args) {
        WeatherData w1 = new WeatherData(45, 60);
        w1.checkAlert();

        WeatherData w2 = new WeatherData(5, 50);
        w2.checkAlert();

        WeatherData w3 = new WeatherData(25, 85);
        w3.checkAlert();

        WeatherData w4 = new WeatherData(25, 60);
        w4.checkAlert();
    }
}