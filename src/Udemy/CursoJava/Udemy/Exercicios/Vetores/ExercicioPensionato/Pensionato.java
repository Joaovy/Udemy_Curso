package Udemy.CursoJava.Udemy.Exercicios.Vetores.ExercicioPensionato;

import Udemy.CursoJava.Udemy.Exercicios.Vetores.ProblemaAltura.Pessoa;

import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos quartos vão ser alugados?: ");
        int quantidadeQuartos = scanner.nextInt();

        Quartos[] vetorQuartos = new Quartos[quantidadeQuartos];

        for (int i = 0; i < vetorQuartos.length; i++) {

            System.out.println("Rent: "+ (i + 1));
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.println("Quarto: ");
            int numero = scanner.nextInt();
            System.out.println("");

            vetorQuartos[i] = new Quartos(nome, email, numero);

        }


        System.out.println("Quartos ocupados:");
        for (int i = 0; i < vetorQuartos.length; i++) {

            if(vetorQuartos[i] != null){
                System.out.println(i +": "+vetorQuartos[i]);
            }

        }


        scanner.close();
    }
}
