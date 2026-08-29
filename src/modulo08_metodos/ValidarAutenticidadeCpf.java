package modulo08_metodos;

import java.util.Scanner;

public class ValidarAutenticidadeCpf {

    public static boolean eCpfValido(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
        return cpf.length() == 11;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF para validação: ");
        String documento = sc.nextLine();

        if (eCpfValido(documento)) {
            System.out.println("Formato de CPF válido!");
        } else {
            System.out.println("Formato de CPF inválido! Deve conter 11 dígitos.");
        }

        sc.close();
    }
}