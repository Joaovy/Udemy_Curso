package Udemy.CursoJava.Udemy.Exercicios.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y;
        System.out.print("Informe um numero inteiro: ");
        y = scanner.nextInt();

        if( y % 2 == 0){
            System.out.println("PAR");
        } else{
            System.out.println("IMPAR");
        }

    }
}
