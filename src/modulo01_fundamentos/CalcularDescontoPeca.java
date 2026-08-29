package modulo01_fundamentos;

public class CalcularDescontoPeca {

    public static void main(String[] args) {
        double valorOriginal = 180.0;
        
        double descontoAvista = 25.0;
        
        double valorFinal = valorOriginal - descontoAvista;
        
        System.out.printf("O valor final é: %.2f\n",valorFinal);

    }
}
