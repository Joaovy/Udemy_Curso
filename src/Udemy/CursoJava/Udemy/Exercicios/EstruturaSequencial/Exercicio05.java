package Udemy.CursoJava.Udemy.Exercicios.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        double valorUnitarioPeca1, valorUnitarioPeca2;

        System.out.print("Codigo da peça 1°: ");
        codigoPeca1 = scanner.nextInt();

        System.out.print("Quantidade da peça 1°: ");
        quantidadePeca1 = scanner.nextInt();

        System.out.print("Valor da peça 1°: ");
        valorUnitarioPeca1 = scanner.nextDouble();

        double totalPeca1 = valorUnitarioPeca1 * quantidadePeca1;

        System.out.print("Codigo da peça 2°: ");
        codigoPeca2 = scanner.nextInt();

        System.out.print("Quantidade da peça 2°: ");
        quantidadePeca2 = scanner.nextInt();

        System.out.print("Valor da peça 2°: ");
        valorUnitarioPeca2 = scanner.nextDouble();

        double totalPeca2 = valorUnitarioPeca1 * quantidadePeca2;
        double valorPagar = totalPeca1 + totalPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);

        scanner.close();
    }
}
