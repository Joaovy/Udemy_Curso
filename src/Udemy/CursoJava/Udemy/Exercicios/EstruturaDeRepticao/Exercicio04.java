package Udemy.CursoJava.Udemy.Exercicios.EstruturaDeRepticao;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(y == 0){
                System.out.println("divisão impossivel");
            } else{
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }

    }
}
