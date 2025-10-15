package tugaspbo_2_mohamadagip;

public class classKonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 55;

        double celsiusToFahrenheit = (C * 9 / 5) + 32;
        double fahrenheitToCelsius = (F - 32) * 5 / 9;
        double celsiusToReamur = C * 4 / 5;
        double reamurToCelsius = (C * 5 / 4);
        double fahrenheitToReamur = (F - 32) * 4 / 9;
        double reamurToFahrenheit = (C * 9 / 4) + 32;
        
        System.out.println("Celsius Ke Fahrenheit = " + celsiusToFahrenheit);
        System.out.println("Fahrenheit Ke Celsius = " + fahrenheitToCelsius);
        System.out.println("Celsius Ke Reamur = " + celsiusToReamur);
        System.out.println("Fahrenheit Ke Reamur = " + fahrenheitToReamur);

    }
}
