package org.example;

public class Executor {
    public static void main(String[] args) {

        FilaSimples<Integer> fila = new FilaSimples<>();

        fila.enfileira(10);
        fila.enfileira(10);
        fila.enfileira(10);
        fila.enfileira(10);
        fila.enfileira(10);
        System.out.println(fila.media());
        System.out.println(fila.toString());
        fila.removerTodasOcorrencias(1);
        System.out.println(fila.toString());
        fila.aumentarCapacidade();
        fila.enfileira(2);
        fila.enfileira(1);
        fila.enfileira(7);
        fila.enfileira(2);
        fila.enfileira(4);
        System.out.println(fila.toString());
        fila.removerTodasOcorrencias(7);
        System.out.println(fila.toString());
        System.out.println(fila.media());
        System.out.println(fila.buscar(4));

    }
}
