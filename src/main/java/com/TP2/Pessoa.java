package com.TP2;

import java.util.Date;
import java.text.Normalizer;

public class Pessoa {
    private static String apiKey = "dedc56402da5c9115c366b579a9e900e5350a33dc71d7a3920bbd88321910cf8";
    private String nome;
    private String nomeNormalizado;
    private Date dataNascimento;
    private int numeroIdentificacao;
    private String gender;

    // Construtor
    public Pessoa(String nome, Date dataNascimento, int numeroIdentificacao) {
        this.nome = nome;
        this.nomeNormalizado = stripAccents(nome);
        this.dataNascimento = dataNascimento;
        this.numeroIdentificacao = numeroIdentificacao;
        this.gender = GenderDetector.detectGender(this.nomeNormalizado.split(" ")[0], apiKey);
    }

    public static String stripAccents(String nome) {
        nome = Normalizer.normalize(nome, Normalizer.Form.NFD);
        nome = nome.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return nome;
    }

    // Getters e Setters
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNomeNormalizado() {
        return nomeNormalizado;
    }

    public void setNomeNormalizado(String nomeNormalizado) {
        this.nomeNormalizado = nomeNormalizado;
    }

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
