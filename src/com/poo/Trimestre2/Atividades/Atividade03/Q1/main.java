package com.poo.Trimestre2.Atividades.Atividade03.Q1;

public class main {
    public static void main(String[] args) {

//- O método agandarConsulta() deve gerar uma data de consulta randômica válida para o ano de 2023 e retornar uma
// String (concatenar especialidade e data da consulta).

//- Na classe NaoConveniado, no método agendarConsulta () deve ser retornado também o valor da consulta (R$ 200,00).

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

        Paciente paciente = new Paciente();
        System.out.println(paciente.agendarConsulta("cardio",
                999, "Unimed")
        );
    }
}
