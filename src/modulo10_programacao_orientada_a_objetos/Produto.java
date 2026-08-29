package modulo10_programacao_orientada_a_objetos;

class Produto {
    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Estoque insuficiente para a saída!");
        }
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }
}

public class GerenciarEstoqueProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Teclado Mecânico";
        p.preco = 150.0;
        p.quantidade = 10;

        p.adicionarEstoque(5);
        System.out.printf("Produto: %s | Qtd: %d | Total: R$ %.2f\n", p.nome, p.quantidade, p.valorTotalEmEstoque());
    }
}