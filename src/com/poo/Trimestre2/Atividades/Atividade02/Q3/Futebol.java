package com.poo.Trimestre2.Atividades.Atividade02.Q3;

public class Futebol extends JogoComBola {
    String equipe2;
    String equipe1;

    @Override
    public void setNomesEquipes(String equipe1, String equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 =equipe2;
    }


    @Override
    public String iniciar() {
        String message = "Jogo iniciado\n";
        return message;
    }

    @Override
    public String jogar() {
        String message = "Jogando\n";

        return message;
    }

    @Override
    public String finalizar() {
        String message = "Jogo finalizado\n";

        return message;
    }

    public String getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(String equipe2) {
        this.equipe2 = equipe2;
    }

    public String getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(String equipe1) {
        this.equipe1 = equipe1;
    }
}
