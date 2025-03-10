package Udemy.CursoJava.Anotacoes.Exemplos.Enumeracoes.ExercicioResolvido01enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Programa {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = scanner.nextLine();

        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Nome: ");
        String nomeTrabalhador = scanner.nextLine();

        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Salario base: ");
        double baseSalario = scanner.nextDouble();

        Funcionario worker = new Funcionario(new Departamento(nomeDepartamento), baseSalario, WorkLevel.valueOf(workerLevel), nomeTrabalhador);

        System.out.print("Quantos contratos este funcionario vai ter?: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Informe o contrato #"+ (i + 1) +" data:");

            System.out.print("Data (DD/MM/YYYY): ");
            Date contratoData = sdf.parse(scanner.next());

            System.out.print("Valor por hora: ");
            double valorPorHora = scanner.nextDouble();

            System.out.print("Duração (horas): ");
            int horas = scanner.nextInt();

            ContratoHora contrato = new ContratoHora(contratoData, valorPorHora, horas);
            worker.addContrato(contrato);

        }

        System.out.println();
        System.out.println("Informe o mes e o ano que deseja calcular(mmYYYY): ");
        String monthAdYear = scanner.next();
        int mes = Integer.parseInt(monthAdYear.substring(0,2));
        int ano = Integer.parseInt(monthAdYear.substring(3));

        System.out.println("Nome: "+  worker.getName());
        System.out.println("Departamento: "+ worker.getDepartamento().getName());
        System.out.println("Total ganho: "+ monthAdYear +": "+ String.format("%.2f",worker.income(ano, mes)));

        scanner.close();
    }
}
