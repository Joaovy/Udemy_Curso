package Udemy.CursoJava.Udemy.Exercicios.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero = scanner.nextInt();

        if( numero > 0 || numero < 100){
            System.out.println("Fora de intervalo");

        } else if (numero <= 25.0){
            System.out.println("Intervalo [0,25]");

        } else if (numero <= 50.0){
            System.out.println("Intervalo (25,50]");

        } else if (numero <= 75.0){
            System.out.println("Intervalo (50, 75]");

        } else {
            System.out.println("Intervalo (75, 100]");
        }

        scanner.close();
    }
}
