package modulo01_fundamentos;

public class CalcularValorTotalEstoque {

    public static void main(String[] args) {
        // Declaração de variáveis
        String nomePeca = "Tela Frontal Moto G32";
        int quantidade = 8;
        double precoUnitario = 120.50;

        // Cálculo do valor total
        double valorTotal = quantidade * precoUnitario;

        // Exibição dos resultados
        System.out.println("--- RELATÓRIO DE ESTOQUE ---");
        System.out.println("Peça: " + nomePeca);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Valor total em estoque: R$ %.2f\n", valorTotal);
    }
}