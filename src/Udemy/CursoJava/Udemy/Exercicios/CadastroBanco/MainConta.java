package Udemy.CursoJava.Udemy.Exercicios.CadastroBanco;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero da conta: ");
        int numeroContaBanco = scanner.nextInt();

        System.out.print("Informe o titular da conta: ");
        scanner.nextLine();
        String titularDaConta = scanner.nextLine();

        System.out.print("Deseja depositar um valor?(s/n): ");
        String respostaDesposito = scanner.nextLine();

        Conta c1;
        double saldoConta = 0.0;

        if (respostaDesposito.equalsIgnoreCase("s")){
            System.out.print("informe um valor para depositar: ");
            saldoConta = scanner.nextDouble();

        } else if(respostaDesposito.equalsIgnoreCase("n")){
//            System.out.println("Saldo atual: "+ saldoConta);
              c1 = new Conta(numeroContaBanco, titularDaConta);
        }

        c1 = new Conta(titularDaConta, numeroContaBanco, saldoConta);
        System.out.println("Atualização da conta:");
        System.out.println(c1);

        System.out.println("\n");
        System.out.print("informe um valor para depositar: ");
        saldoConta = scanner.nextDouble();
        c1.depositar(saldoConta);
        // Metedo com toString

        System.out.println("Atualização da conta:");
        System.out.println("Conta: "+ c1.getNumero() +", Titular: "+ c1.getTitular() +", Saldo: "+ c1.getSaldo());

        System.out.println("\n");
        System.out.print("informe um valor para sacar: ");
        saldoConta = scanner.nextDouble();
        c1.retirar(saldoConta);

        System.out.println("Atualização da conta:");
        System.out.println("Conta: "+ c1.getNumero() +", Titular: "+ c1.getTitular() +", Saldo: "+ c1.getSaldo());

        scanner.close();
    }
}
