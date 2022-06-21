package com.poo.Trimestre2.Atividades.Atividade02.Q2;

public class main {
    public static void main(String[] args) {
//        2 - Implemente, em Java, uma classe abstrata de nome Quadrilatero
//        onde são declarados dois métodos abstratos: float calcularArea( ) e float calcularPerimetro( );

//- crie, como subclasse de Quadrilatero, uma classe de nome Retangulo cujas
// instâncias são caracterizadas pelos atributos lado e altura ambos do tipo float.

//- implemente na classe Retangulo os métodos herdados de Quadrilatero e outros que ache necessários.

//- crie, como subclasse de Quadrilatero, uma classe de nome Circulo cujas instâncias
// são caracterizadas pelo atributo raio do tipo float.


//- implemente na classe Circulo os métodos herdados de Quadrilatero e outros que ache
// necessários. (Nota: poderá acessar o valor de Pi fazendo Math.Pi)

//- crie, como subclasse de Retangulo, uma classe de nome Quadrado cujas instâncias são
// caracterizadas por terem os atributos lado e altura com o mesmo valor.

//- crie uma classe para testar as classes criadas.

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5);
        retangulo.setLado(5);
//        System.out.println("Area retangulo: "+retangulo.calcularArea(5,5));
//        System.out.println("Perimetro retangulo: "+retangulo.calcularPerimetro(5,10));
        System.out.println("Area do retangulo: " + retangulo.calcularArea() +
                "\nPerimetro do retangulo: " + retangulo.calcularPerimetro());
        System.out.println("---------");
        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        System.out.println("Area do Circulo: " + circulo.calcularArea() +
                "\nPerimetro do Circulo: " + circulo.calcularPerimetro());


        System.out.println("---------");
        Quadrado quadrado = new Quadrado();
        quadrado.setAltura(15);
        quadrado.setLado(1);
        System.out.println("Area do quadrado: " + quadrado.calcularArea() +
                "\nPerimetro do quadrado: " + quadrado.calcularPerimetro());

    }
}
