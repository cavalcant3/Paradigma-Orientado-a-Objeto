package com.poo.Trimestre2.Atividades.Atividade02.Q2;

public class Circulo extends Quadrilatero{
    float raio;

    @Override
    public float calcularArea() {
        float resultado = (float) (Math.PI * (this.raio * this.raio));
        return resultado;
    }


    @Override
    public float calcularPerimetro() {

        return (float) (2 * Math.PI * this.raio);
    }

//    utilizando a sobrecarga de métodos e deixando os não usáveis para trás.


    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
