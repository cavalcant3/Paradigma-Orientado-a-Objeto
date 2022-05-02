package com.poo.Trimestre1.Atividades.Atividade01;

public class Carro {
    //    Escreva um programa para armazenar dados de veículos. A classe deve conter os atributos: nome, marca, ano,
//    motor e número de marchas.
//    Inclua um método construtor que contém TODOS os parâmetros para atualização de todos os atributos.
//    Crie outro método construtor que tenha como parâmetro somente nome e marca do carro e para os demais atributos
//    considere o ano 2020, motor 1.3 e 5 marchas.

    private String nome;
    private String marca;
    private int ano;
    private double motor;
    private int NumMarchas;

    public Carro(String nome, String marca, int ano, double motor, int numMarchas) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.motor = motor;
        NumMarchas = numMarchas;
    }

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
        this.ano = 2020;
        this.motor = 1.3;
        this.NumMarchas = 5;
    }
    public String imprimirDados(){
       String dados = "\n Modelo: " + this.nome;
        dados += "\n MArca: " + this.marca;
        dados += "\n ano: " + this.ano;
        dados += "\n motor: " + this.motor;
        dados +="\n Numero de marchas: " + this.NumMarchas;

        return dados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getNumMarchas() {
        return NumMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        NumMarchas = numMarchas;
    }
}
