package com.poo.Trimestre2.Atividades.Atividade02.Q1;

public class Caminhao extends Veiculo{
    int numExos;
    double pesoMax;
    String carga;

    public String mostrarDados(){
        String dados;
        dados = "\nNumero de eixos: " + this.numExos;
        dados += "\n Peso Max.: " + this.pesoMax;
        dados += "\n carga: " + this.carga;
        dados += "\n Placa: " + this.placa;
        dados += "\n Ano: " + this.ano;

        return dados;
    }


    public int getNumExos() {
        return numExos;
    }

    public void setNumExos(int numExos) {
        this.numExos = numExos;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public Caminhao(String placa, int ano) {
        super(placa, ano);
    }
}
