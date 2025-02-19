package Udemy.CursoJava.Anotações.Exemplos;

import java.util.Scanner;

public class EstruturadeRepticaoFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int N = scanner.nextInt();
//        int soma = 0;
//
//        for (int i = 0; i < N; i++){
//            int x = scanner.nextInt();
//            soma += x;
//        }
//
//        System.out.println(soma);

        // contagem regressiva:
        for (int i=4; i>=0; i--) {
            System.out.println("Valor de i: " + i);
        }
    }
}
