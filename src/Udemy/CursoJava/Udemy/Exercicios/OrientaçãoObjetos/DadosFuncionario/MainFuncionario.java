package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.DadosFuncionario;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();

        System.out.print("informe o nome: ");
        funcionario1.nome = scanner.nextLine();

        System.out.println("Informe o salario: ");
        funcionario1.salario = scanner.nextDouble();

        System.out.println("Informe a taxa: ");
        funcionario1.taxa = scanner.nextDouble();

        funcionario1.impostoSobreSalario();

        System.out.println("Qual a porcentagem de taxa sobre o salario: ");
        double porcentagem = scanner.nextDouble();
        funcionario1.bonusSalario(porcentagem);

        System.out.println("Atualizado: "+ funcionario1);


        scanner.close();
    }
}
