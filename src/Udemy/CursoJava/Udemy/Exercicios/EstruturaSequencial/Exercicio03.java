package Udemy.CursoJava.Udemy.Exercicios.EstruturaSequencial;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("Informe o 1° valor: ");
        A = scanner.nextInt();

        System.out.print("Informe o 2° valor: ");
        B = scanner.nextInt();

        System.out.print("Informe o 3° valor: ");
        C = scanner.nextInt();

        System.out.print("Informe o 4° valor: ");
        D = scanner.nextInt();

        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = "+ diferenca);
    }
}
