package com.poo.Trimestre2.Atividades.Atividade02.Q1;

public abstract class Veiculo {
    String placa;
    int ano;

//    isso aqui é um constructor
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }
    void contarMaisUm(){
        int contar=0;
        contar++;
    }
}
