package Udemy.CursoJava.Udemy.Exercicios.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        System.out.print("Informe o primeiro valor: ");
        a = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        b = scanner.nextInt();

        int soma = a + b;
        System.out.println("SOMA = "+ soma);
    }
}
