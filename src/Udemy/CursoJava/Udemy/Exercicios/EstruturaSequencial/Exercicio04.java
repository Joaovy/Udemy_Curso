package Udemy.CursoJava.Udemy.Exercicios.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorPorHora;

        System.out.print("Informe o numero do funcionario: ");
        numeroFuncionario = scanner.nextInt();

        System.out.print("Informe as horas trabalhadas do funcionario: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.print("Informe o valor hora que o funcionario recebe: ");
        valorPorHora = scanner.nextDouble();

        double totalSalario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = "+ numeroFuncionario);
        System.out.printf("SALARY = %.2f%n", totalSalario);


    }


}
