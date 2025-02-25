package Udemy.CursoJava.Udemy.Exercicios.Vetores;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar?: ");
        int n = scanner.nextInt();

        double[] vetorN = new double[n];

        for(int i = 0; i < vetorN.length; i++){
            System.out.print("Digite um numero: ");
            vetorN[i] = scanner.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vetorN.length; i++){
            System.out.println(" "+vetorN[i]);

        }

        double soma = 0.0;
        for(int i = 0; i < vetorN.length; i++){
            soma += vetorN[i];
        }

        double media = soma / n;
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);


        scanner.close();
    }
}
