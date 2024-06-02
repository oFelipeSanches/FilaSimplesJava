package org.example;

public class FilaSimples<T> {

    private T[] elementos;

    private int tamanho;

    public void EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public FilaSimples() {
        EstruturaEstatica(5);
    }

    public void enfileira(T elemento) {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
        } else {
            throw new RuntimeException("Fila cheia");
        }
    }

    public T desenfileira() {

        final int posicao = 0;

        if(this.isEmpty()) {
            throw new RuntimeException("Não há elementos na fila!");
        }
        T elementoASerRemovido = this.elementos[posicao];

        for (int i = posicao; i < tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho --;

        return elementoASerRemovido;
    }

    public T espiar() {
        if(this.isEmpty()) {
            return null;
        }
        return this.elementos[0];
    }

    public void aumentarCapacidade() {
        if(this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void removerTodasOcorrencias(T valorARemover) {

        int novoTamanho = 0;

        for (int i = 0; i < this.tamanho; i++) {
            if (!this.elementos[i].equals(valorARemover)) {
                this.elementos[novoTamanho++] = this.elementos[i];
            }
        }
        this.tamanho = novoTamanho;

    }

    public String toString() {

        StringBuilder construirString = new StringBuilder();
        construirString.append("[");

        for (int elementoPercorrido = 0; elementoPercorrido < this.tamanho-1; elementoPercorrido++) {
            construirString.append(this.elementos[elementoPercorrido]);
            construirString.append(", ");
        }

        if(this.tamanho > 0) {
            construirString.append(this.elementos[this.tamanho-1]);
        }

        construirString.append("]");

        return construirString.toString();
    }

    public Integer maior() {
        if (isEmpty()) {
            throw new RuntimeException("A Fila está vazia!");
        }
        Integer maior = (Integer) this.elementos[0];
        for (int i = 0; i < this.tamanho; i++) {
            Integer elementoAtual = (Integer) this.elementos[i];
            if(elementoAtual > maior) {
                maior = elementoAtual;
            }
        }
        return maior;
    }

    public Integer menor() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!");
        }
        Integer menor = (Integer) this.elementos[0];
        for (int i = 0; i < this.tamanho; i++) {
            Integer elementoAtual = (Integer) this.elementos[i];
            if(elementoAtual < menor) {
                menor = elementoAtual;
            }
        }
        return menor;
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }
}
