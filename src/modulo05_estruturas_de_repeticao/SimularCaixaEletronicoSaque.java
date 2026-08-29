package modulo05_estruturas_de_repeticao;

import java.util.Scanner;

public class SimularCaixaEletronicoSaque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PIN_CORRETO = 1234;
        int tentativas = 0;
        boolean acessoConcedido = false;

        while (tentativas < 3) {
            System.out.print("Digite a sua senha de 4 dígitos: ");
            int pin = sc.nextInt();
            tentativas++;

            if (pin == PIN_CORRETO) {
                acessoConcedido = true;
                break;
            } else {
                System.out.println("Senha incorreta! Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (acessoConcedido) {
            System.out.println("Acesso liberado! Escolha a operação de saque.");
        } else {
            System.out.println("Cartão bloqueado devido a 3 tentativas incorretas!");
        }

        sc.close();
    }
}