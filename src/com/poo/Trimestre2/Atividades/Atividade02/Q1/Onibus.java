package com.poo.Trimestre2.Atividades.Atividade02.Q1;

public class Onibus extends Veiculo  {
    int numAssentos;



//    public String mostrarDados() {
//        String dados;
//        dados = "\nNumero de assentos: " + this.numAssentos;
//        dados += "\n Placa: " + this.placa;
//        dados += "\n Ano: " + this.ano;
//
//
//        return dados;
//    }

    public int getNumAssentos() {
        return numAssentos;
    }

    @Override
    public String getInfo() {
        String informacaoBasica = super.getInfo();
        return informacaoBasica +
                "\n Numero De assentos: " + this.numAssentos;

    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    public Onibus(String placa, int ano) {
        super(placa, ano);


    }


}
