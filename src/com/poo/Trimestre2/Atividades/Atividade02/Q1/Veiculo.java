package com.poo.Trimestre2.Atividades.Atividade02.Q1;

public abstract class Veiculo {
    String placa;
    int ano;
    double Valor;

//    isso aqui é um constructor
    public Veiculo(String placa, int ano, double Valor) {
        this.placa = placa;
        this.ano = ano;
        this.Valor = Valor;
    }

    public String getInfo(){
        return "placa: " + this.placa + "\nano: " +this.ano;
    }

    public double getValor() {
        return Valor;
    }
}
