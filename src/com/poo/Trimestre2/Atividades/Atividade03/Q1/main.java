package com.poo.Trimestre2.Atividades.Atividade03.Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        List<String> especialidades = Arrays.asList("pediatra",
                "cardiologista",
                "dermatologista",
                "tocador de zabumba",
                "cardiologista",
                "dermatologista",
                "tocador de zabumba",
                "afinador de caavaquinho",
                "pneumologista");
//        List<NaoConveniado> naoConveniadoList = new ArrayList<>();
        List<String> usuarios = Arrays.asList("Julio Renan Cardoso",
                "Benedito Nathan Rodrigo Baptista",
                "Sebastião Jorge Manoel Sales",
                "Osvaldo Sérgio Joaquim Ramos",
                "Ryan Marcos Vinicius Silva");
//
//
        for (int x = 0; x < 5; x++) {
            if (x % 2 == 0) {
                NaoConveniado naoConveniado = new NaoConveniado(usuarios.get(x));
                System.out.println(naoConveniado.agendarConsulta(especialidades.get(x),""));
                //NaoConveniado naoConveniado2 = new NaoConveniado(usuarios.get(x));
                int z = 1;
                System.out.println("Segunda consulta: " +
                        naoConveniado.agendarConsulta(especialidades.get(z),""));
                z++;
                System.out.println("---------------------------------------------");
            } else {
                for (int i = 2; i < 4; i++) {
                    Conveniado conveniado = new Conveniado(usuarios.get(i));
                    int z = 1;
                    System.out.println(conveniado.agendarConsulta(especialidades.get(i),
                            "UNIMED"));


                    System.out.println("Segunda consulta: " +
                            conveniado.agendarConsulta(especialidades.get(z),""));
                    z++;
                    System.out.println("---------------------------------------------");
                }
            }
        }


    }
}
