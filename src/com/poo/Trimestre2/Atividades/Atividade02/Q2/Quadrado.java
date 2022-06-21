package com.poo.Trimestre2.Atividades.Atividade02.Q2;

public class Quadrado extends Retangulo{
    float lado;
    float altura;

    @Override
    public float calcularArea() {
        return super.calcularArea() + this.altura * this.lado;
    }

    @Override
    public float calcularPerimetro() {
        return super.calcularPerimetro() + this.altura + this.lado;
    }


    @Override
    public float getLado() {
        return lado;
    }

    @Override
    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float getAltura() {
        return altura;
    }

    @Override
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
