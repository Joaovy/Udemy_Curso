package Udemy.CursoJava.Udemy.Exercicios.Vetores.ProblemaAltura;

import java.util.Scanner;

public class CalculoPessoa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe aa quantidade de pessoas: ");
        int n = scanner.nextInt();

        Pessoa[] vetorPessoas = new Pessoa[n];

        for(int i = 1; i < vetorPessoas.length; i++){

            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            vetorPessoas[i] = new Pessoa(nome, idade, altura);

        }

        double soma = 0.0;
        for (int i = 0; i < vetorPessoas.length; i++){
            soma += vetorPessoas[i].getAltura();
        }

        int menoresDe16 = 0;
        for (int i = 0; i < vetorPessoas.length; i++) {
            if (vetorPessoas[i].getIdade() <= 16){
                menoresDe16++;
            }

        }

        double porcentagem = ((double) menoresDe16 / n) * 100;

        System.out.printf("ALTURA MEDIA: %.2f%n", soma);
        System.out.printf("PESSOAS COM MENOS DE 16 ANOS: %.2f%n", porcentagem ,"%");

        scanner.close();
    }
}
