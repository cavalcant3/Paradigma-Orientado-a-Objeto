package com.poo.Trimestre2.Atividades.Atividade02.Q1;

public class main {
    public static void main(String[] args) {
//        1 - Crie uma hierarquia de classes para representar veículos
//        com os atributos placa e ano: considere que as classes ônibus
//        e caminhão serão filhas da classe veículo. Considerações:
//- o construtor da classe veículo deve conter a placa e ano;

//- a classe ônibus deve conter o atributo número de assentos;
//- a classe caminhão deve conter o número de eixos e o peso máximo e carga;
//- crie os métodos gets/sets e exibir dados;
//- crie uma classe para testar as classes criadas;
//- lembre-se de usar abstract quando for o caso;

        Onibus onibus = new Onibus("eof1414", 2001);
        onibus.setNumAssentos(60);
        Caminhao caminhao = new Caminhao("eoe555", 1970);
        caminhao.setPesoMax(2500);
        caminhao.setNumExos(6);
        caminhao.setCarga("aves");
        System.out.println("----info. sobre o caminhão:------");
        System.out.println(caminhao.getInfo());
        System.out.println("----info. sobre o onibus:------");
        System.out.println(onibus.getInfo());
    }
}
