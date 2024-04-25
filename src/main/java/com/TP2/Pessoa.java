package com.TP2;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private int numeroIdentificacao;

    // Construtor
    public Pessoa(String nome, Date dataNascimento, int numeroIdentificacao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroIdentificacao = numeroIdentificacao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }
}
