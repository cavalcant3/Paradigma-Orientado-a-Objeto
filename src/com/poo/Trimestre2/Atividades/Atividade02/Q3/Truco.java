package com.poo.Trimestre2.Atividades.Atividade02.Q3;

import java.util.Random;

public class Truco extends JogoDeCartas {
   private Random random = new Random();
    int cartas;

    @Override
    public int qtdCartasDistribuidas() {
        int qtdCartas = random.nextInt(100);
        cartas = qtdCartas;

        return qtdCartas;
    }

    @Override
    public int numeroParticipantes(int participantes) {
        int cartaPorParticipante=0;
        if (cartas != 0) {
            cartaPorParticipante = cartas/participantes;

        } else {
            cartaPorParticipante = qtdCartasDistribuidas()/participantes ;


        }

        return cartaPorParticipante;
    }

    @Override
    public String iniciar() {

        return super.iniciar();
    }

    @Override
    public String jogar() {
        return super.jogar() + "\nBoa sorte";
    }

    @Override
    public String finalizar() {
        return super.finalizar() + "\nPara saber quem ganhou aceito indicações de estágio. Contato: 9.98329912\n";
    }
}
