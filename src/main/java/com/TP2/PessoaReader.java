package com.TP2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PessoaReader {
    private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LinkedList readPessoas(String fileName) throws Exception {
        LinkedList listaPessoas = new LinkedList();
        List<String> lines = FileReaderTXT.readLines(fileName);

        for (int i = 0; i < lines.size(); i += 3) {
            String nome = lines.get(i).trim();
            LocalDate dataNascimento = LocalDate.parse(lines.get(i + 1).trim(), dateFormat);
            int numeroIdentificacao = Integer.parseInt(lines.get(i + 2).trim());
            Pessoa pessoa = new Pessoa(nome, dataNascimento, numeroIdentificacao);
            listaPessoas.append(pessoa);
        }

        return listaPessoas;
    }
}
