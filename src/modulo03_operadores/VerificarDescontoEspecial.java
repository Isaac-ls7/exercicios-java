package modulo03_operadores;

public class VerificarDescontoEspecial {

    public static void main(String[] args) {
        
        // 1. Dados de entrada
        double valorCompra = 350.0;
        boolean isVip = false;
        
        // 2. Expressão lógica: (valorCompra >= 500) OU (isVip == true)
        // No Java, o operador "OU" é representado por ||
        boolean temDireitoAoDesconto = (valorCompra >= 500.0) || isVip;
        
        // 3. Imprimir o resultado (vai sair true ou false)
        System.out.println("Tem direito ao desconto? " + temDireitoAoDesconto);
    }
}