package Udemy.CursoJava.Anotacoes.Exemplos;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scanner.nextInt();
            }

        }

        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i]+ " ");
        }
        System.out.println("");

        int numero = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] < 0){
                    numero++;
                }
            }

        }
        System.out.println("Numeros negativos: "+ numero);

        // mat[i].length é a linha que ele percorre

        scanner.close();
    }
}
