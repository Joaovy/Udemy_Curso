package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.MembrosEstaticos;

import java.util.Scanner;

public class ExecultandoRaio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculoDoRaio calc = new CalculoDoRaio();

        System.out.print("Informe o raio: ");
        double raio = scanner.nextDouble();

        double v = calc.volume(raio);
        double c = calc.circumFerencia(raio);

        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI = %.2f%n", calc.PI);

        scanner.close();
    }

}
