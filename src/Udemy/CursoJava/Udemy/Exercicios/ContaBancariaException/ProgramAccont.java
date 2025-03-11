package Udemy.CursoJava.Udemy.Exercicios.ContaBancariaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramAccont {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe os dados da conta: ");
            System.out.print("Numero: ");
            int numeroConta = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Titular: ");
            String titularConta = scanner.nextLine();

            System.out.print("Saldo inicial: ");
            double saldoDeclarado = scanner.nextDouble();

            System.out.print("Limite de saque: ");
            double limiteDeSaque = scanner.nextDouble();

            Account conta = new Account(numeroConta, titularConta, saldoDeclarado, limiteDeSaque);

            System.out.print("Insira um valor para saque: ");
            double valorSaque = scanner.nextDouble();

            conta.saque(valorSaque);

            System.out.println();
            System.out.print("Valor do saldo atualizado: "+ conta.getSaldo());


        } catch (InputMismatchException e){
            System.err.println("Valor Invalido!");
        }



        scanner.close();
    }
}
