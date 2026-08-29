package modulo12_heranca;

class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo) {
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + bonusFixo;
    }
}

public class CalcularFolhaPagamentoFuncionarios {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 2500.0);
        Gerente g = new Gerente("Ana", 5000.0, 1500.0);

        System.out.printf("Salário %s: R$ %.2f\n", f.nome, f.calcularSalarioTotal());
        System.out.printf("Salário Gerente %s: R$ %.2f\n", g.nome, g.calcularSalarioTotal());
    }
}