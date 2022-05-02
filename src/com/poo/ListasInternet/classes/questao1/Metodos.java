package com.poo.ListasInternet.classes.questao1;

public class Metodos {
//media calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
////final calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

   // Aluno aluno = new Aluno();

    public double notaMedia(double nota1, double nota2) {
        double mediaProva = 0;

        mediaProva = (nota1 + nota2)*2.5/2;
        return mediaProva;
    }
    public double ficouDeFinal(double nota1, double nota2){
       double problema = notaMedia(nota1, nota2);
       if (problema<6){
           problema = problema - 10;
           return problema;
       } else if (problema>6){
           return 0;
       }
        return 111;
    }
}
