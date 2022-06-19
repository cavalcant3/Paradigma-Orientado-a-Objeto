package com.poo.Trimestre2.Atividades.Atividade02.Q1;

public class Onibus extends Veiculo {
    String numAssentos;

    public String mostrarDados(){
        String dados;
        dados = "\nNumero de assentos: " + this.numAssentos;
        dados += "\n Placa: " + this.placa;
        dados += "\n Ano: " + this.ano;

        return dados;
    }

    public String getNumAssentos() {
        return numAssentos;
    }

    public void setNumAssentos(String numAssentos) {
        this.numAssentos = numAssentos;
    }

    public Onibus(String placa, int ano) {
        super(placa, ano);


    }
}
