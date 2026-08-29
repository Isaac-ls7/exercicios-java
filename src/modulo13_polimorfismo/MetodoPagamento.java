package modulo13_polimorfismo;

interface MetodoPagamento {
    double processar(double valor);
}

class PagamentoPix implements MetodoPagamento {
    @Override
    public double processar(double valor) {
        return valor * 0.95; // 5% de desconto no PIX
    }
}

class PagamentoCartaoCredito implements MetodoPagamento {
    @Override
    public double processar(double valor) {
        return valor * 1.02; // 2% de taxa do cartão
    }
}

public class ProcessarPagamentosDiferenciados {
    public static void main(String[] args) {
        double valorCompra = 100.00;

        MetodoPagamento pix = new PagamentoPix();
        MetodoPagamento cartao = new PagamentoCartaoCredito();

        System.out.printf("Total no PIX: R$ %.2f\n", pix.processar(valorCompra));
        System.out.printf("Total no Cartão: R$ %.2f\n", cartao.processar(valorCompra));
    }
}