package com.poo.Trimestre1.Atividades.Atividade02.Q1;

public class Veiculo {
//01 - Escreva um programa para armazenar dados de veículos.
//A classe deve conter os atributos: nome, marca, ano, motor, número de marchas e velocidade.
//Crie um método construtor que tenha como parâmetro somente nome e marca do carro e para os demais atributos
// considere o ano 2020, motor 1.3, 5 marchas e velocidade 50 km/h.
//Crie um método acelerar que aumenta a velocidade do veículo de acordo com a aceleração (parâmetro).
//Crie um método frear que diminui a velocidade do veículo de acordo com a redução (parâmetro).
//Crie 2 veículos testando a classe criada.

    private String nome;
    private String marca;
    private int ano;
    private int numMarchas;
    private double motor;
    private double velocidade;

    //    constructor
    public Veiculo(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
        this.ano = 2020;
        this.motor = 1.3;
        this.numMarchas = 5;
        this.velocidade = 50.0;
    }

    public String acelerar(double incremento) {
        this.velocidade = this.velocidade + incremento;
        String acelerando = "Aumentando a velocidade";
        return acelerando;
    }


    public String frear(double decremento) {
        this.velocidade = this.velocidade - decremento;
        String freando = "freandoooooo OLHA O POSTEEEEEEE";
        return freando;
    }

//    GEtters e SETTERS

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

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
