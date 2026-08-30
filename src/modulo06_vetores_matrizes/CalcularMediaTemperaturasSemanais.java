package modulo06_vetores_matrizes;

import java.util.Scanner;

public class CalcularMediaTemperaturasSemanais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temps = new double[7];
        double soma = 0;

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Temperatura do dia " + (i + 1) + ": ");
            temps[i] = sc.nextDouble();
            soma += temps[i];
        }

        double media = soma / temps.length;
        int diasAcimaMedia = 0;

        for (double t : temps) {
            if (t > media) diasAcimaMedia++;
        }

        System.out.printf("\nMédia semanal: %.1f°C\n", media);
        System.out.println("Dias com temperatura acima da média: " + diasAcimaMedia);

        sc.close();
    }
}