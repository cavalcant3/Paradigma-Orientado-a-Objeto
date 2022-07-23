package com.poo.Trimestre2.prova2;

abstract class Funcionario {
    String matricula;
    String nome;
    String sgEstadoNascmento;
    String sgDepartamento;
    int vlSalarioBase;
    double vlSalarioLiquido = 0;
    int txINSS;
    int qtdFilhos = 0;
    //Para cada filho considere um auxílio
    //de R$ 100.00.
    abstract double calculaSalario();
    abstract  double calculaAumentoSalarial(String matricula, double percentualAumento);
    abstract double calculaAumentoSalarial(double valorAumento, String matricula);

    public Funcionario(String matricula, String nome,
                       String sgEstadoNascmento,
                       String sgDepartamento, Integer vlSalarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.sgEstadoNascmento = sgEstadoNascmento;
        this.sgDepartamento = sgDepartamento;
        this.vlSalarioBase = vlSalarioBase;
    }


}
