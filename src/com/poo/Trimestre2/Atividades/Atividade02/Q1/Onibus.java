package com.poo.Trimestre2.Atividades.Atividade02.Q1;

public class Onibus extends Veiculo implements Tributavel {
    String numAssentos;

    @Override
    public double getImposto() {
        return this.Valor * 0.15;
    }

    public String mostrarDados() {
        String dados;
        dados = "\nNumero de assentos: " + this.numAssentos;
        dados += "\n Placa: " + this.placa;
        dados += "\n Ano: " + this.ano;


        return dados;
    }

    public String getNumAssentos() {
        return numAssentos;
    }

    @Override
    public String getInfo() {
        String informacaoBasica = super.getInfo();
        return informacaoBasica +
                "\n Numero De assentos: " + this.numAssentos+
                "\n Valor do tributo: " + this.getImposto();
    }

    public void setNumAssentos(String numAssentos) {
        this.numAssentos = numAssentos;
    }

    public Onibus(String placa, int ano, double Valor) {
        super(placa, ano, Valor);


    }


}
