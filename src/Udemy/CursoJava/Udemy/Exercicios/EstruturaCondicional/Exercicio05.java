package Udemy.CursoJava.Udemy.Exercicios.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        double total;

        if(codigo == 1){
            total = quantidade * 4.00;

        } else if(codigo == 2){
            total = quantidade * 4.50;

        } else if (codigo == 3) {
            total = quantidade * 5.00;

        } else if (codigo == 4) {
            total = quantidade * 2.00;

        } else {
            total = quantidade * 1.50;

        }
        System.out.printf("Total: R$ %.2f%n", total);

        scanner.close();
    }
}
