package modulo06_vetores_matrizes;

import java.util.Scanner;

public class ArmazenarTensoes {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            // 1. Criamos um vetor do tipo double com 4 posições (índices de 0 a 3)
            double[] tensoes = new double[4];

            System.out.println("=== LEITURA DAS TENSÕES ===");
            // 2. Laço 'for' para preencher o vetor com as entradas do usuário
            for (int i = 0; i < tensoes.length; i++) {
                System.out.print("Digite o valor da tensão " + (i + 1) + " (em Volts): ");
                tensoes[i] = ler.nextDouble();
            }

            System.out.println("\n=== RESULTADO DAS LEITURAS ===");
            // 3. Laço 'for' para exibir o conteúdo armazenado no vetor
            for (int i = 0; i < tensoes.length; i++) {
                System.out.printf("Leitura [%d]: %.2f V%n", i, tensoes[i]);
            }
        }
    }
}