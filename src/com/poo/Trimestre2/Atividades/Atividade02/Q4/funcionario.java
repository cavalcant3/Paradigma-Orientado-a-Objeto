package com.poo.Trimestre2.Atividades.Atividade02.Q4;

import java.util.ArrayList;

public class funcionario {
    String nome;
    String senha;
    ArrayList<Integer> VendasTotal = new ArrayList<Integer>();

    public int cacularVenda(int quantidadeDeVenda, int valorUnitario) {
        int resultado = 0;
        try {
            if (valorUnitario > 0 && quantidadeDeVenda >= 1) {
                resultado = quantidadeDeVenda * valorUnitario;
                VendasTotal.add(resultado);
            }
        } catch (NullPointerException e) {
            System.out.println("Erro Atual: " + e);
        }
        return resultado;
    }

    public double listarVenda() {
        double vendasTotal = 0;
        for (double d: VendasTotal) {
            vendasTotal +=d;
        }

        return vendasTotal;
    }

}
