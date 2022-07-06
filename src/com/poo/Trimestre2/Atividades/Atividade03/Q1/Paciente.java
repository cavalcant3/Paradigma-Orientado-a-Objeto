package com.poo.Trimestre2.Atividades.Atividade03.Q1;


import java.util.GregorianCalendar;

public abstract class Paciente {
    //static ArrayList<Object> agendamentos;
    int cpf;
    String nome;

    public String print(){
        return null;
    }


    public abstract String agendarConsulta(String nomeEspecialidade, String nomeConvenio);


// calculo do numero aleatório
    public  int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }



}
