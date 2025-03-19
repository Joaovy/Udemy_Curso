package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ProcessContratc;

import Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ProcessContratc.Model.entities.Contract;
import Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ProcessContratc.Model.entities.Installment;
import Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ProcessContratc.Model.service.ContractService;
import Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.ProcessContratc.Model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramContratc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int numeroContrato = scanner.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), fmt);

        System.out.print("Valor do contrato: ");
        double valorDoContrato = scanner.nextDouble();

        Contract objetoContrato = new Contract(numeroContrato, date, valorDoContrato);
        System.out.print("Informe o numero de parcela: ");
        int numeroParcelas = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(objetoContrato, numeroParcelas);

        System.out.println("Parcelas:");
        for (Installment installment : objetoContrato.getInstallments()){
            System.out.println(installment);
        }


        scanner.close();
    }
}
