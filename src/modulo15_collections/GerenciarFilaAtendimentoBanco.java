package modulo15_collections;

import java.util.ArrayList;

public class GerenciarFilaAtendimentoBanco {
    public static void main(String[] args) {
        ArrayList<String> fila = new ArrayList<>();

        // Chegada de clientes
        fila.add("João Silva");
        fila.add("Maria Oliveira");
        fila.add("Pedro Santos");

        System.out.println("Clientes na Fila: " + fila);

        // Atendendo o primeiro da fila
        String atendido = fila.remove(0);
        System.out.println("Atendendo agora: " + atendido);

        System.out.println("Fila atualizada: " + fila);
    }
}