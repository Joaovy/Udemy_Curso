package Udemy.CursoJava.Anotações.Exemplos.Enumeracoes.ExercicioResolvido01enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;


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
        scanner.close();
    }
}
