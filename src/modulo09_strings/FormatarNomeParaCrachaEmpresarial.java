package modulo09_strings;

import java.util.Scanner;

public class FormatarNomeParaCrachaEmpresarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome completo do funcionário: ");
        String nomeCompleto = sc.nextLine().trim();

        String[] partes = nomeCompleto.split("\\s+");
        if (partes.length >= 2) {
            String primeiroNome = partes[0];
            String ultimoSobrenome = partes[partes.length - 1];

            String formatado = ultimoSobrenome.toUpperCase() + ", " + primeiroNome.substring(0, 1).toUpperCase() + ".";
            System.out.println("Nome para crachá: " + formatado);
        } else {
            System.out.println("Nome crachá: " + nomeCompleto.toUpperCase());
        }

        sc.close();
    }
}