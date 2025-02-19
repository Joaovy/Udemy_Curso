package Udemy.CursoJava.Udemy.Exercicios.EstruturaDeRepticao;

import java.util.Scanner;

public class LacoFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        for (int i = 0; i <= X; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
