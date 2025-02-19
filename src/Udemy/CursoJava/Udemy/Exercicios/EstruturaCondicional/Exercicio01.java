package Udemy.CursoJava.Udemy.Exercicios.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Informe um numero: ");
        x = scanner.nextInt();

        if(x < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        scanner.close();
    }
}
