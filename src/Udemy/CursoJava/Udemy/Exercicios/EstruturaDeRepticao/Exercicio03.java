package Udemy.CursoJava.Udemy.Exercicios.EstruturaDeRepticao;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){

            double n1 = scanner.nextDouble();
            double n2 = scanner.nextDouble();
            double n3 = scanner.nextDouble();

            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
            System.out.printf("%.1f%n",media);
        }

        scanner.close();
    }
}
