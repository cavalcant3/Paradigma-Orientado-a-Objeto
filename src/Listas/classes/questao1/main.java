package Listas.classes.questao1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
//dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
//trabalho. Escreva os seguintes métodos para esta classe:
//        media calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
//final calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
        Aluno aluno = new Aluno();
        Metodos metodos = new Metodos();
        aluno.setNome("Teste");
        aluno.setMatricula("987aabcc");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getMatricula());
        //metodos.mediaFinal();
       aluno.setNota1(3);
       aluno.setNota1(3);
        System.out.println(metodos.notaMedia(aluno.getNota1(), aluno.getNota2()));
        System.out.println(metodos.ficouDeFinal(aluno.getNota1(), aluno.getNota2()));

    }
}
