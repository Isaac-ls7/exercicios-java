package modulo03_operadores;

import java.util.Scanner;

public class TestarTensaoAlimentacao {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Qual a tensão medida: ");
            double tensaoMedia = ler.nextDouble();
            
            boolean tensaoValida = (tensaoMedia >= 4.75 && tensaoMedia <= 5.25);
            
            System.out.println("A tensão é válida? " + tensaoValida);
        }
    }
}