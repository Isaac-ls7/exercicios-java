package modulo11_encapsulamento;

class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}

public class GerenciarOperacoesContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("4589-X", 500.0);
        conta.depositar(250.0);

        if (conta.sacar(100.0)) {
            System.out.println("Saque efetuado com sucesso!");
        }

        System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
    }
}