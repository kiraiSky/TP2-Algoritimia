package com.TP2;

public class FilterGender {

    public static LinkedList getMales(LinkedList pessoas) {
        LinkedList males = new LinkedList();
        Node current = pessoas.getHead();
        while (current != null){
            if (current.getPessoa().getGender().equals("Masculino")) {
                males.append(current.getPessoa());
            }
            current = current.getNext();
        }
        return males;
    }

    public static LinkedList getFemales(LinkedList pessoas) {
        LinkedList females = new LinkedList();
        Node current = pessoas.getHead();
        while (current != null){
            if (current.getPessoa().getGender().equals("Feminino")) {
                females.append(current.getPessoa());
            }
            current = current.getNext();
        }
        return females;
    }
}
