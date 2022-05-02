package com.poo.Trimestre1.Atividades.Atividade01;

public class Main {

    //    Escreva um programa para armazenar dados de veículos. A classe deve conter os atributos: nome, marca, ano,
//    motor e número de marchas.
//    Inclua um método construtor que contém TODOS os parâmetros para atualização de todos os atributos.
//    Crie outro método construtor que tenha como parâmetro somente nome e marca do carro e para os demais atributos
//    considere o ano 2020, motor 1.3 e 5 marchas.
    public static void main(String[] args) {
        Carro carro = new Carro("fusquinha","ferrari");

        System.out.println("-----testando com informações pré definidas:");
        System.out.println(carro.imprimirDados());
        System.out.println("-----testando com informações informadas pelo usuário:");
        Carro carroPessoal = new Carro("celta","chevrolet",2001,2.5,7);
        System.out.println(carroPessoal.imprimirDados());

    }
}
