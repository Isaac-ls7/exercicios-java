package modulo06_vetores_matrizes;

import java.util.Scanner;

public class AnaliseCorrentes {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            double[] correntes = new double[5];
            double soma = 0;

            for (int i = 0; i < correntes.length; i++) {
                System.out.print("Digite o valor da " + (i + 1) + "ª corrente: ");
                correntes[i] = ler.nextDouble();
                soma += correntes[i];
            }

            double mediaCorrente = soma / correntes.length;
            double maior = correntes[0]; // Inicializa com o primeiro elemento do vetor

            for (int i = 1; i < correntes.length; i++) {
                if (correntes[i] > maior) {
                    maior = correntes[i];
                }
            }

            System.out.println("\n=== RESULTADO DA ANÁLISE ===");
            System.out.printf("Média das correntes: %.2f A%n", mediaCorrente);
            System.out.printf("Maior corrente registrada: %.2f A%n", maior);
        } 
    }
}