package modulo02_entrada_de_dados;

import java.util.Scanner;

public class CalcularSalarioLiquidoComDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe as horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Informe o valor da hora: R$ ");
        double valorHora = sc.nextDouble();
        System.out.print("Informe a porcentagem de desconto do INSS (%): ");
        double inss = sc.nextDouble();

        double salarioBruto = horas * valorHora;
        double valorInss = salarioBruto * (inss / 100);
        double salarioLiquido = salarioBruto - valorInss;

        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f\n", valorInss);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}