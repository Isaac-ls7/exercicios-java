package modulo03_operadores;

import java.util.Scanner;

public class ConverterTemperaturaCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.1f°C equivale a %.1f°F\n", celsius, fahrenheit);

        sc.close();
    }
}