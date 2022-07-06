package com.poo.Trimestre2.Atividades.Atividade03.Q1;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {


        List<String> especialidades = Arrays.asList("pediatra",
                "cardiologista",
                "dermatologista",
                "tocador de zabumba",
                "cardiologista",
                "dermatologista",
                "tocador de zabumba",
                "afinador de caavaquinho",
                "pneumologista");
        List<String> usuarios = Arrays.asList("Julio Renan Cardoso",
                "Benedito Nathan Rodrigo Baptista",
                "Sebastião Jorge Manoel Sales",
                "Osvaldo Sérgio Joaquim Ramos",
                "Ryan Marcos Vinicius Silva");

//        criando 5 clientes
        for (int x = 0; x < 5; x++) {
//            para x com valores pares é criado objetos não conveniados
            if (x % 2 == 0) {
                NaoConveniado naoConveniado = new NaoConveniado(usuarios.get(x));
                System.out.println(naoConveniado.agendarConsulta(especialidades.get(x),""));
                int z = 1;
                System.out.println("Segunda consulta: " +
                        naoConveniado.agendarConsulta(especialidades.get(z),""));
                z++;
                System.out.println("---------------------------------------------");
//            caso não seja par então é criado objetos conveniados
            } else {

                    Conveniado conveniado = new Conveniado(usuarios.get(x));
                    int z = 1;
                    System.out.println(conveniado.agendarConsulta(especialidades.get(x),
                            "UNIMED"));


                    System.out.println("Segunda consulta: " +
                            conveniado.agendarConsulta(especialidades.get(z),"UNIMED"));
                    z++;
                    System.out.println("---------------------------------------------");

            }
        }


    }
}
