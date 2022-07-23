package com.poo.Trimestre2.prova2;

public class FuncionarioTemp extends Funcionario {

    double tempoContrato = 12;
    double txInss = 0.1;

    public FuncionarioTemp(String matricula, String nome, String sgEstadoNascmento,
                           String sgDepartamento, Integer vlSalarioBase, double tempoContrato,
                           double txInss) {
        super(matricula, nome, sgEstadoNascmento, sgDepartamento, vlSalarioBase);
        this.tempoContrato = tempoContrato;
        this.txInss = txInss;
    }


    //    calcular o vlSalarioLiquido
//(vlSalarioBase + vlAuxilioFilhos) descontando a txINSS.
    @Override
    double calculaSalario() {
        this.qtdFilhos = 2;
        int vlAuxilioFilhos = qtdFilhos * 100;
        vlSalarioLiquido = (this.vlSalarioBase + vlAuxilioFilhos);
        double txInssFinal = (vlSalarioLiquido * this.txINSS) / 100;
        vlSalarioLiquido = (vlSalarioLiquido - txInssFinal);
        return vlSalarioLiquido;
    }

    @Override
    double calculaAumentoSalarial(String matricula, double percentualAumento) {
        percentualAumento = percentualAumento/100;
        double calculaAumento = calculaSalario() + (percentualAumento * calculaSalario());
        return calculaAumento;
    }

    @Override
    double calculaAumentoSalarial(double valorAumento, String matricula) {
        double calculaAumento = calculaSalario() + valorAumento;
        return calculaAumento;
    }
}
