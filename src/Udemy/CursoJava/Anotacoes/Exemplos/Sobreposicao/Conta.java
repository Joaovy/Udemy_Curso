package Udemy.CursoJava.Anotacoes.Exemplos.Sobreposicao;

public class Conta {

    private int number;
    private String holder;
    // Ele da acesso a subclasses que utilizam desse modificador sem que deixe ele esposto!
    protected double balance;

    public Conta(){

    }

    public Conta(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double quantia){
        balance -= quantia + 5.0;

    }

    public void depositar(double quantia){
        balance += quantia;

    }
}
