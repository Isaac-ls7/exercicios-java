
package modulo02_entrada_de_dados;
import java.util.Scanner;

public class CalcularOrcamentoAssistecia {

   
    public static void main(String[] args) {
        try(Scanner ler = new Scanner(System.in)){
            System.out.println("Qual o valor da peça de reposição: ");
            double valorPecaReposicao = ler.nextDouble();
            
            System.out.println("Qual valor da mão de obra: ");
            double valorMaodeObra = ler.nextDouble();
            
            System.out.println("Qual o valor da taxa de entrega: ");
            double valorTaxaEntrega = ler.nextDouble();
            
            double orcamentoFinal = valorPecaReposicao + valorMaodeObra +valorTaxaEntrega;
            
            System.out.printf("O orçameto final fica: %.2f\n",orcamentoFinal);
        }
    }

}
