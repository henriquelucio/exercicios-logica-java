package Exercise17.Main;

// 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * (F-32) / 9)

public class Exercise17 {

    public void print(double fahrenheitTemperatureValue){
        System.out.println("\nThe temperature value in Fahrenheit is: " + fahrenheitTemperatureValue);

        System.out.println("\nConverting temperature...");
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double celsiusTemperatureValue = temperatureConverter.fahrenheitToCelsiusConverter(fahrenheitTemperatureValue);
        String celsiusFormatted = String.format("%.2f", celsiusTemperatureValue);

        System.out.println("\nThe temperature equivalent in Celsius is: " + celsiusFormatted);
    }
}
