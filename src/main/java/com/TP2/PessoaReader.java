package com.TP2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PessoaReader {
    public static LinkedList readPessoas(String fileName) throws Exception {
        LinkedList listaPessoas = new LinkedList();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        List<String> lines = FileReaderTXT.readLines(fileName);

        for (int i = 0; i < lines.size(); i += 3) {
            String nome = lines.get(i).trim();
            Date dataNascimento = dateFormat.parse(lines.get(i + 1).trim());
            int numeroIdentificacao = Integer.parseInt(lines.get(i + 2).trim());
            Pessoa pessoa = new Pessoa(nome, dataNascimento, numeroIdentificacao);
            listaPessoas.append(pessoa);
        }

        return listaPessoas;
    }
}
