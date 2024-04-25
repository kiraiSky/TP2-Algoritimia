package com.TP2;

import java.util.Date;

public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {
            LinkedList list = new LinkedList();
            
            // Criando pessoas
            Pessoa pessoa1 = new Pessoa("Andre Silva", new Date(2001, 0, 19), 259276928);
            Pessoa pessoa2 = new Pessoa("Maria Santos", new Date(1995, 5, 12), 123456789);
            Pessoa pessoa3 = new Pessoa("João Oliveira", new Date(1980, 9, 30), 987654321);
            Pessoa pessoa4 = new Pessoa("Ana Souza", new Date(1973, 2, 8), 456789123);
            
            // Adicionando pessoas à lista
            list.append(pessoa1);
            list.append(pessoa2);
            list.append(pessoa3);
            list.append(pessoa4);

            System.out.println("Lista Encadeada:");
            list.printList();

            // // Editando o valor da segunda pessoa na lista
            // Pessoa novaPessoa2 = new Pessoa("Maria Silva", new Date(1995, 5, 12), 123456789);
            // list.edit(1, novaPessoa2);
            // System.out.println("Lista Encadeada após editar:");
            // list.printList();

            // // Apagando a terceira pessoa na lista
            // list.delete(2);
            // System.out.println("Lista Encadeada após apagar:");
            // list.printList();

            // Filtrando as pessoas por genero
            LinkedList males = FilterGender.getMales(list);
            System.out.println("Lista Encadeada após filtrar:");
            males.printList();

            // System.out.println("Pessoas lidas do arquivo:");
            // LinkedList pessoas = PessoaReader.readPessoas("C:\\Users\\Axel hehe\\OneDrive - Universidade do Algarve\\Universidade\\SEMESTRE 2\\Algoritmia\\TP2\\TP2-Algoritimia\\src\\main\\java\\com\\TP2\\arquivo.txt");
            // pessoas.printList();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
