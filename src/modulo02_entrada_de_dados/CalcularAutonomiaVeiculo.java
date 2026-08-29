
package modulo02_entrada_de_dados;
import java.util.Scanner;

public class CalcularAutonomiaVeiculo {

   
    public static void main(String[] args) {
        try(Scanner ler = new Scanner(System.in)){
            System.out.println("Qual a distancia total percorrida: ");
            double distanciaTotalPercorrida = ler.nextDouble();
            
            System.out.println("Qual a quantidade de combustivel gasto: ");
            double quantidadeCombustivelGasto = ler.nextDouble();
            
            double autonomiaMedia = distanciaTotalPercorrida / quantidadeCombustivelGasto;
            
            System.out.printf("A autonomia média é: %.2f\n",autonomiaMedia);
            
        }
    }

}
