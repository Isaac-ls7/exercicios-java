package modulo05_estruturas_de_repeticao;

import java.util.Scanner;

public class MonitorarCorrente {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            double corrente = -1; // Inicializado com um valor diferente de 0 para entrar no loop

            while (corrente != 0) {
                System.out.print("Digite a corrente em Amperes (0 para sair): ");
                corrente = ler.nextDouble();

                if (corrente != 0) {
                    System.out.printf("Corrente detectada: %.2f A%n%n", corrente);
                }
            }

            System.out.println("Circuito desligado (0.0A). Encerrando monitoramento.");
        }
    }
}