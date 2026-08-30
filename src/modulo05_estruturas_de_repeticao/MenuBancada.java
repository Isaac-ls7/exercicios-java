package modulo05_estruturas_de_repeticao;

import java.util.Scanner;

public class MenuBancada {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("1 - Testar Continuidade");
                System.out.println("2 - Medir Resistência");
                System.out.println("0 - Sair\n");
                System.out.print("Escolha uma opção: ");
                op = ler.nextInt();
            } while (op != 0);

            System.out.println("Saindo do sistema...");
        }
    }
}