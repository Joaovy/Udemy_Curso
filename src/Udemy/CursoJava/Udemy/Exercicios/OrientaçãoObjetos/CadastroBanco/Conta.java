package Udemy.CursoJava.Udemy.Exercicios.OrientaçãoObjetos.CadastroBanco;

public class Conta {

    private String titular;
    private final int numero;
    private double saldo;

    public Conta(int numero, String titular) {
        this.titular = titular;
        this.numero = numero;
    }

    public Conta(String titular, int numero, double initialDeposit) {
        this.numero = numero;
        this.titular = titular;
        depositar(initialDeposit);

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

//    public void retirar(double valorSaque){
//        double taxa = 5.0;
//        double valorTotalSaque = valorSaque + taxa;
//        saldo -= valorTotalSaque;
//
//    }

    public void retirar(double amount) {
        saldo -= amount + 5.0;
    }

    public String toString(){
        return "Conta: "+ numero +", Titular da conta: "+ titular +", Saldo: $"+ String.format("%.2f", saldo);
    }
}