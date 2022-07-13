package com.poo.Trimestre2.Atividades.Atividade02.Q4;

public class main {
    public static void main(String[] args) {
//  Em um sistema de loja, há 3 tipos de usuários: gerente, funcionário e cliente.
//  Todo usuário tem nome e senha. O cliente possui, além do nome e senha,
//   outros dados cadastrais como endereço e data de nascimento.
//   A classe funcionário possui o método “calcular venda”
//   que contém os parâmetros “quantidade de venda” e
//   “valor unitário” e “listar venda” que exibe uma mensagem
//   “Relatório de Vendas”. O gerente pode fazer tudo que
//   o funcionário pode e também possui acesso para o fechamento
//   do caixa. Crie um esboço com atributos e métodos mencionados acima.

        funcionario x = new funcionario();
        System.out.println("Testando o funcionario:");
        System.out.println(x.cacularVenda(20, 3));
        System.out.println(x.cacularVenda(10, 3));

        System.out.println(x.listarVenda());
        System.out.println("Testando o funcionario:");
        gerente y = new gerente();
        System.out.println(y.cacularVenda(20, 2));
        System.out.println(y.cacularVenda(20, 3));
        System.out.println(y.listarVenda());
        System.out.println(y.fecharCaixar());
    }
}
