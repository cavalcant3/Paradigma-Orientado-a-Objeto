package com.poo.Trimestre2.Atividades.Atividade03.Q1;

import java.util.GregorianCalendar;

public class Conveniado extends Paciente {
    int númeroConvênio;
    String nomeConvenio;
    String nomeEspecialidade;
    String nome;

    public Conveniado(String nome) {
        this.nome = nome;
    }

//    Acrescentar nome e convenio


    @Override
    public String agendarConsulta(String nomeEspecialidade, String nomeConvenio) {
        GregorianCalendar gc = new GregorianCalendar();
        int ano = randBetween(2023, 2023);
        gc.set(gc.YEAR, ano);
        int diaDoAno = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, diaDoAno);
        String data = "PACIENTE: " +nome + " - ";
        data +=  nomeEspecialidade + " - ";
        data += gc.get(gc.DAY_OF_MONTH) + "/" + (gc.get(gc.MONTH) + 1) + "/" + (gc.get(gc.YEAR));
        return data;
    }




    @Override
    public int randBetween(int start, int end) {
        return super.randBetween(start, end);
    }
}
