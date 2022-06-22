package com.poo.Trimestre2.Atividades.Atividade02.Q3;

public class Volei extends JogoComBola{
    @Override
    public void setNomesEquipes(String equipe1, String equipe2) {

    }

    @Override
    public String iniciar() {
        String message = "Jogo iniciado\n";
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
