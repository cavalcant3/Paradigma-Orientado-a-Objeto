package com.poo.Trimestre2.Atividades.Atividade02.Q1;

public class Caminhao extends Veiculo implements Tributavel{
    int numExos;
    double pesoMax;
    String carga;

    public String mostrarDados(){
        String dados;
        dados = "\nNumero de eixos: " + this.numExos;
        dados += "\n Peso Max.: " + this.pesoMax;
        dados += "\n carga: " + this.carga;
        dados += "\n Valor do tributo: " + this.getImposto();

        return dados;
    }
    @Override
    public String getInfo() {
        String informacaoBasica = super.getInfo();
        return informacaoBasica + mostrarDados();
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

    public Caminhao(String placa, int ano, double Valor) {
        super(placa, ano, Valor);


    }

    @Override
    public double getImposto() {
        return this.Valor * 0.25;

    }
}
