package modulo04_estruturas_condicionais;

import java.util.Scanner;

public class SelecionarEscalaMultimetro {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int opcao;

            System.out.println("1 - Tensão Contínua (VDC)");
            System.out.println("2 - Tensão Alternada (VAC)");
            System.out.println("3 - Resistência (Ohms)");
            System.out.println("4 - Corrente (Amperes)");
            System.out.println("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escala selecionada: Tensão Contínua (VDC)");
                    break;
                case 2:
                    System.out.println("Escala selecionada: Tensão Alternada (VAC)");
                    break;
                case 3:
                    System.out.println("Escala selecionada: Resistência (Ohms)");
                    break;
                case 4:
                    System.out.println("Escala selecionada: Corrente (Amperes)");
                    break;
                default:
                    System.out.println("Opção inválida! Seleção fora da escala.");
            }

        }

    }

}
