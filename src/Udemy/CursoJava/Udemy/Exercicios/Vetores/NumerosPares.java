package Udemy.CursoJava.Udemy.Exercicios.Vetores;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de numeros: ");
        int N = scanner.nextInt();

        int[] numeroPar = new int[N];

        for (int i = 0; i < numeroPar.length; i++){
            System.out.print("Digite um numero: ");
            numeroPar[i] = scanner.nextInt();

        }

        int soma = 0;

        System.out.print("NUMEROS PARES: ");
        for(int i = 0; i < numeroPar.length; i++){
            if(numeroPar[i] % 2 == 0){
                System.out.print(" "+numeroPar[i]);
                soma++;
            }

        }

        System.out.println("");
        System.out.println("QUANTIDADE DE PARES: "+ soma);


        scanner.close();
    }
}
