package com.poo.Trimestre2.Atividades.Atividade03.Q1;

import java.util.GregorianCalendar;

public class Paciente {
    int cpf;
    String nome;
    int numeroConvenio;
    String nomeConvenio;
    String nomeEspecialidade;


    public Paciente(String nome) {
        this.nome = nome;
    }

    public String print() {
        return null;
    }

    public String agendarConsulta(String nomeEspecialidade,
                                  int numeroConvenio,
                                  String nomeConvenio) {
        GregorianCalendar gc = new GregorianCalendar();
        int ano = randBetween(2023, 2023);
        gc.set(gc.YEAR, ano);
        int diaDoAno = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, diaDoAno);
//        String resultado = (gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));

        String resultado = "Paciente: " + this.nome + " - Convênio: "
                + this.nomeConvenio + "numero Convenio: " + this.numeroConvenio + "\n";
         resultado += gc.get(gc.DAY_OF_MONTH) + "/" + (gc.get(gc.MONTH) + 1) + "/" + (gc.get(gc.YEAR))
                 + " Especialidade: " + this.nomeEspecialidade;
//                resultado += " - NUMERO DO CONVENIO: " + this.numeroConvenio +"\n CONVENIO: " + this.nomeConvenio;
        return resultado;

    }

    public String agendarConsulta(String nomeEspecialidade,
                                  String nomeConvenio) {
        GregorianCalendar gc = new GregorianCalendar();
        int ano = randBetween(2023, 2023);
        gc.set(gc.YEAR, ano);
        int diaDoAno = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, diaDoAno);
        String resultado = "Paciente: " + this.nome + " - Convênio: "
                + this.nomeConvenio + "\n";
        resultado += gc.get(gc.DAY_OF_MONTH) + "/" + (gc.get(gc.MONTH) + 1) + "/" + (gc.get(gc.YEAR))
                + " Especialidade: " + this.nomeEspecialidade;
        return resultado;

    }

    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(int numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }
}
