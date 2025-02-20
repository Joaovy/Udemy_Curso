package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.MembrosEstaticos.MetodoEstaticoV2;

import Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.MembrosEstaticos.CalculoDoRaio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio: ");
        double raio = scanner.nextDouble();

        double v = CalculoRaioStatico.volume(raio);
        double c = CalculoDoRaio.circumFerencia(raio);

        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI = %.2f%n", CalculoDoRaio.PI);

        scanner.close();
    }
}
