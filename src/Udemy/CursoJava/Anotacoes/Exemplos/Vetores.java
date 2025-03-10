package Udemy.CursoJava.Anotacoes.Exemplos;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade: ");
        int n = scanner.nextInt();
        System.out.println("");

        double[] vect = new double[n];

        /* essa é uma forma de ler o vetor e voce
        utiliza o i  para percorrer o vetor"!!
         */
        for (int i = 0; i < n; i++){

            System.out.print("altura("+ (i + 1 ) +"): ");
            vect[i] = scanner.nextDouble();

        }

        double soma = 0.0;
        for(int i = 0; i < n; i++){
            soma += vect[i];

        }

        double avg = soma / n;

        System.out.printf("media: %.2f%n", avg);
        scanner.close();
    }
}
