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


//        observe que ao instanciar a classe ônibus devo fornecer os atributos:
        Onibus onibus = new Onibus("0000",2001, 20000);
//        System.out.println("-- Informações sobre o onibus: --");
        onibus.setNumAssentos("40");
//
//        System.out.println(((Onibus) onibus).mostrarDados());


//        dados do caminhão:
        Caminhao caminhao = new Caminhao("0f30",1999,250000);

        caminhao.setCarga("tijolos");
        caminhao.setNumExos(6);
        caminhao.setPesoMax(1000);
//        System.out.println("-- Informações sobre o caminhao: --");
//        System.out.println(((Caminhao) caminhao).mostrarDados());

        System.out.println("-- Informações sobre polimorfismo: --");
        System.out.println("-- Informações sobre o caminhao: --");
        System.out.println(caminhao.getInfo());
        System.out.println("-- Informações sobre o onibus: --");
        System.out.println(onibus.getInfo());


    }
}
