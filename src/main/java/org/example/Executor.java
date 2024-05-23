package org.example;

public class Executor {
    public static void main(String[] args) {

//        int nomeVariavel;
//        ListaSimples lista = new ListaSimples(10);
//        lista.exibirElementos();
//        lista.adicaoPorDeslocamento(1, 10);
//        lista.adicaoPorDeslocamento(2, 10);
//        lista.adicaoPorDeslocamento(3, 10);
//        lista.adicaoPorDeslocamento(0, 50);
//        lista.adicaoPorDeslocamento(1, 50);
//        lista.exibirElementos();
//        //lista.removerPorIndice(1);
//        lista.removerPorElemento(10);
//        lista.exibirElementos();



//        ListaDinamica listaDinamica = new ListaDinamica();
//        listaDinamica.adicionar(10);
//        listaDinamica.adicionar(20);
//        listaDinamica.adicionar(30);
//        listaDinamica.adicionar(40);
//        listaDinamica.exibirElementos();
//        listaDinamica.removerElemento(40);
//        System.out.println();
//        listaDinamica.exibirElementos();

//        Pilha pilha = new Pilha();
//
//        pilha.empilhar(10);
//        pilha.empilhar(9);
//        pilha.empilhar(8);
//        pilha.empilhar(7);
//        pilha.empilhar(6);
//        pilha.empilhar(5);
//        pilha.empilhar(4);
//        pilha.empilhar(3);
//        pilha.empilhar(2);
//        pilha.empilhar(1);
//
//
//        while(!pilha.isEmpty()) {
//            int elemento = pilha.desempilhar();
//            System.out.println("Desempilhei " + elemento);
//        }

        FilaSimples<Integer> fila = new FilaSimples<>();

        fila.enfileira(2);
        fila.enfileira(1);
        fila.enfileira(14);
        System.out.println(fila.toString());
        fila.desenfileira();
        System.out.println(fila.toString());

    }
}
