package Udemy.CursoJava.Udemy.Exercicios.Vetores;

import java.util.Scanner;

public class ProblemasNegativos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma quantidade de numeros (max 10): ");
        int N = scanner.nextInt();

        if(N > 10){
            System.out.println("Limite de numeros atingido!");
            System.exit(0);
        }

        int[] vetor = new int[N];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Informe um numero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        scanner.close();
    }
}
