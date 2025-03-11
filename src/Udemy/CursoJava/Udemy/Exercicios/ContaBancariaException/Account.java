package Udemy.CursoJava.Udemy.Exercicios.ContaBancariaException;

public class Account {

    private int numero;
    private String titular;
    private double saldo;
    private double sacarLimit;

    public Account() {

    }

    public Account(int numero, String titular, double saldo, double sacarLimit) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.sacarLimit = sacarLimit;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSacarLimit() {
        return sacarLimit;
    }

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void saque(double valor){
        this.saldo -= valor;
    }

}
