package com.poo.Trimestre2.Atividades.Atividade03.Q1;

import java.util.GregorianCalendar;

public class NaoConveniado extends Paciente {
    int numCartãoCrédito;
    String bandeiraCartãoCrédito;
    String nome;

    public NaoConveniado(String nome) {
        this.nome = nome;
    }


    @Override
    public String agendarConsulta(String nomeEspecialidade, String nomeConvenio) {
        nomeConvenio = " - SEM CONVÊNIO";
        GregorianCalendar gc = new GregorianCalendar();
        int ano = randBetween(2023, 2023);
        gc.set(gc.YEAR, ano);
        int diaDoAno = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, diaDoAno);
        String data = "PACIENTE: " +nome + " - " + nomeConvenio  + " - R$: 200,00";
        data +=  nomeEspecialidade + " - ";
        data += gc.get(gc.DAY_OF_MONTH) + "/" + (gc.get(gc.MONTH) + 1) + "/" + (gc.get(gc.YEAR));
        return data;

    }



//
//    @Override
//    public String agendarConsulta(String nomeEspecialidade, String nomeConvenio) {
//        return super.agendarConsulta(this.nomeEspecialidade, this.nomeConvenio);
//    }
//
//    @Override
//    public String agendarConsulta(String nomeEspecialidade, int numeroConvenio, String nomeConvenio) {
//        return super.agendarConsulta(nomeEspecialidade, numeroConvenio, nomeConvenio);
//    }
//
//    public int getNumCartãoCrédito() {
//        return numCartãoCrédito;
//    }
//
//    public void setNumCartãoCrédito(int numCartãoCrédito) {
//        this.numCartãoCrédito = numCartãoCrédito;
//    }
//
//    public String getBandeiraCartãoCrédito() {
//        return bandeiraCartãoCrédito;
//    }
//
//    public void setBandeiraCartãoCrédito(String bandeiraCartãoCrédito) {
//        this.bandeiraCartãoCrédito = bandeiraCartãoCrédito;
//    }

}
