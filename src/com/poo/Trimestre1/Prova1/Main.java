package com.poo.Trimestre1.Prova1;

public class Main {
    public static void main(String[] args) {
//        criação dos produtos
        Produto biscoito = new Produto(2.00, "biscoito wafer");
        Produto macarrao = new Produto(2.00, "macarrao wafer");
        Produto oleo = new Produto(2.00, "oleo marata");
        Produto sabaoEmPo = new Produto(2.00, "sabao em po Aluno de telmo");
//        atualizando estoque
//        em cada alteração modifiquei valores de E/S do estoque
        System.out.println("Atualizando estoque: ");
        biscoito.atualizarEstoque("entrada", 500);
        System.out.println("COD: " + biscoito.getCodigo() + " Desc: " + biscoito.getDescricao() +
                " Estoque: " + biscoito.getEstoque() + " Valor Custo: " + biscoito.getValorCusto() +
                " Venda: " + biscoito.getValorVenda() + " Promo: " + biscoito.getValorPromocional());
        biscoito.atualizarEstoque("saida", 100);
//        -------------segunda vez---------------------
        biscoito.setValorCusto(5.00);
        System.out.println("COD: " + biscoito.getCodigo() + " Desc: " + biscoito.getDescricao() +
                " Estoque: " + biscoito.getEstoque() + " Valor Custo: " + biscoito.getValorCusto() +
                " Venda: " + biscoito.getValorVenda() + " Promo: " + biscoito.getValorPromocional());
        //        -------------terceira vez---------------------
        macarrao.atualizarEstoque("Entrada", 1000);
        System.out.println("COD: " + macarrao.getCodigo() + " Desc: " + macarrao.getDescricao() +
                " Estoque: " + macarrao.getEstoque() + " Valor Custo: " + macarrao.getValorCusto() +
                " Venda: " + macarrao.getValorVenda() + " Promo: " + macarrao.getValorPromocional());
        //        -------------quarta vez---------------------
        macarrao.atualizarEstoque("Saida", 10);
        System.out.println("COD: " + macarrao.getCodigo() + " Desc: " + macarrao.getDescricao() +
                " Estoque: " + macarrao.getEstoque() + " Valor Custo: " + macarrao.getValorCusto() +
                " Venda: " + macarrao.getValorVenda() + " Promo: " + macarrao.getValorPromocional());
//------------------------------------------------------------------------------------------
//        Atualizando promo nos produtos 3 e 4:
        System.out.println("Atualizando promo:");
        oleo.atualizarValorPromo(50);
        oleo.setEstoque(100);
        sabaoEmPo.atualizarValorPromo(100.00);
        sabaoEmPo.setEstoque(1);
        System.out.println("COD: " + oleo.getCodigo() + " Desc: " + oleo.getDescricao() +
                " Estoque: " + oleo.getEstoque() + " Valor Custo: " + oleo.getValorCusto() +
                " Venda: " + oleo.getValorVenda() + " Promo: " + oleo.getValorPromocional());
        System.out.println("COD: " + sabaoEmPo.getCodigo() + " Desc: " + sabaoEmPo.getDescricao() +
                " Estoque: " + sabaoEmPo.getEstoque() + " Valor Custo: " + sabaoEmPo.getValorCusto() +
                " Venda: " + sabaoEmPo.getValorVenda() + " Promo: " + sabaoEmPo.getValorPromocional());

        System.out.println("Estoque total da empresa: " + Produto.valorTotalEstoque);
        System.out.println("------------------------------------------------------");
//        modificando os valores de custo nos produtos 1 e 2
        System.out.println("modificando os valores de custo nos produtos 1 e 2.");
        biscoito.setValorCusto(1.00);
        macarrao.setValorCusto(100.00);
        System.out.println("consultando valores de custo: ");
        System.out.println("COD: " + biscoito.getCodigo() + " Desc: " + biscoito.getDescricao() +
                " Estoque: " + biscoito.getEstoque() + " Valor Custo: " + biscoito.getValorCusto() +
                " Venda: " + biscoito.getValorVenda() + " Promo: " + biscoito.getValorPromocional());
        System.out.println("COD: " + macarrao.getCodigo() + " Desc: " + macarrao.getDescricao() +
                " Estoque: " + macarrao.getEstoque() + " Valor Custo: " + macarrao.getValorCusto() +
                " Venda: " + macarrao.getValorVenda() + " Promo: " + macarrao.getValorPromocional());


    }


}
