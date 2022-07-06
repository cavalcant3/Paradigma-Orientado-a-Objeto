package com.poo.Trimestre2.Atividades.Atividade03.Q1;

public class NaoConveniado extends Paciente {
    int numCartãoCrédito;
    String bandeiraCartãoCrédito;

    public NaoConveniado(String nome) {
        super(nome);
    }


    @Override
    public String print() {
        return super.print();
    }

    @Override
    public String agendarConsulta(String nomeEspecialidade, int númeroConvênio, String nomeConvênio) {
        return super.agendarConsulta(nomeEspecialidade, númeroConvênio, nomeConvênio) + " - R$:200,00";
    }

    @Override
    public String agendarConsulta(String nomeEspecialidade, String nomeConvênio) {
        return super.agendarConsulta(nomeEspecialidade, nomeConvênio) + " - R$:200,00";
    }
}
