package com.poo.Trimestre2.Atividades.Atividade03.Q1;

public class Conveniado extends Paciente {
    int númeroConvênio;
    String nomeConvênio;

    public Conveniado(String nome) {
        super(nome);
    }

    @Override
    public String print() {
        return super.print();
    }

    @Override
    public String agendarConsulta(String nomeEspecialidade, int númeroConvênio, String nomeConvênio) {
        return super.agendarConsulta(nomeEspecialidade, númeroConvênio, nomeConvênio);
    }

    @Override
    public String agendarConsulta(String nomeEspecialidade, String nomeConvênio) {
        return super.agendarConsulta(nomeEspecialidade, nomeConvênio);
    }
}
