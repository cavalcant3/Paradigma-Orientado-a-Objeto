package com.poo.Trimestre2.Atividades.Atividade02.Q2;

public class Retangulo extends Quadrilatero {
    float lado;
    float altura;



    @Override
    public float calcularArea() {
        float resultado = 0;
        resultado = this.lado * this.altura;
        return resultado;
    }


    @Override
    public float calcularPerimetro() {
        float resultado = 0;
        resultado = this.lado + this.altura;
        return resultado;
    }


    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
