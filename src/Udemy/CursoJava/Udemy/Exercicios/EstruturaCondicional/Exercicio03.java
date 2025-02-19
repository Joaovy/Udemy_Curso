package Udemy.CursoJava.Udemy.Exercicios.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;
        System.out.print("Informe um numero A: ");
        A = scanner.nextInt();

        System.out.print("Infomer o numero B: ");
        B = scanner.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        scanner.close();
    }
}
