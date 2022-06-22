package com.poo.Trimestre2.Atividades.Atividade02.Q3;

public abstract class JogoDeCartas implements Jogo {

    public abstract int qtdCartasDistribuidas();

    public abstract int numeroParticipantes(int participantes);

    @Override
    public String iniciar() {
        String message = "Jogo iniciado";
        return message;
    }

    @Override
    public String jogar() {
        String message = "Jogando";

        return message;
    }

    @Override
    public String finalizar() {
        String message = "Jogo finalizado";

        return message;
    }
}
