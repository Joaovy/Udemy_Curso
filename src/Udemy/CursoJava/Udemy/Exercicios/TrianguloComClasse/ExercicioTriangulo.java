package Udemy.CursoJava.Udemy.Exercicios.TrianguloComClasse;

import java.util.Scanner;

public class ExercicioTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Passe as medidas do trinagulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Passe as medidas do triangulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.b = scanner.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("A area do tringulo X: %.4f%n", areaX);
        System.out.printf("A area do tringulo y: %.4f%n", areaY);


        if( areaX > areaY){
            System.out.println("A maior area é: X");
        }else{
            System.out.println("A maior area é: Y");
        }

        scanner.close();
    }
}
