package Udemy.CursoJava.Anotações.Exemplos.Sobreposicao;

public class SavingConta extends Conta{

    private double interestRate;

    public SavingConta(){

    }

    public SavingConta(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double quantia){
        balance -= quantia;
    }

}
