
package modulo02_entrada_de_dados;
import java.util.Scanner;

public class CalcularDescontoComScanner {

   
    public static void main(String[] args) {
        try(Scanner ler = new Scanner(System.in)){
            System.out.println("Qual o preço original do produto: ");
            double precoOriginalProduto = ler.nextDouble();
            
            System.out.println("Qual o valor do desconto em reais: ");
            double descontoEmReais = ler.nextDouble();
            
            double precoFinal = precoOriginalProduto - descontoEmReais;
            
            System.out.printf("O preço final do produto é: %.2f\n",precoFinal);
        }
    }

}
