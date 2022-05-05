package com.poo.Trimestre1.Atividades.Atividade02.Q2;

public class Conta {
//02 - Crie uma classe Conta com os atributos tipo da conta e saldo. Crie os seguintes métodos.
//Um método construtor que tem como parâmetro o valor inicial do depósito.
//Um método depositar que tem como parâmetro o valor a ser depositado que por segurança não deve permitir depósitos acima de 1.000,00.
// Um método sacar que tem como parâmetro o valor a ser debitado. O método não deve permitir saque superior ao saldo da conta.

    //A seguir, teste a classe como seguinte roteiro: Crie duas contas com depósitos iniciais de 500,00. Tente depositar 300,00 na conta 1;
//Tente sacar 100,00 na conta 2; Tente sacar 900,00 na conta 1; Tente depositar 1.200,00 na conta 2.
    private String titular;
    private String tipoConta;
    private double saldo;

    // Um método construtor que tem como parâmetro o valor inicial do depósito.
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    //    não permite depositos acima de 1000
    public boolean depositar(double valor) {
        String resultadoDeposito;

        if (valor > 1000) {
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
    }

    //Um método sacar com verificação
    public boolean saque(double valor) {
        if (valor > this.saldo) {
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
    }

    //    criando o metodo TRANSFERE
    public boolean transfere(Conta destino, double valor) {
        boolean verificacaoDeSaque = this.saque(valor);
        if (verificacaoDeSaque == false) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            destino.saldo += valor;
            return true;
        }
    }

}
