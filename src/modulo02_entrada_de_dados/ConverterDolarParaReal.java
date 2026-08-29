
package modulo02_entrada_de_dados;
import java.util.Scanner;

public class ConverterDolarParaReal {

   
    public static void main(String[] args) {
       try( Scanner ler = new Scanner(System.in)){
           System.out.println("Qual a cotação atual do Dólar: ");
           double cotacaoDolar = ler.nextDouble();
           
           System.out.println("Qual valor em Dólar deseja converter: ");
           double valorParaConverter = ler.nextDouble();
           
           double valorEmReais = valorParaConverter * cotacaoDolar;
           
           System.out.printf("O valor em reais é %.2f\n",valorEmReais);
       }
    }

}
