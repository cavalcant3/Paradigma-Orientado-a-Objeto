package com.poo.Trimestre1.Prova1;

import java.util.ArrayList;
import java.util.Locale;

public class Produto {

    int codigo;
    int estoque;
    ArrayList<Double> valorEstoque = new ArrayList<Double>();
    public static double valorTotalEstoque = 0;
    public static int contador = 1;
    double valorCusto;
    double valorVenda = 0;
    double valorPromocional;
    String descricao;

//  construtor conforme o que havia solicitado. Também atualizo o valor total em estoque
    public Produto(double valorCusto, String descricao) {
        this.valorCusto = valorCusto;
        valorEstoque.add(this.valorCusto);
        this.descricao = descricao.toUpperCase(Locale.ROOT);
        this.codigo= contador++;
//        usando 125%... Pego o valor total e adiciono os 25% solicitado na questão. Sem precisar fazer a soma
        this.valorVenda = (this.valorCusto * 1.25);
    }

//  metodo para atualizar a venda
    public void atualizarValorPromo(double percentualDesconto) {
        percentualDesconto = percentualDesconto / 100;
       this.valorPromocional = this.valorVenda - percentualDesconto;
    }

    //    nesse bloco de codigo fiz a verificação de strings para a diferenciação de letras
//    multiplicando o valor de custo atual pela quantidade vamos obter o valor total que devemos atualizar
//    na variavel do valor total. Optei por utilizar arraylist e chamo o metodo AtualizandoValorTotal() para calcular o valor total.
    public boolean atualizarEstoque(String tipoOperecao, int quantidade) {
        if (tipoOperecao.equalsIgnoreCase("entrada")) {
            this.estoque += quantidade;
            double atualizacao = quantidade * this.valorCusto;
            valorEstoque.add(atualizacao);
            this.AtualizandoValorTotal();
            return true;
        } else {
//            para o mercadinho não ser saqueado e ter que ficar devendo aos fornecedores adicionei a verificação
//            de quantidade para valores de "saques" menores ou iguais ao que temos em estoque
//            subtraimos da variavel geral o valor total que está saindo junto com a mercadoria
            if (tipoOperecao.equalsIgnoreCase("saida") && quantidade <= this.estoque) {
                this.estoque -= quantidade;
                double atualizacao = quantidade * this.valorCusto;
                valorTotalEstoque -= atualizacao;
                return true;
            }
            return false;

        }

    }

    //        Imprimindo o array e somando na variavel valorTotalEstoque
    private void AtualizandoValorTotal() {
        for (double valorEstoque : valorEstoque) {
            valorTotalEstoque += valorEstoque;
        }

    }

//GETTERS E SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
        this.valorVenda = (this.valorCusto * 1.25);
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorPromocional() {
        return valorPromocional;
    }

    public void setValorPromocional(double valorPromocional) {
        this.valorPromocional = valorPromocional;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

