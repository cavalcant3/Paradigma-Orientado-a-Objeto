package com.poo.Trimestre1.Atividades.Atividade02.Q3;

import java.util.Locale;

public class Pais {
    //03 - Escreva uma classe que represente um país. Um país é representado através dos atributos: sigla (ex.: BRA), nome (ex.:
//    Brasil), população (ex.: 200.333.444) e a sua dimensão em Km2 (ex.: 8.515.767,049).
//    Escreva a classe em Java contendo:
//   Um método construtor que inicialize a sigla, o nome e a dimensão do país;
//    Os métodos de acesso (getter/setter) para as propriedades sigla, nome, população e dimensão do país;
//    Um método que retorne a densidade populacional do país;
    private String sigla;
    private String nome;
    private double populacao;
    private double dimensao;

    public Pais(String sigla, String nome, double dimensao) {
        this.sigla = sigla.substring(0, 3).toUpperCase(Locale.ROOT);
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public double dimensaoPais(){
        double showDimension = this.dimensao;
        return showDimension;
    }















    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
}


