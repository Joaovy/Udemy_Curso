package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao;

import Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao.LocacaoDeCarro.Model.Service.BrazilTaxService;
import Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao.LocacaoDeCarro.Model.Service.RentalService;
import Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao.LocacaoDeCarro.Model.entities.CarRental;
import Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao.LocacaoDeCarro.Model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramServiceCar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel!!");
        System.out.print("Modelo do carro: ");
        String modeloCarro = scanner.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);

        System.out.print("Entrada (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(modeloCarro));

        System.out.print("Entre com o preço por hora: ");
        double valorHora = scanner.nextDouble();
        System.out.print("ENtre com o preço por dia: ");
        double valorDia = scanner.nextDouble();

        RentalService rentalService = new RentalService(valorDia, valorHora, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: "+ String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: "+ String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: "+ String.format("%.2f", cr.getInvoice().getTotalPayment()));

        scanner.close();
    }
}
