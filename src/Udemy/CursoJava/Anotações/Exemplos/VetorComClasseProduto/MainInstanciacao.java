package Udemy.CursoJava.Anotações.Exemplos.VetorComClasseProduto;

import java.util.Scanner;

public class MainInstanciacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de produtos: ");
        int n = scanner.nextInt();
        Produto[] vect = new Produto[n];
        // criando um vetor com objetos!!1

        for(int i = 0; i < vect.length; i++){

            scanner.nextLine();
            System.out.print("informe o nome do produto: ");
            String name = scanner.nextLine();

            System.out.print("Informe o preço do produto: ");
            double preco = scanner.nextDouble();

            vect[i] = new Produto(name, preco);


        }

        double soma = 0.0;

        for(int i = 0; i < vect.length; i++){
            soma += vect[i].getPreco();
        }

        double avg = soma / vect.length;
        System.out.printf("MEDIA DO PREÇO: %.2f%n", avg);

        scanner.close();
    }
}
