package Udemy.CursoJava.Udemy.Exercicios;

import java.util.Scanner;

public class ExercicioMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matEx = new int[n][m];

        for (int i = 0; i < matEx.length; i++) {
            for (int j = 0; j < matEx[i].length; j++) {
                matEx[i][j] = scanner.nextInt();
            }

        }

        int number = scanner.nextInt();

        for (int i = 0; i < matEx.length; i++) {
            for (int j = 0; j < matEx[i].length; j++) {
                if(matEx[i][j] == number) {
                    System.out.println("Posição: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Left: " + matEx[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matEx[i - 1][j]);
                    }
                    if (j < matEx[i].length - 1) {
                        System.out.println("Right: " + matEx[i][j + 1]);
                    }
                    if (i < matEx.length - 1) {
                        System.out.println("Down: " + matEx[i + 1][j]);
                    }
                }
            }

        }

        scanner.close();
    }
}
