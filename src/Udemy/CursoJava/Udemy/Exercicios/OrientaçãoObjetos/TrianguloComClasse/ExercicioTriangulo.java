package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.TrianguloComClasse;

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

        // metodo da classe Tringulo que realiza o calculo!!
        double areaX = x.area();
        double areaY = y.area();

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
