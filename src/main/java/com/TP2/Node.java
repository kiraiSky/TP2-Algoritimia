package com.TP2;

public class Node {
    private Pessoa pessoa;
    private Node next;

    // Construtor
    public Node(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.next = null;
    }

    // Getters e Setters
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
