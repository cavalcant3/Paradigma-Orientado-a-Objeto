package com.poo.Trimestre2.Atividades.Atividade03.Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//Classe de teste:
//- Elabore um programa de para criar 5 pacientes (Use o comando for. A variavel de controle deve ser chamada de X).
//- Para X com valor ímpar crie objetos "Conveniado" e para valor par crie objetos "NãoConveniado".
//- Para cada objeto criado, agende 2 consultas com especialidades diferentes (pediatra, cardiologista,
// dermatologista, pneumologista, .....).
//Segue modelo de impressão:
//PACIENTE: ANA MARIA DIAS DANTAS - CONVÊNIO UNIMED
//          DERMATOLOGISTA - 22/01/2023
//PACIENTE: ANA PAULA SÁ DA SILVA - SEM CONVÊNIO
//	  CARDIOLOGISTA  - 15/03/2023 - R$ 200,00

//        Paciente paciente = new Paciente();
//        System.out.println(paciente.agendarConsulta("cardio",
//                999, "Unimed")
//        );

//        Scanner sc= new Scanner(System.in);
       List<String> especialidades = Arrays.asList("pediatra",
               "cardiologista",
               "dermatologista",
               "tocador de zabumba",
               "afinador de caavaquinho",
               "pneumologista");

    //    System.out.println(especialidades.get(1));

        for (int x = 0; x < 5; x++) {
            if (x % 2 == 0) {
                for (int i = 0; i < 2; i++) {
                    NaoConveniado naoConveniado = new NaoConveniado("ANA PAULA SÁ DA SILVA");
                    naoConveniado.agendarConsulta(especialidades.get(1), "SEM CONVÊNIO");
                }
            } else {
                for (int i = 2; i < 4; i++) {
                    Conveniado conveniado = new Conveniado("ANA MARIA DIAS DANTAS");
                    conveniado.agendarConsulta(especialidades.get(i), "UNIMED");
                }
            }
        }

    }
}
