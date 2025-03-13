package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceAnotacao.LocacaoDeCarro.Model.entities;

public class Invoice {

    private double basicPayment;
    private double tax;

    public Invoice(){

    }

    public Invoice(double tax, double basicPayment) {
        this.tax = tax;
        this.basicPayment = basicPayment;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPayment(){
        return getBasicPayment() + getTax();
    }

}
