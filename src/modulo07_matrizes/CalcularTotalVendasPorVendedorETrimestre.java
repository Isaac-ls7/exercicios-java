package modulo07_matrizes;

public class CalcularTotalVendasPorVendedorETrimestre {
    public static void main(String[] args) {
        double[][] vendas = {
            {1500.0, 2000.0, 1800.0, 2100.0}, // Vendedor 1
            {1100.0, 1300.0, 1200.0, 1400.0}, // Vendedor 2
            {3000.0, 2800.0, 3100.0, 3500.0}  // Vendedor 3
        };

        for (int i = 0; i < vendas.length; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < vendas[i].length; j++) {
                totalVendedor += vendas[i][j];
            }
            System.out.printf("Total de vendas do Vendedor %d: R$ %.2f\n", (i + 1), totalVendedor);
        }
    }
}