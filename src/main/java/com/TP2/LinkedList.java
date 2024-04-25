package com.TP2;

public class LinkedList {
    private Node head;

    // Construtor
    public LinkedList() {
        this.head = null;
    }

    // Método para adicionar um novo nó no final da lista
    public void append(Pessoa pessoa) {
        Node newNode = new Node(pessoa);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    // Método para imprimir a lista encadeada
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println("Nome: " + current.getPessoa().getNome() + ", Data de Nascimento: " +
                    current.getPessoa().getDataNascimento() + ", Número de Identificação: " +
                    current.getPessoa().getNumeroIdentificacao());
            current = current.getNext();
        }
    }

    // Método para editar o valor de um nó na posição index
    public void edit(int index, Pessoa newPessoa) {
        if (index < 0 || head == null) {
            return;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null) {
                return;
            }
            current = current.getNext();
        }
        current.setPessoa(newPessoa);
    }

    // Método para apagar o nó na posição index
    public void delete(int index) {
        if (index < 0 || head == null) {
            return;
        }

        if (index == 0) {
            head = head.getNext();
            return;
        }

        Node current = head;
        Node prev = null;
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null) {
                return;
            }
            prev = current;
            current = current.getNext();
        }
        prev.setNext(current.getNext());
    }
}
