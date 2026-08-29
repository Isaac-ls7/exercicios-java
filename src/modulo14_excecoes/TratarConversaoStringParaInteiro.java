package modulo14_excecoes;

import java.util.Scanner;

public class TratarConversaoStringParaInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número digitado elevado ao quadrado: " + (numero * numero));
        } catch (NumberFormatException e) {
            System.out.println("Erro: A entrada '" + entrada + "' não é um número inteiro válido!");
        }

        sc.close();
    }
}