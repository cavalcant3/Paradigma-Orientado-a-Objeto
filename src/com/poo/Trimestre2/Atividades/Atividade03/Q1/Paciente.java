package com.poo.Trimestre2.Atividades.Atividade03.Q1;

import java.util.GregorianCalendar;

public class Paciente {
    int cpf;
    String nome;

    public String print() {
        return null;
    }

    public String agendarConsulta(String nomeEspecialidade,
                                  int númeroConvênio,
                                  String nomeConvênio) {
        GregorianCalendar gc = new GregorianCalendar();
        int ano = randBetween(2023, 2023);
        gc.set(gc.YEAR, ano);
        int diaDoAno = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, diaDoAno);
        String resultado = (gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
        return resultado;

    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
