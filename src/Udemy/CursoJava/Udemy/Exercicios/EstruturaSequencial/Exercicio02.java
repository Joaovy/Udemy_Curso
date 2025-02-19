package Udemy.CursoJava.Udemy.Exercicios.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio;

        System.out.print("Informe um valor para o raio: ");
        raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.println("A="+ area);

    }
}
