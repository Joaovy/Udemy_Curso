package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao.LocacaoDeCarro.Model.Service;


import Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao.LocacaoDeCarro.Model.entities.CarRental;
import Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao.LocacaoDeCarro.Model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private double pricePerDay;
    private double pricePerHour;

    private TaxService taxService;

    public RentalService(double pricePerDay, double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPaymet;
        if(hours <= 12.0){
            // este Math.ceil arredonda o valor recebido!!!
            basicPaymet = pricePerHour * Math.ceil(hours);
        } else {
            basicPaymet  = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPaymet);
        carRental.setInvoice(new Invoice(basicPaymet, tax));
    }
}
