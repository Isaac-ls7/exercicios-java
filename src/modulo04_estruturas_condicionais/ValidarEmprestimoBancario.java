package modulo04_estruturas_condicionais;

import java.util.Scanner;

public class ValidarEmprestimoBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: R$ ");
        double salario = sc.nextDouble();
        System.out.print("Digite o valor da parcela pretendida: R$ ");
        double parcela = sc.nextDouble();

        double limiteMaximo = salario * 0.30;

        if (parcela <= limiteMaximo) {
            System.out.println("Empréstimo APROVADO!");
        } else {
            System.out.printf("Empréstimo NEGADO! Parcela máxima permitida: R$ %.2f\n", limiteMaximo);
        }

        sc.close();
    }
}