package com.poo.Trimestre2.prova2;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        //     Funcionario funcionarios[] = new Funcionario[6];
        //      ArrayList<Funcionario> funcionarioss = new ArrayList<Funcionario>();

//        07 - Crie uma classe para testar
//        as classes criadas acima com 3 objetos da classe FuncionarioCLT (matrículas 1, 2, 3)

        Funcionario funcionarios[] = new Funcionario[6];
        FuncionarioCLT funcionarioCLT1 = new FuncionarioCLT("1",
                "betoRisca faca", "SE", "Agiota", 4500);
        //  funcionarioss.add(funcionarioCLT1);
        FuncionarioCLT funcionarioCLT2 = new FuncionarioCLT("2",
                "aninha furacao", "SE", "Agiota", 4500);
        // funcionarioss.add(funcionarioCLT2);
        FuncionarioCLT funcionarioCLT3 = new FuncionarioCLT("3",
                "telmo do acordeon", "SE", "professor topado", 45000000);

        funcionarios[0] = (funcionarioCLT1);
        funcionarios[1] = (funcionarioCLT2);
        funcionarios[2] = (funcionarioCLT3);
//        funcionarioCLT1.calculaAumentoSalarial("1", 50);
//        funcionarioCLT2.calculaAumentoSalarial(1000, "2");


//        Metodos funcionando... Então é 10
        // System.out.println(funcionarioCLT1.calculaSalario());
        // System.out.println(funcionarioCLT1.calculaAumentoSalarial(500, "1"));
        //  System.out.println(funcionarioCLT1.calculaAumentoSalarial("1", 50));
        //        funcionarioCLT2.setQtdFilhos(1);


//        retornar metodo para calcular os salarios

        FuncionarioTemp joao = new FuncionarioTemp("4",
                "tati quebra barraco", "SE",
                "Agiota", 4500, 0, 1);

        funcionarios[3] = (joao);

        FuncionarioTemp jorge = new FuncionarioTemp("5",
                "bruno da capoeira", "SE",
                "Agiota", 4500, 0, 1);

        funcionarios[4] = (jorge);
        FuncionarioTemp ze = new FuncionarioTemp("6",
                "tenho vendedor de galinha", "SE",
                "Agiota", 4500, 0, 1);

        funcionarios[5] = (ze);

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] instanceof FuncionarioCLT) {
//                System.out.println("TIPO FUNC. -Matric.   -Nome   -Sal  -Num.Filhos  -Sal.Liquido");
                System.out.println("FUNCIONARIO CLT-" + funcionarios[i].matricula + "  "
                        + funcionarios[i].nome + "   " + funcionarios[i].vlSalarioBase + "  "
                        + funcionarios[i].qtdFilhos + "   " + funcionarios[i].calculaSalario()
                );

            } else {
                System.out.println("FUNCIONARIO TEMP-" + funcionarios[i].matricula + "  "
                        + funcionarios[i].nome + "   " + funcionarios[i].vlSalarioBase + "  "
                        + funcionarios[i].qtdFilhos + "   " + funcionarios[i].calculaSalario());

            }

        }


    }
}
