package com.poo.Trimestre2.Atividades.Atividade02.Q3;

public class main {
    public static void main(String[] args) {
// 3 - Defina uma interface com o nome Jogo. Crie os métodos iniciar(), jogar() e finalizar(). A seguir:
//- crie uma classe abstrata com o nome JogoComBola e faça-a implementar a interface Jogo.

//- crie um método abstrato denominado setNomesEquipes(String equipe1, String equipe2).
//- crie uma classe com o nome Futebol e faça-a herdar da classe JogoComBola.

//- repare que, por se tratar de uma classe concreta, você será obrigado pelo compilador

// a implementar os métodos da classe abstrata e também os métodos definidos na interface.

//- coloque implementações simples nestes métodos como mensagens, por exemplo. OLHAR TIPOS DE IMPLEMENTAÇÕES

//- crie uma classe com o nome Vôlei nos mesmos moldes da classe Futebol.

//- crie uma classe abstrata com o nome JogoDeCartas e faça-a herdar da interface Jogo.

//- crie um método abstrato qtdCartasDistribuidas() com o retorno do tipo inteiro.

//- crie outro método abstrato com o nome numeroParticipantes() também com retorno inteiro.

//- crie uma classe concreta denominada Truco herdando de JogoDeCartas.

//- implemente de maneira simples os métodos da interface Jogo e da classe abstrata JogoDeCartas.

        Futebol futebol = new Futebol();
        System.out.println("--futebol--");
        System.out.println(futebol.iniciar());
        System.out.println(futebol.jogar());
        System.out.println(futebol.finalizar());
        System.out.println("--truco--");
        Truco truco = new Truco();
        System.out.println("--iniciando o jogo--");
        System.out.println(truco.iniciar());
        System.out.println("--passando a qtd de participantes e retornando o  total de carta por participante--");
        System.out.println(truco.numeroParticipantes(10));
        System.out.println(truco.jogar());
        System.out.println(truco.finalizar());

        System.out.println("--pegando numero aleatório de cartas:--");
        System.out.println(truco.qtdCartasDistribuidas());

    }
}
