package com.poo.Trimestre1.Atividades.Atividade02.Q1;

public class Main {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo("fusquinha","coca cola");

        carro1.setAno(2021);
        carro1.setMarca("aviao");
        carro1.setMotor(2.8);
       // carro1.setVelocidade(99);
        carro1.setNumMarchas(10);

        System.out.println(carro1.acelerar(250));
        System.out.println(carro1.getVelocidade());
        System.out.println("------------------------------");
        System.out.println(carro1.frear(50));
        System.out.println(carro1.getVelocidade());

//        -----------------------------------------------------------------------------

        Veiculo carro2 = new Veiculo("fusquinha","coca cola");

        carro1.setAno(2021);
        carro1.setMarca("aviao");
        carro1.setMotor(2.8);
        // carro1.setVelocidade(99);
        carro1.setNumMarchas(10);

        System.out.println(carro1.acelerar(250));
        System.out.println(carro1.getVelocidade());
        System.out.println("------------------------------");
        System.out.println(carro1.frear(50));
        System.out.println(carro1.getVelocidade());
    }
}
