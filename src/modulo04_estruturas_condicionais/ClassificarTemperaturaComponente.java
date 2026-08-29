package modulo04_estruturas_condicionais;

import java.util.Scanner;

public class ClassificarTemperaturaComponente {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em graus Celcius: ");
            double temperatura = ler.nextDouble();

            if (temperatura <= 40.0) {
                System.out.println("Temperatura normal / operacional");
            } else if (temperatura > 40.0 && temperatura <= 75.0) {
                System.out.println("Atenção: Elevação de temperatura");
            } else {
                System.out.println("Perigo: Superaquecimento! Desligando sistema.");
            }
        }
    }

}
