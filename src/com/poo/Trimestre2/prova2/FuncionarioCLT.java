package com.poo.Trimestre2.prova2;

public class FuncionarioCLT extends Funcionario {
    int vlSalarioProdutividade = 500;
    double txINSS = 0.2;
    double percentualAumento;
    int qtdFilhos;


    public FuncionarioCLT(String matricula, String nome,
                          String sgEstadoNascmento, String sgDepartamento,
                          int vlSalarioBase) {
        super(matricula, nome, sgEstadoNascmento, sgDepartamento, vlSalarioBase);
    }


    //calcular o vlSalarioLiquido
//(vlSalarioBase + vlAuxilioFilhos + vlSalarioProd) descontando a txINSS.
    @Override
    double calculaSalario() {
        //this.qtdFilhos = 0;
        int vlAuxilioFilhos = this.qtdFilhos * 100;
        vlSalarioLiquido = (this.vlSalarioBase + vlAuxilioFilhos + this.vlSalarioProdutividade);
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

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }
}
