package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ProgramaContribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramContribuintes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Informe os contribuintes: ");
        int quantidadeContribuints = scanner.nextInt();

        for(int i = 1; i <= quantidadeContribuints; i++){

            System.out.print("Contribuinte #"+ i +" dados:");
            System.out.print("Individual ou Company? (i/c): ");
            char verificaContribuinte = scanner.next().charAt(0);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nomeContribuinte = scanner.nextLine();
            System.out.print("Renda Anual: ");
            double rendaAnual = scanner.nextDouble();

            if(verificaContribuinte == 'i'){
                System.out.print("Qual o gasto em saude?: ");
                double gastoEmSaude = scanner.nextDouble();
                Contribuinte con1 = new Individual(nomeContribuinte, rendaAnual, gastoEmSaude);
                list.add(con1);
            } else {
                System.out.print("Qual a quantidade de funcionarios?: ");
                int quantidadeFuncionarios = scanner.nextInt();
                Contribuinte con1 = new Company(nomeContribuinte, rendaAnual, quantidadeFuncionarios);
                list.add(con1);
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXAS PAGAS:");
        for(Contribuinte con1 : list){
            double taxa = con1.tax();
            System.out.println(con1.getNomes() +": $"+ String.format("%.2f", con1.tax()));
            sum += taxa;
        }

        System.out.println();
        System.out.println("TOTAL TAXAS : $"+ String.format("%.2f", sum));
        scanner.close();
    }

}
