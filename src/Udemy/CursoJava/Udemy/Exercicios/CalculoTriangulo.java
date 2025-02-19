package Udemy.CursoJava.Udemy.Exercicios;

import java.util.Scanner;

public class CalculoTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Este é apnas um exemplo de um codigo sem orientação a objetos log mais vou aplicar
        uma classe para poder entender melhor a orientação a objetos!!
         */

        double xA, xB, xC, yA, yB, yC;

        System.out.print("Passe as medidas do triangulo X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();
        System.out.print("Passe as medidas do triangulo Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB +xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("A area do triangulo X é: %.4f%n", areaX);
        System.out.printf("A area do triangulo Y é: %.4f%n", areaY);

    if ( areaX > areaY){
        System.out.println("Maior area: X");
    } else {
        System.out.println("Maior area: Y");
    }

    }
}
