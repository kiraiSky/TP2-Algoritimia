package com.TP2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class FileWriterTXT {

    private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void saveToFile(LinkedList pessoas) {
        try {
            DataOutputStream maleWriter = new DataOutputStream(new FileOutputStream("Masculino.txt"));
            DataOutputStream femaleWriter = new DataOutputStream(new FileOutputStream("Feminino.txt"));
            Node current = pessoas.getHead();
            while (current != null) {
                if (current.getPessoa().getGender().equals("Masculino")) {
                    writeToFile(current.getPessoa(), maleWriter);
                } else if (current.getPessoa().getGender().equals("Feminino")) {
                    writeToFile(current.getPessoa(), femaleWriter);
                }
                current = current.getNext();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(Pessoa pessoa, DataOutputStream writer) {
        try {
            writer.writeChars(pessoa.getNome() + "\n");
            writer.writeChars(dateFormat.format(pessoa.getDataNascimento()) + "\n");
            writer.writeChars(pessoa.getNumeroIdentificacao() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
